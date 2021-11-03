/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.eclipse.core.ansi;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

import com.amazonaws.eclipse.core.util.OsPlatformUtils;

import static com.amazonaws.eclipse.core.ansi.AnsiCommands.*;

public class AnsiConsoleAttributes implements Cloneable {
    public final static int UNDERLINE_NONE = -1; // nothing in SWT, a bit of an abuse

    public Integer currentBgColor;
    public Integer currentFgColor;
    public int     underline;
    public boolean bold;
    public boolean italic;
    public boolean invert;
    public boolean conceal;
    public boolean strike;
    public boolean framed;

    public AnsiConsoleAttributes() {
        reset();
    }

    public void reset() {
        currentBgColor = null;
        currentFgColor = null;
        underline = UNDERLINE_NONE;
        bold = false;
        italic = false;
        invert = false;
        conceal = false;
        strike = false;
        framed = false;
    }

    @Override
    public AnsiConsoleAttributes clone() {
        AnsiConsoleAttributes result = new AnsiConsoleAttributes();
        result.currentBgColor = currentBgColor;
        result.currentFgColor = currentFgColor;
        result.underline = underline;
        result.bold = bold;
        result.italic = italic;
        result.invert = invert;
        result.conceal = conceal;
        result.strike = strike;
        result.framed = framed;
        return result;
    }

    public static Color hiliteRgbColor(Color c) {
        if (c == null)
            return new Color(null, new RGB(0xff, 0xff, 0xff));
        int red = c.getRed() * 2;
        int green = c.getGreen() * 2;
        int blue = c.getBlue() * 2;

        if (red > 0xff)   red = 0xff;
        if (green > 0xff) green = 0xff;
        if (blue > 0xff)  blue = 0xff;

        return new Color(null, new RGB(red, green, blue)); // here
    }

    // This function maps from the current attributes as "described" by escape sequences to real,
    // Eclipse console specific attributes (resolving color palette, default colors, etc.)
    public static void updateRangeStyle(StyleRange range, AnsiConsoleAttributes attribute) {
        boolean useWindowsMapping = OsPlatformUtils.isWindows();
        AnsiConsoleAttributes tempAttrib = attribute.clone();

        boolean hilite = false;

        if (useWindowsMapping) {
            if (tempAttrib.bold) {
                tempAttrib.bold = false; // not supported, rendered as intense, already done that
                hilite = true;
            }
            if (tempAttrib.italic) {
                tempAttrib.italic = false;
                tempAttrib.invert = true;
            }
            tempAttrib.underline = UNDERLINE_NONE; // not supported on Windows
            tempAttrib.strike = false; // not supported on Windows
            tempAttrib.framed = false; // not supported on Windows
        }

        // Prepare the foreground color
        if (hilite) {
            if (tempAttrib.currentFgColor == null) {
                range.foreground = AnsiConsolePreferenceUtils.getDebugConsoleFgColor();
                range.foreground = hiliteRgbColor(range.foreground);
            } else {
                if (tempAttrib.currentFgColor < COMMAND_COLOR_INTENSITY_DELTA)
                    range.foreground = new Color(null, AnsiConsoleColorPalette.getColor(tempAttrib.currentFgColor + COMMAND_COLOR_INTENSITY_DELTA));
                else
                    range.foreground = new Color(null, AnsiConsoleColorPalette.getColor(tempAttrib.currentFgColor));
            }
        } else {
            if (tempAttrib.currentFgColor != null)
                range.foreground = new Color(null, AnsiConsoleColorPalette.getColor(tempAttrib.currentFgColor));
        }

        // Prepare the background color
        if (tempAttrib.currentBgColor != null)
            range.background = new Color(null, AnsiConsoleColorPalette.getColor(tempAttrib.currentBgColor));

        // These two still mess with the foreground/background colors
        // We need to solve them before we use them for strike/underline/frame colors
        if (tempAttrib.invert) {
            if (range.foreground == null)
                range.foreground = AnsiConsolePreferenceUtils.getDebugConsoleFgColor();
            if (range.background == null)
                range.background = AnsiConsolePreferenceUtils.getDebugConsoleBgColor();
            Color tmp = range.background;
            range.background = range.foreground;
            range.foreground = tmp;
        }

        if (tempAttrib.conceal) {
            if (range.background == null)
                range.background = AnsiConsolePreferenceUtils.getDebugConsoleBgColor();
            range.foreground = range.background;
        }

        range.font = null;
        range.fontStyle = SWT.NORMAL;
        // Prepare the rest of the attributes
        if (tempAttrib.bold)
            range.fontStyle |= SWT.BOLD;

        if (tempAttrib.italic)
            range.fontStyle |= SWT.ITALIC;

        if (tempAttrib.underline != UNDERLINE_NONE) {
            range.underline = true;
            range.underlineColor = range.foreground;
            range.underlineStyle = tempAttrib.underline;
        }
        else
            range.underline = false;

        range.strikeout = tempAttrib.strike;
        range.strikeoutColor = range.foreground;

        if (tempAttrib.framed) {
            range.borderStyle = SWT.BORDER_SOLID;
            range.borderColor = range.foreground;
        }
        else
            range.borderStyle = SWT.NONE;
    }
}
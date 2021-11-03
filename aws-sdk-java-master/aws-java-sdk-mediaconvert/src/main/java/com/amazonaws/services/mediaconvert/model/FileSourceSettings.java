/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * If your input captions are SCC, SMI, SRT, STL, TTML, WebVTT, or IMSC 1.1 in an xml file, specify the URI of the input
 * caption source file. If your caption source is IMSC in an IMF package, use TrackSourceSettings instead of
 * FileSoureSettings.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/FileSourceSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileSourceSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose
     * Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using
     * the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
     */
    private String convert608To708;
    /**
     * Ignore this setting unless your input captions format is SCC. To have the service compensate for differing frame
     * rates between your input captions and input video, specify the frame rate of the captions file. Specify this
     * value as a fraction. When you work directly in your JSON job specification, use the settings framerateNumerator
     * and framerateDenominator. For example, you might specify 24 / 1 for 24 fps, 25 / 1 for 25 fps, 24000 / 1001 for
     * 23.976 fps, or 30000 / 1001 for 29.97 fps.
     */
    private CaptionSourceFramerate framerate;
    /**
     * External caption file used for loading captions. Accepted file extensions are 'scc', 'ttml', 'dfxp', 'stl',
     * 'srt', 'xml', 'smi', 'webvtt', and 'vtt'.
     */
    private String sourceFile;
    /**
     * Optional. Use this setting when you need to adjust the sync between your sidecar captions and your video. For
     * more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/time-delta-use-cases.html. Enter a
     * positive or negative number to modify the times in the captions file. For example, type 15 to add 15 seconds to
     * all the times in the captions file. Type -5 to subtract 5 seconds from the times in the captions file. You can
     * optionally specify your time delta in milliseconds instead of seconds. When you do so, set the related setting,
     * Time delta units (TimeDeltaUnits) to Milliseconds (MILLISECONDS). Note that, when you specify a time delta for
     * timecode-based caption sources, such as SCC and STL, and your time delta isn't a multiple of the input frame rate,
     * MediaConvert snaps the captions to the nearest frame. For example, when your input video frame rate is 25 fps and
     * you specify 1010ms for time delta, MediaConvert delays your captions by 1000 ms.
     */
    private Integer timeDelta;
    /**
     * When you use the setting Time delta (TimeDelta) to adjust the sync between your sidecar captions and your video,
     * use this setting to specify the units for the delta that you specify. When you don't specify a value for Time
     * delta units (TimeDeltaUnits), MediaConvert uses seconds by default.
     */
    private String timeDeltaUnits;

    /**
     * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose
     * Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using
     * the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
     * 
     * @param convert608To708
     *        Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you
     *        choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data
     *        through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data
     *        into 708.
     * @see FileSourceConvert608To708
     */

    public void setConvert608To708(String convert608To708) {
        this.convert608To708 = convert608To708;
    }

    /**
     * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose
     * Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using
     * the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
     * 
     * @return Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you
     *         choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data
     *         through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data
     *         into 708.
     * @see FileSourceConvert608To708
     */

    public String getConvert608To708() {
        return this.convert608To708;
    }

    /**
     * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose
     * Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using
     * the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
     * 
     * @param convert608To708
     *        Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you
     *        choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data
     *        through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data
     *        into 708.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSourceConvert608To708
     */

    public FileSourceSettings withConvert608To708(String convert608To708) {
        setConvert608To708(convert608To708);
        return this;
    }

    /**
     * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose
     * Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using
     * the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
     * 
     * @param convert608To708
     *        Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you
     *        choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data
     *        through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data
     *        into 708.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSourceConvert608To708
     */

    public FileSourceSettings withConvert608To708(FileSourceConvert608To708 convert608To708) {
        this.convert608To708 = convert608To708.toString();
        return this;
    }

    /**
     * Ignore this setting unless your input captions format is SCC. To have the service compensate for differing frame
     * rates between your input captions and input video, specify the frame rate of the captions file. Specify this
     * value as a fraction. When you work directly in your JSON job specification, use the settings framerateNumerator
     * and framerateDenominator. For example, you might specify 24 / 1 for 24 fps, 25 / 1 for 25 fps, 24000 / 1001 for
     * 23.976 fps, or 30000 / 1001 for 29.97 fps.
     * 
     * @param framerate
     *        Ignore this setting unless your input captions format is SCC. To have the service compensate for differing
     *        frame rates between your input captions and input video, specify the frame rate of the captions file.
     *        Specify this value as a fraction. When you work directly in your JSON job specification, use the settings
     *        framerateNumerator and framerateDenominator. For example, you might specify 24 / 1 for 24 fps, 25 / 1 for
     *        25 fps, 24000 / 1001 for 23.976 fps, or 30000 / 1001 for 29.97 fps.
     */

    public void setFramerate(CaptionSourceFramerate framerate) {
        this.framerate = framerate;
    }

    /**
     * Ignore this setting unless your input captions format is SCC. To have the service compensate for differing frame
     * rates between your input captions and input video, specify the frame rate of the captions file. Specify this
     * value as a fraction. When you work directly in your JSON job specification, use the settings framerateNumerator
     * and framerateDenominator. For example, you might specify 24 / 1 for 24 fps, 25 / 1 for 25 fps, 24000 / 1001 for
     * 23.976 fps, or 30000 / 1001 for 29.97 fps.
     * 
     * @return Ignore this setting unless your input captions format is SCC. To have the service compensate for
     *         differing frame rates between your input captions and input video, specify the frame rate of the captions
     *         file. Specify this value as a fraction. When you work directly in your JSON job specification, use the
     *         settings framerateNumerator and framerateDenominator. For example, you might specify 24 / 1 for 24 fps,
     *         25 / 1 for 25 fps, 24000 / 1001 for 23.976 fps, or 30000 / 1001 for 29.97 fps.
     */

    public CaptionSourceFramerate getFramerate() {
        return this.framerate;
    }

    /**
     * Ignore this setting unless your input captions format is SCC. To have the service compensate for differing frame
     * rates between your input captions and input video, specify the frame rate of the captions file. Specify this
     * value as a fraction. When you work directly in your JSON job specification, use the settings framerateNumerator
     * and framerateDenominator. For example, you might specify 24 / 1 for 24 fps, 25 / 1 for 25 fps, 24000 / 1001 for
     * 23.976 fps, or 30000 / 1001 for 29.97 fps.
     * 
     * @param framerate
     *        Ignore this setting unless your input captions format is SCC. To have the service compensate for differing
     *        frame rates between your input captions and input video, specify the frame rate of the captions file.
     *        Specify this value as a fraction. When you work directly in your JSON job specification, use the settings
     *        framerateNumerator and framerateDenominator. For example, you might specify 24 / 1 for 24 fps, 25 / 1 for
     *        25 fps, 24000 / 1001 for 23.976 fps, or 30000 / 1001 for 29.97 fps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSourceSettings withFramerate(CaptionSourceFramerate framerate) {
        setFramerate(framerate);
        return this;
    }

    /**
     * External caption file used for loading captions. Accepted file extensions are 'scc', 'ttml', 'dfxp', 'stl',
     * 'srt', 'xml', 'smi', 'webvtt', and 'vtt'.
     * 
     * @param sourceFile
     *        External caption file used for loading captions. Accepted file extensions are 'scc', 'ttml', 'dfxp',
     *        'stl', 'srt', 'xml', 'smi', 'webvtt', and 'vtt'.
     */

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    /**
     * External caption file used for loading captions. Accepted file extensions are 'scc', 'ttml', 'dfxp', 'stl',
     * 'srt', 'xml', 'smi', 'webvtt', and 'vtt'.
     * 
     * @return External caption file used for loading captions. Accepted file extensions are 'scc', 'ttml', 'dfxp',
     *         'stl', 'srt', 'xml', 'smi', 'webvtt', and 'vtt'.
     */

    public String getSourceFile() {
        return this.sourceFile;
    }

    /**
     * External caption file used for loading captions. Accepted file extensions are 'scc', 'ttml', 'dfxp', 'stl',
     * 'srt', 'xml', 'smi', 'webvtt', and 'vtt'.
     * 
     * @param sourceFile
     *        External caption file used for loading captions. Accepted file extensions are 'scc', 'ttml', 'dfxp',
     *        'stl', 'srt', 'xml', 'smi', 'webvtt', and 'vtt'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSourceSettings withSourceFile(String sourceFile) {
        setSourceFile(sourceFile);
        return this;
    }

    /**
     * Optional. Use this setting when you need to adjust the sync between your sidecar captions and your video. For
     * more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/time-delta-use-cases.html. Enter a
     * positive or negative number to modify the times in the captions file. For example, type 15 to add 15 seconds to
     * all the times in the captions file. Type -5 to subtract 5 seconds from the times in the captions file. You can
     * optionally specify your time delta in milliseconds instead of seconds. When you do so, set the related setting,
     * Time delta units (TimeDeltaUnits) to Milliseconds (MILLISECONDS). Note that, when you specify a time delta for
     * timecode-based caption sources, such as SCC and STL, and your time delta isn't a multiple of the input frame rate,
     * MediaConvert snaps the captions to the nearest frame. For example, when your input video frame rate is 25 fps and
     * you specify 1010ms for time delta, MediaConvert delays your captions by 1000 ms.
     * 
     * @param timeDelta
     *        Optional. Use this setting when you need to adjust the sync between your sidecar captions and your video.
     *        For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/time-delta-use-cases.html.
     *        Enter a positive or negative number to modify the times in the captions file. For example, type 15 to add
     *        15 seconds to all the times in the captions file. Type -5 to subtract 5 seconds from the times in the
     *        captions file. You can optionally specify your time delta in milliseconds instead of seconds. When you do
     *        so, set the related setting, Time delta units (TimeDeltaUnits) to Milliseconds (MILLISECONDS). Note that,
     *        when you specify a time delta for timecode-based caption sources, such as SCC and STL, and your time delta
     *        isn't a multiple of the input frame rate, MediaConvert snaps the captions to the nearest frame. For
     *        example, when your input video frame rate is 25 fps and you specify 1010ms for time delta, MediaConvert
     *        delays your captions by 1000 ms.
     */

    public void setTimeDelta(Integer timeDelta) {
        this.timeDelta = timeDelta;
    }

    /**
     * Optional. Use this setting when you need to adjust the sync between your sidecar captions and your video. For
     * more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/time-delta-use-cases.html. Enter a
     * positive or negative number to modify the times in the captions file. For example, type 15 to add 15 seconds to
     * all the times in the captions file. Type -5 to subtract 5 seconds from the times in the captions file. You can
     * optionally specify your time delta in milliseconds instead of seconds. When you do so, set the related setting,
     * Time delta units (TimeDeltaUnits) to Milliseconds (MILLISECONDS). Note that, when you specify a time delta for
     * timecode-based caption sources, such as SCC and STL, and your time delta isn't a multiple of the input frame rate,
     * MediaConvert snaps the captions to the nearest frame. For example, when your input video frame rate is 25 fps and
     * you specify 1010ms for time delta, MediaConvert delays your captions by 1000 ms.
     * 
     * @return Optional. Use this setting when you need to adjust the sync between your sidecar captions and your video.
     *         For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/time-delta-use-cases.html.
     *         Enter a positive or negative number to modify the times in the captions file. For example, type 15 to add
     *         15 seconds to all the times in the captions file. Type -5 to subtract 5 seconds from the times in the
     *         captions file. You can optionally specify your time delta in milliseconds instead of seconds. When you do
     *         so, set the related setting, Time delta units (TimeDeltaUnits) to Milliseconds (MILLISECONDS). Note that,
     *         when you specify a time delta for timecode-based caption sources, such as SCC and STL, and your time
     *         delta isn't a multiple of the input frame rate, MediaConvert snaps the captions to the nearest frame. For
     *         example, when your input video frame rate is 25 fps and you specify 1010ms for time delta, MediaConvert
     *         delays your captions by 1000 ms.
     */

    public Integer getTimeDelta() {
        return this.timeDelta;
    }

    /**
     * Optional. Use this setting when you need to adjust the sync between your sidecar captions and your video. For
     * more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/time-delta-use-cases.html. Enter a
     * positive or negative number to modify the times in the captions file. For example, type 15 to add 15 seconds to
     * all the times in the captions file. Type -5 to subtract 5 seconds from the times in the captions file. You can
     * optionally specify your time delta in milliseconds instead of seconds. When you do so, set the related setting,
     * Time delta units (TimeDeltaUnits) to Milliseconds (MILLISECONDS). Note that, when you specify a time delta for
     * timecode-based caption sources, such as SCC and STL, and your time delta isn't a multiple of the input frame rate,
     * MediaConvert snaps the captions to the nearest frame. For example, when your input video frame rate is 25 fps and
     * you specify 1010ms for time delta, MediaConvert delays your captions by 1000 ms.
     * 
     * @param timeDelta
     *        Optional. Use this setting when you need to adjust the sync between your sidecar captions and your video.
     *        For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/time-delta-use-cases.html.
     *        Enter a positive or negative number to modify the times in the captions file. For example, type 15 to add
     *        15 seconds to all the times in the captions file. Type -5 to subtract 5 seconds from the times in the
     *        captions file. You can optionally specify your time delta in milliseconds instead of seconds. When you do
     *        so, set the related setting, Time delta units (TimeDeltaUnits) to Milliseconds (MILLISECONDS). Note that,
     *        when you specify a time delta for timecode-based caption sources, such as SCC and STL, and your time delta
     *        isn't a multiple of the input frame rate, MediaConvert snaps the captions to the nearest frame. For
     *        example, when your input video frame rate is 25 fps and you specify 1010ms for time delta, MediaConvert
     *        delays your captions by 1000 ms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSourceSettings withTimeDelta(Integer timeDelta) {
        setTimeDelta(timeDelta);
        return this;
    }

    /**
     * When you use the setting Time delta (TimeDelta) to adjust the sync between your sidecar captions and your video,
     * use this setting to specify the units for the delta that you specify. When you don't specify a value for Time
     * delta units (TimeDeltaUnits), MediaConvert uses seconds by default.
     * 
     * @param timeDeltaUnits
     *        When you use the setting Time delta (TimeDelta) to adjust the sync between your sidecar captions and your
     *        video, use this setting to specify the units for the delta that you specify. When you don't specify a
     *        value for Time delta units (TimeDeltaUnits), MediaConvert uses seconds by default.
     * @see FileSourceTimeDeltaUnits
     */

    public void setTimeDeltaUnits(String timeDeltaUnits) {
        this.timeDeltaUnits = timeDeltaUnits;
    }

    /**
     * When you use the setting Time delta (TimeDelta) to adjust the sync between your sidecar captions and your video,
     * use this setting to specify the units for the delta that you specify. When you don't specify a value for Time
     * delta units (TimeDeltaUnits), MediaConvert uses seconds by default.
     * 
     * @return When you use the setting Time delta (TimeDelta) to adjust the sync between your sidecar captions and your
     *         video, use this setting to specify the units for the delta that you specify. When you don't specify a
     *         value for Time delta units (TimeDeltaUnits), MediaConvert uses seconds by default.
     * @see FileSourceTimeDeltaUnits
     */

    public String getTimeDeltaUnits() {
        return this.timeDeltaUnits;
    }

    /**
     * When you use the setting Time delta (TimeDelta) to adjust the sync between your sidecar captions and your video,
     * use this setting to specify the units for the delta that you specify. When you don't specify a value for Time
     * delta units (TimeDeltaUnits), MediaConvert uses seconds by default.
     * 
     * @param timeDeltaUnits
     *        When you use the setting Time delta (TimeDelta) to adjust the sync between your sidecar captions and your
     *        video, use this setting to specify the units for the delta that you specify. When you don't specify a
     *        value for Time delta units (TimeDeltaUnits), MediaConvert uses seconds by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSourceTimeDeltaUnits
     */

    public FileSourceSettings withTimeDeltaUnits(String timeDeltaUnits) {
        setTimeDeltaUnits(timeDeltaUnits);
        return this;
    }

    /**
     * When you use the setting Time delta (TimeDelta) to adjust the sync between your sidecar captions and your video,
     * use this setting to specify the units for the delta that you specify. When you don't specify a value for Time
     * delta units (TimeDeltaUnits), MediaConvert uses seconds by default.
     * 
     * @param timeDeltaUnits
     *        When you use the setting Time delta (TimeDelta) to adjust the sync between your sidecar captions and your
     *        video, use this setting to specify the units for the delta that you specify. When you don't specify a
     *        value for Time delta units (TimeDeltaUnits), MediaConvert uses seconds by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSourceTimeDeltaUnits
     */

    public FileSourceSettings withTimeDeltaUnits(FileSourceTimeDeltaUnits timeDeltaUnits) {
        this.timeDeltaUnits = timeDeltaUnits.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConvert608To708() != null)
            sb.append("Convert608To708: ").append(getConvert608To708()).append(",");
        if (getFramerate() != null)
            sb.append("Framerate: ").append(getFramerate()).append(",");
        if (getSourceFile() != null)
            sb.append("SourceFile: ").append(getSourceFile()).append(",");
        if (getTimeDelta() != null)
            sb.append("TimeDelta: ").append(getTimeDelta()).append(",");
        if (getTimeDeltaUnits() != null)
            sb.append("TimeDeltaUnits: ").append(getTimeDeltaUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileSourceSettings == false)
            return false;
        FileSourceSettings other = (FileSourceSettings) obj;
        if (other.getConvert608To708() == null ^ this.getConvert608To708() == null)
            return false;
        if (other.getConvert608To708() != null && other.getConvert608To708().equals(this.getConvert608To708()) == false)
            return false;
        if (other.getFramerate() == null ^ this.getFramerate() == null)
            return false;
        if (other.getFramerate() != null && other.getFramerate().equals(this.getFramerate()) == false)
            return false;
        if (other.getSourceFile() == null ^ this.getSourceFile() == null)
            return false;
        if (other.getSourceFile() != null && other.getSourceFile().equals(this.getSourceFile()) == false)
            return false;
        if (other.getTimeDelta() == null ^ this.getTimeDelta() == null)
            return false;
        if (other.getTimeDelta() != null && other.getTimeDelta().equals(this.getTimeDelta()) == false)
            return false;
        if (other.getTimeDeltaUnits() == null ^ this.getTimeDeltaUnits() == null)
            return false;
        if (other.getTimeDeltaUnits() != null && other.getTimeDeltaUnits().equals(this.getTimeDeltaUnits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConvert608To708() == null) ? 0 : getConvert608To708().hashCode());
        hashCode = prime * hashCode + ((getFramerate() == null) ? 0 : getFramerate().hashCode());
        hashCode = prime * hashCode + ((getSourceFile() == null) ? 0 : getSourceFile().hashCode());
        hashCode = prime * hashCode + ((getTimeDelta() == null) ? 0 : getTimeDelta().hashCode());
        hashCode = prime * hashCode + ((getTimeDeltaUnits() == null) ? 0 : getTimeDeltaUnits().hashCode());
        return hashCode;
    }

    @Override
    public FileSourceSettings clone() {
        try {
            return (FileSourceSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.FileSourceSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

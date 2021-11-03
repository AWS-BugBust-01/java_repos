/*
 * Copyright 2013 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.eclipse.explorer.identitymanagement;

public class OpenRolesEditorAction extends AbstractOpenEditorAction {

    private final static String EDITOR_ID = "com.amazonaws.eclipse.explorer.identitymanagement.role.roleEditor";

    public OpenRolesEditorAction(String titleName) {
        super(titleName, EDITOR_ID);
    }
}

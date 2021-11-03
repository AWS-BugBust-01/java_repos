/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.xray.exceptions;

public class SegmentNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -3341201172459643090L;

    public SegmentNotFoundException() {
    }

    public SegmentNotFoundException(String message) {
        super(message);
    }

    public SegmentNotFoundException(Throwable cause) {
        super(cause);
    }

    public SegmentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

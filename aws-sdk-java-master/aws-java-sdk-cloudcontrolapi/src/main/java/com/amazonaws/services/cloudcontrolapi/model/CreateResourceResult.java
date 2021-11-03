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
package com.amazonaws.services.cloudcontrolapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/CreateResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Represents the current status of the resource creation request.
     * </p>
     * <p>
     * After you have initiated a resource creation request, you can monitor the progress of your request by calling <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html">
     * GetResourceRequestStatus</a> using the <code>RequestToken</code> of the <code>ProgressEvent</code> returned by
     * <code>CreateResource</code>.
     * </p>
     */
    private ProgressEvent progressEvent;

    /**
     * <p>
     * Represents the current status of the resource creation request.
     * </p>
     * <p>
     * After you have initiated a resource creation request, you can monitor the progress of your request by calling <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html">
     * GetResourceRequestStatus</a> using the <code>RequestToken</code> of the <code>ProgressEvent</code> returned by
     * <code>CreateResource</code>.
     * </p>
     * 
     * @param progressEvent
     *        Represents the current status of the resource creation request.</p>
     *        <p>
     *        After you have initiated a resource creation request, you can monitor the progress of your request by
     *        calling <a
     *        href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html"
     *        >GetResourceRequestStatus</a> using the <code>RequestToken</code> of the <code>ProgressEvent</code>
     *        returned by <code>CreateResource</code>.
     */

    public void setProgressEvent(ProgressEvent progressEvent) {
        this.progressEvent = progressEvent;
    }

    /**
     * <p>
     * Represents the current status of the resource creation request.
     * </p>
     * <p>
     * After you have initiated a resource creation request, you can monitor the progress of your request by calling <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html">
     * GetResourceRequestStatus</a> using the <code>RequestToken</code> of the <code>ProgressEvent</code> returned by
     * <code>CreateResource</code>.
     * </p>
     * 
     * @return Represents the current status of the resource creation request.</p>
     *         <p>
     *         After you have initiated a resource creation request, you can monitor the progress of your request by
     *         calling <a href=
     *         "https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html"
     *         >GetResourceRequestStatus</a> using the <code>RequestToken</code> of the <code>ProgressEvent</code>
     *         returned by <code>CreateResource</code>.
     */

    public ProgressEvent getProgressEvent() {
        return this.progressEvent;
    }

    /**
     * <p>
     * Represents the current status of the resource creation request.
     * </p>
     * <p>
     * After you have initiated a resource creation request, you can monitor the progress of your request by calling <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html">
     * GetResourceRequestStatus</a> using the <code>RequestToken</code> of the <code>ProgressEvent</code> returned by
     * <code>CreateResource</code>.
     * </p>
     * 
     * @param progressEvent
     *        Represents the current status of the resource creation request.</p>
     *        <p>
     *        After you have initiated a resource creation request, you can monitor the progress of your request by
     *        calling <a
     *        href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html"
     *        >GetResourceRequestStatus</a> using the <code>RequestToken</code> of the <code>ProgressEvent</code>
     *        returned by <code>CreateResource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceResult withProgressEvent(ProgressEvent progressEvent) {
        setProgressEvent(progressEvent);
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
        if (getProgressEvent() != null)
            sb.append("ProgressEvent: ").append(getProgressEvent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResourceResult == false)
            return false;
        CreateResourceResult other = (CreateResourceResult) obj;
        if (other.getProgressEvent() == null ^ this.getProgressEvent() == null)
            return false;
        if (other.getProgressEvent() != null && other.getProgressEvent().equals(this.getProgressEvent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProgressEvent() == null) ? 0 : getProgressEvent().hashCode());
        return hashCode;
    }

    @Override
    public CreateResourceResult clone() {
        try {
            return (CreateResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

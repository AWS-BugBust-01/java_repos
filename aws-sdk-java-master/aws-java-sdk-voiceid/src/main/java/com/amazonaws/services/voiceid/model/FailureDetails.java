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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains error details for a failed batch job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/FailureDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailureDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the error that caused the batch job failure.
     * </p>
     */
    private String message;
    /**
     * <p>
     * An HTTP status code representing the nature of the error.
     * </p>
     */
    private Integer statusCode;

    /**
     * <p>
     * A description of the error that caused the batch job failure.
     * </p>
     * 
     * @param message
     *        A description of the error that caused the batch job failure.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the error that caused the batch job failure.
     * </p>
     * 
     * @return A description of the error that caused the batch job failure.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A description of the error that caused the batch job failure.
     * </p>
     * 
     * @param message
     *        A description of the error that caused the batch job failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureDetails withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * An HTTP status code representing the nature of the error.
     * </p>
     * 
     * @param statusCode
     *        An HTTP status code representing the nature of the error.
     */

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * An HTTP status code representing the nature of the error.
     * </p>
     * 
     * @return An HTTP status code representing the nature of the error.
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * An HTTP status code representing the nature of the error.
     * </p>
     * 
     * @param statusCode
     *        An HTTP status code representing the nature of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureDetails withStatusCode(Integer statusCode) {
        setStatusCode(statusCode);
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailureDetails == false)
            return false;
        FailureDetails other = (FailureDetails) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        return hashCode;
    }

    @Override
    public FailureDetails clone() {
        try {
            return (FailureDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.voiceid.model.transform.FailureDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

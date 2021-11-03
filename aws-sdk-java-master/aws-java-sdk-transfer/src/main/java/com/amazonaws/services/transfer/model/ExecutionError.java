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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the error message and type, for an error that occurs during the execution of the workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ExecutionError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the error type: currently, the only valid value is <code>PERMISSION_DENIED</code>, which occurs if your
     * policy does not contain the correct permissions to complete one or more of the steps in the workflow.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Specifies the descriptive message that corresponds to the <code>ErrorType</code>.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Specifies the error type: currently, the only valid value is <code>PERMISSION_DENIED</code>, which occurs if your
     * policy does not contain the correct permissions to complete one or more of the steps in the workflow.
     * </p>
     * 
     * @param type
     *        Specifies the error type: currently, the only valid value is <code>PERMISSION_DENIED</code>, which occurs
     *        if your policy does not contain the correct permissions to complete one or more of the steps in the
     *        workflow.
     * @see ExecutionErrorType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the error type: currently, the only valid value is <code>PERMISSION_DENIED</code>, which occurs if your
     * policy does not contain the correct permissions to complete one or more of the steps in the workflow.
     * </p>
     * 
     * @return Specifies the error type: currently, the only valid value is <code>PERMISSION_DENIED</code>, which occurs
     *         if your policy does not contain the correct permissions to complete one or more of the steps in the
     *         workflow.
     * @see ExecutionErrorType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies the error type: currently, the only valid value is <code>PERMISSION_DENIED</code>, which occurs if your
     * policy does not contain the correct permissions to complete one or more of the steps in the workflow.
     * </p>
     * 
     * @param type
     *        Specifies the error type: currently, the only valid value is <code>PERMISSION_DENIED</code>, which occurs
     *        if your policy does not contain the correct permissions to complete one or more of the steps in the
     *        workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionErrorType
     */

    public ExecutionError withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies the error type: currently, the only valid value is <code>PERMISSION_DENIED</code>, which occurs if your
     * policy does not contain the correct permissions to complete one or more of the steps in the workflow.
     * </p>
     * 
     * @param type
     *        Specifies the error type: currently, the only valid value is <code>PERMISSION_DENIED</code>, which occurs
     *        if your policy does not contain the correct permissions to complete one or more of the steps in the
     *        workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionErrorType
     */

    public ExecutionError withType(ExecutionErrorType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the descriptive message that corresponds to the <code>ErrorType</code>.
     * </p>
     * 
     * @param message
     *        Specifies the descriptive message that corresponds to the <code>ErrorType</code>.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Specifies the descriptive message that corresponds to the <code>ErrorType</code>.
     * </p>
     * 
     * @return Specifies the descriptive message that corresponds to the <code>ErrorType</code>.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Specifies the descriptive message that corresponds to the <code>ErrorType</code>.
     * </p>
     * 
     * @param message
     *        Specifies the descriptive message that corresponds to the <code>ErrorType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionError withMessage(String message) {
        setMessage(message);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionError == false)
            return false;
        ExecutionError other = (ExecutionError) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public ExecutionError clone() {
        try {
            return (ExecutionError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.ExecutionErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

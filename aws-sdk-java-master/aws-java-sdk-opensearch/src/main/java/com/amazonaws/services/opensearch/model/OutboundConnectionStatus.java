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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The connection status of an outbound cross-cluster connection.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutboundConnectionStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state code for the outbound connection. Can be one of the following:
     * </p>
     * <ul>
     * <li>VALIDATING: The outbound connection request is being validated.</li>
     * <li>VALIDATION_FAILED: Validation failed for the connection request.</li>
     * <li>PENDING_ACCEPTANCE: Outbound connection request is validated and is not yet accepted by the remote domain
     * owner.</li>
     * <li>APPROVED: Outbound connection has been approved by the remote domain owner for getting provisioned.</li>
     * <li>PROVISIONING: Outbound connection request is in process.</li>
     * <li>ACTIVE: Outbound connection is active and ready to use.</li>
     * <li>REJECTING: Outbound connection rejection by remote domain owner is in progress.</li>
     * <li>REJECTED: Outbound connection request is rejected by remote domain owner.</li>
     * <li>DELETING: Outbound connection deletion is in progress.</li>
     * <li>DELETED: Outbound connection is deleted and can no longer be used.</li>
     * </ul>
     */
    private String statusCode;
    /**
     * <p>
     * Verbose information for the outbound connection status.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The state code for the outbound connection. Can be one of the following:
     * </p>
     * <ul>
     * <li>VALIDATING: The outbound connection request is being validated.</li>
     * <li>VALIDATION_FAILED: Validation failed for the connection request.</li>
     * <li>PENDING_ACCEPTANCE: Outbound connection request is validated and is not yet accepted by the remote domain
     * owner.</li>
     * <li>APPROVED: Outbound connection has been approved by the remote domain owner for getting provisioned.</li>
     * <li>PROVISIONING: Outbound connection request is in process.</li>
     * <li>ACTIVE: Outbound connection is active and ready to use.</li>
     * <li>REJECTING: Outbound connection rejection by remote domain owner is in progress.</li>
     * <li>REJECTED: Outbound connection request is rejected by remote domain owner.</li>
     * <li>DELETING: Outbound connection deletion is in progress.</li>
     * <li>DELETED: Outbound connection is deleted and can no longer be used.</li>
     * </ul>
     * 
     * @param statusCode
     *        The state code for the outbound connection. Can be one of the following:</p>
     *        <ul>
     *        <li>VALIDATING: The outbound connection request is being validated.</li>
     *        <li>VALIDATION_FAILED: Validation failed for the connection request.</li>
     *        <li>PENDING_ACCEPTANCE: Outbound connection request is validated and is not yet accepted by the remote
     *        domain owner.</li>
     *        <li>APPROVED: Outbound connection has been approved by the remote domain owner for getting provisioned.</li>
     *        <li>PROVISIONING: Outbound connection request is in process.</li>
     *        <li>ACTIVE: Outbound connection is active and ready to use.</li>
     *        <li>REJECTING: Outbound connection rejection by remote domain owner is in progress.</li>
     *        <li>REJECTED: Outbound connection request is rejected by remote domain owner.</li>
     *        <li>DELETING: Outbound connection deletion is in progress.</li>
     *        <li>DELETED: Outbound connection is deleted and can no longer be used.</li>
     * @see OutboundConnectionStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The state code for the outbound connection. Can be one of the following:
     * </p>
     * <ul>
     * <li>VALIDATING: The outbound connection request is being validated.</li>
     * <li>VALIDATION_FAILED: Validation failed for the connection request.</li>
     * <li>PENDING_ACCEPTANCE: Outbound connection request is validated and is not yet accepted by the remote domain
     * owner.</li>
     * <li>APPROVED: Outbound connection has been approved by the remote domain owner for getting provisioned.</li>
     * <li>PROVISIONING: Outbound connection request is in process.</li>
     * <li>ACTIVE: Outbound connection is active and ready to use.</li>
     * <li>REJECTING: Outbound connection rejection by remote domain owner is in progress.</li>
     * <li>REJECTED: Outbound connection request is rejected by remote domain owner.</li>
     * <li>DELETING: Outbound connection deletion is in progress.</li>
     * <li>DELETED: Outbound connection is deleted and can no longer be used.</li>
     * </ul>
     * 
     * @return The state code for the outbound connection. Can be one of the following:</p>
     *         <ul>
     *         <li>VALIDATING: The outbound connection request is being validated.</li>
     *         <li>VALIDATION_FAILED: Validation failed for the connection request.</li>
     *         <li>PENDING_ACCEPTANCE: Outbound connection request is validated and is not yet accepted by the remote
     *         domain owner.</li>
     *         <li>APPROVED: Outbound connection has been approved by the remote domain owner for getting provisioned.</li>
     *         <li>PROVISIONING: Outbound connection request is in process.</li>
     *         <li>ACTIVE: Outbound connection is active and ready to use.</li>
     *         <li>REJECTING: Outbound connection rejection by remote domain owner is in progress.</li>
     *         <li>REJECTED: Outbound connection request is rejected by remote domain owner.</li>
     *         <li>DELETING: Outbound connection deletion is in progress.</li>
     *         <li>DELETED: Outbound connection is deleted and can no longer be used.</li>
     * @see OutboundConnectionStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The state code for the outbound connection. Can be one of the following:
     * </p>
     * <ul>
     * <li>VALIDATING: The outbound connection request is being validated.</li>
     * <li>VALIDATION_FAILED: Validation failed for the connection request.</li>
     * <li>PENDING_ACCEPTANCE: Outbound connection request is validated and is not yet accepted by the remote domain
     * owner.</li>
     * <li>APPROVED: Outbound connection has been approved by the remote domain owner for getting provisioned.</li>
     * <li>PROVISIONING: Outbound connection request is in process.</li>
     * <li>ACTIVE: Outbound connection is active and ready to use.</li>
     * <li>REJECTING: Outbound connection rejection by remote domain owner is in progress.</li>
     * <li>REJECTED: Outbound connection request is rejected by remote domain owner.</li>
     * <li>DELETING: Outbound connection deletion is in progress.</li>
     * <li>DELETED: Outbound connection is deleted and can no longer be used.</li>
     * </ul>
     * 
     * @param statusCode
     *        The state code for the outbound connection. Can be one of the following:</p>
     *        <ul>
     *        <li>VALIDATING: The outbound connection request is being validated.</li>
     *        <li>VALIDATION_FAILED: Validation failed for the connection request.</li>
     *        <li>PENDING_ACCEPTANCE: Outbound connection request is validated and is not yet accepted by the remote
     *        domain owner.</li>
     *        <li>APPROVED: Outbound connection has been approved by the remote domain owner for getting provisioned.</li>
     *        <li>PROVISIONING: Outbound connection request is in process.</li>
     *        <li>ACTIVE: Outbound connection is active and ready to use.</li>
     *        <li>REJECTING: Outbound connection rejection by remote domain owner is in progress.</li>
     *        <li>REJECTED: Outbound connection request is rejected by remote domain owner.</li>
     *        <li>DELETING: Outbound connection deletion is in progress.</li>
     *        <li>DELETED: Outbound connection is deleted and can no longer be used.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutboundConnectionStatusCode
     */

    public OutboundConnectionStatus withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The state code for the outbound connection. Can be one of the following:
     * </p>
     * <ul>
     * <li>VALIDATING: The outbound connection request is being validated.</li>
     * <li>VALIDATION_FAILED: Validation failed for the connection request.</li>
     * <li>PENDING_ACCEPTANCE: Outbound connection request is validated and is not yet accepted by the remote domain
     * owner.</li>
     * <li>APPROVED: Outbound connection has been approved by the remote domain owner for getting provisioned.</li>
     * <li>PROVISIONING: Outbound connection request is in process.</li>
     * <li>ACTIVE: Outbound connection is active and ready to use.</li>
     * <li>REJECTING: Outbound connection rejection by remote domain owner is in progress.</li>
     * <li>REJECTED: Outbound connection request is rejected by remote domain owner.</li>
     * <li>DELETING: Outbound connection deletion is in progress.</li>
     * <li>DELETED: Outbound connection is deleted and can no longer be used.</li>
     * </ul>
     * 
     * @param statusCode
     *        The state code for the outbound connection. Can be one of the following:</p>
     *        <ul>
     *        <li>VALIDATING: The outbound connection request is being validated.</li>
     *        <li>VALIDATION_FAILED: Validation failed for the connection request.</li>
     *        <li>PENDING_ACCEPTANCE: Outbound connection request is validated and is not yet accepted by the remote
     *        domain owner.</li>
     *        <li>APPROVED: Outbound connection has been approved by the remote domain owner for getting provisioned.</li>
     *        <li>PROVISIONING: Outbound connection request is in process.</li>
     *        <li>ACTIVE: Outbound connection is active and ready to use.</li>
     *        <li>REJECTING: Outbound connection rejection by remote domain owner is in progress.</li>
     *        <li>REJECTED: Outbound connection request is rejected by remote domain owner.</li>
     *        <li>DELETING: Outbound connection deletion is in progress.</li>
     *        <li>DELETED: Outbound connection is deleted and can no longer be used.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutboundConnectionStatusCode
     */

    public OutboundConnectionStatus withStatusCode(OutboundConnectionStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * Verbose information for the outbound connection status.
     * </p>
     * 
     * @param message
     *        Verbose information for the outbound connection status.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Verbose information for the outbound connection status.
     * </p>
     * 
     * @return Verbose information for the outbound connection status.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Verbose information for the outbound connection status.
     * </p>
     * 
     * @param message
     *        Verbose information for the outbound connection status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutboundConnectionStatus withMessage(String message) {
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
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
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

        if (obj instanceof OutboundConnectionStatus == false)
            return false;
        OutboundConnectionStatus other = (OutboundConnectionStatus) obj;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
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

        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public OutboundConnectionStatus clone() {
        try {
            return (OutboundConnectionStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.OutboundConnectionStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

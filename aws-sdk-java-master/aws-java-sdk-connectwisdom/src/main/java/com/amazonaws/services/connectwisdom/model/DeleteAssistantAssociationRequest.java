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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/DeleteAssistantAssociation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAssistantAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the assistant association. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     */
    private String assistantAssociationId;
    /**
     * <p>
     * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     */
    private String assistantId;

    /**
     * <p>
     * The identifier of the assistant association. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param assistantAssociationId
     *        The identifier of the assistant association. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public void setAssistantAssociationId(String assistantAssociationId) {
        this.assistantAssociationId = assistantAssociationId;
    }

    /**
     * <p>
     * The identifier of the assistant association. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @return The identifier of the assistant association. Can be either the ID or the ARN. URLs cannot contain the
     *         ARN.
     */

    public String getAssistantAssociationId() {
        return this.assistantAssociationId;
    }

    /**
     * <p>
     * The identifier of the assistant association. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param assistantAssociationId
     *        The identifier of the assistant association. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAssistantAssociationRequest withAssistantAssociationId(String assistantAssociationId) {
        setAssistantAssociationId(assistantAssociationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param assistantId
     *        The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @return The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public String getAssistantId() {
        return this.assistantId;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param assistantId
     *        The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAssistantAssociationRequest withAssistantId(String assistantId) {
        setAssistantId(assistantId);
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
        if (getAssistantAssociationId() != null)
            sb.append("AssistantAssociationId: ").append(getAssistantAssociationId()).append(",");
        if (getAssistantId() != null)
            sb.append("AssistantId: ").append(getAssistantId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAssistantAssociationRequest == false)
            return false;
        DeleteAssistantAssociationRequest other = (DeleteAssistantAssociationRequest) obj;
        if (other.getAssistantAssociationId() == null ^ this.getAssistantAssociationId() == null)
            return false;
        if (other.getAssistantAssociationId() != null && other.getAssistantAssociationId().equals(this.getAssistantAssociationId()) == false)
            return false;
        if (other.getAssistantId() == null ^ this.getAssistantId() == null)
            return false;
        if (other.getAssistantId() != null && other.getAssistantId().equals(this.getAssistantId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssistantAssociationId() == null) ? 0 : getAssistantAssociationId().hashCode());
        hashCode = prime * hashCode + ((getAssistantId() == null) ? 0 : getAssistantId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAssistantAssociationRequest clone() {
        return (DeleteAssistantAssociationRequest) super.clone();
    }

}

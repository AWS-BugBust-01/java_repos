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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateAgentStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAgentStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The name of the status.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the status.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The state of the status.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The display order of the status.
     * </p>
     */
    private Integer displayOrder;
    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentStatusRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The name of the status.
     * </p>
     * 
     * @param name
     *        The name of the status.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the status.
     * </p>
     * 
     * @return The name of the status.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the status.
     * </p>
     * 
     * @param name
     *        The name of the status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentStatusRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the status.
     * </p>
     * 
     * @param description
     *        The description of the status.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the status.
     * </p>
     * 
     * @return The description of the status.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the status.
     * </p>
     * 
     * @param description
     *        The description of the status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentStatusRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The state of the status.
     * </p>
     * 
     * @param state
     *        The state of the status.
     * @see AgentStatusState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the status.
     * </p>
     * 
     * @return The state of the status.
     * @see AgentStatusState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the status.
     * </p>
     * 
     * @param state
     *        The state of the status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatusState
     */

    public CreateAgentStatusRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the status.
     * </p>
     * 
     * @param state
     *        The state of the status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatusState
     */

    public CreateAgentStatusRequest withState(AgentStatusState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The display order of the status.
     * </p>
     * 
     * @param displayOrder
     *        The display order of the status.
     */

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * <p>
     * The display order of the status.
     * </p>
     * 
     * @return The display order of the status.
     */

    public Integer getDisplayOrder() {
        return this.displayOrder;
    }

    /**
     * <p>
     * The display order of the status.
     * </p>
     * 
     * @param displayOrder
     *        The display order of the status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentStatusRequest withDisplayOrder(Integer displayOrder) {
        setDisplayOrder(displayOrder);
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @return One or more tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentStatusRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAgentStatusRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentStatusRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentStatusRequest clearTagsEntries() {
        this.tags = null;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getDisplayOrder() != null)
            sb.append("DisplayOrder: ").append(getDisplayOrder()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAgentStatusRequest == false)
            return false;
        CreateAgentStatusRequest other = (CreateAgentStatusRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getDisplayOrder() == null ^ this.getDisplayOrder() == null)
            return false;
        if (other.getDisplayOrder() != null && other.getDisplayOrder().equals(this.getDisplayOrder()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getDisplayOrder() == null) ? 0 : getDisplayOrder().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAgentStatusRequest clone() {
        return (CreateAgentStatusRequest) super.clone();
    }

}

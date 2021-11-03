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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the custom plugin.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CustomPluginSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomPluginSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time that the custom plugin was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom plugin.
     * </p>
     */
    private String customPluginArn;
    /**
     * <p>
     * The state of the custom plugin.
     * </p>
     */
    private String customPluginState;
    /**
     * <p>
     * A description of the custom plugin.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The latest revision of the custom plugin.
     * </p>
     */
    private CustomPluginRevisionSummary latestRevision;
    /**
     * <p>
     * The name of the custom plugin.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The time that the custom plugin was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the custom plugin was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the custom plugin was created.
     * </p>
     * 
     * @return The time that the custom plugin was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the custom plugin was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the custom plugin was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomPluginSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom plugin.
     * </p>
     * 
     * @param customPluginArn
     *        The Amazon Resource Name (ARN) of the custom plugin.
     */

    public void setCustomPluginArn(String customPluginArn) {
        this.customPluginArn = customPluginArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom plugin.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the custom plugin.
     */

    public String getCustomPluginArn() {
        return this.customPluginArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom plugin.
     * </p>
     * 
     * @param customPluginArn
     *        The Amazon Resource Name (ARN) of the custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomPluginSummary withCustomPluginArn(String customPluginArn) {
        setCustomPluginArn(customPluginArn);
        return this;
    }

    /**
     * <p>
     * The state of the custom plugin.
     * </p>
     * 
     * @param customPluginState
     *        The state of the custom plugin.
     * @see CustomPluginState
     */

    public void setCustomPluginState(String customPluginState) {
        this.customPluginState = customPluginState;
    }

    /**
     * <p>
     * The state of the custom plugin.
     * </p>
     * 
     * @return The state of the custom plugin.
     * @see CustomPluginState
     */

    public String getCustomPluginState() {
        return this.customPluginState;
    }

    /**
     * <p>
     * The state of the custom plugin.
     * </p>
     * 
     * @param customPluginState
     *        The state of the custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomPluginState
     */

    public CustomPluginSummary withCustomPluginState(String customPluginState) {
        setCustomPluginState(customPluginState);
        return this;
    }

    /**
     * <p>
     * The state of the custom plugin.
     * </p>
     * 
     * @param customPluginState
     *        The state of the custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomPluginState
     */

    public CustomPluginSummary withCustomPluginState(CustomPluginState customPluginState) {
        this.customPluginState = customPluginState.toString();
        return this;
    }

    /**
     * <p>
     * A description of the custom plugin.
     * </p>
     * 
     * @param description
     *        A description of the custom plugin.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the custom plugin.
     * </p>
     * 
     * @return A description of the custom plugin.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the custom plugin.
     * </p>
     * 
     * @param description
     *        A description of the custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomPluginSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The latest revision of the custom plugin.
     * </p>
     * 
     * @param latestRevision
     *        The latest revision of the custom plugin.
     */

    public void setLatestRevision(CustomPluginRevisionSummary latestRevision) {
        this.latestRevision = latestRevision;
    }

    /**
     * <p>
     * The latest revision of the custom plugin.
     * </p>
     * 
     * @return The latest revision of the custom plugin.
     */

    public CustomPluginRevisionSummary getLatestRevision() {
        return this.latestRevision;
    }

    /**
     * <p>
     * The latest revision of the custom plugin.
     * </p>
     * 
     * @param latestRevision
     *        The latest revision of the custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomPluginSummary withLatestRevision(CustomPluginRevisionSummary latestRevision) {
        setLatestRevision(latestRevision);
        return this;
    }

    /**
     * <p>
     * The name of the custom plugin.
     * </p>
     * 
     * @param name
     *        The name of the custom plugin.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the custom plugin.
     * </p>
     * 
     * @return The name of the custom plugin.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the custom plugin.
     * </p>
     * 
     * @param name
     *        The name of the custom plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomPluginSummary withName(String name) {
        setName(name);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCustomPluginArn() != null)
            sb.append("CustomPluginArn: ").append(getCustomPluginArn()).append(",");
        if (getCustomPluginState() != null)
            sb.append("CustomPluginState: ").append(getCustomPluginState()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLatestRevision() != null)
            sb.append("LatestRevision: ").append(getLatestRevision()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomPluginSummary == false)
            return false;
        CustomPluginSummary other = (CustomPluginSummary) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCustomPluginArn() == null ^ this.getCustomPluginArn() == null)
            return false;
        if (other.getCustomPluginArn() != null && other.getCustomPluginArn().equals(this.getCustomPluginArn()) == false)
            return false;
        if (other.getCustomPluginState() == null ^ this.getCustomPluginState() == null)
            return false;
        if (other.getCustomPluginState() != null && other.getCustomPluginState().equals(this.getCustomPluginState()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLatestRevision() == null ^ this.getLatestRevision() == null)
            return false;
        if (other.getLatestRevision() != null && other.getLatestRevision().equals(this.getLatestRevision()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCustomPluginArn() == null) ? 0 : getCustomPluginArn().hashCode());
        hashCode = prime * hashCode + ((getCustomPluginState() == null) ? 0 : getCustomPluginState().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLatestRevision() == null) ? 0 : getLatestRevision().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CustomPluginSummary clone() {
        try {
            return (CustomPluginSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafkaconnect.model.transform.CustomPluginSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

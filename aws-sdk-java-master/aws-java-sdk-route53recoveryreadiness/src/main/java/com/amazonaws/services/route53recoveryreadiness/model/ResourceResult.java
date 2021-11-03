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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Result with status for an individual resource.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ResourceResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceResult implements Serializable, Cloneable, StructuredPojo {

    /** The component id of the resource */
    private String componentId;
    /** The time the resource was last checked for readiness, in ISO-8601 format, UTC. */
    private java.util.Date lastCheckedTimestamp;
    /** The readiness of the resource. */
    private String readiness;
    /** The ARN of the resource */
    private String resourceArn;

    /**
     * The component id of the resource
     * 
     * @param componentId
     *        The component id of the resource
     */

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    /**
     * The component id of the resource
     * 
     * @return The component id of the resource
     */

    public String getComponentId() {
        return this.componentId;
    }

    /**
     * The component id of the resource
     * 
     * @param componentId
     *        The component id of the resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceResult withComponentId(String componentId) {
        setComponentId(componentId);
        return this;
    }

    /**
     * The time the resource was last checked for readiness, in ISO-8601 format, UTC.
     * 
     * @param lastCheckedTimestamp
     *        The time the resource was last checked for readiness, in ISO-8601 format, UTC.
     */

    public void setLastCheckedTimestamp(java.util.Date lastCheckedTimestamp) {
        this.lastCheckedTimestamp = lastCheckedTimestamp;
    }

    /**
     * The time the resource was last checked for readiness, in ISO-8601 format, UTC.
     * 
     * @return The time the resource was last checked for readiness, in ISO-8601 format, UTC.
     */

    public java.util.Date getLastCheckedTimestamp() {
        return this.lastCheckedTimestamp;
    }

    /**
     * The time the resource was last checked for readiness, in ISO-8601 format, UTC.
     * 
     * @param lastCheckedTimestamp
     *        The time the resource was last checked for readiness, in ISO-8601 format, UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceResult withLastCheckedTimestamp(java.util.Date lastCheckedTimestamp) {
        setLastCheckedTimestamp(lastCheckedTimestamp);
        return this;
    }

    /**
     * The readiness of the resource.
     * 
     * @param readiness
     *        The readiness of the resource.
     * @see Readiness
     */

    public void setReadiness(String readiness) {
        this.readiness = readiness;
    }

    /**
     * The readiness of the resource.
     * 
     * @return The readiness of the resource.
     * @see Readiness
     */

    public String getReadiness() {
        return this.readiness;
    }

    /**
     * The readiness of the resource.
     * 
     * @param readiness
     *        The readiness of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Readiness
     */

    public ResourceResult withReadiness(String readiness) {
        setReadiness(readiness);
        return this;
    }

    /**
     * The readiness of the resource.
     * 
     * @param readiness
     *        The readiness of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Readiness
     */

    public ResourceResult withReadiness(Readiness readiness) {
        this.readiness = readiness.toString();
        return this;
    }

    /**
     * The ARN of the resource
     * 
     * @param resourceArn
     *        The ARN of the resource
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * The ARN of the resource
     * 
     * @return The ARN of the resource
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * The ARN of the resource
     * 
     * @param resourceArn
     *        The ARN of the resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getComponentId() != null)
            sb.append("ComponentId: ").append(getComponentId()).append(",");
        if (getLastCheckedTimestamp() != null)
            sb.append("LastCheckedTimestamp: ").append(getLastCheckedTimestamp()).append(",");
        if (getReadiness() != null)
            sb.append("Readiness: ").append(getReadiness()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceResult == false)
            return false;
        ResourceResult other = (ResourceResult) obj;
        if (other.getComponentId() == null ^ this.getComponentId() == null)
            return false;
        if (other.getComponentId() != null && other.getComponentId().equals(this.getComponentId()) == false)
            return false;
        if (other.getLastCheckedTimestamp() == null ^ this.getLastCheckedTimestamp() == null)
            return false;
        if (other.getLastCheckedTimestamp() != null && other.getLastCheckedTimestamp().equals(this.getLastCheckedTimestamp()) == false)
            return false;
        if (other.getReadiness() == null ^ this.getReadiness() == null)
            return false;
        if (other.getReadiness() != null && other.getReadiness().equals(this.getReadiness()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentId() == null) ? 0 : getComponentId().hashCode());
        hashCode = prime * hashCode + ((getLastCheckedTimestamp() == null) ? 0 : getLastCheckedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getReadiness() == null) ? 0 : getReadiness().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public ResourceResult clone() {
        try {
            return (ResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoveryreadiness.model.transform.ResourceResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

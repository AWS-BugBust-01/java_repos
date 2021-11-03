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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of settings that update the current configuration for the <code>RStudioServerPro</code> Domain-level
 * app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RStudioServerProDomainSettingsForUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RStudioServerProDomainSettingsForUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The execution role for the <code>RStudioServerPro</code> Domain-level app.
     * </p>
     */
    private String domainExecutionRoleArn;

    private ResourceSpec defaultResourceSpec;

    /**
     * <p>
     * The execution role for the <code>RStudioServerPro</code> Domain-level app.
     * </p>
     * 
     * @param domainExecutionRoleArn
     *        The execution role for the <code>RStudioServerPro</code> Domain-level app.
     */

    public void setDomainExecutionRoleArn(String domainExecutionRoleArn) {
        this.domainExecutionRoleArn = domainExecutionRoleArn;
    }

    /**
     * <p>
     * The execution role for the <code>RStudioServerPro</code> Domain-level app.
     * </p>
     * 
     * @return The execution role for the <code>RStudioServerPro</code> Domain-level app.
     */

    public String getDomainExecutionRoleArn() {
        return this.domainExecutionRoleArn;
    }

    /**
     * <p>
     * The execution role for the <code>RStudioServerPro</code> Domain-level app.
     * </p>
     * 
     * @param domainExecutionRoleArn
     *        The execution role for the <code>RStudioServerPro</code> Domain-level app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RStudioServerProDomainSettingsForUpdate withDomainExecutionRoleArn(String domainExecutionRoleArn) {
        setDomainExecutionRoleArn(domainExecutionRoleArn);
        return this;
    }

    /**
     * @param defaultResourceSpec
     */

    public void setDefaultResourceSpec(ResourceSpec defaultResourceSpec) {
        this.defaultResourceSpec = defaultResourceSpec;
    }

    /**
     * @return
     */

    public ResourceSpec getDefaultResourceSpec() {
        return this.defaultResourceSpec;
    }

    /**
     * @param defaultResourceSpec
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RStudioServerProDomainSettingsForUpdate withDefaultResourceSpec(ResourceSpec defaultResourceSpec) {
        setDefaultResourceSpec(defaultResourceSpec);
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
        if (getDomainExecutionRoleArn() != null)
            sb.append("DomainExecutionRoleArn: ").append(getDomainExecutionRoleArn()).append(",");
        if (getDefaultResourceSpec() != null)
            sb.append("DefaultResourceSpec: ").append(getDefaultResourceSpec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RStudioServerProDomainSettingsForUpdate == false)
            return false;
        RStudioServerProDomainSettingsForUpdate other = (RStudioServerProDomainSettingsForUpdate) obj;
        if (other.getDomainExecutionRoleArn() == null ^ this.getDomainExecutionRoleArn() == null)
            return false;
        if (other.getDomainExecutionRoleArn() != null && other.getDomainExecutionRoleArn().equals(this.getDomainExecutionRoleArn()) == false)
            return false;
        if (other.getDefaultResourceSpec() == null ^ this.getDefaultResourceSpec() == null)
            return false;
        if (other.getDefaultResourceSpec() != null && other.getDefaultResourceSpec().equals(this.getDefaultResourceSpec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainExecutionRoleArn() == null) ? 0 : getDomainExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDefaultResourceSpec() == null) ? 0 : getDefaultResourceSpec().hashCode());
        return hashCode;
    }

    @Override
    public RStudioServerProDomainSettingsForUpdate clone() {
        try {
            return (RStudioServerProDomainSettingsForUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.RStudioServerProDomainSettingsForUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

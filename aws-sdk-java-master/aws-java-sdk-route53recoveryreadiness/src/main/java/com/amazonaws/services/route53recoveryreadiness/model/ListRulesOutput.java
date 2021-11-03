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
 * A collection of rules used in a readiness check
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListRulesOutput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRulesOutput implements Serializable, Cloneable, StructuredPojo {

    /** The resource type the rule applies to. */
    private String resourceType;
    /** A description of the rule */
    private String ruleDescription;
    /** The Rule's ID. */
    private String ruleId;

    /**
     * The resource type the rule applies to.
     * 
     * @param resourceType
     *        The resource type the rule applies to.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * The resource type the rule applies to.
     * 
     * @return The resource type the rule applies to.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * The resource type the rule applies to.
     * 
     * @param resourceType
     *        The resource type the rule applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesOutput withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * A description of the rule
     * 
     * @param ruleDescription
     *        A description of the rule
     */

    public void setRuleDescription(String ruleDescription) {
        this.ruleDescription = ruleDescription;
    }

    /**
     * A description of the rule
     * 
     * @return A description of the rule
     */

    public String getRuleDescription() {
        return this.ruleDescription;
    }

    /**
     * A description of the rule
     * 
     * @param ruleDescription
     *        A description of the rule
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesOutput withRuleDescription(String ruleDescription) {
        setRuleDescription(ruleDescription);
        return this;
    }

    /**
     * The Rule's ID.
     * 
     * @param ruleId
     *        The Rule's ID.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * The Rule's ID.
     * 
     * @return The Rule's ID.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * The Rule's ID.
     * 
     * @param ruleId
     *        The Rule's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesOutput withRuleId(String ruleId) {
        setRuleId(ruleId);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getRuleDescription() != null)
            sb.append("RuleDescription: ").append(getRuleDescription()).append(",");
        if (getRuleId() != null)
            sb.append("RuleId: ").append(getRuleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRulesOutput == false)
            return false;
        ListRulesOutput other = (ListRulesOutput) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getRuleDescription() == null ^ this.getRuleDescription() == null)
            return false;
        if (other.getRuleDescription() != null && other.getRuleDescription().equals(this.getRuleDescription()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getRuleDescription() == null) ? 0 : getRuleDescription().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        return hashCode;
    }

    @Override
    public ListRulesOutput clone() {
        try {
            return (ListRulesOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoveryreadiness.model.transform.ListRulesOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

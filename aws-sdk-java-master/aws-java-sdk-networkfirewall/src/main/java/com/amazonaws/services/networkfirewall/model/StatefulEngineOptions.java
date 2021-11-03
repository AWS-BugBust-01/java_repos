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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration settings for the handling of the stateful rule groups in a firewall policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/StatefulEngineOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatefulEngineOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates how to manage the order of stateful rule evaluation for the policy. By default, Network Firewall leaves
     * the rule evaluation order up to the Suricata rule processing engine. If you set this to <code>STRICT_ORDER</code>
     * , your rules are evaluated in the exact order that you provide them in the policy. With strict ordering, the rule
     * groups are evaluated by order of priority, starting from the lowest number, and the rules in each rule group are
     * processed in the order that they're defined.
     * </p>
     */
    private String ruleOrder;

    /**
     * <p>
     * Indicates how to manage the order of stateful rule evaluation for the policy. By default, Network Firewall leaves
     * the rule evaluation order up to the Suricata rule processing engine. If you set this to <code>STRICT_ORDER</code>
     * , your rules are evaluated in the exact order that you provide them in the policy. With strict ordering, the rule
     * groups are evaluated by order of priority, starting from the lowest number, and the rules in each rule group are
     * processed in the order that they're defined.
     * </p>
     * 
     * @param ruleOrder
     *        Indicates how to manage the order of stateful rule evaluation for the policy. By default, Network Firewall
     *        leaves the rule evaluation order up to the Suricata rule processing engine. If you set this to
     *        <code>STRICT_ORDER</code>, your rules are evaluated in the exact order that you provide them in the
     *        policy. With strict ordering, the rule groups are evaluated by order of priority, starting from the lowest
     *        number, and the rules in each rule group are processed in the order that they're defined.
     * @see RuleOrder
     */

    public void setRuleOrder(String ruleOrder) {
        this.ruleOrder = ruleOrder;
    }

    /**
     * <p>
     * Indicates how to manage the order of stateful rule evaluation for the policy. By default, Network Firewall leaves
     * the rule evaluation order up to the Suricata rule processing engine. If you set this to <code>STRICT_ORDER</code>
     * , your rules are evaluated in the exact order that you provide them in the policy. With strict ordering, the rule
     * groups are evaluated by order of priority, starting from the lowest number, and the rules in each rule group are
     * processed in the order that they're defined.
     * </p>
     * 
     * @return Indicates how to manage the order of stateful rule evaluation for the policy. By default, Network
     *         Firewall leaves the rule evaluation order up to the Suricata rule processing engine. If you set this to
     *         <code>STRICT_ORDER</code>, your rules are evaluated in the exact order that you provide them in the
     *         policy. With strict ordering, the rule groups are evaluated by order of priority, starting from the
     *         lowest number, and the rules in each rule group are processed in the order that they're defined.
     * @see RuleOrder
     */

    public String getRuleOrder() {
        return this.ruleOrder;
    }

    /**
     * <p>
     * Indicates how to manage the order of stateful rule evaluation for the policy. By default, Network Firewall leaves
     * the rule evaluation order up to the Suricata rule processing engine. If you set this to <code>STRICT_ORDER</code>
     * , your rules are evaluated in the exact order that you provide them in the policy. With strict ordering, the rule
     * groups are evaluated by order of priority, starting from the lowest number, and the rules in each rule group are
     * processed in the order that they're defined.
     * </p>
     * 
     * @param ruleOrder
     *        Indicates how to manage the order of stateful rule evaluation for the policy. By default, Network Firewall
     *        leaves the rule evaluation order up to the Suricata rule processing engine. If you set this to
     *        <code>STRICT_ORDER</code>, your rules are evaluated in the exact order that you provide them in the
     *        policy. With strict ordering, the rule groups are evaluated by order of priority, starting from the lowest
     *        number, and the rules in each rule group are processed in the order that they're defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleOrder
     */

    public StatefulEngineOptions withRuleOrder(String ruleOrder) {
        setRuleOrder(ruleOrder);
        return this;
    }

    /**
     * <p>
     * Indicates how to manage the order of stateful rule evaluation for the policy. By default, Network Firewall leaves
     * the rule evaluation order up to the Suricata rule processing engine. If you set this to <code>STRICT_ORDER</code>
     * , your rules are evaluated in the exact order that you provide them in the policy. With strict ordering, the rule
     * groups are evaluated by order of priority, starting from the lowest number, and the rules in each rule group are
     * processed in the order that they're defined.
     * </p>
     * 
     * @param ruleOrder
     *        Indicates how to manage the order of stateful rule evaluation for the policy. By default, Network Firewall
     *        leaves the rule evaluation order up to the Suricata rule processing engine. If you set this to
     *        <code>STRICT_ORDER</code>, your rules are evaluated in the exact order that you provide them in the
     *        policy. With strict ordering, the rule groups are evaluated by order of priority, starting from the lowest
     *        number, and the rules in each rule group are processed in the order that they're defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleOrder
     */

    public StatefulEngineOptions withRuleOrder(RuleOrder ruleOrder) {
        this.ruleOrder = ruleOrder.toString();
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
        if (getRuleOrder() != null)
            sb.append("RuleOrder: ").append(getRuleOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatefulEngineOptions == false)
            return false;
        StatefulEngineOptions other = (StatefulEngineOptions) obj;
        if (other.getRuleOrder() == null ^ this.getRuleOrder() == null)
            return false;
        if (other.getRuleOrder() != null && other.getRuleOrder().equals(this.getRuleOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleOrder() == null) ? 0 : getRuleOrder().hashCode());
        return hashCode;
    }

    @Override
    public StatefulEngineOptions clone() {
        try {
            return (StatefulEngineOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.StatefulEngineOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

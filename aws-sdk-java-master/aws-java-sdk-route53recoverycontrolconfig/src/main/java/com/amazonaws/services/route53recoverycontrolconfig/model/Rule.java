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
package com.amazonaws.services.route53recoverycontrolconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A safety rule. A safety rule can be an assertion rule or a gating rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/Rule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Rule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An assertion rule enforces that, when a routing control state is changed, the criteria set by the rule
     * configuration is met. Otherwise, the change to the routing control is not accepted.
     * </p>
     */
    private AssertionRule aSSERTION;
    /**
     * <p>
     * A gating rule verifies that a set of gating controls evaluates as true, based on a rule configuration that you
     * specify. If the gating rule evaluates to true, Amazon Route 53 Application Recovery Controller allows a set of
     * routing control state changes to run and complete against the set of target controls.
     * </p>
     */
    private GatingRule gATING;

    /**
     * <p>
     * An assertion rule enforces that, when a routing control state is changed, the criteria set by the rule
     * configuration is met. Otherwise, the change to the routing control is not accepted.
     * </p>
     * 
     * @param aSSERTION
     *        An assertion rule enforces that, when a routing control state is changed, the criteria set by the rule
     *        configuration is met. Otherwise, the change to the routing control is not accepted.
     */

    public void setASSERTION(AssertionRule aSSERTION) {
        this.aSSERTION = aSSERTION;
    }

    /**
     * <p>
     * An assertion rule enforces that, when a routing control state is changed, the criteria set by the rule
     * configuration is met. Otherwise, the change to the routing control is not accepted.
     * </p>
     * 
     * @return An assertion rule enforces that, when a routing control state is changed, the criteria set by the rule
     *         configuration is met. Otherwise, the change to the routing control is not accepted.
     */

    public AssertionRule getASSERTION() {
        return this.aSSERTION;
    }

    /**
     * <p>
     * An assertion rule enforces that, when a routing control state is changed, the criteria set by the rule
     * configuration is met. Otherwise, the change to the routing control is not accepted.
     * </p>
     * 
     * @param aSSERTION
     *        An assertion rule enforces that, when a routing control state is changed, the criteria set by the rule
     *        configuration is met. Otherwise, the change to the routing control is not accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withASSERTION(AssertionRule aSSERTION) {
        setASSERTION(aSSERTION);
        return this;
    }

    /**
     * <p>
     * A gating rule verifies that a set of gating controls evaluates as true, based on a rule configuration that you
     * specify. If the gating rule evaluates to true, Amazon Route 53 Application Recovery Controller allows a set of
     * routing control state changes to run and complete against the set of target controls.
     * </p>
     * 
     * @param gATING
     *        A gating rule verifies that a set of gating controls evaluates as true, based on a rule configuration that
     *        you specify. If the gating rule evaluates to true, Amazon Route 53 Application Recovery Controller allows
     *        a set of routing control state changes to run and complete against the set of target controls.
     */

    public void setGATING(GatingRule gATING) {
        this.gATING = gATING;
    }

    /**
     * <p>
     * A gating rule verifies that a set of gating controls evaluates as true, based on a rule configuration that you
     * specify. If the gating rule evaluates to true, Amazon Route 53 Application Recovery Controller allows a set of
     * routing control state changes to run and complete against the set of target controls.
     * </p>
     * 
     * @return A gating rule verifies that a set of gating controls evaluates as true, based on a rule configuration
     *         that you specify. If the gating rule evaluates to true, Amazon Route 53 Application Recovery Controller
     *         allows a set of routing control state changes to run and complete against the set of target controls.
     */

    public GatingRule getGATING() {
        return this.gATING;
    }

    /**
     * <p>
     * A gating rule verifies that a set of gating controls evaluates as true, based on a rule configuration that you
     * specify. If the gating rule evaluates to true, Amazon Route 53 Application Recovery Controller allows a set of
     * routing control state changes to run and complete against the set of target controls.
     * </p>
     * 
     * @param gATING
     *        A gating rule verifies that a set of gating controls evaluates as true, based on a rule configuration that
     *        you specify. If the gating rule evaluates to true, Amazon Route 53 Application Recovery Controller allows
     *        a set of routing control state changes to run and complete against the set of target controls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withGATING(GatingRule gATING) {
        setGATING(gATING);
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
        if (getASSERTION() != null)
            sb.append("ASSERTION: ").append(getASSERTION()).append(",");
        if (getGATING() != null)
            sb.append("GATING: ").append(getGATING());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Rule == false)
            return false;
        Rule other = (Rule) obj;
        if (other.getASSERTION() == null ^ this.getASSERTION() == null)
            return false;
        if (other.getASSERTION() != null && other.getASSERTION().equals(this.getASSERTION()) == false)
            return false;
        if (other.getGATING() == null ^ this.getGATING() == null)
            return false;
        if (other.getGATING() != null && other.getGATING().equals(this.getGATING()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getASSERTION() == null) ? 0 : getASSERTION().hashCode());
        hashCode = prime * hashCode + ((getGATING() == null) ? 0 : getGATING().hashCode());
        return hashCode;
    }

    @Override
    public Rule clone() {
        try {
            return (Rule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoverycontrolconfig.model.transform.RuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

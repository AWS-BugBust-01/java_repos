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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request body that you include when you create a safety rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateSafetyRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSafetyRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private NewAssertionRule assertionRule;
    /**
     * <p>
     * Unique client idempotency token.
     * </p>
     */
    private String clientToken;

    private NewGatingRule gatingRule;

    /**
     * @param assertionRule
     */

    public void setAssertionRule(NewAssertionRule assertionRule) {
        this.assertionRule = assertionRule;
    }

    /**
     * @return
     */

    public NewAssertionRule getAssertionRule() {
        return this.assertionRule;
    }

    /**
     * @param assertionRule
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSafetyRuleRequest withAssertionRule(NewAssertionRule assertionRule) {
        setAssertionRule(assertionRule);
        return this;
    }

    /**
     * <p>
     * Unique client idempotency token.
     * </p>
     * 
     * @param clientToken
     *        Unique client idempotency token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique client idempotency token.
     * </p>
     * 
     * @return Unique client idempotency token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique client idempotency token.
     * </p>
     * 
     * @param clientToken
     *        Unique client idempotency token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSafetyRuleRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * @param gatingRule
     */

    public void setGatingRule(NewGatingRule gatingRule) {
        this.gatingRule = gatingRule;
    }

    /**
     * @return
     */

    public NewGatingRule getGatingRule() {
        return this.gatingRule;
    }

    /**
     * @param gatingRule
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSafetyRuleRequest withGatingRule(NewGatingRule gatingRule) {
        setGatingRule(gatingRule);
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
        if (getAssertionRule() != null)
            sb.append("AssertionRule: ").append(getAssertionRule()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getGatingRule() != null)
            sb.append("GatingRule: ").append(getGatingRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSafetyRuleRequest == false)
            return false;
        CreateSafetyRuleRequest other = (CreateSafetyRuleRequest) obj;
        if (other.getAssertionRule() == null ^ this.getAssertionRule() == null)
            return false;
        if (other.getAssertionRule() != null && other.getAssertionRule().equals(this.getAssertionRule()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getGatingRule() == null ^ this.getGatingRule() == null)
            return false;
        if (other.getGatingRule() != null && other.getGatingRule().equals(this.getGatingRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssertionRule() == null) ? 0 : getAssertionRule().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getGatingRule() == null) ? 0 : getGatingRule().hashCode());
        return hashCode;
    }

    @Override
    public CreateSafetyRuleRequest clone() {
        return (CreateSafetyRuleRequest) super.clone();
    }

}

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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DeleteSafetyRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSafetyRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The request body that you include when you update a safety rule.
     * </p>
     */
    private String safetyRuleArn;

    /**
     * <p>
     * The request body that you include when you update a safety rule.
     * </p>
     * 
     * @param safetyRuleArn
     *        The request body that you include when you update a safety rule.
     */

    public void setSafetyRuleArn(String safetyRuleArn) {
        this.safetyRuleArn = safetyRuleArn;
    }

    /**
     * <p>
     * The request body that you include when you update a safety rule.
     * </p>
     * 
     * @return The request body that you include when you update a safety rule.
     */

    public String getSafetyRuleArn() {
        return this.safetyRuleArn;
    }

    /**
     * <p>
     * The request body that you include when you update a safety rule.
     * </p>
     * 
     * @param safetyRuleArn
     *        The request body that you include when you update a safety rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSafetyRuleRequest withSafetyRuleArn(String safetyRuleArn) {
        setSafetyRuleArn(safetyRuleArn);
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
        if (getSafetyRuleArn() != null)
            sb.append("SafetyRuleArn: ").append(getSafetyRuleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSafetyRuleRequest == false)
            return false;
        DeleteSafetyRuleRequest other = (DeleteSafetyRuleRequest) obj;
        if (other.getSafetyRuleArn() == null ^ this.getSafetyRuleArn() == null)
            return false;
        if (other.getSafetyRuleArn() != null && other.getSafetyRuleArn().equals(this.getSafetyRuleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSafetyRuleArn() == null) ? 0 : getSafetyRuleArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSafetyRuleRequest clone() {
        return (DeleteSafetyRuleRequest) super.clone();
    }

}

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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizeSecurityGroupIngressResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, returns an error.
     * </p>
     */
    private Boolean returnValue;
    /**
     * <p>
     * Information about the inbound (ingress) security group rules that were added.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SecurityGroupRule> securityGroupRules;

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, returns an error.
     * </p>
     * 
     * @param returnValue
     *        Returns <code>true</code> if the request succeeds; otherwise, returns an error.
     */

    public void setReturn(Boolean returnValue) {
        this.returnValue = returnValue;
    }

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, returns an error.
     * </p>
     * 
     * @return Returns <code>true</code> if the request succeeds; otherwise, returns an error.
     */

    public Boolean getReturn() {
        return this.returnValue;
    }

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, returns an error.
     * </p>
     * 
     * @param returnValue
     *        Returns <code>true</code> if the request succeeds; otherwise, returns an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressResult withReturn(Boolean returnValue) {
        setReturn(returnValue);
        return this;
    }

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, returns an error.
     * </p>
     * 
     * @return Returns <code>true</code> if the request succeeds; otherwise, returns an error.
     */

    public Boolean isReturn() {
        return this.returnValue;
    }

    /**
     * <p>
     * Information about the inbound (ingress) security group rules that were added.
     * </p>
     * 
     * @return Information about the inbound (ingress) security group rules that were added.
     */

    public java.util.List<SecurityGroupRule> getSecurityGroupRules() {
        if (securityGroupRules == null) {
            securityGroupRules = new com.amazonaws.internal.SdkInternalList<SecurityGroupRule>();
        }
        return securityGroupRules;
    }

    /**
     * <p>
     * Information about the inbound (ingress) security group rules that were added.
     * </p>
     * 
     * @param securityGroupRules
     *        Information about the inbound (ingress) security group rules that were added.
     */

    public void setSecurityGroupRules(java.util.Collection<SecurityGroupRule> securityGroupRules) {
        if (securityGroupRules == null) {
            this.securityGroupRules = null;
            return;
        }

        this.securityGroupRules = new com.amazonaws.internal.SdkInternalList<SecurityGroupRule>(securityGroupRules);
    }

    /**
     * <p>
     * Information about the inbound (ingress) security group rules that were added.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupRules(java.util.Collection)} or {@link #withSecurityGroupRules(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param securityGroupRules
     *        Information about the inbound (ingress) security group rules that were added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressResult withSecurityGroupRules(SecurityGroupRule... securityGroupRules) {
        if (this.securityGroupRules == null) {
            setSecurityGroupRules(new com.amazonaws.internal.SdkInternalList<SecurityGroupRule>(securityGroupRules.length));
        }
        for (SecurityGroupRule ele : securityGroupRules) {
            this.securityGroupRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the inbound (ingress) security group rules that were added.
     * </p>
     * 
     * @param securityGroupRules
     *        Information about the inbound (ingress) security group rules that were added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeSecurityGroupIngressResult withSecurityGroupRules(java.util.Collection<SecurityGroupRule> securityGroupRules) {
        setSecurityGroupRules(securityGroupRules);
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
        if (getReturn() != null)
            sb.append("Return: ").append(getReturn()).append(",");
        if (getSecurityGroupRules() != null)
            sb.append("SecurityGroupRules: ").append(getSecurityGroupRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizeSecurityGroupIngressResult == false)
            return false;
        AuthorizeSecurityGroupIngressResult other = (AuthorizeSecurityGroupIngressResult) obj;
        if (other.getReturn() == null ^ this.getReturn() == null)
            return false;
        if (other.getReturn() != null && other.getReturn().equals(this.getReturn()) == false)
            return false;
        if (other.getSecurityGroupRules() == null ^ this.getSecurityGroupRules() == null)
            return false;
        if (other.getSecurityGroupRules() != null && other.getSecurityGroupRules().equals(this.getSecurityGroupRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReturn() == null) ? 0 : getReturn().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupRules() == null) ? 0 : getSecurityGroupRules().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizeSecurityGroupIngressResult clone() {
        try {
            return (AuthorizeSecurityGroupIngressResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

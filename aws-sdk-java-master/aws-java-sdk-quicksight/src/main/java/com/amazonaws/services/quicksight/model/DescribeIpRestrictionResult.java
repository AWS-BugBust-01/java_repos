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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeIpRestriction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIpRestrictionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Your AWS account ID.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * Describes the IP rules with CIDR range and description.
     * </p>
     */
    private java.util.Map<String, String> ipRestrictionRuleMap;
    /**
     * <p>
     * Whether or not IP rules are enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The ID of the describe request.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The status of a set of IP restrictions. A successful request returns a 200 status code.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * Your AWS account ID.
     * </p>
     * 
     * @param awsAccountId
     *        Your AWS account ID.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * Your AWS account ID.
     * </p>
     * 
     * @return Your AWS account ID.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * Your AWS account ID.
     * </p>
     * 
     * @param awsAccountId
     *        Your AWS account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpRestrictionResult withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * Describes the IP rules with CIDR range and description.
     * </p>
     * 
     * @return Describes the IP rules with CIDR range and description.
     */

    public java.util.Map<String, String> getIpRestrictionRuleMap() {
        return ipRestrictionRuleMap;
    }

    /**
     * <p>
     * Describes the IP rules with CIDR range and description.
     * </p>
     * 
     * @param ipRestrictionRuleMap
     *        Describes the IP rules with CIDR range and description.
     */

    public void setIpRestrictionRuleMap(java.util.Map<String, String> ipRestrictionRuleMap) {
        this.ipRestrictionRuleMap = ipRestrictionRuleMap;
    }

    /**
     * <p>
     * Describes the IP rules with CIDR range and description.
     * </p>
     * 
     * @param ipRestrictionRuleMap
     *        Describes the IP rules with CIDR range and description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpRestrictionResult withIpRestrictionRuleMap(java.util.Map<String, String> ipRestrictionRuleMap) {
        setIpRestrictionRuleMap(ipRestrictionRuleMap);
        return this;
    }

    /**
     * Add a single IpRestrictionRuleMap entry
     *
     * @see DescribeIpRestrictionResult#withIpRestrictionRuleMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpRestrictionResult addIpRestrictionRuleMapEntry(String key, String value) {
        if (null == this.ipRestrictionRuleMap) {
            this.ipRestrictionRuleMap = new java.util.HashMap<String, String>();
        }
        if (this.ipRestrictionRuleMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.ipRestrictionRuleMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into IpRestrictionRuleMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpRestrictionResult clearIpRestrictionRuleMapEntries() {
        this.ipRestrictionRuleMap = null;
        return this;
    }

    /**
     * <p>
     * Whether or not IP rules are enabled.
     * </p>
     * 
     * @param enabled
     *        Whether or not IP rules are enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether or not IP rules are enabled.
     * </p>
     * 
     * @return Whether or not IP rules are enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether or not IP rules are enabled.
     * </p>
     * 
     * @param enabled
     *        Whether or not IP rules are enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpRestrictionResult withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether or not IP rules are enabled.
     * </p>
     * 
     * @return Whether or not IP rules are enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The ID of the describe request.
     * </p>
     * 
     * @param requestId
     *        The ID of the describe request.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The ID of the describe request.
     * </p>
     * 
     * @return The ID of the describe request.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The ID of the describe request.
     * </p>
     * 
     * @param requestId
     *        The ID of the describe request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpRestrictionResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The status of a set of IP restrictions. A successful request returns a 200 status code.
     * </p>
     * 
     * @param status
     *        The status of a set of IP restrictions. A successful request returns a 200 status code.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a set of IP restrictions. A successful request returns a 200 status code.
     * </p>
     * 
     * @return The status of a set of IP restrictions. A successful request returns a 200 status code.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a set of IP restrictions. A successful request returns a 200 status code.
     * </p>
     * 
     * @param status
     *        The status of a set of IP restrictions. A successful request returns a 200 status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpRestrictionResult withStatus(Integer status) {
        setStatus(status);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getIpRestrictionRuleMap() != null)
            sb.append("IpRestrictionRuleMap: ").append(getIpRestrictionRuleMap()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIpRestrictionResult == false)
            return false;
        DescribeIpRestrictionResult other = (DescribeIpRestrictionResult) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getIpRestrictionRuleMap() == null ^ this.getIpRestrictionRuleMap() == null)
            return false;
        if (other.getIpRestrictionRuleMap() != null && other.getIpRestrictionRuleMap().equals(this.getIpRestrictionRuleMap()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getIpRestrictionRuleMap() == null) ? 0 : getIpRestrictionRuleMap().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIpRestrictionResult clone() {
        try {
            return (DescribeIpRestrictionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

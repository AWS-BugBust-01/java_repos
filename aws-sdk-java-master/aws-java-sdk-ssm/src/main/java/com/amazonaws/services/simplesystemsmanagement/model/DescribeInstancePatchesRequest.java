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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstancePatches" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstancePatchesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the instance whose patch state information should be retrieved.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * Each element in the array is a structure containing a key-value pair.
     * </p>
     * <p>
     * Supported keys for <code>DescribeInstancePatches</code>include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Classification</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Security</code> | <code>SecurityUpdates</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>KBId</code> </b>
     * </p>
     * <p>
     * Sample values: <code>KB4480056</code> | <code>java-1.7.0-openjdk.x86_64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Severity</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Important</code> | <code>Medium</code> | <code>Low</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>State</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Installed</code> | <code>InstalledOther</code> | <code>InstalledPendingReboot</code>
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<PatchOrchestratorFilter> filters;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of patches to return (per page).
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the instance whose patch state information should be retrieved.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance whose patch state information should be retrieved.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance whose patch state information should be retrieved.
     * </p>
     * 
     * @return The ID of the instance whose patch state information should be retrieved.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance whose patch state information should be retrieved.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance whose patch state information should be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancePatchesRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * Each element in the array is a structure containing a key-value pair.
     * </p>
     * <p>
     * Supported keys for <code>DescribeInstancePatches</code>include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Classification</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Security</code> | <code>SecurityUpdates</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>KBId</code> </b>
     * </p>
     * <p>
     * Sample values: <code>KB4480056</code> | <code>java-1.7.0-openjdk.x86_64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Severity</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Important</code> | <code>Medium</code> | <code>Low</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>State</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Installed</code> | <code>InstalledOther</code> | <code>InstalledPendingReboot</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Each element in the array is a structure containing a key-value pair.</p>
     *         <p>
     *         Supported keys for <code>DescribeInstancePatches</code>include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>Classification</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>Security</code> | <code>SecurityUpdates</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>KBId</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>KB4480056</code> | <code>java-1.7.0-openjdk.x86_64</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Severity</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>Important</code> | <code>Medium</code> | <code>Low</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>State</code> </b>
     *         </p>
     *         <p>
     *         Sample values: <code>Installed</code> | <code>InstalledOther</code> | <code>InstalledPendingReboot</code>
     *         </p>
     *         </li>
     */

    public java.util.List<PatchOrchestratorFilter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<PatchOrchestratorFilter>();
        }
        return filters;
    }

    /**
     * <p>
     * Each element in the array is a structure containing a key-value pair.
     * </p>
     * <p>
     * Supported keys for <code>DescribeInstancePatches</code>include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Classification</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Security</code> | <code>SecurityUpdates</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>KBId</code> </b>
     * </p>
     * <p>
     * Sample values: <code>KB4480056</code> | <code>java-1.7.0-openjdk.x86_64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Severity</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Important</code> | <code>Medium</code> | <code>Low</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>State</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Installed</code> | <code>InstalledOther</code> | <code>InstalledPendingReboot</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Each element in the array is a structure containing a key-value pair.</p>
     *        <p>
     *        Supported keys for <code>DescribeInstancePatches</code>include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Classification</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>Security</code> | <code>SecurityUpdates</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>KBId</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>KB4480056</code> | <code>java-1.7.0-openjdk.x86_64</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Severity</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>Important</code> | <code>Medium</code> | <code>Low</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>State</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>Installed</code> | <code>InstalledOther</code> | <code>InstalledPendingReboot</code>
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<PatchOrchestratorFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<PatchOrchestratorFilter>(filters);
    }

    /**
     * <p>
     * Each element in the array is a structure containing a key-value pair.
     * </p>
     * <p>
     * Supported keys for <code>DescribeInstancePatches</code>include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Classification</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Security</code> | <code>SecurityUpdates</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>KBId</code> </b>
     * </p>
     * <p>
     * Sample values: <code>KB4480056</code> | <code>java-1.7.0-openjdk.x86_64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Severity</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Important</code> | <code>Medium</code> | <code>Low</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>State</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Installed</code> | <code>InstalledOther</code> | <code>InstalledPendingReboot</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Each element in the array is a structure containing a key-value pair.</p>
     *        <p>
     *        Supported keys for <code>DescribeInstancePatches</code>include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Classification</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>Security</code> | <code>SecurityUpdates</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>KBId</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>KB4480056</code> | <code>java-1.7.0-openjdk.x86_64</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Severity</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>Important</code> | <code>Medium</code> | <code>Low</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>State</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>Installed</code> | <code>InstalledOther</code> | <code>InstalledPendingReboot</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancePatchesRequest withFilters(PatchOrchestratorFilter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<PatchOrchestratorFilter>(filters.length));
        }
        for (PatchOrchestratorFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Each element in the array is a structure containing a key-value pair.
     * </p>
     * <p>
     * Supported keys for <code>DescribeInstancePatches</code>include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Classification</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Security</code> | <code>SecurityUpdates</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>KBId</code> </b>
     * </p>
     * <p>
     * Sample values: <code>KB4480056</code> | <code>java-1.7.0-openjdk.x86_64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Severity</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Important</code> | <code>Medium</code> | <code>Low</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>State</code> </b>
     * </p>
     * <p>
     * Sample values: <code>Installed</code> | <code>InstalledOther</code> | <code>InstalledPendingReboot</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Each element in the array is a structure containing a key-value pair.</p>
     *        <p>
     *        Supported keys for <code>DescribeInstancePatches</code>include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Classification</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>Security</code> | <code>SecurityUpdates</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>KBId</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>KB4480056</code> | <code>java-1.7.0-openjdk.x86_64</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Severity</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>Important</code> | <code>Medium</code> | <code>Low</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>State</code> </b>
     *        </p>
     *        <p>
     *        Sample values: <code>Installed</code> | <code>InstalledOther</code> | <code>InstalledPendingReboot</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancePatchesRequest withFilters(java.util.Collection<PatchOrchestratorFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancePatchesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of patches to return (per page).
     * </p>
     * 
     * @param maxResults
     *        The maximum number of patches to return (per page).
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of patches to return (per page).
     * </p>
     * 
     * @return The maximum number of patches to return (per page).
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of patches to return (per page).
     * </p>
     * 
     * @param maxResults
     *        The maximum number of patches to return (per page).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancePatchesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstancePatchesRequest == false)
            return false;
        DescribeInstancePatchesRequest other = (DescribeInstancePatchesRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstancePatchesRequest clone() {
        return (DescribeInstancePatchesRequest) super.clone();
    }

}

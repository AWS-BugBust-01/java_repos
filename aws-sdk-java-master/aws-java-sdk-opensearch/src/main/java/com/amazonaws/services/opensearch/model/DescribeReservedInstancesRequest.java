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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for parameters to <code>DescribeReservedInstances</code>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The reserved instance identifier filter value. Use this parameter to show only the reservation that matches the
     * specified reserved OpenSearch instance ID.
     * </p>
     */
    private String reservedInstanceId;
    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified, defaults to 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The reserved instance identifier filter value. Use this parameter to show only the reservation that matches the
     * specified reserved OpenSearch instance ID.
     * </p>
     * 
     * @param reservedInstanceId
     *        The reserved instance identifier filter value. Use this parameter to show only the reservation that
     *        matches the specified reserved OpenSearch instance ID.
     */

    public void setReservedInstanceId(String reservedInstanceId) {
        this.reservedInstanceId = reservedInstanceId;
    }

    /**
     * <p>
     * The reserved instance identifier filter value. Use this parameter to show only the reservation that matches the
     * specified reserved OpenSearch instance ID.
     * </p>
     * 
     * @return The reserved instance identifier filter value. Use this parameter to show only the reservation that
     *         matches the specified reserved OpenSearch instance ID.
     */

    public String getReservedInstanceId() {
        return this.reservedInstanceId;
    }

    /**
     * <p>
     * The reserved instance identifier filter value. Use this parameter to show only the reservation that matches the
     * specified reserved OpenSearch instance ID.
     * </p>
     * 
     * @param reservedInstanceId
     *        The reserved instance identifier filter value. Use this parameter to show only the reservation that
     *        matches the specified reserved OpenSearch instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesRequest withReservedInstanceId(String reservedInstanceId) {
        setReservedInstanceId(reservedInstanceId);
        return this;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified, defaults to 100.
     * </p>
     * 
     * @param maxResults
     *        Set this value to limit the number of results returned. If not specified, defaults to 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified, defaults to 100.
     * </p>
     * 
     * @return Set this value to limit the number of results returned. If not specified, defaults to 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified, defaults to 100.
     * </p>
     * 
     * @param maxResults
     *        Set this value to limit the number of results returned. If not specified, defaults to 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param nextToken
     *        Provides an identifier to allow retrieval of paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @return Provides an identifier to allow retrieval of paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param nextToken
     *        Provides an identifier to allow retrieval of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getReservedInstanceId() != null)
            sb.append("ReservedInstanceId: ").append(getReservedInstanceId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedInstancesRequest == false)
            return false;
        DescribeReservedInstancesRequest other = (DescribeReservedInstancesRequest) obj;
        if (other.getReservedInstanceId() == null ^ this.getReservedInstanceId() == null)
            return false;
        if (other.getReservedInstanceId() != null && other.getReservedInstanceId().equals(this.getReservedInstanceId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedInstanceId() == null) ? 0 : getReservedInstanceId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedInstancesRequest clone() {
        return (DescribeReservedInstancesRequest) super.clone();
    }

}

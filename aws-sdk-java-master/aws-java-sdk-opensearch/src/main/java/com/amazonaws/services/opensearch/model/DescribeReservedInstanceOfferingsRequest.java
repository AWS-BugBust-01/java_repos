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
 * Container for parameters to <code>DescribeReservedInstanceOfferings</code>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedInstanceOfferingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only the available offering that matches the
     * specified reservation identifier.
     * </p>
     */
    private String reservedInstanceOfferingId;
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
     * The offering identifier filter value. Use this parameter to show only the available offering that matches the
     * specified reservation identifier.
     * </p>
     * 
     * @param reservedInstanceOfferingId
     *        The offering identifier filter value. Use this parameter to show only the available offering that matches
     *        the specified reservation identifier.
     */

    public void setReservedInstanceOfferingId(String reservedInstanceOfferingId) {
        this.reservedInstanceOfferingId = reservedInstanceOfferingId;
    }

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only the available offering that matches the
     * specified reservation identifier.
     * </p>
     * 
     * @return The offering identifier filter value. Use this parameter to show only the available offering that matches
     *         the specified reservation identifier.
     */

    public String getReservedInstanceOfferingId() {
        return this.reservedInstanceOfferingId;
    }

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only the available offering that matches the
     * specified reservation identifier.
     * </p>
     * 
     * @param reservedInstanceOfferingId
     *        The offering identifier filter value. Use this parameter to show only the available offering that matches
     *        the specified reservation identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstanceOfferingsRequest withReservedInstanceOfferingId(String reservedInstanceOfferingId) {
        setReservedInstanceOfferingId(reservedInstanceOfferingId);
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

    public DescribeReservedInstanceOfferingsRequest withMaxResults(Integer maxResults) {
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

    public DescribeReservedInstanceOfferingsRequest withNextToken(String nextToken) {
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
        if (getReservedInstanceOfferingId() != null)
            sb.append("ReservedInstanceOfferingId: ").append(getReservedInstanceOfferingId()).append(",");
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

        if (obj instanceof DescribeReservedInstanceOfferingsRequest == false)
            return false;
        DescribeReservedInstanceOfferingsRequest other = (DescribeReservedInstanceOfferingsRequest) obj;
        if (other.getReservedInstanceOfferingId() == null ^ this.getReservedInstanceOfferingId() == null)
            return false;
        if (other.getReservedInstanceOfferingId() != null && other.getReservedInstanceOfferingId().equals(this.getReservedInstanceOfferingId()) == false)
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

        hashCode = prime * hashCode + ((getReservedInstanceOfferingId() == null) ? 0 : getReservedInstanceOfferingId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedInstanceOfferingsRequest clone() {
        return (DescribeReservedInstanceOfferingsRequest) super.clone();
    }

}

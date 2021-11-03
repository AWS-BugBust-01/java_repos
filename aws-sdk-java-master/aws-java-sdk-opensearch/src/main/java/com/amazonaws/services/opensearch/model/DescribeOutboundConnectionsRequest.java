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
 * Container for the parameters to the <code> <a>DescribeOutboundConnections</a> </code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOutboundConnectionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of filters used to match properties for outbound cross-cluster connections. Available
     * <code> <a>Filter</a> </code> names for this operation are:
     * <ul>
     * <li>connection-id</li>
     * <li>remote-domain-info.domain-name</li>
     * <li>remote-domain-info.owner-id</li>
     * <li>remote-domain-info.region</li>
     * <li>local-domain-info.domain-name</li>
     * </ul>
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified, defaults to 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * NextToken is sent in case the earlier API call results contain the NextToken parameter. Used for pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of filters used to match properties for outbound cross-cluster connections. Available
     * <code> <a>Filter</a> </code> names for this operation are:
     * <ul>
     * <li>connection-id</li>
     * <li>remote-domain-info.domain-name</li>
     * <li>remote-domain-info.owner-id</li>
     * <li>remote-domain-info.region</li>
     * <li>local-domain-info.domain-name</li>
     * </ul>
     * </p>
     * 
     * @return A list of filters used to match properties for outbound cross-cluster connections. Available
     *         <code> <a>Filter</a> </code> names for this operation are:
     *         <ul>
     *         <li>connection-id</li>
     *         <li>remote-domain-info.domain-name</li>
     *         <li>remote-domain-info.owner-id</li>
     *         <li>remote-domain-info.region</li>
     *         <li>local-domain-info.domain-name</li>
     *         </ul>
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A list of filters used to match properties for outbound cross-cluster connections. Available
     * <code> <a>Filter</a> </code> names for this operation are:
     * <ul>
     * <li>connection-id</li>
     * <li>remote-domain-info.domain-name</li>
     * <li>remote-domain-info.owner-id</li>
     * <li>remote-domain-info.region</li>
     * <li>local-domain-info.domain-name</li>
     * </ul>
     * </p>
     * 
     * @param filters
     *        A list of filters used to match properties for outbound cross-cluster connections. Available
     *        <code> <a>Filter</a> </code> names for this operation are:
     *        <ul>
     *        <li>connection-id</li>
     *        <li>remote-domain-info.domain-name</li>
     *        <li>remote-domain-info.owner-id</li>
     *        <li>remote-domain-info.region</li>
     *        <li>local-domain-info.domain-name</li>
     *        </ul>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * A list of filters used to match properties for outbound cross-cluster connections. Available
     * <code> <a>Filter</a> </code> names for this operation are:
     * <ul>
     * <li>connection-id</li>
     * <li>remote-domain-info.domain-name</li>
     * <li>remote-domain-info.owner-id</li>
     * <li>remote-domain-info.region</li>
     * <li>local-domain-info.domain-name</li>
     * </ul>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A list of filters used to match properties for outbound cross-cluster connections. Available
     *        <code> <a>Filter</a> </code> names for this operation are:
     *        <ul>
     *        <li>connection-id</li>
     *        <li>remote-domain-info.domain-name</li>
     *        <li>remote-domain-info.owner-id</li>
     *        <li>remote-domain-info.region</li>
     *        <li>local-domain-info.domain-name</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOutboundConnectionsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of filters used to match properties for outbound cross-cluster connections. Available
     * <code> <a>Filter</a> </code> names for this operation are:
     * <ul>
     * <li>connection-id</li>
     * <li>remote-domain-info.domain-name</li>
     * <li>remote-domain-info.owner-id</li>
     * <li>remote-domain-info.region</li>
     * <li>local-domain-info.domain-name</li>
     * </ul>
     * </p>
     * 
     * @param filters
     *        A list of filters used to match properties for outbound cross-cluster connections. Available
     *        <code> <a>Filter</a> </code> names for this operation are:
     *        <ul>
     *        <li>connection-id</li>
     *        <li>remote-domain-info.domain-name</li>
     *        <li>remote-domain-info.owner-id</li>
     *        <li>remote-domain-info.region</li>
     *        <li>local-domain-info.domain-name</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOutboundConnectionsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
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

    public DescribeOutboundConnectionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * NextToken is sent in case the earlier API call results contain the NextToken parameter. Used for pagination.
     * </p>
     * 
     * @param nextToken
     *        NextToken is sent in case the earlier API call results contain the NextToken parameter. Used for
     *        pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * NextToken is sent in case the earlier API call results contain the NextToken parameter. Used for pagination.
     * </p>
     * 
     * @return NextToken is sent in case the earlier API call results contain the NextToken parameter. Used for
     *         pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * NextToken is sent in case the earlier API call results contain the NextToken parameter. Used for pagination.
     * </p>
     * 
     * @param nextToken
     *        NextToken is sent in case the earlier API call results contain the NextToken parameter. Used for
     *        pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOutboundConnectionsRequest withNextToken(String nextToken) {
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof DescribeOutboundConnectionsRequest == false)
            return false;
        DescribeOutboundConnectionsRequest other = (DescribeOutboundConnectionsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOutboundConnectionsRequest clone() {
        return (DescribeOutboundConnectionsRequest) super.clone();
    }

}

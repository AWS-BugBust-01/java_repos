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

/**
 * <p>
 * The result of a <code> <a>DescribeOutboundConnections</a> </code> request. Contains the list of connections matching
 * the filter criteria.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOutboundConnectionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code> <a>OutboundConnection</a> </code> matching the specified filter criteria.
     * </p>
     */
    private java.util.List<OutboundConnection> connections;
    /**
     * <p>
     * If more results are available and NextToken is present, make the next request to the same API with the received
     * NextToken to paginate the remaining results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code> <a>OutboundConnection</a> </code> matching the specified filter criteria.
     * </p>
     * 
     * @return A list of <code> <a>OutboundConnection</a> </code> matching the specified filter criteria.
     */

    public java.util.List<OutboundConnection> getConnections() {
        return connections;
    }

    /**
     * <p>
     * A list of <code> <a>OutboundConnection</a> </code> matching the specified filter criteria.
     * </p>
     * 
     * @param connections
     *        A list of <code> <a>OutboundConnection</a> </code> matching the specified filter criteria.
     */

    public void setConnections(java.util.Collection<OutboundConnection> connections) {
        if (connections == null) {
            this.connections = null;
            return;
        }

        this.connections = new java.util.ArrayList<OutboundConnection>(connections);
    }

    /**
     * <p>
     * A list of <code> <a>OutboundConnection</a> </code> matching the specified filter criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnections(java.util.Collection)} or {@link #withConnections(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param connections
     *        A list of <code> <a>OutboundConnection</a> </code> matching the specified filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOutboundConnectionsResult withConnections(OutboundConnection... connections) {
        if (this.connections == null) {
            setConnections(new java.util.ArrayList<OutboundConnection>(connections.length));
        }
        for (OutboundConnection ele : connections) {
            this.connections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code> <a>OutboundConnection</a> </code> matching the specified filter criteria.
     * </p>
     * 
     * @param connections
     *        A list of <code> <a>OutboundConnection</a> </code> matching the specified filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOutboundConnectionsResult withConnections(java.util.Collection<OutboundConnection> connections) {
        setConnections(connections);
        return this;
    }

    /**
     * <p>
     * If more results are available and NextToken is present, make the next request to the same API with the received
     * NextToken to paginate the remaining results.
     * </p>
     * 
     * @param nextToken
     *        If more results are available and NextToken is present, make the next request to the same API with the
     *        received NextToken to paginate the remaining results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If more results are available and NextToken is present, make the next request to the same API with the received
     * NextToken to paginate the remaining results.
     * </p>
     * 
     * @return If more results are available and NextToken is present, make the next request to the same API with the
     *         received NextToken to paginate the remaining results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If more results are available and NextToken is present, make the next request to the same API with the received
     * NextToken to paginate the remaining results.
     * </p>
     * 
     * @param nextToken
     *        If more results are available and NextToken is present, make the next request to the same API with the
     *        received NextToken to paginate the remaining results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOutboundConnectionsResult withNextToken(String nextToken) {
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
        if (getConnections() != null)
            sb.append("Connections: ").append(getConnections()).append(",");
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

        if (obj instanceof DescribeOutboundConnectionsResult == false)
            return false;
        DescribeOutboundConnectionsResult other = (DescribeOutboundConnectionsResult) obj;
        if (other.getConnections() == null ^ this.getConnections() == null)
            return false;
        if (other.getConnections() != null && other.getConnections().equals(this.getConnections()) == false)
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

        hashCode = prime * hashCode + ((getConnections() == null) ? 0 : getConnections().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOutboundConnectionsResult clone() {
        try {
            return (DescribeOutboundConnectionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

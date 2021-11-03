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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/ListConnectors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConnectorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of connector descriptions.
     * </p>
     */
    private java.util.List<ConnectorSummary> connectors;
    /**
     * <p>
     * If the response of a ListConnectors operation is truncated, it will include a NextToken. Send this NextToken in a
     * subsequent request to continue listing from where it left off.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of connector descriptions.
     * </p>
     * 
     * @return An array of connector descriptions.
     */

    public java.util.List<ConnectorSummary> getConnectors() {
        return connectors;
    }

    /**
     * <p>
     * An array of connector descriptions.
     * </p>
     * 
     * @param connectors
     *        An array of connector descriptions.
     */

    public void setConnectors(java.util.Collection<ConnectorSummary> connectors) {
        if (connectors == null) {
            this.connectors = null;
            return;
        }

        this.connectors = new java.util.ArrayList<ConnectorSummary>(connectors);
    }

    /**
     * <p>
     * An array of connector descriptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectors(java.util.Collection)} or {@link #withConnectors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param connectors
     *        An array of connector descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectorsResult withConnectors(ConnectorSummary... connectors) {
        if (this.connectors == null) {
            setConnectors(new java.util.ArrayList<ConnectorSummary>(connectors.length));
        }
        for (ConnectorSummary ele : connectors) {
            this.connectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of connector descriptions.
     * </p>
     * 
     * @param connectors
     *        An array of connector descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectorsResult withConnectors(java.util.Collection<ConnectorSummary> connectors) {
        setConnectors(connectors);
        return this;
    }

    /**
     * <p>
     * If the response of a ListConnectors operation is truncated, it will include a NextToken. Send this NextToken in a
     * subsequent request to continue listing from where it left off.
     * </p>
     * 
     * @param nextToken
     *        If the response of a ListConnectors operation is truncated, it will include a NextToken. Send this
     *        NextToken in a subsequent request to continue listing from where it left off.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response of a ListConnectors operation is truncated, it will include a NextToken. Send this NextToken in a
     * subsequent request to continue listing from where it left off.
     * </p>
     * 
     * @return If the response of a ListConnectors operation is truncated, it will include a NextToken. Send this
     *         NextToken in a subsequent request to continue listing from where it left off.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response of a ListConnectors operation is truncated, it will include a NextToken. Send this NextToken in a
     * subsequent request to continue listing from where it left off.
     * </p>
     * 
     * @param nextToken
     *        If the response of a ListConnectors operation is truncated, it will include a NextToken. Send this
     *        NextToken in a subsequent request to continue listing from where it left off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectorsResult withNextToken(String nextToken) {
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
        if (getConnectors() != null)
            sb.append("Connectors: ").append(getConnectors()).append(",");
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

        if (obj instanceof ListConnectorsResult == false)
            return false;
        ListConnectorsResult other = (ListConnectorsResult) obj;
        if (other.getConnectors() == null ^ this.getConnectors() == null)
            return false;
        if (other.getConnectors() != null && other.getConnectors().equals(this.getConnectors()) == false)
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

        hashCode = prime * hashCode + ((getConnectors() == null) ? 0 : getConnectors().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListConnectorsResult clone() {
        try {
            return (ListConnectorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

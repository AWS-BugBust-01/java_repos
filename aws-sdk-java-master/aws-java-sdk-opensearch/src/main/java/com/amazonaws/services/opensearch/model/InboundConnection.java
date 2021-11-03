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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of an inbound connection.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InboundConnection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code> <a>AWSDomainInformation</a> </code> for the local OpenSearch domain.
     * </p>
     */
    private DomainInformationContainer localDomainInfo;
    /**
     * <p>
     * The <code> <a>AWSDomainInformation</a> </code> for the remote OpenSearch domain.
     * </p>
     */
    private DomainInformationContainer remoteDomainInfo;
    /**
     * <p>
     * The connection ID for the inbound cross-cluster connection.
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * The <code> <a>InboundConnectionStatus</a> </code> for the outbound connection.
     * </p>
     */
    private InboundConnectionStatus connectionStatus;

    /**
     * <p>
     * The <code> <a>AWSDomainInformation</a> </code> for the local OpenSearch domain.
     * </p>
     * 
     * @param localDomainInfo
     *        The <code> <a>AWSDomainInformation</a> </code> for the local OpenSearch domain.
     */

    public void setLocalDomainInfo(DomainInformationContainer localDomainInfo) {
        this.localDomainInfo = localDomainInfo;
    }

    /**
     * <p>
     * The <code> <a>AWSDomainInformation</a> </code> for the local OpenSearch domain.
     * </p>
     * 
     * @return The <code> <a>AWSDomainInformation</a> </code> for the local OpenSearch domain.
     */

    public DomainInformationContainer getLocalDomainInfo() {
        return this.localDomainInfo;
    }

    /**
     * <p>
     * The <code> <a>AWSDomainInformation</a> </code> for the local OpenSearch domain.
     * </p>
     * 
     * @param localDomainInfo
     *        The <code> <a>AWSDomainInformation</a> </code> for the local OpenSearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InboundConnection withLocalDomainInfo(DomainInformationContainer localDomainInfo) {
        setLocalDomainInfo(localDomainInfo);
        return this;
    }

    /**
     * <p>
     * The <code> <a>AWSDomainInformation</a> </code> for the remote OpenSearch domain.
     * </p>
     * 
     * @param remoteDomainInfo
     *        The <code> <a>AWSDomainInformation</a> </code> for the remote OpenSearch domain.
     */

    public void setRemoteDomainInfo(DomainInformationContainer remoteDomainInfo) {
        this.remoteDomainInfo = remoteDomainInfo;
    }

    /**
     * <p>
     * The <code> <a>AWSDomainInformation</a> </code> for the remote OpenSearch domain.
     * </p>
     * 
     * @return The <code> <a>AWSDomainInformation</a> </code> for the remote OpenSearch domain.
     */

    public DomainInformationContainer getRemoteDomainInfo() {
        return this.remoteDomainInfo;
    }

    /**
     * <p>
     * The <code> <a>AWSDomainInformation</a> </code> for the remote OpenSearch domain.
     * </p>
     * 
     * @param remoteDomainInfo
     *        The <code> <a>AWSDomainInformation</a> </code> for the remote OpenSearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InboundConnection withRemoteDomainInfo(DomainInformationContainer remoteDomainInfo) {
        setRemoteDomainInfo(remoteDomainInfo);
        return this;
    }

    /**
     * <p>
     * The connection ID for the inbound cross-cluster connection.
     * </p>
     * 
     * @param connectionId
     *        The connection ID for the inbound cross-cluster connection.
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The connection ID for the inbound cross-cluster connection.
     * </p>
     * 
     * @return The connection ID for the inbound cross-cluster connection.
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The connection ID for the inbound cross-cluster connection.
     * </p>
     * 
     * @param connectionId
     *        The connection ID for the inbound cross-cluster connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InboundConnection withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * The <code> <a>InboundConnectionStatus</a> </code> for the outbound connection.
     * </p>
     * 
     * @param connectionStatus
     *        The <code> <a>InboundConnectionStatus</a> </code> for the outbound connection.
     */

    public void setConnectionStatus(InboundConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    /**
     * <p>
     * The <code> <a>InboundConnectionStatus</a> </code> for the outbound connection.
     * </p>
     * 
     * @return The <code> <a>InboundConnectionStatus</a> </code> for the outbound connection.
     */

    public InboundConnectionStatus getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * <p>
     * The <code> <a>InboundConnectionStatus</a> </code> for the outbound connection.
     * </p>
     * 
     * @param connectionStatus
     *        The <code> <a>InboundConnectionStatus</a> </code> for the outbound connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InboundConnection withConnectionStatus(InboundConnectionStatus connectionStatus) {
        setConnectionStatus(connectionStatus);
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
        if (getLocalDomainInfo() != null)
            sb.append("LocalDomainInfo: ").append(getLocalDomainInfo()).append(",");
        if (getRemoteDomainInfo() != null)
            sb.append("RemoteDomainInfo: ").append(getRemoteDomainInfo()).append(",");
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId()).append(",");
        if (getConnectionStatus() != null)
            sb.append("ConnectionStatus: ").append(getConnectionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InboundConnection == false)
            return false;
        InboundConnection other = (InboundConnection) obj;
        if (other.getLocalDomainInfo() == null ^ this.getLocalDomainInfo() == null)
            return false;
        if (other.getLocalDomainInfo() != null && other.getLocalDomainInfo().equals(this.getLocalDomainInfo()) == false)
            return false;
        if (other.getRemoteDomainInfo() == null ^ this.getRemoteDomainInfo() == null)
            return false;
        if (other.getRemoteDomainInfo() != null && other.getRemoteDomainInfo().equals(this.getRemoteDomainInfo()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getConnectionStatus() == null ^ this.getConnectionStatus() == null)
            return false;
        if (other.getConnectionStatus() != null && other.getConnectionStatus().equals(this.getConnectionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocalDomainInfo() == null) ? 0 : getLocalDomainInfo().hashCode());
        hashCode = prime * hashCode + ((getRemoteDomainInfo() == null) ? 0 : getRemoteDomainInfo().hashCode());
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getConnectionStatus() == null) ? 0 : getConnectionStatus().hashCode());
        return hashCode;
    }

    @Override
    public InboundConnection clone() {
        try {
            return (InboundConnection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.InboundConnectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

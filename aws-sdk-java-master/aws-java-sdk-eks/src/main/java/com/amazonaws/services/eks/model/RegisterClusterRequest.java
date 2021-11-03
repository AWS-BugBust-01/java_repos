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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/RegisterCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Define a unique name for this cluster within your AWS account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The configuration settings required to connect the Kubernetes cluster to the Amazon EKS control plane.
     * </p>
     */
    private ConnectorConfigRequest connectorConfig;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * Define a unique name for this cluster within your AWS account.
     * </p>
     * 
     * @param name
     *        Define a unique name for this cluster within your AWS account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Define a unique name for this cluster within your AWS account.
     * </p>
     * 
     * @return Define a unique name for this cluster within your AWS account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Define a unique name for this cluster within your AWS account.
     * </p>
     * 
     * @param name
     *        Define a unique name for this cluster within your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClusterRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The configuration settings required to connect the Kubernetes cluster to the Amazon EKS control plane.
     * </p>
     * 
     * @param connectorConfig
     *        The configuration settings required to connect the Kubernetes cluster to the Amazon EKS control plane.
     */

    public void setConnectorConfig(ConnectorConfigRequest connectorConfig) {
        this.connectorConfig = connectorConfig;
    }

    /**
     * <p>
     * The configuration settings required to connect the Kubernetes cluster to the Amazon EKS control plane.
     * </p>
     * 
     * @return The configuration settings required to connect the Kubernetes cluster to the Amazon EKS control plane.
     */

    public ConnectorConfigRequest getConnectorConfig() {
        return this.connectorConfig;
    }

    /**
     * <p>
     * The configuration settings required to connect the Kubernetes cluster to the Amazon EKS control plane.
     * </p>
     * 
     * @param connectorConfig
     *        The configuration settings required to connect the Kubernetes cluster to the Amazon EKS control plane.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClusterRequest withConnectorConfig(ConnectorConfigRequest connectorConfig) {
        setConnectorConfig(connectorConfig);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClusterRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getConnectorConfig() != null)
            sb.append("ConnectorConfig: ").append(getConnectorConfig()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterClusterRequest == false)
            return false;
        RegisterClusterRequest other = (RegisterClusterRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConnectorConfig() == null ^ this.getConnectorConfig() == null)
            return false;
        if (other.getConnectorConfig() != null && other.getConnectorConfig().equals(this.getConnectorConfig()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConnectorConfig() == null) ? 0 : getConnectorConfig().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public RegisterClusterRequest clone() {
        return (RegisterClusterRequest) super.clone();
    }

}

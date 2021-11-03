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
package com.amazonaws.services.route53recoverycontrolconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The details of the control panel that you're creating.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateControlPanel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateControlPanelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique client idempotency token.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster for the control panel.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The name of the control panel.
     * </p>
     */
    private String controlPanelName;

    /**
     * <p>
     * Unique client idempotency token.
     * </p>
     * 
     * @param clientToken
     *        Unique client idempotency token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique client idempotency token.
     * </p>
     * 
     * @return Unique client idempotency token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique client idempotency token.
     * </p>
     * 
     * @param clientToken
     *        Unique client idempotency token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateControlPanelRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster for the control panel.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the cluster for the control panel.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster for the control panel.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the cluster for the control panel.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster for the control panel.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the cluster for the control panel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateControlPanelRequest withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * The name of the control panel.
     * </p>
     * 
     * @param controlPanelName
     *        The name of the control panel.
     */

    public void setControlPanelName(String controlPanelName) {
        this.controlPanelName = controlPanelName;
    }

    /**
     * <p>
     * The name of the control panel.
     * </p>
     * 
     * @return The name of the control panel.
     */

    public String getControlPanelName() {
        return this.controlPanelName;
    }

    /**
     * <p>
     * The name of the control panel.
     * </p>
     * 
     * @param controlPanelName
     *        The name of the control panel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateControlPanelRequest withControlPanelName(String controlPanelName) {
        setControlPanelName(controlPanelName);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getControlPanelName() != null)
            sb.append("ControlPanelName: ").append(getControlPanelName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateControlPanelRequest == false)
            return false;
        CreateControlPanelRequest other = (CreateControlPanelRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getControlPanelName() == null ^ this.getControlPanelName() == null)
            return false;
        if (other.getControlPanelName() != null && other.getControlPanelName().equals(this.getControlPanelName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getControlPanelName() == null) ? 0 : getControlPanelName().hashCode());
        return hashCode;
    }

    @Override
    public CreateControlPanelRequest clone() {
        return (CreateControlPanelRequest) super.clone();
    }

}

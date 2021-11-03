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
 * Options to specify the Cognito user and identity pools for OpenSearch Dashboards authentication. For more
 * information, see <a href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html"
 * target="_blank">Configuring Amazon Cognito authentication for OpenSearch Dashboards</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CognitoOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The option to enable Cognito for OpenSearch Dashboards authentication.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The Cognito user pool ID for OpenSearch Dashboards authentication.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The Cognito identity pool ID for OpenSearch Dashboards authentication.
     * </p>
     */
    private String identityPoolId;
    /**
     * <p>
     * The role ARN that provides OpenSearch permissions for accessing Cognito resources.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The option to enable Cognito for OpenSearch Dashboards authentication.
     * </p>
     * 
     * @param enabled
     *        The option to enable Cognito for OpenSearch Dashboards authentication.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * The option to enable Cognito for OpenSearch Dashboards authentication.
     * </p>
     * 
     * @return The option to enable Cognito for OpenSearch Dashboards authentication.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The option to enable Cognito for OpenSearch Dashboards authentication.
     * </p>
     * 
     * @param enabled
     *        The option to enable Cognito for OpenSearch Dashboards authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoOptions withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * The option to enable Cognito for OpenSearch Dashboards authentication.
     * </p>
     * 
     * @return The option to enable Cognito for OpenSearch Dashboards authentication.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The Cognito user pool ID for OpenSearch Dashboards authentication.
     * </p>
     * 
     * @param userPoolId
     *        The Cognito user pool ID for OpenSearch Dashboards authentication.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The Cognito user pool ID for OpenSearch Dashboards authentication.
     * </p>
     * 
     * @return The Cognito user pool ID for OpenSearch Dashboards authentication.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The Cognito user pool ID for OpenSearch Dashboards authentication.
     * </p>
     * 
     * @param userPoolId
     *        The Cognito user pool ID for OpenSearch Dashboards authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoOptions withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The Cognito identity pool ID for OpenSearch Dashboards authentication.
     * </p>
     * 
     * @param identityPoolId
     *        The Cognito identity pool ID for OpenSearch Dashboards authentication.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * The Cognito identity pool ID for OpenSearch Dashboards authentication.
     * </p>
     * 
     * @return The Cognito identity pool ID for OpenSearch Dashboards authentication.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * <p>
     * The Cognito identity pool ID for OpenSearch Dashboards authentication.
     * </p>
     * 
     * @param identityPoolId
     *        The Cognito identity pool ID for OpenSearch Dashboards authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoOptions withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * <p>
     * The role ARN that provides OpenSearch permissions for accessing Cognito resources.
     * </p>
     * 
     * @param roleArn
     *        The role ARN that provides OpenSearch permissions for accessing Cognito resources.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The role ARN that provides OpenSearch permissions for accessing Cognito resources.
     * </p>
     * 
     * @return The role ARN that provides OpenSearch permissions for accessing Cognito resources.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The role ARN that provides OpenSearch permissions for accessing Cognito resources.
     * </p>
     * 
     * @param roleArn
     *        The role ARN that provides OpenSearch permissions for accessing Cognito resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoOptions withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: ").append(getIdentityPoolId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CognitoOptions == false)
            return false;
        CognitoOptions other = (CognitoOptions) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public CognitoOptions clone() {
        try {
            return (CognitoOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.CognitoOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

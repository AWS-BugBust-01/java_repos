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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceTypeDetails implements Serializable, Cloneable, StructuredPojo {

    private String instanceType;

    private Boolean encryptionEnabled;

    private Boolean cognitoEnabled;

    private Boolean appLogsEnabled;

    private Boolean advancedSecurityEnabled;

    private Boolean warmEnabled;

    private java.util.List<String> instanceRole;

    /**
     * @param instanceType
     * @see OpenSearchPartitionInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * @return
     * @see OpenSearchPartitionInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @param instanceType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenSearchPartitionInstanceType
     */

    public InstanceTypeDetails withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * @param instanceType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenSearchPartitionInstanceType
     */

    public InstanceTypeDetails withInstanceType(OpenSearchPartitionInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * @param encryptionEnabled
     */

    public void setEncryptionEnabled(Boolean encryptionEnabled) {
        this.encryptionEnabled = encryptionEnabled;
    }

    /**
     * @return
     */

    public Boolean getEncryptionEnabled() {
        return this.encryptionEnabled;
    }

    /**
     * @param encryptionEnabled
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeDetails withEncryptionEnabled(Boolean encryptionEnabled) {
        setEncryptionEnabled(encryptionEnabled);
        return this;
    }

    /**
     * @return
     */

    public Boolean isEncryptionEnabled() {
        return this.encryptionEnabled;
    }

    /**
     * @param cognitoEnabled
     */

    public void setCognitoEnabled(Boolean cognitoEnabled) {
        this.cognitoEnabled = cognitoEnabled;
    }

    /**
     * @return
     */

    public Boolean getCognitoEnabled() {
        return this.cognitoEnabled;
    }

    /**
     * @param cognitoEnabled
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeDetails withCognitoEnabled(Boolean cognitoEnabled) {
        setCognitoEnabled(cognitoEnabled);
        return this;
    }

    /**
     * @return
     */

    public Boolean isCognitoEnabled() {
        return this.cognitoEnabled;
    }

    /**
     * @param appLogsEnabled
     */

    public void setAppLogsEnabled(Boolean appLogsEnabled) {
        this.appLogsEnabled = appLogsEnabled;
    }

    /**
     * @return
     */

    public Boolean getAppLogsEnabled() {
        return this.appLogsEnabled;
    }

    /**
     * @param appLogsEnabled
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeDetails withAppLogsEnabled(Boolean appLogsEnabled) {
        setAppLogsEnabled(appLogsEnabled);
        return this;
    }

    /**
     * @return
     */

    public Boolean isAppLogsEnabled() {
        return this.appLogsEnabled;
    }

    /**
     * @param advancedSecurityEnabled
     */

    public void setAdvancedSecurityEnabled(Boolean advancedSecurityEnabled) {
        this.advancedSecurityEnabled = advancedSecurityEnabled;
    }

    /**
     * @return
     */

    public Boolean getAdvancedSecurityEnabled() {
        return this.advancedSecurityEnabled;
    }

    /**
     * @param advancedSecurityEnabled
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeDetails withAdvancedSecurityEnabled(Boolean advancedSecurityEnabled) {
        setAdvancedSecurityEnabled(advancedSecurityEnabled);
        return this;
    }

    /**
     * @return
     */

    public Boolean isAdvancedSecurityEnabled() {
        return this.advancedSecurityEnabled;
    }

    /**
     * @param warmEnabled
     */

    public void setWarmEnabled(Boolean warmEnabled) {
        this.warmEnabled = warmEnabled;
    }

    /**
     * @return
     */

    public Boolean getWarmEnabled() {
        return this.warmEnabled;
    }

    /**
     * @param warmEnabled
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeDetails withWarmEnabled(Boolean warmEnabled) {
        setWarmEnabled(warmEnabled);
        return this;
    }

    /**
     * @return
     */

    public Boolean isWarmEnabled() {
        return this.warmEnabled;
    }

    /**
     * @return
     */

    public java.util.List<String> getInstanceRole() {
        return instanceRole;
    }

    /**
     * @param instanceRole
     */

    public void setInstanceRole(java.util.Collection<String> instanceRole) {
        if (instanceRole == null) {
            this.instanceRole = null;
            return;
        }

        this.instanceRole = new java.util.ArrayList<String>(instanceRole);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceRole(java.util.Collection)} or {@link #withInstanceRole(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceRole
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeDetails withInstanceRole(String... instanceRole) {
        if (this.instanceRole == null) {
            setInstanceRole(new java.util.ArrayList<String>(instanceRole.length));
        }
        for (String ele : instanceRole) {
            this.instanceRole.add(ele);
        }
        return this;
    }

    /**
     * @param instanceRole
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeDetails withInstanceRole(java.util.Collection<String> instanceRole) {
        setInstanceRole(instanceRole);
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getEncryptionEnabled() != null)
            sb.append("EncryptionEnabled: ").append(getEncryptionEnabled()).append(",");
        if (getCognitoEnabled() != null)
            sb.append("CognitoEnabled: ").append(getCognitoEnabled()).append(",");
        if (getAppLogsEnabled() != null)
            sb.append("AppLogsEnabled: ").append(getAppLogsEnabled()).append(",");
        if (getAdvancedSecurityEnabled() != null)
            sb.append("AdvancedSecurityEnabled: ").append(getAdvancedSecurityEnabled()).append(",");
        if (getWarmEnabled() != null)
            sb.append("WarmEnabled: ").append(getWarmEnabled()).append(",");
        if (getInstanceRole() != null)
            sb.append("InstanceRole: ").append(getInstanceRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceTypeDetails == false)
            return false;
        InstanceTypeDetails other = (InstanceTypeDetails) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getEncryptionEnabled() == null ^ this.getEncryptionEnabled() == null)
            return false;
        if (other.getEncryptionEnabled() != null && other.getEncryptionEnabled().equals(this.getEncryptionEnabled()) == false)
            return false;
        if (other.getCognitoEnabled() == null ^ this.getCognitoEnabled() == null)
            return false;
        if (other.getCognitoEnabled() != null && other.getCognitoEnabled().equals(this.getCognitoEnabled()) == false)
            return false;
        if (other.getAppLogsEnabled() == null ^ this.getAppLogsEnabled() == null)
            return false;
        if (other.getAppLogsEnabled() != null && other.getAppLogsEnabled().equals(this.getAppLogsEnabled()) == false)
            return false;
        if (other.getAdvancedSecurityEnabled() == null ^ this.getAdvancedSecurityEnabled() == null)
            return false;
        if (other.getAdvancedSecurityEnabled() != null && other.getAdvancedSecurityEnabled().equals(this.getAdvancedSecurityEnabled()) == false)
            return false;
        if (other.getWarmEnabled() == null ^ this.getWarmEnabled() == null)
            return false;
        if (other.getWarmEnabled() != null && other.getWarmEnabled().equals(this.getWarmEnabled()) == false)
            return false;
        if (other.getInstanceRole() == null ^ this.getInstanceRole() == null)
            return false;
        if (other.getInstanceRole() != null && other.getInstanceRole().equals(this.getInstanceRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getEncryptionEnabled() == null) ? 0 : getEncryptionEnabled().hashCode());
        hashCode = prime * hashCode + ((getCognitoEnabled() == null) ? 0 : getCognitoEnabled().hashCode());
        hashCode = prime * hashCode + ((getAppLogsEnabled() == null) ? 0 : getAppLogsEnabled().hashCode());
        hashCode = prime * hashCode + ((getAdvancedSecurityEnabled() == null) ? 0 : getAdvancedSecurityEnabled().hashCode());
        hashCode = prime * hashCode + ((getWarmEnabled() == null) ? 0 : getWarmEnabled().hashCode());
        hashCode = prime * hashCode + ((getInstanceRole() == null) ? 0 : getInstanceRole().hashCode());
        return hashCode;
    }

    @Override
    public InstanceTypeDetails clone() {
        try {
            return (InstanceTypeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.InstanceTypeDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

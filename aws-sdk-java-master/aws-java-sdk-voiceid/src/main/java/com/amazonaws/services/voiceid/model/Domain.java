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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains all the information about a domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/Domain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Domain implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the domain.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The timestamp at which the domain is created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The client-provided description of the domain.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The service-generated identifier for the domain.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The current status of the domain.
     * </p>
     */
    private String domainStatus;
    /**
     * <p>
     * The client-provided name for the domain.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The server-side encryption configuration containing the KMS Key Identifier you want Voice ID to use to encrypt
     * your data.
     * </p>
     */
    private ServerSideEncryptionConfiguration serverSideEncryptionConfiguration;
    /**
     * <p>
     * The timestamp showing the domain's last update.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the domain.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the domain.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the domain.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the domain.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the domain.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Domain withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the domain is created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp at which the domain is created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp at which the domain is created.
     * </p>
     * 
     * @return The timestamp at which the domain is created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp at which the domain is created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp at which the domain is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Domain withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The client-provided description of the domain.
     * </p>
     * 
     * @param description
     *        The client-provided description of the domain.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The client-provided description of the domain.
     * </p>
     * 
     * @return The client-provided description of the domain.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The client-provided description of the domain.
     * </p>
     * 
     * @param description
     *        The client-provided description of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Domain withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The service-generated identifier for the domain.
     * </p>
     * 
     * @param domainId
     *        The service-generated identifier for the domain.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The service-generated identifier for the domain.
     * </p>
     * 
     * @return The service-generated identifier for the domain.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The service-generated identifier for the domain.
     * </p>
     * 
     * @param domainId
     *        The service-generated identifier for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Domain withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The current status of the domain.
     * </p>
     * 
     * @param domainStatus
     *        The current status of the domain.
     * @see DomainStatus
     */

    public void setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
    }

    /**
     * <p>
     * The current status of the domain.
     * </p>
     * 
     * @return The current status of the domain.
     * @see DomainStatus
     */

    public String getDomainStatus() {
        return this.domainStatus;
    }

    /**
     * <p>
     * The current status of the domain.
     * </p>
     * 
     * @param domainStatus
     *        The current status of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainStatus
     */

    public Domain withDomainStatus(String domainStatus) {
        setDomainStatus(domainStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the domain.
     * </p>
     * 
     * @param domainStatus
     *        The current status of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainStatus
     */

    public Domain withDomainStatus(DomainStatus domainStatus) {
        this.domainStatus = domainStatus.toString();
        return this;
    }

    /**
     * <p>
     * The client-provided name for the domain.
     * </p>
     * 
     * @param name
     *        The client-provided name for the domain.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The client-provided name for the domain.
     * </p>
     * 
     * @return The client-provided name for the domain.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The client-provided name for the domain.
     * </p>
     * 
     * @param name
     *        The client-provided name for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Domain withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The server-side encryption configuration containing the KMS Key Identifier you want Voice ID to use to encrypt
     * your data.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The server-side encryption configuration containing the KMS Key Identifier you want Voice ID to use to
     *        encrypt your data.
     */

    public void setServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The server-side encryption configuration containing the KMS Key Identifier you want Voice ID to use to encrypt
     * your data.
     * </p>
     * 
     * @return The server-side encryption configuration containing the KMS Key Identifier you want Voice ID to use to
     *         encrypt your data.
     */

    public ServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The server-side encryption configuration containing the KMS Key Identifier you want Voice ID to use to encrypt
     * your data.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The server-side encryption configuration containing the KMS Key Identifier you want Voice ID to use to
     *        encrypt your data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Domain withServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        setServerSideEncryptionConfiguration(serverSideEncryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * The timestamp showing the domain's last update.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp showing the domain's last update.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp showing the domain's last update.
     * </p>
     * 
     * @return The timestamp showing the domain's last update.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp showing the domain's last update.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp showing the domain's last update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Domain withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getDomainStatus() != null)
            sb.append("DomainStatus: ").append(getDomainStatus()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getServerSideEncryptionConfiguration() != null)
            sb.append("ServerSideEncryptionConfiguration: ").append(getServerSideEncryptionConfiguration()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Domain == false)
            return false;
        Domain other = (Domain) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getDomainStatus() == null ^ this.getDomainStatus() == null)
            return false;
        if (other.getDomainStatus() != null && other.getDomainStatus().equals(this.getDomainStatus()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getServerSideEncryptionConfiguration() == null ^ this.getServerSideEncryptionConfiguration() == null)
            return false;
        if (other.getServerSideEncryptionConfiguration() != null
                && other.getServerSideEncryptionConfiguration().equals(this.getServerSideEncryptionConfiguration()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getDomainStatus() == null) ? 0 : getDomainStatus().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getServerSideEncryptionConfiguration() == null) ? 0 : getServerSideEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public Domain clone() {
        try {
            return (Domain) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.voiceid.model.transform.DomainMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

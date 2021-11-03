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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about the knowledge base.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/KnowledgeBaseSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KnowledgeBaseSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description of the knowledge base.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     */
    private String knowledgeBaseArn;
    /**
     * <p>
     * The the identifier of the knowledge base.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * The type of knowledge base.
     * </p>
     */
    private String knowledgeBaseType;
    /**
     * <p>
     * The name of the knowledge base.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Information about how to render the content.
     * </p>
     */
    private RenderingConfiguration renderingConfiguration;
    /**
     * <p>
     * The KMS key used for encryption.
     * </p>
     */
    private ServerSideEncryptionConfiguration serverSideEncryptionConfiguration;
    /**
     * <p>
     * [KEVIN]
     * </p>
     */
    private SourceConfiguration sourceConfiguration;
    /**
     * <p>
     * The status of the knowledge base summary.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The description of the knowledge base.
     * </p>
     * 
     * @param description
     *        The description of the knowledge base.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the knowledge base.
     * </p>
     * 
     * @return The description of the knowledge base.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the knowledge base.
     * </p>
     * 
     * @param description
     *        The description of the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseArn
     *        The Amazon Resource Name (ARN) of the knowledge base.
     */

    public void setKnowledgeBaseArn(String knowledgeBaseArn) {
        this.knowledgeBaseArn = knowledgeBaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the knowledge base.
     */

    public String getKnowledgeBaseArn() {
        return this.knowledgeBaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseArn
     *        The Amazon Resource Name (ARN) of the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseSummary withKnowledgeBaseArn(String knowledgeBaseArn) {
        setKnowledgeBaseArn(knowledgeBaseArn);
        return this;
    }

    /**
     * <p>
     * The the identifier of the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The the identifier of the knowledge base.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The the identifier of the knowledge base.
     * </p>
     * 
     * @return The the identifier of the knowledge base.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The the identifier of the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The the identifier of the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseSummary withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
    }

    /**
     * <p>
     * The type of knowledge base.
     * </p>
     * 
     * @param knowledgeBaseType
     *        The type of knowledge base.
     * @see KnowledgeBaseType
     */

    public void setKnowledgeBaseType(String knowledgeBaseType) {
        this.knowledgeBaseType = knowledgeBaseType;
    }

    /**
     * <p>
     * The type of knowledge base.
     * </p>
     * 
     * @return The type of knowledge base.
     * @see KnowledgeBaseType
     */

    public String getKnowledgeBaseType() {
        return this.knowledgeBaseType;
    }

    /**
     * <p>
     * The type of knowledge base.
     * </p>
     * 
     * @param knowledgeBaseType
     *        The type of knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KnowledgeBaseType
     */

    public KnowledgeBaseSummary withKnowledgeBaseType(String knowledgeBaseType) {
        setKnowledgeBaseType(knowledgeBaseType);
        return this;
    }

    /**
     * <p>
     * The type of knowledge base.
     * </p>
     * 
     * @param knowledgeBaseType
     *        The type of knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KnowledgeBaseType
     */

    public KnowledgeBaseSummary withKnowledgeBaseType(KnowledgeBaseType knowledgeBaseType) {
        this.knowledgeBaseType = knowledgeBaseType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the knowledge base.
     * </p>
     * 
     * @param name
     *        The name of the knowledge base.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the knowledge base.
     * </p>
     * 
     * @return The name of the knowledge base.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the knowledge base.
     * </p>
     * 
     * @param name
     *        The name of the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Information about how to render the content.
     * </p>
     * 
     * @param renderingConfiguration
     *        Information about how to render the content.
     */

    public void setRenderingConfiguration(RenderingConfiguration renderingConfiguration) {
        this.renderingConfiguration = renderingConfiguration;
    }

    /**
     * <p>
     * Information about how to render the content.
     * </p>
     * 
     * @return Information about how to render the content.
     */

    public RenderingConfiguration getRenderingConfiguration() {
        return this.renderingConfiguration;
    }

    /**
     * <p>
     * Information about how to render the content.
     * </p>
     * 
     * @param renderingConfiguration
     *        Information about how to render the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseSummary withRenderingConfiguration(RenderingConfiguration renderingConfiguration) {
        setRenderingConfiguration(renderingConfiguration);
        return this;
    }

    /**
     * <p>
     * The KMS key used for encryption.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The KMS key used for encryption.
     */

    public void setServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The KMS key used for encryption.
     * </p>
     * 
     * @return The KMS key used for encryption.
     */

    public ServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The KMS key used for encryption.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The KMS key used for encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseSummary withServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        setServerSideEncryptionConfiguration(serverSideEncryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * [KEVIN]
     * </p>
     * 
     * @param sourceConfiguration
     *        [KEVIN]
     */

    public void setSourceConfiguration(SourceConfiguration sourceConfiguration) {
        this.sourceConfiguration = sourceConfiguration;
    }

    /**
     * <p>
     * [KEVIN]
     * </p>
     * 
     * @return [KEVIN]
     */

    public SourceConfiguration getSourceConfiguration() {
        return this.sourceConfiguration;
    }

    /**
     * <p>
     * [KEVIN]
     * </p>
     * 
     * @param sourceConfiguration
     *        [KEVIN]
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseSummary withSourceConfiguration(SourceConfiguration sourceConfiguration) {
        setSourceConfiguration(sourceConfiguration);
        return this;
    }

    /**
     * <p>
     * The status of the knowledge base summary.
     * </p>
     * 
     * @param status
     *        The status of the knowledge base summary.
     * @see KnowledgeBaseStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the knowledge base summary.
     * </p>
     * 
     * @return The status of the knowledge base summary.
     * @see KnowledgeBaseStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the knowledge base summary.
     * </p>
     * 
     * @param status
     *        The status of the knowledge base summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KnowledgeBaseStatus
     */

    public KnowledgeBaseSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the knowledge base summary.
     * </p>
     * 
     * @param status
     *        The status of the knowledge base summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KnowledgeBaseStatus
     */

    public KnowledgeBaseSummary withStatus(KnowledgeBaseStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see KnowledgeBaseSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseSummary addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseSummary clearTagsEntries() {
        this.tags = null;
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKnowledgeBaseArn() != null)
            sb.append("KnowledgeBaseArn: ").append(getKnowledgeBaseArn()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getKnowledgeBaseType() != null)
            sb.append("KnowledgeBaseType: ").append(getKnowledgeBaseType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRenderingConfiguration() != null)
            sb.append("RenderingConfiguration: ").append(getRenderingConfiguration()).append(",");
        if (getServerSideEncryptionConfiguration() != null)
            sb.append("ServerSideEncryptionConfiguration: ").append(getServerSideEncryptionConfiguration()).append(",");
        if (getSourceConfiguration() != null)
            sb.append("SourceConfiguration: ").append(getSourceConfiguration()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KnowledgeBaseSummary == false)
            return false;
        KnowledgeBaseSummary other = (KnowledgeBaseSummary) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKnowledgeBaseArn() == null ^ this.getKnowledgeBaseArn() == null)
            return false;
        if (other.getKnowledgeBaseArn() != null && other.getKnowledgeBaseArn().equals(this.getKnowledgeBaseArn()) == false)
            return false;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        if (other.getKnowledgeBaseType() == null ^ this.getKnowledgeBaseType() == null)
            return false;
        if (other.getKnowledgeBaseType() != null && other.getKnowledgeBaseType().equals(this.getKnowledgeBaseType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRenderingConfiguration() == null ^ this.getRenderingConfiguration() == null)
            return false;
        if (other.getRenderingConfiguration() != null && other.getRenderingConfiguration().equals(this.getRenderingConfiguration()) == false)
            return false;
        if (other.getServerSideEncryptionConfiguration() == null ^ this.getServerSideEncryptionConfiguration() == null)
            return false;
        if (other.getServerSideEncryptionConfiguration() != null
                && other.getServerSideEncryptionConfiguration().equals(this.getServerSideEncryptionConfiguration()) == false)
            return false;
        if (other.getSourceConfiguration() == null ^ this.getSourceConfiguration() == null)
            return false;
        if (other.getSourceConfiguration() != null && other.getSourceConfiguration().equals(this.getSourceConfiguration()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseArn() == null) ? 0 : getKnowledgeBaseArn().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseType() == null) ? 0 : getKnowledgeBaseType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRenderingConfiguration() == null) ? 0 : getRenderingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getServerSideEncryptionConfiguration() == null) ? 0 : getServerSideEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSourceConfiguration() == null) ? 0 : getSourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public KnowledgeBaseSummary clone() {
        try {
            return (KnowledgeBaseSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.KnowledgeBaseSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

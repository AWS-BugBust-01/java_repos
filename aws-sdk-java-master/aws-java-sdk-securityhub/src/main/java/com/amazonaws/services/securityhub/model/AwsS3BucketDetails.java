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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of an Amazon S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The canonical user ID of the owner of the S3 bucket.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The display name of the owner of the S3 bucket.
     * </p>
     */
    private String ownerName;
    /**
     * <p>
     * The Amazon Web Services account identifier of the account that owns the S3 bucket.
     * </p>
     */
    private String ownerAccountId;
    /**
     * <p>
     * Indicates when the S3 bucket was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String createdAt;
    /**
     * <p>
     * The encryption rules that are applied to the S3 bucket.
     * </p>
     */
    private AwsS3BucketServerSideEncryptionConfiguration serverSideEncryptionConfiguration;
    /**
     * <p>
     * The lifecycle configuration for objects in the S3 bucket.
     * </p>
     */
    private AwsS3BucketBucketLifecycleConfigurationDetails bucketLifecycleConfiguration;
    /**
     * <p>
     * Provides information about the Amazon S3 Public Access Block configuration for the S3 bucket.
     * </p>
     */
    private AwsS3AccountPublicAccessBlockDetails publicAccessBlockConfiguration;
    /**
     * <p>
     * The access control list for the S3 bucket.
     * </p>
     */
    private String accessControlList;
    /**
     * <p>
     * The logging configuration for the S3 bucket.
     * </p>
     */
    private AwsS3BucketLoggingConfiguration bucketLoggingConfiguration;
    /**
     * <p>
     * The website configuration parameters for the S3 bucket.
     * </p>
     */
    private AwsS3BucketWebsiteConfiguration bucketWebsiteConfiguration;
    /**
     * <p>
     * The notification configuration for the S3 bucket.
     * </p>
     */
    private AwsS3BucketNotificationConfiguration bucketNotificationConfiguration;

    /**
     * <p>
     * The canonical user ID of the owner of the S3 bucket.
     * </p>
     * 
     * @param ownerId
     *        The canonical user ID of the owner of the S3 bucket.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The canonical user ID of the owner of the S3 bucket.
     * </p>
     * 
     * @return The canonical user ID of the owner of the S3 bucket.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The canonical user ID of the owner of the S3 bucket.
     * </p>
     * 
     * @param ownerId
     *        The canonical user ID of the owner of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketDetails withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The display name of the owner of the S3 bucket.
     * </p>
     * 
     * @param ownerName
     *        The display name of the owner of the S3 bucket.
     */

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * <p>
     * The display name of the owner of the S3 bucket.
     * </p>
     * 
     * @return The display name of the owner of the S3 bucket.
     */

    public String getOwnerName() {
        return this.ownerName;
    }

    /**
     * <p>
     * The display name of the owner of the S3 bucket.
     * </p>
     * 
     * @param ownerName
     *        The display name of the owner of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketDetails withOwnerName(String ownerName) {
        setOwnerName(ownerName);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account identifier of the account that owns the S3 bucket.
     * </p>
     * 
     * @param ownerAccountId
     *        The Amazon Web Services account identifier of the account that owns the S3 bucket.
     */

    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account identifier of the account that owns the S3 bucket.
     * </p>
     * 
     * @return The Amazon Web Services account identifier of the account that owns the S3 bucket.
     */

    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account identifier of the account that owns the S3 bucket.
     * </p>
     * 
     * @param ownerAccountId
     *        The Amazon Web Services account identifier of the account that owns the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketDetails withOwnerAccountId(String ownerAccountId) {
        setOwnerAccountId(ownerAccountId);
        return this;
    }

    /**
     * <p>
     * Indicates when the S3 bucket was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createdAt
     *        Indicates when the S3 bucket was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Indicates when the S3 bucket was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the S3 bucket was created.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Indicates when the S3 bucket was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createdAt
     *        Indicates when the S3 bucket was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketDetails withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The encryption rules that are applied to the S3 bucket.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The encryption rules that are applied to the S3 bucket.
     */

    public void setServerSideEncryptionConfiguration(AwsS3BucketServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The encryption rules that are applied to the S3 bucket.
     * </p>
     * 
     * @return The encryption rules that are applied to the S3 bucket.
     */

    public AwsS3BucketServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The encryption rules that are applied to the S3 bucket.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The encryption rules that are applied to the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketDetails withServerSideEncryptionConfiguration(AwsS3BucketServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        setServerSideEncryptionConfiguration(serverSideEncryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * The lifecycle configuration for objects in the S3 bucket.
     * </p>
     * 
     * @param bucketLifecycleConfiguration
     *        The lifecycle configuration for objects in the S3 bucket.
     */

    public void setBucketLifecycleConfiguration(AwsS3BucketBucketLifecycleConfigurationDetails bucketLifecycleConfiguration) {
        this.bucketLifecycleConfiguration = bucketLifecycleConfiguration;
    }

    /**
     * <p>
     * The lifecycle configuration for objects in the S3 bucket.
     * </p>
     * 
     * @return The lifecycle configuration for objects in the S3 bucket.
     */

    public AwsS3BucketBucketLifecycleConfigurationDetails getBucketLifecycleConfiguration() {
        return this.bucketLifecycleConfiguration;
    }

    /**
     * <p>
     * The lifecycle configuration for objects in the S3 bucket.
     * </p>
     * 
     * @param bucketLifecycleConfiguration
     *        The lifecycle configuration for objects in the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketDetails withBucketLifecycleConfiguration(AwsS3BucketBucketLifecycleConfigurationDetails bucketLifecycleConfiguration) {
        setBucketLifecycleConfiguration(bucketLifecycleConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides information about the Amazon S3 Public Access Block configuration for the S3 bucket.
     * </p>
     * 
     * @param publicAccessBlockConfiguration
     *        Provides information about the Amazon S3 Public Access Block configuration for the S3 bucket.
     */

    public void setPublicAccessBlockConfiguration(AwsS3AccountPublicAccessBlockDetails publicAccessBlockConfiguration) {
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
    }

    /**
     * <p>
     * Provides information about the Amazon S3 Public Access Block configuration for the S3 bucket.
     * </p>
     * 
     * @return Provides information about the Amazon S3 Public Access Block configuration for the S3 bucket.
     */

    public AwsS3AccountPublicAccessBlockDetails getPublicAccessBlockConfiguration() {
        return this.publicAccessBlockConfiguration;
    }

    /**
     * <p>
     * Provides information about the Amazon S3 Public Access Block configuration for the S3 bucket.
     * </p>
     * 
     * @param publicAccessBlockConfiguration
     *        Provides information about the Amazon S3 Public Access Block configuration for the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketDetails withPublicAccessBlockConfiguration(AwsS3AccountPublicAccessBlockDetails publicAccessBlockConfiguration) {
        setPublicAccessBlockConfiguration(publicAccessBlockConfiguration);
        return this;
    }

    /**
     * <p>
     * The access control list for the S3 bucket.
     * </p>
     * 
     * @param accessControlList
     *        The access control list for the S3 bucket.
     */

    public void setAccessControlList(String accessControlList) {
        this.accessControlList = accessControlList;
    }

    /**
     * <p>
     * The access control list for the S3 bucket.
     * </p>
     * 
     * @return The access control list for the S3 bucket.
     */

    public String getAccessControlList() {
        return this.accessControlList;
    }

    /**
     * <p>
     * The access control list for the S3 bucket.
     * </p>
     * 
     * @param accessControlList
     *        The access control list for the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketDetails withAccessControlList(String accessControlList) {
        setAccessControlList(accessControlList);
        return this;
    }

    /**
     * <p>
     * The logging configuration for the S3 bucket.
     * </p>
     * 
     * @param bucketLoggingConfiguration
     *        The logging configuration for the S3 bucket.
     */

    public void setBucketLoggingConfiguration(AwsS3BucketLoggingConfiguration bucketLoggingConfiguration) {
        this.bucketLoggingConfiguration = bucketLoggingConfiguration;
    }

    /**
     * <p>
     * The logging configuration for the S3 bucket.
     * </p>
     * 
     * @return The logging configuration for the S3 bucket.
     */

    public AwsS3BucketLoggingConfiguration getBucketLoggingConfiguration() {
        return this.bucketLoggingConfiguration;
    }

    /**
     * <p>
     * The logging configuration for the S3 bucket.
     * </p>
     * 
     * @param bucketLoggingConfiguration
     *        The logging configuration for the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketDetails withBucketLoggingConfiguration(AwsS3BucketLoggingConfiguration bucketLoggingConfiguration) {
        setBucketLoggingConfiguration(bucketLoggingConfiguration);
        return this;
    }

    /**
     * <p>
     * The website configuration parameters for the S3 bucket.
     * </p>
     * 
     * @param bucketWebsiteConfiguration
     *        The website configuration parameters for the S3 bucket.
     */

    public void setBucketWebsiteConfiguration(AwsS3BucketWebsiteConfiguration bucketWebsiteConfiguration) {
        this.bucketWebsiteConfiguration = bucketWebsiteConfiguration;
    }

    /**
     * <p>
     * The website configuration parameters for the S3 bucket.
     * </p>
     * 
     * @return The website configuration parameters for the S3 bucket.
     */

    public AwsS3BucketWebsiteConfiguration getBucketWebsiteConfiguration() {
        return this.bucketWebsiteConfiguration;
    }

    /**
     * <p>
     * The website configuration parameters for the S3 bucket.
     * </p>
     * 
     * @param bucketWebsiteConfiguration
     *        The website configuration parameters for the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketDetails withBucketWebsiteConfiguration(AwsS3BucketWebsiteConfiguration bucketWebsiteConfiguration) {
        setBucketWebsiteConfiguration(bucketWebsiteConfiguration);
        return this;
    }

    /**
     * <p>
     * The notification configuration for the S3 bucket.
     * </p>
     * 
     * @param bucketNotificationConfiguration
     *        The notification configuration for the S3 bucket.
     */

    public void setBucketNotificationConfiguration(AwsS3BucketNotificationConfiguration bucketNotificationConfiguration) {
        this.bucketNotificationConfiguration = bucketNotificationConfiguration;
    }

    /**
     * <p>
     * The notification configuration for the S3 bucket.
     * </p>
     * 
     * @return The notification configuration for the S3 bucket.
     */

    public AwsS3BucketNotificationConfiguration getBucketNotificationConfiguration() {
        return this.bucketNotificationConfiguration;
    }

    /**
     * <p>
     * The notification configuration for the S3 bucket.
     * </p>
     * 
     * @param bucketNotificationConfiguration
     *        The notification configuration for the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketDetails withBucketNotificationConfiguration(AwsS3BucketNotificationConfiguration bucketNotificationConfiguration) {
        setBucketNotificationConfiguration(bucketNotificationConfiguration);
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
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getOwnerName() != null)
            sb.append("OwnerName: ").append(getOwnerName()).append(",");
        if (getOwnerAccountId() != null)
            sb.append("OwnerAccountId: ").append(getOwnerAccountId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getServerSideEncryptionConfiguration() != null)
            sb.append("ServerSideEncryptionConfiguration: ").append(getServerSideEncryptionConfiguration()).append(",");
        if (getBucketLifecycleConfiguration() != null)
            sb.append("BucketLifecycleConfiguration: ").append(getBucketLifecycleConfiguration()).append(",");
        if (getPublicAccessBlockConfiguration() != null)
            sb.append("PublicAccessBlockConfiguration: ").append(getPublicAccessBlockConfiguration()).append(",");
        if (getAccessControlList() != null)
            sb.append("AccessControlList: ").append(getAccessControlList()).append(",");
        if (getBucketLoggingConfiguration() != null)
            sb.append("BucketLoggingConfiguration: ").append(getBucketLoggingConfiguration()).append(",");
        if (getBucketWebsiteConfiguration() != null)
            sb.append("BucketWebsiteConfiguration: ").append(getBucketWebsiteConfiguration()).append(",");
        if (getBucketNotificationConfiguration() != null)
            sb.append("BucketNotificationConfiguration: ").append(getBucketNotificationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketDetails == false)
            return false;
        AwsS3BucketDetails other = (AwsS3BucketDetails) obj;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getOwnerName() == null ^ this.getOwnerName() == null)
            return false;
        if (other.getOwnerName() != null && other.getOwnerName().equals(this.getOwnerName()) == false)
            return false;
        if (other.getOwnerAccountId() == null ^ this.getOwnerAccountId() == null)
            return false;
        if (other.getOwnerAccountId() != null && other.getOwnerAccountId().equals(this.getOwnerAccountId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getServerSideEncryptionConfiguration() == null ^ this.getServerSideEncryptionConfiguration() == null)
            return false;
        if (other.getServerSideEncryptionConfiguration() != null
                && other.getServerSideEncryptionConfiguration().equals(this.getServerSideEncryptionConfiguration()) == false)
            return false;
        if (other.getBucketLifecycleConfiguration() == null ^ this.getBucketLifecycleConfiguration() == null)
            return false;
        if (other.getBucketLifecycleConfiguration() != null && other.getBucketLifecycleConfiguration().equals(this.getBucketLifecycleConfiguration()) == false)
            return false;
        if (other.getPublicAccessBlockConfiguration() == null ^ this.getPublicAccessBlockConfiguration() == null)
            return false;
        if (other.getPublicAccessBlockConfiguration() != null
                && other.getPublicAccessBlockConfiguration().equals(this.getPublicAccessBlockConfiguration()) == false)
            return false;
        if (other.getAccessControlList() == null ^ this.getAccessControlList() == null)
            return false;
        if (other.getAccessControlList() != null && other.getAccessControlList().equals(this.getAccessControlList()) == false)
            return false;
        if (other.getBucketLoggingConfiguration() == null ^ this.getBucketLoggingConfiguration() == null)
            return false;
        if (other.getBucketLoggingConfiguration() != null && other.getBucketLoggingConfiguration().equals(this.getBucketLoggingConfiguration()) == false)
            return false;
        if (other.getBucketWebsiteConfiguration() == null ^ this.getBucketWebsiteConfiguration() == null)
            return false;
        if (other.getBucketWebsiteConfiguration() != null && other.getBucketWebsiteConfiguration().equals(this.getBucketWebsiteConfiguration()) == false)
            return false;
        if (other.getBucketNotificationConfiguration() == null ^ this.getBucketNotificationConfiguration() == null)
            return false;
        if (other.getBucketNotificationConfiguration() != null
                && other.getBucketNotificationConfiguration().equals(this.getBucketNotificationConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getOwnerName() == null) ? 0 : getOwnerName().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccountId() == null) ? 0 : getOwnerAccountId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getServerSideEncryptionConfiguration() == null) ? 0 : getServerSideEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getBucketLifecycleConfiguration() == null) ? 0 : getBucketLifecycleConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPublicAccessBlockConfiguration() == null) ? 0 : getPublicAccessBlockConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAccessControlList() == null) ? 0 : getAccessControlList().hashCode());
        hashCode = prime * hashCode + ((getBucketLoggingConfiguration() == null) ? 0 : getBucketLoggingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getBucketWebsiteConfiguration() == null) ? 0 : getBucketWebsiteConfiguration().hashCode());
        hashCode = prime * hashCode + ((getBucketNotificationConfiguration() == null) ? 0 : getBucketNotificationConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketDetails clone() {
        try {
            return (AwsS3BucketDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

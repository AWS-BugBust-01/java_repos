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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/AmazonopensearchserviceDestinationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonopensearchserviceDestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

    private String roleARN;

    private String domainARN;

    private String clusterEndpoint;

    private String indexName;

    private String typeName;

    private String indexRotationPeriod;

    private AmazonopensearchserviceBufferingHints bufferingHints;

    private AmazonopensearchserviceRetryOptions retryOptions;

    private String s3BackupMode;

    private S3DestinationConfiguration s3Configuration;

    private ProcessingConfiguration processingConfiguration;

    private CloudWatchLoggingOptions cloudWatchLoggingOptions;

    private VpcConfiguration vpcConfiguration;

    /**
     * @param roleARN
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * @return
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * @param roleARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationConfiguration withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * @param domainARN
     */

    public void setDomainARN(String domainARN) {
        this.domainARN = domainARN;
    }

    /**
     * @return
     */

    public String getDomainARN() {
        return this.domainARN;
    }

    /**
     * @param domainARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationConfiguration withDomainARN(String domainARN) {
        setDomainARN(domainARN);
        return this;
    }

    /**
     * @param clusterEndpoint
     */

    public void setClusterEndpoint(String clusterEndpoint) {
        this.clusterEndpoint = clusterEndpoint;
    }

    /**
     * @return
     */

    public String getClusterEndpoint() {
        return this.clusterEndpoint;
    }

    /**
     * @param clusterEndpoint
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationConfiguration withClusterEndpoint(String clusterEndpoint) {
        setClusterEndpoint(clusterEndpoint);
        return this;
    }

    /**
     * @param indexName
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * @return
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * @param indexName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationConfiguration withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * @param typeName
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * @return
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * @param typeName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationConfiguration withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * @param indexRotationPeriod
     * @see AmazonopensearchserviceIndexRotationPeriod
     */

    public void setIndexRotationPeriod(String indexRotationPeriod) {
        this.indexRotationPeriod = indexRotationPeriod;
    }

    /**
     * @return
     * @see AmazonopensearchserviceIndexRotationPeriod
     */

    public String getIndexRotationPeriod() {
        return this.indexRotationPeriod;
    }

    /**
     * @param indexRotationPeriod
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AmazonopensearchserviceIndexRotationPeriod
     */

    public AmazonopensearchserviceDestinationConfiguration withIndexRotationPeriod(String indexRotationPeriod) {
        setIndexRotationPeriod(indexRotationPeriod);
        return this;
    }

    /**
     * @param indexRotationPeriod
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AmazonopensearchserviceIndexRotationPeriod
     */

    public AmazonopensearchserviceDestinationConfiguration withIndexRotationPeriod(AmazonopensearchserviceIndexRotationPeriod indexRotationPeriod) {
        this.indexRotationPeriod = indexRotationPeriod.toString();
        return this;
    }

    /**
     * @param bufferingHints
     */

    public void setBufferingHints(AmazonopensearchserviceBufferingHints bufferingHints) {
        this.bufferingHints = bufferingHints;
    }

    /**
     * @return
     */

    public AmazonopensearchserviceBufferingHints getBufferingHints() {
        return this.bufferingHints;
    }

    /**
     * @param bufferingHints
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationConfiguration withBufferingHints(AmazonopensearchserviceBufferingHints bufferingHints) {
        setBufferingHints(bufferingHints);
        return this;
    }

    /**
     * @param retryOptions
     */

    public void setRetryOptions(AmazonopensearchserviceRetryOptions retryOptions) {
        this.retryOptions = retryOptions;
    }

    /**
     * @return
     */

    public AmazonopensearchserviceRetryOptions getRetryOptions() {
        return this.retryOptions;
    }

    /**
     * @param retryOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationConfiguration withRetryOptions(AmazonopensearchserviceRetryOptions retryOptions) {
        setRetryOptions(retryOptions);
        return this;
    }

    /**
     * @param s3BackupMode
     * @see AmazonopensearchserviceS3BackupMode
     */

    public void setS3BackupMode(String s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
    }

    /**
     * @return
     * @see AmazonopensearchserviceS3BackupMode
     */

    public String getS3BackupMode() {
        return this.s3BackupMode;
    }

    /**
     * @param s3BackupMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AmazonopensearchserviceS3BackupMode
     */

    public AmazonopensearchserviceDestinationConfiguration withS3BackupMode(String s3BackupMode) {
        setS3BackupMode(s3BackupMode);
        return this;
    }

    /**
     * @param s3BackupMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AmazonopensearchserviceS3BackupMode
     */

    public AmazonopensearchserviceDestinationConfiguration withS3BackupMode(AmazonopensearchserviceS3BackupMode s3BackupMode) {
        this.s3BackupMode = s3BackupMode.toString();
        return this;
    }

    /**
     * @param s3Configuration
     */

    public void setS3Configuration(S3DestinationConfiguration s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    /**
     * @return
     */

    public S3DestinationConfiguration getS3Configuration() {
        return this.s3Configuration;
    }

    /**
     * @param s3Configuration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationConfiguration withS3Configuration(S3DestinationConfiguration s3Configuration) {
        setS3Configuration(s3Configuration);
        return this;
    }

    /**
     * @param processingConfiguration
     */

    public void setProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        this.processingConfiguration = processingConfiguration;
    }

    /**
     * @return
     */

    public ProcessingConfiguration getProcessingConfiguration() {
        return this.processingConfiguration;
    }

    /**
     * @param processingConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationConfiguration withProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        setProcessingConfiguration(processingConfiguration);
        return this;
    }

    /**
     * @param cloudWatchLoggingOptions
     */

    public void setCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
    }

    /**
     * @return
     */

    public CloudWatchLoggingOptions getCloudWatchLoggingOptions() {
        return this.cloudWatchLoggingOptions;
    }

    /**
     * @param cloudWatchLoggingOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationConfiguration withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        setCloudWatchLoggingOptions(cloudWatchLoggingOptions);
        return this;
    }

    /**
     * @param vpcConfiguration
     */

    public void setVpcConfiguration(VpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * @return
     */

    public VpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * @param vpcConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceDestinationConfiguration withVpcConfiguration(VpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
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
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getDomainARN() != null)
            sb.append("DomainARN: ").append(getDomainARN()).append(",");
        if (getClusterEndpoint() != null)
            sb.append("ClusterEndpoint: ").append(getClusterEndpoint()).append(",");
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getIndexRotationPeriod() != null)
            sb.append("IndexRotationPeriod: ").append(getIndexRotationPeriod()).append(",");
        if (getBufferingHints() != null)
            sb.append("BufferingHints: ").append(getBufferingHints()).append(",");
        if (getRetryOptions() != null)
            sb.append("RetryOptions: ").append(getRetryOptions()).append(",");
        if (getS3BackupMode() != null)
            sb.append("S3BackupMode: ").append(getS3BackupMode()).append(",");
        if (getS3Configuration() != null)
            sb.append("S3Configuration: ").append(getS3Configuration()).append(",");
        if (getProcessingConfiguration() != null)
            sb.append("ProcessingConfiguration: ").append(getProcessingConfiguration()).append(",");
        if (getCloudWatchLoggingOptions() != null)
            sb.append("CloudWatchLoggingOptions: ").append(getCloudWatchLoggingOptions()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AmazonopensearchserviceDestinationConfiguration == false)
            return false;
        AmazonopensearchserviceDestinationConfiguration other = (AmazonopensearchserviceDestinationConfiguration) obj;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getDomainARN() == null ^ this.getDomainARN() == null)
            return false;
        if (other.getDomainARN() != null && other.getDomainARN().equals(this.getDomainARN()) == false)
            return false;
        if (other.getClusterEndpoint() == null ^ this.getClusterEndpoint() == null)
            return false;
        if (other.getClusterEndpoint() != null && other.getClusterEndpoint().equals(this.getClusterEndpoint()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getIndexRotationPeriod() == null ^ this.getIndexRotationPeriod() == null)
            return false;
        if (other.getIndexRotationPeriod() != null && other.getIndexRotationPeriod().equals(this.getIndexRotationPeriod()) == false)
            return false;
        if (other.getBufferingHints() == null ^ this.getBufferingHints() == null)
            return false;
        if (other.getBufferingHints() != null && other.getBufferingHints().equals(this.getBufferingHints()) == false)
            return false;
        if (other.getRetryOptions() == null ^ this.getRetryOptions() == null)
            return false;
        if (other.getRetryOptions() != null && other.getRetryOptions().equals(this.getRetryOptions()) == false)
            return false;
        if (other.getS3BackupMode() == null ^ this.getS3BackupMode() == null)
            return false;
        if (other.getS3BackupMode() != null && other.getS3BackupMode().equals(this.getS3BackupMode()) == false)
            return false;
        if (other.getS3Configuration() == null ^ this.getS3Configuration() == null)
            return false;
        if (other.getS3Configuration() != null && other.getS3Configuration().equals(this.getS3Configuration()) == false)
            return false;
        if (other.getProcessingConfiguration() == null ^ this.getProcessingConfiguration() == null)
            return false;
        if (other.getProcessingConfiguration() != null && other.getProcessingConfiguration().equals(this.getProcessingConfiguration()) == false)
            return false;
        if (other.getCloudWatchLoggingOptions() == null ^ this.getCloudWatchLoggingOptions() == null)
            return false;
        if (other.getCloudWatchLoggingOptions() != null && other.getCloudWatchLoggingOptions().equals(this.getCloudWatchLoggingOptions()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getDomainARN() == null) ? 0 : getDomainARN().hashCode());
        hashCode = prime * hashCode + ((getClusterEndpoint() == null) ? 0 : getClusterEndpoint().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getIndexRotationPeriod() == null) ? 0 : getIndexRotationPeriod().hashCode());
        hashCode = prime * hashCode + ((getBufferingHints() == null) ? 0 : getBufferingHints().hashCode());
        hashCode = prime * hashCode + ((getRetryOptions() == null) ? 0 : getRetryOptions().hashCode());
        hashCode = prime * hashCode + ((getS3BackupMode() == null) ? 0 : getS3BackupMode().hashCode());
        hashCode = prime * hashCode + ((getS3Configuration() == null) ? 0 : getS3Configuration().hashCode());
        hashCode = prime * hashCode + ((getProcessingConfiguration() == null) ? 0 : getProcessingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptions() == null) ? 0 : getCloudWatchLoggingOptions().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public AmazonopensearchserviceDestinationConfiguration clone() {
        try {
            return (AmazonopensearchserviceDestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.AmazonopensearchserviceDestinationConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}

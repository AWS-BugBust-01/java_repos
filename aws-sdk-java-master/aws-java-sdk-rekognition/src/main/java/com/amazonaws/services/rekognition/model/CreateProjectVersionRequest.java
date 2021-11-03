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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProjectVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the Amazon Rekognition Custom Labels project that manages the model that you want to train.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * A name for the version of the model. This value must be unique.
     * </p>
     */
    private String versionName;
    /**
     * <p>
     * The Amazon S3 bucket location to store the results of training. The S3 bucket can be in any AWS account as long
     * as the caller has <code>s3:PutObject</code> permissions on the S3 bucket.
     * </p>
     */
    private OutputConfig outputConfig;
    /**
     * <p>
     * Specifies an external manifest that the services uses to train the model. If you specify
     * <code>TrainingData</code> you must also specify <code>TestingData</code>. The project must not have any
     * associated datasets.
     * </p>
     */
    private TrainingData trainingData;
    /**
     * <p>
     * Specifies an external manifest that the service uses to test the model. If you specify <code>TestingData</code>
     * you must also specify <code>TrainingData</code>. The project must not have any associated datasets.
     * </p>
     */
    private TestingData testingData;
    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the model.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource Name
     * (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt training and test images copied into the service for model training. Your source images are unaffected.
     * The key is also used to encrypt training results and manifest files written to the output Amazon S3 bucket (
     * <code>OutputConfig</code>).
     * </p>
     * <p>
     * If you choose to use your own KMS key, you need the following permissions on the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * kms:CreateGrant
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted using a key
     * that AWS owns and manages.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The ARN of the Amazon Rekognition Custom Labels project that manages the model that you want to train.
     * </p>
     * 
     * @param projectArn
     *        The ARN of the Amazon Rekognition Custom Labels project that manages the model that you want to train.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Rekognition Custom Labels project that manages the model that you want to train.
     * </p>
     * 
     * @return The ARN of the Amazon Rekognition Custom Labels project that manages the model that you want to train.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Rekognition Custom Labels project that manages the model that you want to train.
     * </p>
     * 
     * @param projectArn
     *        The ARN of the Amazon Rekognition Custom Labels project that manages the model that you want to train.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * A name for the version of the model. This value must be unique.
     * </p>
     * 
     * @param versionName
     *        A name for the version of the model. This value must be unique.
     */

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * A name for the version of the model. This value must be unique.
     * </p>
     * 
     * @return A name for the version of the model. This value must be unique.
     */

    public String getVersionName() {
        return this.versionName;
    }

    /**
     * <p>
     * A name for the version of the model. This value must be unique.
     * </p>
     * 
     * @param versionName
     *        A name for the version of the model. This value must be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withVersionName(String versionName) {
        setVersionName(versionName);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket location to store the results of training. The S3 bucket can be in any AWS account as long
     * as the caller has <code>s3:PutObject</code> permissions on the S3 bucket.
     * </p>
     * 
     * @param outputConfig
     *        The Amazon S3 bucket location to store the results of training. The S3 bucket can be in any AWS account as
     *        long as the caller has <code>s3:PutObject</code> permissions on the S3 bucket.
     */

    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The Amazon S3 bucket location to store the results of training. The S3 bucket can be in any AWS account as long
     * as the caller has <code>s3:PutObject</code> permissions on the S3 bucket.
     * </p>
     * 
     * @return The Amazon S3 bucket location to store the results of training. The S3 bucket can be in any AWS account
     *         as long as the caller has <code>s3:PutObject</code> permissions on the S3 bucket.
     */

    public OutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * The Amazon S3 bucket location to store the results of training. The S3 bucket can be in any AWS account as long
     * as the caller has <code>s3:PutObject</code> permissions on the S3 bucket.
     * </p>
     * 
     * @param outputConfig
     *        The Amazon S3 bucket location to store the results of training. The S3 bucket can be in any AWS account as
     *        long as the caller has <code>s3:PutObject</code> permissions on the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withOutputConfig(OutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * Specifies an external manifest that the services uses to train the model. If you specify
     * <code>TrainingData</code> you must also specify <code>TestingData</code>. The project must not have any
     * associated datasets.
     * </p>
     * 
     * @param trainingData
     *        Specifies an external manifest that the services uses to train the model. If you specify
     *        <code>TrainingData</code> you must also specify <code>TestingData</code>. The project must not have any
     *        associated datasets.
     */

    public void setTrainingData(TrainingData trainingData) {
        this.trainingData = trainingData;
    }

    /**
     * <p>
     * Specifies an external manifest that the services uses to train the model. If you specify
     * <code>TrainingData</code> you must also specify <code>TestingData</code>. The project must not have any
     * associated datasets.
     * </p>
     * 
     * @return Specifies an external manifest that the services uses to train the model. If you specify
     *         <code>TrainingData</code> you must also specify <code>TestingData</code>. The project must not have any
     *         associated datasets.
     */

    public TrainingData getTrainingData() {
        return this.trainingData;
    }

    /**
     * <p>
     * Specifies an external manifest that the services uses to train the model. If you specify
     * <code>TrainingData</code> you must also specify <code>TestingData</code>. The project must not have any
     * associated datasets.
     * </p>
     * 
     * @param trainingData
     *        Specifies an external manifest that the services uses to train the model. If you specify
     *        <code>TrainingData</code> you must also specify <code>TestingData</code>. The project must not have any
     *        associated datasets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withTrainingData(TrainingData trainingData) {
        setTrainingData(trainingData);
        return this;
    }

    /**
     * <p>
     * Specifies an external manifest that the service uses to test the model. If you specify <code>TestingData</code>
     * you must also specify <code>TrainingData</code>. The project must not have any associated datasets.
     * </p>
     * 
     * @param testingData
     *        Specifies an external manifest that the service uses to test the model. If you specify
     *        <code>TestingData</code> you must also specify <code>TrainingData</code>. The project must not have any
     *        associated datasets.
     */

    public void setTestingData(TestingData testingData) {
        this.testingData = testingData;
    }

    /**
     * <p>
     * Specifies an external manifest that the service uses to test the model. If you specify <code>TestingData</code>
     * you must also specify <code>TrainingData</code>. The project must not have any associated datasets.
     * </p>
     * 
     * @return Specifies an external manifest that the service uses to test the model. If you specify
     *         <code>TestingData</code> you must also specify <code>TrainingData</code>. The project must not have any
     *         associated datasets.
     */

    public TestingData getTestingData() {
        return this.testingData;
    }

    /**
     * <p>
     * Specifies an external manifest that the service uses to test the model. If you specify <code>TestingData</code>
     * you must also specify <code>TrainingData</code>. The project must not have any associated datasets.
     * </p>
     * 
     * @param testingData
     *        Specifies an external manifest that the service uses to test the model. If you specify
     *        <code>TestingData</code> you must also specify <code>TrainingData</code>. The project must not have any
     *        associated datasets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withTestingData(TestingData testingData) {
        setTestingData(testingData);
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the model.
     * </p>
     * 
     * @return A set of tags (key-value pairs) that you want to attach to the model.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the model.
     * </p>
     * 
     * @param tags
     *        A set of tags (key-value pairs) that you want to attach to the model.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the model.
     * </p>
     * 
     * @param tags
     *        A set of tags (key-value pairs) that you want to attach to the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateProjectVersionRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest addTagsEntry(String key, String value) {
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

    public CreateProjectVersionRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource Name
     * (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt training and test images copied into the service for model training. Your source images are unaffected.
     * The key is also used to encrypt training results and manifest files written to the output Amazon S3 bucket (
     * <code>OutputConfig</code>).
     * </p>
     * <p>
     * If you choose to use your own KMS key, you need the following permissions on the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * kms:CreateGrant
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted using a key
     * that AWS owns and manages.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource
     *        Name (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is
     *        used to encrypt training and test images copied into the service for model training. Your source images
     *        are unaffected. The key is also used to encrypt training results and manifest files written to the output
     *        Amazon S3 bucket (<code>OutputConfig</code>).</p>
     *        <p>
     *        If you choose to use your own KMS key, you need the following permissions on the KMS key.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        kms:CreateGrant
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        kms:DescribeKey
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        kms:GenerateDataKey
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        kms:Decrypt
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted using
     *        a key that AWS owns and manages.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource Name
     * (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt training and test images copied into the service for model training. Your source images are unaffected.
     * The key is also used to encrypt training results and manifest files written to the output Amazon S3 bucket (
     * <code>OutputConfig</code>).
     * </p>
     * <p>
     * If you choose to use your own KMS key, you need the following permissions on the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * kms:CreateGrant
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted using a key
     * that AWS owns and manages.
     * </p>
     * 
     * @return The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource
     *         Name (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key
     *         is used to encrypt training and test images copied into the service for model training. Your source
     *         images are unaffected. The key is also used to encrypt training results and manifest files written to the
     *         output Amazon S3 bucket (<code>OutputConfig</code>).</p>
     *         <p>
     *         If you choose to use your own KMS key, you need the following permissions on the KMS key.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         kms:CreateGrant
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         kms:DescribeKey
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         kms:GenerateDataKey
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         kms:Decrypt
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted
     *         using a key that AWS owns and manages.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource Name
     * (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt training and test images copied into the service for model training. Your source images are unaffected.
     * The key is also used to encrypt training results and manifest files written to the output Amazon S3 bucket (
     * <code>OutputConfig</code>).
     * </p>
     * <p>
     * If you choose to use your own KMS key, you need the following permissions on the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * kms:CreateGrant
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted using a key
     * that AWS owns and manages.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource
     *        Name (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is
     *        used to encrypt training and test images copied into the service for model training. Your source images
     *        are unaffected. The key is also used to encrypt training results and manifest files written to the output
     *        Amazon S3 bucket (<code>OutputConfig</code>).</p>
     *        <p>
     *        If you choose to use your own KMS key, you need the following permissions on the KMS key.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        kms:CreateGrant
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        kms:DescribeKey
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        kms:GenerateDataKey
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        kms:Decrypt
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a value for <code>KmsKeyId</code>, images copied into the service are encrypted using
     *        a key that AWS owns and manages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectVersionRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getVersionName() != null)
            sb.append("VersionName: ").append(getVersionName()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getTrainingData() != null)
            sb.append("TrainingData: ").append(getTrainingData()).append(",");
        if (getTestingData() != null)
            sb.append("TestingData: ").append(getTestingData()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProjectVersionRequest == false)
            return false;
        CreateProjectVersionRequest other = (CreateProjectVersionRequest) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getTrainingData() == null ^ this.getTrainingData() == null)
            return false;
        if (other.getTrainingData() != null && other.getTrainingData().equals(this.getTrainingData()) == false)
            return false;
        if (other.getTestingData() == null ^ this.getTestingData() == null)
            return false;
        if (other.getTestingData() != null && other.getTestingData().equals(this.getTestingData()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getTrainingData() == null) ? 0 : getTrainingData().hashCode());
        hashCode = prime * hashCode + ((getTestingData() == null) ? 0 : getTestingData().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public CreateProjectVersionRequest clone() {
        return (CreateProjectVersionRequest) super.clone();
    }

}

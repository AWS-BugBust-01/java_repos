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
 * Contains all the information about a speaker enrollment job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/SpeakerEnrollmentJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpeakerEnrollmentJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A timestamp showing the creation of the speaker enrollment job.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to read the
     * input manifest file and write the job output file.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * The identifier of the domain that contains the speaker enrollment job.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * A timestamp showing when the speaker enrollment job ended.
     * </p>
     */
    private java.util.Date endedAt;
    /**
     * <p>
     * The configuration that defines the action to take when the speaker is already enrolled in Voice ID, and the
     * <code>FraudDetectionConfig</code> to use.
     * </p>
     */
    private EnrollmentConfig enrollmentConfig;
    /**
     * <p>
     * Contains details that are populated when an entire batch job fails. In cases of individual registration job
     * failures, the batch job as a whole doesn't fail; it is completed with a <code>JobStatus</code> of
     * <code>COMPLETED_WITH_ERRORS</code>. You can use the job output file to identify the individual registration
     * requests that failed.
     * </p>
     */
    private FailureDetails failureDetails;
    /**
     * <p>
     * The input data config containing an S3 URI for the input manifest file that contains the list of speaker
     * enrollment job requests.
     * </p>
     */
    private InputDataConfig inputDataConfig;
    /**
     * <p>
     * The service-generated identifier for the speaker enrollment job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The client-provided name for the speaker enrollment job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * Provides details on job progress. This field shows the completed percentage of registration requests listed in
     * the input file.
     * </p>
     */
    private JobProgress jobProgress;
    /**
     * <p>
     * The current status of the speaker enrollment job.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * The output data config containing the S3 location where Voice ID writes the job output file; you must also
     * include a KMS Key ID to encrypt the file.
     * </p>
     */
    private OutputDataConfig outputDataConfig;

    /**
     * <p>
     * A timestamp showing the creation of the speaker enrollment job.
     * </p>
     * 
     * @param createdAt
     *        A timestamp showing the creation of the speaker enrollment job.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * A timestamp showing the creation of the speaker enrollment job.
     * </p>
     * 
     * @return A timestamp showing the creation of the speaker enrollment job.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * A timestamp showing the creation of the speaker enrollment job.
     * </p>
     * 
     * @param createdAt
     *        A timestamp showing the creation of the speaker enrollment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerEnrollmentJob withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to read the
     * input manifest file and write the job output file.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to
     *        read the input manifest file and write the job output file.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to read the
     * input manifest file and write the job output file.
     * </p>
     * 
     * @return The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to
     *         read the input manifest file and write the job output file.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to read the
     * input manifest file and write the job output file.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The IAM role Amazon Resource Name (ARN) that grants Voice ID permissions to access customer's buckets to
     *        read the input manifest file and write the job output file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerEnrollmentJob withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the domain that contains the speaker enrollment job.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain that contains the speaker enrollment job.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the domain that contains the speaker enrollment job.
     * </p>
     * 
     * @return The identifier of the domain that contains the speaker enrollment job.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the domain that contains the speaker enrollment job.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain that contains the speaker enrollment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerEnrollmentJob withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * A timestamp showing when the speaker enrollment job ended.
     * </p>
     * 
     * @param endedAt
     *        A timestamp showing when the speaker enrollment job ended.
     */

    public void setEndedAt(java.util.Date endedAt) {
        this.endedAt = endedAt;
    }

    /**
     * <p>
     * A timestamp showing when the speaker enrollment job ended.
     * </p>
     * 
     * @return A timestamp showing when the speaker enrollment job ended.
     */

    public java.util.Date getEndedAt() {
        return this.endedAt;
    }

    /**
     * <p>
     * A timestamp showing when the speaker enrollment job ended.
     * </p>
     * 
     * @param endedAt
     *        A timestamp showing when the speaker enrollment job ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerEnrollmentJob withEndedAt(java.util.Date endedAt) {
        setEndedAt(endedAt);
        return this;
    }

    /**
     * <p>
     * The configuration that defines the action to take when the speaker is already enrolled in Voice ID, and the
     * <code>FraudDetectionConfig</code> to use.
     * </p>
     * 
     * @param enrollmentConfig
     *        The configuration that defines the action to take when the speaker is already enrolled in Voice ID, and
     *        the <code>FraudDetectionConfig</code> to use.
     */

    public void setEnrollmentConfig(EnrollmentConfig enrollmentConfig) {
        this.enrollmentConfig = enrollmentConfig;
    }

    /**
     * <p>
     * The configuration that defines the action to take when the speaker is already enrolled in Voice ID, and the
     * <code>FraudDetectionConfig</code> to use.
     * </p>
     * 
     * @return The configuration that defines the action to take when the speaker is already enrolled in Voice ID, and
     *         the <code>FraudDetectionConfig</code> to use.
     */

    public EnrollmentConfig getEnrollmentConfig() {
        return this.enrollmentConfig;
    }

    /**
     * <p>
     * The configuration that defines the action to take when the speaker is already enrolled in Voice ID, and the
     * <code>FraudDetectionConfig</code> to use.
     * </p>
     * 
     * @param enrollmentConfig
     *        The configuration that defines the action to take when the speaker is already enrolled in Voice ID, and
     *        the <code>FraudDetectionConfig</code> to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerEnrollmentJob withEnrollmentConfig(EnrollmentConfig enrollmentConfig) {
        setEnrollmentConfig(enrollmentConfig);
        return this;
    }

    /**
     * <p>
     * Contains details that are populated when an entire batch job fails. In cases of individual registration job
     * failures, the batch job as a whole doesn't fail; it is completed with a <code>JobStatus</code> of
     * <code>COMPLETED_WITH_ERRORS</code>. You can use the job output file to identify the individual registration
     * requests that failed.
     * </p>
     * 
     * @param failureDetails
     *        Contains details that are populated when an entire batch job fails. In cases of individual registration
     *        job failures, the batch job as a whole doesn't fail; it is completed with a <code>JobStatus</code> of
     *        <code>COMPLETED_WITH_ERRORS</code>. You can use the job output file to identify the individual
     *        registration requests that failed.
     */

    public void setFailureDetails(FailureDetails failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     * <p>
     * Contains details that are populated when an entire batch job fails. In cases of individual registration job
     * failures, the batch job as a whole doesn't fail; it is completed with a <code>JobStatus</code> of
     * <code>COMPLETED_WITH_ERRORS</code>. You can use the job output file to identify the individual registration
     * requests that failed.
     * </p>
     * 
     * @return Contains details that are populated when an entire batch job fails. In cases of individual registration
     *         job failures, the batch job as a whole doesn't fail; it is completed with a <code>JobStatus</code> of
     *         <code>COMPLETED_WITH_ERRORS</code>. You can use the job output file to identify the individual
     *         registration requests that failed.
     */

    public FailureDetails getFailureDetails() {
        return this.failureDetails;
    }

    /**
     * <p>
     * Contains details that are populated when an entire batch job fails. In cases of individual registration job
     * failures, the batch job as a whole doesn't fail; it is completed with a <code>JobStatus</code> of
     * <code>COMPLETED_WITH_ERRORS</code>. You can use the job output file to identify the individual registration
     * requests that failed.
     * </p>
     * 
     * @param failureDetails
     *        Contains details that are populated when an entire batch job fails. In cases of individual registration
     *        job failures, the batch job as a whole doesn't fail; it is completed with a <code>JobStatus</code> of
     *        <code>COMPLETED_WITH_ERRORS</code>. You can use the job output file to identify the individual
     *        registration requests that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerEnrollmentJob withFailureDetails(FailureDetails failureDetails) {
        setFailureDetails(failureDetails);
        return this;
    }

    /**
     * <p>
     * The input data config containing an S3 URI for the input manifest file that contains the list of speaker
     * enrollment job requests.
     * </p>
     * 
     * @param inputDataConfig
     *        The input data config containing an S3 URI for the input manifest file that contains the list of speaker
     *        enrollment job requests.
     */

    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The input data config containing an S3 URI for the input manifest file that contains the list of speaker
     * enrollment job requests.
     * </p>
     * 
     * @return The input data config containing an S3 URI for the input manifest file that contains the list of speaker
     *         enrollment job requests.
     */

    public InputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * The input data config containing an S3 URI for the input manifest file that contains the list of speaker
     * enrollment job requests.
     * </p>
     * 
     * @param inputDataConfig
     *        The input data config containing an S3 URI for the input manifest file that contains the list of speaker
     *        enrollment job requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerEnrollmentJob withInputDataConfig(InputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * The service-generated identifier for the speaker enrollment job.
     * </p>
     * 
     * @param jobId
     *        The service-generated identifier for the speaker enrollment job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The service-generated identifier for the speaker enrollment job.
     * </p>
     * 
     * @return The service-generated identifier for the speaker enrollment job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The service-generated identifier for the speaker enrollment job.
     * </p>
     * 
     * @param jobId
     *        The service-generated identifier for the speaker enrollment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerEnrollmentJob withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The client-provided name for the speaker enrollment job.
     * </p>
     * 
     * @param jobName
     *        The client-provided name for the speaker enrollment job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The client-provided name for the speaker enrollment job.
     * </p>
     * 
     * @return The client-provided name for the speaker enrollment job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The client-provided name for the speaker enrollment job.
     * </p>
     * 
     * @param jobName
     *        The client-provided name for the speaker enrollment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerEnrollmentJob withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * Provides details on job progress. This field shows the completed percentage of registration requests listed in
     * the input file.
     * </p>
     * 
     * @param jobProgress
     *        Provides details on job progress. This field shows the completed percentage of registration requests
     *        listed in the input file.
     */

    public void setJobProgress(JobProgress jobProgress) {
        this.jobProgress = jobProgress;
    }

    /**
     * <p>
     * Provides details on job progress. This field shows the completed percentage of registration requests listed in
     * the input file.
     * </p>
     * 
     * @return Provides details on job progress. This field shows the completed percentage of registration requests
     *         listed in the input file.
     */

    public JobProgress getJobProgress() {
        return this.jobProgress;
    }

    /**
     * <p>
     * Provides details on job progress. This field shows the completed percentage of registration requests listed in
     * the input file.
     * </p>
     * 
     * @param jobProgress
     *        Provides details on job progress. This field shows the completed percentage of registration requests
     *        listed in the input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerEnrollmentJob withJobProgress(JobProgress jobProgress) {
        setJobProgress(jobProgress);
        return this;
    }

    /**
     * <p>
     * The current status of the speaker enrollment job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the speaker enrollment job.
     * @see SpeakerEnrollmentJobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the speaker enrollment job.
     * </p>
     * 
     * @return The current status of the speaker enrollment job.
     * @see SpeakerEnrollmentJobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The current status of the speaker enrollment job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the speaker enrollment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpeakerEnrollmentJobStatus
     */

    public SpeakerEnrollmentJob withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the speaker enrollment job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the speaker enrollment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpeakerEnrollmentJobStatus
     */

    public SpeakerEnrollmentJob withJobStatus(SpeakerEnrollmentJobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The output data config containing the S3 location where Voice ID writes the job output file; you must also
     * include a KMS Key ID to encrypt the file.
     * </p>
     * 
     * @param outputDataConfig
     *        The output data config containing the S3 location where Voice ID writes the job output file; you must also
     *        include a KMS Key ID to encrypt the file.
     */

    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * The output data config containing the S3 location where Voice ID writes the job output file; you must also
     * include a KMS Key ID to encrypt the file.
     * </p>
     * 
     * @return The output data config containing the S3 location where Voice ID writes the job output file; you must
     *         also include a KMS Key ID to encrypt the file.
     */

    public OutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * The output data config containing the S3 location where Voice ID writes the job output file; you must also
     * include a KMS Key ID to encrypt the file.
     * </p>
     * 
     * @param outputDataConfig
     *        The output data config containing the S3 location where Voice ID writes the job output file; you must also
     *        include a KMS Key ID to encrypt the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerEnrollmentJob withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getEndedAt() != null)
            sb.append("EndedAt: ").append(getEndedAt()).append(",");
        if (getEnrollmentConfig() != null)
            sb.append("EnrollmentConfig: ").append(getEnrollmentConfig()).append(",");
        if (getFailureDetails() != null)
            sb.append("FailureDetails: ").append(getFailureDetails()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append("***Sensitive Data Redacted***").append(",");
        if (getJobProgress() != null)
            sb.append("JobProgress: ").append(getJobProgress()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpeakerEnrollmentJob == false)
            return false;
        SpeakerEnrollmentJob other = (SpeakerEnrollmentJob) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getEndedAt() == null ^ this.getEndedAt() == null)
            return false;
        if (other.getEndedAt() != null && other.getEndedAt().equals(this.getEndedAt()) == false)
            return false;
        if (other.getEnrollmentConfig() == null ^ this.getEnrollmentConfig() == null)
            return false;
        if (other.getEnrollmentConfig() != null && other.getEnrollmentConfig().equals(this.getEnrollmentConfig()) == false)
            return false;
        if (other.getFailureDetails() == null ^ this.getFailureDetails() == null)
            return false;
        if (other.getFailureDetails() != null && other.getFailureDetails().equals(this.getFailureDetails()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobProgress() == null ^ this.getJobProgress() == null)
            return false;
        if (other.getJobProgress() != null && other.getJobProgress().equals(this.getJobProgress()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getEndedAt() == null) ? 0 : getEndedAt().hashCode());
        hashCode = prime * hashCode + ((getEnrollmentConfig() == null) ? 0 : getEnrollmentConfig().hashCode());
        hashCode = prime * hashCode + ((getFailureDetails() == null) ? 0 : getFailureDetails().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobProgress() == null) ? 0 : getJobProgress().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        return hashCode;
    }

    @Override
    public SpeakerEnrollmentJob clone() {
        try {
            return (SpeakerEnrollmentJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.voiceid.model.transform.SpeakerEnrollmentJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

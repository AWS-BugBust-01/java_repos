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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides summary information about a call analytics job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CallAnalyticsJobSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CallAnalyticsJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the call analytics job.
     * </p>
     */
    private String callAnalyticsJobName;
    /**
     * <p>
     * A timestamp that shows when the call analytics job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A timestamp that shows when the job began processing.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * A timestamp that shows when the job was completed.
     * </p>
     */
    private java.util.Date completionTime;
    /**
     * <p>
     * The language of the transcript in the source audio file.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The status of the call analytics job.
     * </p>
     */
    private String callAnalyticsJobStatus;
    /**
     * <p>
     * If the <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, a description of the error.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the call analytics job.
     * </p>
     * 
     * @param callAnalyticsJobName
     *        The name of the call analytics job.
     */

    public void setCallAnalyticsJobName(String callAnalyticsJobName) {
        this.callAnalyticsJobName = callAnalyticsJobName;
    }

    /**
     * <p>
     * The name of the call analytics job.
     * </p>
     * 
     * @return The name of the call analytics job.
     */

    public String getCallAnalyticsJobName() {
        return this.callAnalyticsJobName;
    }

    /**
     * <p>
     * The name of the call analytics job.
     * </p>
     * 
     * @param callAnalyticsJobName
     *        The name of the call analytics job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJobSummary withCallAnalyticsJobName(String callAnalyticsJobName) {
        setCallAnalyticsJobName(callAnalyticsJobName);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the call analytics job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the call analytics job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the call analytics job was created.
     * </p>
     * 
     * @return A timestamp that shows when the call analytics job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the call analytics job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the call analytics job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJobSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job began processing.
     * </p>
     * 
     * @param startTime
     *        A timestamp that shows when the job began processing.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job began processing.
     * </p>
     * 
     * @return A timestamp that shows when the job began processing.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job began processing.
     * </p>
     * 
     * @param startTime
     *        A timestamp that shows when the job began processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJobSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job was completed.
     * </p>
     * 
     * @param completionTime
     *        A timestamp that shows when the job was completed.
     */

    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was completed.
     * </p>
     * 
     * @return A timestamp that shows when the job was completed.
     */

    public java.util.Date getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was completed.
     * </p>
     * 
     * @param completionTime
     *        A timestamp that shows when the job was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJobSummary withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * The language of the transcript in the source audio file.
     * </p>
     * 
     * @param languageCode
     *        The language of the transcript in the source audio file.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language of the transcript in the source audio file.
     * </p>
     * 
     * @return The language of the transcript in the source audio file.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language of the transcript in the source audio file.
     * </p>
     * 
     * @param languageCode
     *        The language of the transcript in the source audio file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CallAnalyticsJobSummary withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language of the transcript in the source audio file.
     * </p>
     * 
     * @param languageCode
     *        The language of the transcript in the source audio file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CallAnalyticsJobSummary withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The status of the call analytics job.
     * </p>
     * 
     * @param callAnalyticsJobStatus
     *        The status of the call analytics job.
     * @see CallAnalyticsJobStatus
     */

    public void setCallAnalyticsJobStatus(String callAnalyticsJobStatus) {
        this.callAnalyticsJobStatus = callAnalyticsJobStatus;
    }

    /**
     * <p>
     * The status of the call analytics job.
     * </p>
     * 
     * @return The status of the call analytics job.
     * @see CallAnalyticsJobStatus
     */

    public String getCallAnalyticsJobStatus() {
        return this.callAnalyticsJobStatus;
    }

    /**
     * <p>
     * The status of the call analytics job.
     * </p>
     * 
     * @param callAnalyticsJobStatus
     *        The status of the call analytics job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsJobStatus
     */

    public CallAnalyticsJobSummary withCallAnalyticsJobStatus(String callAnalyticsJobStatus) {
        setCallAnalyticsJobStatus(callAnalyticsJobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the call analytics job.
     * </p>
     * 
     * @param callAnalyticsJobStatus
     *        The status of the call analytics job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsJobStatus
     */

    public CallAnalyticsJobSummary withCallAnalyticsJobStatus(CallAnalyticsJobStatus callAnalyticsJobStatus) {
        this.callAnalyticsJobStatus = callAnalyticsJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, a description of the error.
     * </p>
     * 
     * @param failureReason
     *        If the <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, a description of the error.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, a description of the error.
     * </p>
     * 
     * @return If the <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, a description of the error.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, a description of the error.
     * </p>
     * 
     * @param failureReason
     *        If the <code>CallAnalyticsJobStatus</code> is <code>FAILED</code>, a description of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJobSummary withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getCallAnalyticsJobName() != null)
            sb.append("CallAnalyticsJobName: ").append(getCallAnalyticsJobName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getCallAnalyticsJobStatus() != null)
            sb.append("CallAnalyticsJobStatus: ").append(getCallAnalyticsJobStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CallAnalyticsJobSummary == false)
            return false;
        CallAnalyticsJobSummary other = (CallAnalyticsJobSummary) obj;
        if (other.getCallAnalyticsJobName() == null ^ this.getCallAnalyticsJobName() == null)
            return false;
        if (other.getCallAnalyticsJobName() != null && other.getCallAnalyticsJobName().equals(this.getCallAnalyticsJobName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getCallAnalyticsJobStatus() == null ^ this.getCallAnalyticsJobStatus() == null)
            return false;
        if (other.getCallAnalyticsJobStatus() != null && other.getCallAnalyticsJobStatus().equals(this.getCallAnalyticsJobStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCallAnalyticsJobName() == null) ? 0 : getCallAnalyticsJobName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getCallAnalyticsJobStatus() == null) ? 0 : getCallAnalyticsJobStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public CallAnalyticsJobSummary clone() {
        try {
            return (CallAnalyticsJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.CallAnalyticsJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

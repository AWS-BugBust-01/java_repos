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
 * Describes an asynchronous analytics job that was created with the <code>StartAnalyticsJob</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CallAnalyticsJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CallAnalyticsJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the call analytics job.
     * </p>
     */
    private String callAnalyticsJobName;
    /**
     * <p>
     * The status of the analytics job.
     * </p>
     */
    private String callAnalyticsJobStatus;
    /**
     * <p>
     * If you know the language spoken between the customer and the agent, specify a language code for this field.
     * </p>
     * <p>
     * If you don't know the language, you can leave this field blank, and Amazon Transcribe will use machine learning
     * to automatically identify the language. To improve the accuracy of language identification, you can provide an
     * array containing the possible language codes for the language spoken in your audio. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html">Supported languages and
     * language-specific features</a> for additional information.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The sample rate, in Hertz, of the audio.
     * </p>
     */
    private Integer mediaSampleRateHertz;
    /**
     * <p>
     * The format of the input audio file. Note: for call analytics jobs, only the following media formats are
     * supported: MP3, MP4, WAV, FLAC, OGG, and WebM.
     * </p>
     */
    private String mediaFormat;

    private Media media;

    private Transcript transcript;
    /**
     * <p>
     * A timestamp that shows when the analytics job started processing.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * A timestamp that shows when the analytics job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A timestamp that shows when the analytics job was completed.
     * </p>
     */
    private java.util.Date completionTime;
    /**
     * <p>
     * If the <code>AnalyticsJobStatus</code> is <code>FAILED</code>, this field contains information about why the job
     * failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field can contain one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>: The media format specified in the <code>MediaFormat</code> field of the
     * request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>: The media format of the audio
     * file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>: The sample rate specified in the
     * <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8,000 and 48,000
     * Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>: The sample rate in the audio file
     * doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the request. Check the
     * sample rate of your media file and make sure that the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>: The size of your audio file is larger than what Amazon
     * Transcribe Medical can process. For more information, see <i>Guidelines and Quotas</i> in the Amazon Transcribe
     * Medical Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>: Your audio contains more channels than
     * Amazon Transcribe Medical is configured to process. To request additional channels, see Amazon Transcribe Medical
     * Endpoints and Quotas in the <a href="https://docs.aws.amazon.com/general/latest/gr/Welcome.html">Amazon Web
     * Services General Reference</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String failureReason;
    /**
     * <p>
     * The Amazon Resource Number (ARN) that you use to access the analytics job. ARNs have the format
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * A value between zero and one that Amazon Transcribe assigned to the language that it identified in the source
     * audio. This value appears only when you don't provide a single language code. Larger values indicate that Amazon
     * Transcribe has higher confidence in the language that it identified
     * </p>
     */
    private Float identifiedLanguageScore;
    /**
     * <p>
     * Provides information about the settings used to run a transcription job.
     * </p>
     */
    private CallAnalyticsJobSettings settings;
    /**
     * <p>
     * Shows numeric values to indicate the channel assigned to the agent's audio and the channel assigned to the
     * customer's audio.
     * </p>
     */
    private java.util.List<ChannelDefinition> channelDefinitions;

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

    public CallAnalyticsJob withCallAnalyticsJobName(String callAnalyticsJobName) {
        setCallAnalyticsJobName(callAnalyticsJobName);
        return this;
    }

    /**
     * <p>
     * The status of the analytics job.
     * </p>
     * 
     * @param callAnalyticsJobStatus
     *        The status of the analytics job.
     * @see CallAnalyticsJobStatus
     */

    public void setCallAnalyticsJobStatus(String callAnalyticsJobStatus) {
        this.callAnalyticsJobStatus = callAnalyticsJobStatus;
    }

    /**
     * <p>
     * The status of the analytics job.
     * </p>
     * 
     * @return The status of the analytics job.
     * @see CallAnalyticsJobStatus
     */

    public String getCallAnalyticsJobStatus() {
        return this.callAnalyticsJobStatus;
    }

    /**
     * <p>
     * The status of the analytics job.
     * </p>
     * 
     * @param callAnalyticsJobStatus
     *        The status of the analytics job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsJobStatus
     */

    public CallAnalyticsJob withCallAnalyticsJobStatus(String callAnalyticsJobStatus) {
        setCallAnalyticsJobStatus(callAnalyticsJobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the analytics job.
     * </p>
     * 
     * @param callAnalyticsJobStatus
     *        The status of the analytics job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAnalyticsJobStatus
     */

    public CallAnalyticsJob withCallAnalyticsJobStatus(CallAnalyticsJobStatus callAnalyticsJobStatus) {
        this.callAnalyticsJobStatus = callAnalyticsJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * If you know the language spoken between the customer and the agent, specify a language code for this field.
     * </p>
     * <p>
     * If you don't know the language, you can leave this field blank, and Amazon Transcribe will use machine learning
     * to automatically identify the language. To improve the accuracy of language identification, you can provide an
     * array containing the possible language codes for the language spoken in your audio. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html">Supported languages and
     * language-specific features</a> for additional information.
     * </p>
     * 
     * @param languageCode
     *        If you know the language spoken between the customer and the agent, specify a language code for this
     *        field.</p>
     *        <p>
     *        If you don't know the language, you can leave this field blank, and Amazon Transcribe will use machine
     *        learning to automatically identify the language. To improve the accuracy of language identification, you
     *        can provide an array containing the possible language codes for the language spoken in your audio. Refer
     *        to <a href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html">Supported languages and
     *        language-specific features</a> for additional information.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * If you know the language spoken between the customer and the agent, specify a language code for this field.
     * </p>
     * <p>
     * If you don't know the language, you can leave this field blank, and Amazon Transcribe will use machine learning
     * to automatically identify the language. To improve the accuracy of language identification, you can provide an
     * array containing the possible language codes for the language spoken in your audio. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html">Supported languages and
     * language-specific features</a> for additional information.
     * </p>
     * 
     * @return If you know the language spoken between the customer and the agent, specify a language code for this
     *         field.</p>
     *         <p>
     *         If you don't know the language, you can leave this field blank, and Amazon Transcribe will use machine
     *         learning to automatically identify the language. To improve the accuracy of language identification, you
     *         can provide an array containing the possible language codes for the language spoken in your audio. Refer
     *         to <a href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html">Supported languages and
     *         language-specific features</a> for additional information.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * If you know the language spoken between the customer and the agent, specify a language code for this field.
     * </p>
     * <p>
     * If you don't know the language, you can leave this field blank, and Amazon Transcribe will use machine learning
     * to automatically identify the language. To improve the accuracy of language identification, you can provide an
     * array containing the possible language codes for the language spoken in your audio. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html">Supported languages and
     * language-specific features</a> for additional information.
     * </p>
     * 
     * @param languageCode
     *        If you know the language spoken between the customer and the agent, specify a language code for this
     *        field.</p>
     *        <p>
     *        If you don't know the language, you can leave this field blank, and Amazon Transcribe will use machine
     *        learning to automatically identify the language. To improve the accuracy of language identification, you
     *        can provide an array containing the possible language codes for the language spoken in your audio. Refer
     *        to <a href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html">Supported languages and
     *        language-specific features</a> for additional information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CallAnalyticsJob withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * If you know the language spoken between the customer and the agent, specify a language code for this field.
     * </p>
     * <p>
     * If you don't know the language, you can leave this field blank, and Amazon Transcribe will use machine learning
     * to automatically identify the language. To improve the accuracy of language identification, you can provide an
     * array containing the possible language codes for the language spoken in your audio. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html">Supported languages and
     * language-specific features</a> for additional information.
     * </p>
     * 
     * @param languageCode
     *        If you know the language spoken between the customer and the agent, specify a language code for this
     *        field.</p>
     *        <p>
     *        If you don't know the language, you can leave this field blank, and Amazon Transcribe will use machine
     *        learning to automatically identify the language. To improve the accuracy of language identification, you
     *        can provide an array containing the possible language codes for the language spoken in your audio. Refer
     *        to <a href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html">Supported languages and
     *        language-specific features</a> for additional information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CallAnalyticsJob withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio.
     * </p>
     * 
     * @param mediaSampleRateHertz
     *        The sample rate, in Hertz, of the audio.
     */

    public void setMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio.
     * </p>
     * 
     * @return The sample rate, in Hertz, of the audio.
     */

    public Integer getMediaSampleRateHertz() {
        return this.mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio.
     * </p>
     * 
     * @param mediaSampleRateHertz
     *        The sample rate, in Hertz, of the audio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        setMediaSampleRateHertz(mediaSampleRateHertz);
        return this;
    }

    /**
     * <p>
     * The format of the input audio file. Note: for call analytics jobs, only the following media formats are
     * supported: MP3, MP4, WAV, FLAC, OGG, and WebM.
     * </p>
     * 
     * @param mediaFormat
     *        The format of the input audio file. Note: for call analytics jobs, only the following media formats are
     *        supported: MP3, MP4, WAV, FLAC, OGG, and WebM.
     * @see MediaFormat
     */

    public void setMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
    }

    /**
     * <p>
     * The format of the input audio file. Note: for call analytics jobs, only the following media formats are
     * supported: MP3, MP4, WAV, FLAC, OGG, and WebM.
     * </p>
     * 
     * @return The format of the input audio file. Note: for call analytics jobs, only the following media formats are
     *         supported: MP3, MP4, WAV, FLAC, OGG, and WebM.
     * @see MediaFormat
     */

    public String getMediaFormat() {
        return this.mediaFormat;
    }

    /**
     * <p>
     * The format of the input audio file. Note: for call analytics jobs, only the following media formats are
     * supported: MP3, MP4, WAV, FLAC, OGG, and WebM.
     * </p>
     * 
     * @param mediaFormat
     *        The format of the input audio file. Note: for call analytics jobs, only the following media formats are
     *        supported: MP3, MP4, WAV, FLAC, OGG, and WebM.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaFormat
     */

    public CallAnalyticsJob withMediaFormat(String mediaFormat) {
        setMediaFormat(mediaFormat);
        return this;
    }

    /**
     * <p>
     * The format of the input audio file. Note: for call analytics jobs, only the following media formats are
     * supported: MP3, MP4, WAV, FLAC, OGG, and WebM.
     * </p>
     * 
     * @param mediaFormat
     *        The format of the input audio file. Note: for call analytics jobs, only the following media formats are
     *        supported: MP3, MP4, WAV, FLAC, OGG, and WebM.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaFormat
     */

    public CallAnalyticsJob withMediaFormat(MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat.toString();
        return this;
    }

    /**
     * @param media
     */

    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * @return
     */

    public Media getMedia() {
        return this.media;
    }

    /**
     * @param media
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withMedia(Media media) {
        setMedia(media);
        return this;
    }

    /**
     * @param transcript
     */

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    /**
     * @return
     */

    public Transcript getTranscript() {
        return this.transcript;
    }

    /**
     * @param transcript
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withTranscript(Transcript transcript) {
        setTranscript(transcript);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the analytics job started processing.
     * </p>
     * 
     * @param startTime
     *        A timestamp that shows when the analytics job started processing.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the analytics job started processing.
     * </p>
     * 
     * @return A timestamp that shows when the analytics job started processing.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the analytics job started processing.
     * </p>
     * 
     * @param startTime
     *        A timestamp that shows when the analytics job started processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the analytics job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the analytics job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the analytics job was created.
     * </p>
     * 
     * @return A timestamp that shows when the analytics job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the analytics job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the analytics job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the analytics job was completed.
     * </p>
     * 
     * @param completionTime
     *        A timestamp that shows when the analytics job was completed.
     */

    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * A timestamp that shows when the analytics job was completed.
     * </p>
     * 
     * @return A timestamp that shows when the analytics job was completed.
     */

    public java.util.Date getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * A timestamp that shows when the analytics job was completed.
     * </p>
     * 
     * @param completionTime
     *        A timestamp that shows when the analytics job was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * If the <code>AnalyticsJobStatus</code> is <code>FAILED</code>, this field contains information about why the job
     * failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field can contain one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>: The media format specified in the <code>MediaFormat</code> field of the
     * request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>: The media format of the audio
     * file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>: The sample rate specified in the
     * <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8,000 and 48,000
     * Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>: The sample rate in the audio file
     * doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the request. Check the
     * sample rate of your media file and make sure that the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>: The size of your audio file is larger than what Amazon
     * Transcribe Medical can process. For more information, see <i>Guidelines and Quotas</i> in the Amazon Transcribe
     * Medical Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>: Your audio contains more channels than
     * Amazon Transcribe Medical is configured to process. To request additional channels, see Amazon Transcribe Medical
     * Endpoints and Quotas in the <a href="https://docs.aws.amazon.com/general/latest/gr/Welcome.html">Amazon Web
     * Services General Reference</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureReason
     *        If the <code>AnalyticsJobStatus</code> is <code>FAILED</code>, this field contains information about why
     *        the job failed.</p>
     *        <p>
     *        The <code>FailureReason</code> field can contain one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Unsupported media format</code>: The media format specified in the <code>MediaFormat</code> field of
     *        the request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid
     *        values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>The media format provided does not match the detected media format</code>: The media format of the
     *        audio file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check
     *        the media format of your media file and make sure the two values match.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid sample rate for audio file</code>: The sample rate specified in the
     *        <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8,000 and
     *        48,000 Hertz.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>The sample rate provided does not match the detected sample rate</code>: The sample rate in the
     *        audio file doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the
     *        request. Check the sample rate of your media file and make sure that the two values match.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid file size: file size too large</code>: The size of your audio file is larger than what
     *        Amazon Transcribe Medical can process. For more information, see <i>Guidelines and Quotas</i> in the
     *        Amazon Transcribe Medical Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid number of channels: number of channels too large</code>: Your audio contains more channels
     *        than Amazon Transcribe Medical is configured to process. To request additional channels, see Amazon
     *        Transcribe Medical Endpoints and Quotas in the <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/Welcome.html">Amazon Web Services General
     *        Reference</a>.
     *        </p>
     *        </li>
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the <code>AnalyticsJobStatus</code> is <code>FAILED</code>, this field contains information about why the job
     * failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field can contain one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>: The media format specified in the <code>MediaFormat</code> field of the
     * request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>: The media format of the audio
     * file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>: The sample rate specified in the
     * <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8,000 and 48,000
     * Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>: The sample rate in the audio file
     * doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the request. Check the
     * sample rate of your media file and make sure that the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>: The size of your audio file is larger than what Amazon
     * Transcribe Medical can process. For more information, see <i>Guidelines and Quotas</i> in the Amazon Transcribe
     * Medical Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>: Your audio contains more channels than
     * Amazon Transcribe Medical is configured to process. To request additional channels, see Amazon Transcribe Medical
     * Endpoints and Quotas in the <a href="https://docs.aws.amazon.com/general/latest/gr/Welcome.html">Amazon Web
     * Services General Reference</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return If the <code>AnalyticsJobStatus</code> is <code>FAILED</code>, this field contains information about why
     *         the job failed.</p>
     *         <p>
     *         The <code>FailureReason</code> field can contain one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Unsupported media format</code>: The media format specified in the <code>MediaFormat</code> field
     *         of the request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid
     *         values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>The media format provided does not match the detected media format</code>: The media format of the
     *         audio file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check
     *         the media format of your media file and make sure the two values match.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid sample rate for audio file</code>: The sample rate specified in the
     *         <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8,000 and
     *         48,000 Hertz.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>The sample rate provided does not match the detected sample rate</code>: The sample rate in the
     *         audio file doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the
     *         request. Check the sample rate of your media file and make sure that the two values match.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid file size: file size too large</code>: The size of your audio file is larger than what
     *         Amazon Transcribe Medical can process. For more information, see <i>Guidelines and Quotas</i> in the
     *         Amazon Transcribe Medical Guide.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid number of channels: number of channels too large</code>: Your audio contains more channels
     *         than Amazon Transcribe Medical is configured to process. To request additional channels, see Amazon
     *         Transcribe Medical Endpoints and Quotas in the <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/Welcome.html">Amazon Web Services General
     *         Reference</a>.
     *         </p>
     *         </li>
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the <code>AnalyticsJobStatus</code> is <code>FAILED</code>, this field contains information about why the job
     * failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field can contain one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>: The media format specified in the <code>MediaFormat</code> field of the
     * request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>: The media format of the audio
     * file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>: The sample rate specified in the
     * <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8,000 and 48,000
     * Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>: The sample rate in the audio file
     * doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the request. Check the
     * sample rate of your media file and make sure that the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>: The size of your audio file is larger than what Amazon
     * Transcribe Medical can process. For more information, see <i>Guidelines and Quotas</i> in the Amazon Transcribe
     * Medical Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>: Your audio contains more channels than
     * Amazon Transcribe Medical is configured to process. To request additional channels, see Amazon Transcribe Medical
     * Endpoints and Quotas in the <a href="https://docs.aws.amazon.com/general/latest/gr/Welcome.html">Amazon Web
     * Services General Reference</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureReason
     *        If the <code>AnalyticsJobStatus</code> is <code>FAILED</code>, this field contains information about why
     *        the job failed.</p>
     *        <p>
     *        The <code>FailureReason</code> field can contain one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Unsupported media format</code>: The media format specified in the <code>MediaFormat</code> field of
     *        the request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid
     *        values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>The media format provided does not match the detected media format</code>: The media format of the
     *        audio file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check
     *        the media format of your media file and make sure the two values match.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid sample rate for audio file</code>: The sample rate specified in the
     *        <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8,000 and
     *        48,000 Hertz.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>The sample rate provided does not match the detected sample rate</code>: The sample rate in the
     *        audio file doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the
     *        request. Check the sample rate of your media file and make sure that the two values match.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid file size: file size too large</code>: The size of your audio file is larger than what
     *        Amazon Transcribe Medical can process. For more information, see <i>Guidelines and Quotas</i> in the
     *        Amazon Transcribe Medical Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid number of channels: number of channels too large</code>: Your audio contains more channels
     *        than Amazon Transcribe Medical is configured to process. To request additional channels, see Amazon
     *        Transcribe Medical Endpoints and Quotas in the <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/Welcome.html">Amazon Web Services General
     *        Reference</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) that you use to access the analytics job. ARNs have the format
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Number (ARN) that you use to access the analytics job. ARNs have the format
     *        <code>arn:partition:service:region:account-id:resource-type/resource-id</code>.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) that you use to access the analytics job. ARNs have the format
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) that you use to access the analytics job. ARNs have the format
     *         <code>arn:partition:service:region:account-id:resource-type/resource-id</code>.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) that you use to access the analytics job. ARNs have the format
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Number (ARN) that you use to access the analytics job. ARNs have the format
     *        <code>arn:partition:service:region:account-id:resource-type/resource-id</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * A value between zero and one that Amazon Transcribe assigned to the language that it identified in the source
     * audio. This value appears only when you don't provide a single language code. Larger values indicate that Amazon
     * Transcribe has higher confidence in the language that it identified
     * </p>
     * 
     * @param identifiedLanguageScore
     *        A value between zero and one that Amazon Transcribe assigned to the language that it identified in the
     *        source audio. This value appears only when you don't provide a single language code. Larger values
     *        indicate that Amazon Transcribe has higher confidence in the language that it identified
     */

    public void setIdentifiedLanguageScore(Float identifiedLanguageScore) {
        this.identifiedLanguageScore = identifiedLanguageScore;
    }

    /**
     * <p>
     * A value between zero and one that Amazon Transcribe assigned to the language that it identified in the source
     * audio. This value appears only when you don't provide a single language code. Larger values indicate that Amazon
     * Transcribe has higher confidence in the language that it identified
     * </p>
     * 
     * @return A value between zero and one that Amazon Transcribe assigned to the language that it identified in the
     *         source audio. This value appears only when you don't provide a single language code. Larger values
     *         indicate that Amazon Transcribe has higher confidence in the language that it identified
     */

    public Float getIdentifiedLanguageScore() {
        return this.identifiedLanguageScore;
    }

    /**
     * <p>
     * A value between zero and one that Amazon Transcribe assigned to the language that it identified in the source
     * audio. This value appears only when you don't provide a single language code. Larger values indicate that Amazon
     * Transcribe has higher confidence in the language that it identified
     * </p>
     * 
     * @param identifiedLanguageScore
     *        A value between zero and one that Amazon Transcribe assigned to the language that it identified in the
     *        source audio. This value appears only when you don't provide a single language code. Larger values
     *        indicate that Amazon Transcribe has higher confidence in the language that it identified
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withIdentifiedLanguageScore(Float identifiedLanguageScore) {
        setIdentifiedLanguageScore(identifiedLanguageScore);
        return this;
    }

    /**
     * <p>
     * Provides information about the settings used to run a transcription job.
     * </p>
     * 
     * @param settings
     *        Provides information about the settings used to run a transcription job.
     */

    public void setSettings(CallAnalyticsJobSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Provides information about the settings used to run a transcription job.
     * </p>
     * 
     * @return Provides information about the settings used to run a transcription job.
     */

    public CallAnalyticsJobSettings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * Provides information about the settings used to run a transcription job.
     * </p>
     * 
     * @param settings
     *        Provides information about the settings used to run a transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withSettings(CallAnalyticsJobSettings settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * Shows numeric values to indicate the channel assigned to the agent's audio and the channel assigned to the
     * customer's audio.
     * </p>
     * 
     * @return Shows numeric values to indicate the channel assigned to the agent's audio and the channel assigned to
     *         the customer's audio.
     */

    public java.util.List<ChannelDefinition> getChannelDefinitions() {
        return channelDefinitions;
    }

    /**
     * <p>
     * Shows numeric values to indicate the channel assigned to the agent's audio and the channel assigned to the
     * customer's audio.
     * </p>
     * 
     * @param channelDefinitions
     *        Shows numeric values to indicate the channel assigned to the agent's audio and the channel assigned to the
     *        customer's audio.
     */

    public void setChannelDefinitions(java.util.Collection<ChannelDefinition> channelDefinitions) {
        if (channelDefinitions == null) {
            this.channelDefinitions = null;
            return;
        }

        this.channelDefinitions = new java.util.ArrayList<ChannelDefinition>(channelDefinitions);
    }

    /**
     * <p>
     * Shows numeric values to indicate the channel assigned to the agent's audio and the channel assigned to the
     * customer's audio.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannelDefinitions(java.util.Collection)} or {@link #withChannelDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param channelDefinitions
     *        Shows numeric values to indicate the channel assigned to the agent's audio and the channel assigned to the
     *        customer's audio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withChannelDefinitions(ChannelDefinition... channelDefinitions) {
        if (this.channelDefinitions == null) {
            setChannelDefinitions(new java.util.ArrayList<ChannelDefinition>(channelDefinitions.length));
        }
        for (ChannelDefinition ele : channelDefinitions) {
            this.channelDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Shows numeric values to indicate the channel assigned to the agent's audio and the channel assigned to the
     * customer's audio.
     * </p>
     * 
     * @param channelDefinitions
     *        Shows numeric values to indicate the channel assigned to the agent's audio and the channel assigned to the
     *        customer's audio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJob withChannelDefinitions(java.util.Collection<ChannelDefinition> channelDefinitions) {
        setChannelDefinitions(channelDefinitions);
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
        if (getCallAnalyticsJobStatus() != null)
            sb.append("CallAnalyticsJobStatus: ").append(getCallAnalyticsJobStatus()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getMediaSampleRateHertz() != null)
            sb.append("MediaSampleRateHertz: ").append(getMediaSampleRateHertz()).append(",");
        if (getMediaFormat() != null)
            sb.append("MediaFormat: ").append(getMediaFormat()).append(",");
        if (getMedia() != null)
            sb.append("Media: ").append(getMedia()).append(",");
        if (getTranscript() != null)
            sb.append("Transcript: ").append(getTranscript()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getIdentifiedLanguageScore() != null)
            sb.append("IdentifiedLanguageScore: ").append(getIdentifiedLanguageScore()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getChannelDefinitions() != null)
            sb.append("ChannelDefinitions: ").append(getChannelDefinitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CallAnalyticsJob == false)
            return false;
        CallAnalyticsJob other = (CallAnalyticsJob) obj;
        if (other.getCallAnalyticsJobName() == null ^ this.getCallAnalyticsJobName() == null)
            return false;
        if (other.getCallAnalyticsJobName() != null && other.getCallAnalyticsJobName().equals(this.getCallAnalyticsJobName()) == false)
            return false;
        if (other.getCallAnalyticsJobStatus() == null ^ this.getCallAnalyticsJobStatus() == null)
            return false;
        if (other.getCallAnalyticsJobStatus() != null && other.getCallAnalyticsJobStatus().equals(this.getCallAnalyticsJobStatus()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getMediaSampleRateHertz() == null ^ this.getMediaSampleRateHertz() == null)
            return false;
        if (other.getMediaSampleRateHertz() != null && other.getMediaSampleRateHertz().equals(this.getMediaSampleRateHertz()) == false)
            return false;
        if (other.getMediaFormat() == null ^ this.getMediaFormat() == null)
            return false;
        if (other.getMediaFormat() != null && other.getMediaFormat().equals(this.getMediaFormat()) == false)
            return false;
        if (other.getMedia() == null ^ this.getMedia() == null)
            return false;
        if (other.getMedia() != null && other.getMedia().equals(this.getMedia()) == false)
            return false;
        if (other.getTranscript() == null ^ this.getTranscript() == null)
            return false;
        if (other.getTranscript() != null && other.getTranscript().equals(this.getTranscript()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getIdentifiedLanguageScore() == null ^ this.getIdentifiedLanguageScore() == null)
            return false;
        if (other.getIdentifiedLanguageScore() != null && other.getIdentifiedLanguageScore().equals(this.getIdentifiedLanguageScore()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getChannelDefinitions() == null ^ this.getChannelDefinitions() == null)
            return false;
        if (other.getChannelDefinitions() != null && other.getChannelDefinitions().equals(this.getChannelDefinitions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCallAnalyticsJobName() == null) ? 0 : getCallAnalyticsJobName().hashCode());
        hashCode = prime * hashCode + ((getCallAnalyticsJobStatus() == null) ? 0 : getCallAnalyticsJobStatus().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getMediaSampleRateHertz() == null) ? 0 : getMediaSampleRateHertz().hashCode());
        hashCode = prime * hashCode + ((getMediaFormat() == null) ? 0 : getMediaFormat().hashCode());
        hashCode = prime * hashCode + ((getMedia() == null) ? 0 : getMedia().hashCode());
        hashCode = prime * hashCode + ((getTranscript() == null) ? 0 : getTranscript().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getIdentifiedLanguageScore() == null) ? 0 : getIdentifiedLanguageScore().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getChannelDefinitions() == null) ? 0 : getChannelDefinitions().hashCode());
        return hashCode;
    }

    @Override
    public CallAnalyticsJob clone() {
        try {
            return (CallAnalyticsJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.CallAnalyticsJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

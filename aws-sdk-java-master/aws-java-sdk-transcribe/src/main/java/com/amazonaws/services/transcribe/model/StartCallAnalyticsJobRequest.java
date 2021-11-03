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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartCallAnalyticsJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartCallAnalyticsJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the call analytics job. You can't use the string "." or ".." by themselves as the job name. The name
     * must also be unique within an Amazon Web Services account. If you try to create a call analytics job with the
     * same name as a previous call analytics job, you get a <code>ConflictException</code> error.
     * </p>
     */
    private String callAnalyticsJobName;

    private Media media;
    /**
     * <p>
     * The Amazon S3 location where the output of the call analytics job is stored. You can provide the following
     * location types to store the output of call analytics job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1
     * </p>
     * <p>
     * If you specify a bucket, Amazon Transcribe saves the output of the analytics job as a JSON file at the root level
     * of the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1/folder/
     * </p>
     * <p>
     * f you specify a path, Amazon Transcribe saves the output of the analytics job as
     * s3://DOC-EXAMPLE-BUCKET1/folder/your-transcription-job-name.json
     * </p>
     * <p>
     * If you specify a folder, you must provide a trailing slash.
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1/folder/filename.json
     * </p>
     * <p>
     * If you provide a path that has the filename specified, Amazon Transcribe saves the output of the analytics job as
     * s3://DOC-EXAMPLEBUCKET1/folder/filename.json
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify an Amazon Web Services Key Management Service (KMS) key to encrypt the output of our analytics
     * job using the <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key, Amazon Transcribe
     * uses the default Amazon S3 key for server-side encryption of the analytics job output that is placed in your S3
     * bucket.
     * </p>
     */
    private String outputLocation;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Key Management Service key used to encrypt the output
     * of the call analytics job. The user calling the operation must have permission to use the specified KMS key.
     * </p>
     * <p>
     * You use either of the following to identify an Amazon Web Services KMS key in the current account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS Key Alias: "alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use either of the following to identify a KMS key in the current account or another account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS key in the current account or another account:
     * "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify an encryption key, the output of the call analytics job is encrypted with the default Amazon
     * S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an output location in the
     * <code>OutputLocation</code> parameter.
     * </p>
     */
    private String outputEncryptionKMSKeyId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that has access to the S3 bucket that contains your input files. Amazon
     * Transcribe assumes this role to read queued audio files. If you have specified an output S3 bucket for your
     * transcription results, this role should have access to the output bucket as well.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * A <code>Settings</code> object that provides optional settings for a call analytics job.
     * </p>
     */
    private CallAnalyticsJobSettings settings;
    /**
     * <p>
     * When you start a call analytics job, you must pass an array that maps the agent and the customer to specific
     * audio channels. The values you can assign to a channel are 0 and 1. The agent and the customer must each have
     * their own channel. You can't assign more than one channel to an agent or customer.
     * </p>
     */
    private java.util.List<ChannelDefinition> channelDefinitions;

    /**
     * <p>
     * The name of the call analytics job. You can't use the string "." or ".." by themselves as the job name. The name
     * must also be unique within an Amazon Web Services account. If you try to create a call analytics job with the
     * same name as a previous call analytics job, you get a <code>ConflictException</code> error.
     * </p>
     * 
     * @param callAnalyticsJobName
     *        The name of the call analytics job. You can't use the string "." or ".." by themselves as the job name.
     *        The name must also be unique within an Amazon Web Services account. If you try to create a call analytics
     *        job with the same name as a previous call analytics job, you get a <code>ConflictException</code> error.
     */

    public void setCallAnalyticsJobName(String callAnalyticsJobName) {
        this.callAnalyticsJobName = callAnalyticsJobName;
    }

    /**
     * <p>
     * The name of the call analytics job. You can't use the string "." or ".." by themselves as the job name. The name
     * must also be unique within an Amazon Web Services account. If you try to create a call analytics job with the
     * same name as a previous call analytics job, you get a <code>ConflictException</code> error.
     * </p>
     * 
     * @return The name of the call analytics job. You can't use the string "." or ".." by themselves as the job name.
     *         The name must also be unique within an Amazon Web Services account. If you try to create a call analytics
     *         job with the same name as a previous call analytics job, you get a <code>ConflictException</code> error.
     */

    public String getCallAnalyticsJobName() {
        return this.callAnalyticsJobName;
    }

    /**
     * <p>
     * The name of the call analytics job. You can't use the string "." or ".." by themselves as the job name. The name
     * must also be unique within an Amazon Web Services account. If you try to create a call analytics job with the
     * same name as a previous call analytics job, you get a <code>ConflictException</code> error.
     * </p>
     * 
     * @param callAnalyticsJobName
     *        The name of the call analytics job. You can't use the string "." or ".." by themselves as the job name.
     *        The name must also be unique within an Amazon Web Services account. If you try to create a call analytics
     *        job with the same name as a previous call analytics job, you get a <code>ConflictException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCallAnalyticsJobRequest withCallAnalyticsJobName(String callAnalyticsJobName) {
        setCallAnalyticsJobName(callAnalyticsJobName);
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

    public StartCallAnalyticsJobRequest withMedia(Media media) {
        setMedia(media);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location where the output of the call analytics job is stored. You can provide the following
     * location types to store the output of call analytics job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1
     * </p>
     * <p>
     * If you specify a bucket, Amazon Transcribe saves the output of the analytics job as a JSON file at the root level
     * of the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1/folder/
     * </p>
     * <p>
     * f you specify a path, Amazon Transcribe saves the output of the analytics job as
     * s3://DOC-EXAMPLE-BUCKET1/folder/your-transcription-job-name.json
     * </p>
     * <p>
     * If you specify a folder, you must provide a trailing slash.
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1/folder/filename.json
     * </p>
     * <p>
     * If you provide a path that has the filename specified, Amazon Transcribe saves the output of the analytics job as
     * s3://DOC-EXAMPLEBUCKET1/folder/filename.json
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify an Amazon Web Services Key Management Service (KMS) key to encrypt the output of our analytics
     * job using the <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key, Amazon Transcribe
     * uses the default Amazon S3 key for server-side encryption of the analytics job output that is placed in your S3
     * bucket.
     * </p>
     * 
     * @param outputLocation
     *        The Amazon S3 location where the output of the call analytics job is stored. You can provide the following
     *        location types to store the output of call analytics job:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        s3://DOC-EXAMPLE-BUCKET1
     *        </p>
     *        <p>
     *        If you specify a bucket, Amazon Transcribe saves the output of the analytics job as a JSON file at the
     *        root level of the bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        s3://DOC-EXAMPLE-BUCKET1/folder/
     *        </p>
     *        <p>
     *        f you specify a path, Amazon Transcribe saves the output of the analytics job as
     *        s3://DOC-EXAMPLE-BUCKET1/folder/your-transcription-job-name.json
     *        </p>
     *        <p>
     *        If you specify a folder, you must provide a trailing slash.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        s3://DOC-EXAMPLE-BUCKET1/folder/filename.json
     *        </p>
     *        <p>
     *        If you provide a path that has the filename specified, Amazon Transcribe saves the output of the analytics
     *        job as s3://DOC-EXAMPLEBUCKET1/folder/filename.json
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can specify an Amazon Web Services Key Management Service (KMS) key to encrypt the output of our
     *        analytics job using the <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key,
     *        Amazon Transcribe uses the default Amazon S3 key for server-side encryption of the analytics job output
     *        that is placed in your S3 bucket.
     */

    public void setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * The Amazon S3 location where the output of the call analytics job is stored. You can provide the following
     * location types to store the output of call analytics job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1
     * </p>
     * <p>
     * If you specify a bucket, Amazon Transcribe saves the output of the analytics job as a JSON file at the root level
     * of the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1/folder/
     * </p>
     * <p>
     * f you specify a path, Amazon Transcribe saves the output of the analytics job as
     * s3://DOC-EXAMPLE-BUCKET1/folder/your-transcription-job-name.json
     * </p>
     * <p>
     * If you specify a folder, you must provide a trailing slash.
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1/folder/filename.json
     * </p>
     * <p>
     * If you provide a path that has the filename specified, Amazon Transcribe saves the output of the analytics job as
     * s3://DOC-EXAMPLEBUCKET1/folder/filename.json
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify an Amazon Web Services Key Management Service (KMS) key to encrypt the output of our analytics
     * job using the <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key, Amazon Transcribe
     * uses the default Amazon S3 key for server-side encryption of the analytics job output that is placed in your S3
     * bucket.
     * </p>
     * 
     * @return The Amazon S3 location where the output of the call analytics job is stored. You can provide the
     *         following location types to store the output of call analytics job:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         s3://DOC-EXAMPLE-BUCKET1
     *         </p>
     *         <p>
     *         If you specify a bucket, Amazon Transcribe saves the output of the analytics job as a JSON file at the
     *         root level of the bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         s3://DOC-EXAMPLE-BUCKET1/folder/
     *         </p>
     *         <p>
     *         f you specify a path, Amazon Transcribe saves the output of the analytics job as
     *         s3://DOC-EXAMPLE-BUCKET1/folder/your-transcription-job-name.json
     *         </p>
     *         <p>
     *         If you specify a folder, you must provide a trailing slash.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         s3://DOC-EXAMPLE-BUCKET1/folder/filename.json
     *         </p>
     *         <p>
     *         If you provide a path that has the filename specified, Amazon Transcribe saves the output of the
     *         analytics job as s3://DOC-EXAMPLEBUCKET1/folder/filename.json
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can specify an Amazon Web Services Key Management Service (KMS) key to encrypt the output of our
     *         analytics job using the <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key,
     *         Amazon Transcribe uses the default Amazon S3 key for server-side encryption of the analytics job output
     *         that is placed in your S3 bucket.
     */

    public String getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * <p>
     * The Amazon S3 location where the output of the call analytics job is stored. You can provide the following
     * location types to store the output of call analytics job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1
     * </p>
     * <p>
     * If you specify a bucket, Amazon Transcribe saves the output of the analytics job as a JSON file at the root level
     * of the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1/folder/
     * </p>
     * <p>
     * f you specify a path, Amazon Transcribe saves the output of the analytics job as
     * s3://DOC-EXAMPLE-BUCKET1/folder/your-transcription-job-name.json
     * </p>
     * <p>
     * If you specify a folder, you must provide a trailing slash.
     * </p>
     * </li>
     * <li>
     * <p>
     * s3://DOC-EXAMPLE-BUCKET1/folder/filename.json
     * </p>
     * <p>
     * If you provide a path that has the filename specified, Amazon Transcribe saves the output of the analytics job as
     * s3://DOC-EXAMPLEBUCKET1/folder/filename.json
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify an Amazon Web Services Key Management Service (KMS) key to encrypt the output of our analytics
     * job using the <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key, Amazon Transcribe
     * uses the default Amazon S3 key for server-side encryption of the analytics job output that is placed in your S3
     * bucket.
     * </p>
     * 
     * @param outputLocation
     *        The Amazon S3 location where the output of the call analytics job is stored. You can provide the following
     *        location types to store the output of call analytics job:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        s3://DOC-EXAMPLE-BUCKET1
     *        </p>
     *        <p>
     *        If you specify a bucket, Amazon Transcribe saves the output of the analytics job as a JSON file at the
     *        root level of the bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        s3://DOC-EXAMPLE-BUCKET1/folder/
     *        </p>
     *        <p>
     *        f you specify a path, Amazon Transcribe saves the output of the analytics job as
     *        s3://DOC-EXAMPLE-BUCKET1/folder/your-transcription-job-name.json
     *        </p>
     *        <p>
     *        If you specify a folder, you must provide a trailing slash.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        s3://DOC-EXAMPLE-BUCKET1/folder/filename.json
     *        </p>
     *        <p>
     *        If you provide a path that has the filename specified, Amazon Transcribe saves the output of the analytics
     *        job as s3://DOC-EXAMPLEBUCKET1/folder/filename.json
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can specify an Amazon Web Services Key Management Service (KMS) key to encrypt the output of our
     *        analytics job using the <code>OutputEncryptionKMSKeyId</code> parameter. If you don't specify a KMS key,
     *        Amazon Transcribe uses the default Amazon S3 key for server-side encryption of the analytics job output
     *        that is placed in your S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCallAnalyticsJobRequest withOutputLocation(String outputLocation) {
        setOutputLocation(outputLocation);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Key Management Service key used to encrypt the output
     * of the call analytics job. The user calling the operation must have permission to use the specified KMS key.
     * </p>
     * <p>
     * You use either of the following to identify an Amazon Web Services KMS key in the current account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS Key Alias: "alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use either of the following to identify a KMS key in the current account or another account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS key in the current account or another account:
     * "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify an encryption key, the output of the call analytics job is encrypted with the default Amazon
     * S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an output location in the
     * <code>OutputLocation</code> parameter.
     * </p>
     * 
     * @param outputEncryptionKMSKeyId
     *        The Amazon Resource Name (ARN) of the Amazon Web Services Key Management Service key used to encrypt the
     *        output of the call analytics job. The user calling the operation must have permission to use the specified
     *        KMS key.</p>
     *        <p>
     *        You use either of the following to identify an Amazon Web Services KMS key in the current account:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        KMS Key Alias: "alias/ExampleAlias"
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can use either of the following to identify a KMS key in the current account or another account:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS key in the current account or another account:
     *        "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef1234567890ab"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify an encryption key, the output of the call analytics job is encrypted with the default
     *        Amazon S3 key (SSE-S3).
     *        </p>
     *        <p>
     *        If you specify a KMS key to encrypt your output, you must also specify an output location in the
     *        <code>OutputLocation</code> parameter.
     */

    public void setOutputEncryptionKMSKeyId(String outputEncryptionKMSKeyId) {
        this.outputEncryptionKMSKeyId = outputEncryptionKMSKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Key Management Service key used to encrypt the output
     * of the call analytics job. The user calling the operation must have permission to use the specified KMS key.
     * </p>
     * <p>
     * You use either of the following to identify an Amazon Web Services KMS key in the current account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS Key Alias: "alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use either of the following to identify a KMS key in the current account or another account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS key in the current account or another account:
     * "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify an encryption key, the output of the call analytics job is encrypted with the default Amazon
     * S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an output location in the
     * <code>OutputLocation</code> parameter.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Web Services Key Management Service key used to encrypt the
     *         output of the call analytics job. The user calling the operation must have permission to use the
     *         specified KMS key.</p>
     *         <p>
     *         You use either of the following to identify an Amazon Web Services KMS key in the current account:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         KMS Key Alias: "alias/ExampleAlias"
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can use either of the following to identify a KMS key in the current account or another account:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Amazon Resource Name (ARN) of a KMS key in the current account or another account:
     *         "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef1234567890ab"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify an encryption key, the output of the call analytics job is encrypted with the
     *         default Amazon S3 key (SSE-S3).
     *         </p>
     *         <p>
     *         If you specify a KMS key to encrypt your output, you must also specify an output location in the
     *         <code>OutputLocation</code> parameter.
     */

    public String getOutputEncryptionKMSKeyId() {
        return this.outputEncryptionKMSKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Key Management Service key used to encrypt the output
     * of the call analytics job. The user calling the operation must have permission to use the specified KMS key.
     * </p>
     * <p>
     * You use either of the following to identify an Amazon Web Services KMS key in the current account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS Key Alias: "alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use either of the following to identify a KMS key in the current account or another account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS key in the current account or another account:
     * "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef1234567890ab"
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify an encryption key, the output of the call analytics job is encrypted with the default Amazon
     * S3 key (SSE-S3).
     * </p>
     * <p>
     * If you specify a KMS key to encrypt your output, you must also specify an output location in the
     * <code>OutputLocation</code> parameter.
     * </p>
     * 
     * @param outputEncryptionKMSKeyId
     *        The Amazon Resource Name (ARN) of the Amazon Web Services Key Management Service key used to encrypt the
     *        output of the call analytics job. The user calling the operation must have permission to use the specified
     *        KMS key.</p>
     *        <p>
     *        You use either of the following to identify an Amazon Web Services KMS key in the current account:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        KMS Key Alias: "alias/ExampleAlias"
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can use either of the following to identify a KMS key in the current account or another account:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS key in the current account or another account:
     *        "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef1234567890ab"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify an encryption key, the output of the call analytics job is encrypted with the default
     *        Amazon S3 key (SSE-S3).
     *        </p>
     *        <p>
     *        If you specify a KMS key to encrypt your output, you must also specify an output location in the
     *        <code>OutputLocation</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCallAnalyticsJobRequest withOutputEncryptionKMSKeyId(String outputEncryptionKMSKeyId) {
        setOutputEncryptionKMSKeyId(outputEncryptionKMSKeyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that has access to the S3 bucket that contains your input files. Amazon
     * Transcribe assumes this role to read queued audio files. If you have specified an output S3 bucket for your
     * transcription results, this role should have access to the output bucket as well.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of a role that has access to the S3 bucket that contains your input files.
     *        Amazon Transcribe assumes this role to read queued audio files. If you have specified an output S3 bucket
     *        for your transcription results, this role should have access to the output bucket as well.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that has access to the S3 bucket that contains your input files. Amazon
     * Transcribe assumes this role to read queued audio files. If you have specified an output S3 bucket for your
     * transcription results, this role should have access to the output bucket as well.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role that has access to the S3 bucket that contains your input files.
     *         Amazon Transcribe assumes this role to read queued audio files. If you have specified an output S3 bucket
     *         for your transcription results, this role should have access to the output bucket as well.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that has access to the S3 bucket that contains your input files. Amazon
     * Transcribe assumes this role to read queued audio files. If you have specified an output S3 bucket for your
     * transcription results, this role should have access to the output bucket as well.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of a role that has access to the S3 bucket that contains your input files.
     *        Amazon Transcribe assumes this role to read queued audio files. If you have specified an output S3 bucket
     *        for your transcription results, this role should have access to the output bucket as well.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCallAnalyticsJobRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * A <code>Settings</code> object that provides optional settings for a call analytics job.
     * </p>
     * 
     * @param settings
     *        A <code>Settings</code> object that provides optional settings for a call analytics job.
     */

    public void setSettings(CallAnalyticsJobSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * A <code>Settings</code> object that provides optional settings for a call analytics job.
     * </p>
     * 
     * @return A <code>Settings</code> object that provides optional settings for a call analytics job.
     */

    public CallAnalyticsJobSettings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * A <code>Settings</code> object that provides optional settings for a call analytics job.
     * </p>
     * 
     * @param settings
     *        A <code>Settings</code> object that provides optional settings for a call analytics job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCallAnalyticsJobRequest withSettings(CallAnalyticsJobSettings settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * When you start a call analytics job, you must pass an array that maps the agent and the customer to specific
     * audio channels. The values you can assign to a channel are 0 and 1. The agent and the customer must each have
     * their own channel. You can't assign more than one channel to an agent or customer.
     * </p>
     * 
     * @return When you start a call analytics job, you must pass an array that maps the agent and the customer to
     *         specific audio channels. The values you can assign to a channel are 0 and 1. The agent and the customer
     *         must each have their own channel. You can't assign more than one channel to an agent or customer.
     */

    public java.util.List<ChannelDefinition> getChannelDefinitions() {
        return channelDefinitions;
    }

    /**
     * <p>
     * When you start a call analytics job, you must pass an array that maps the agent and the customer to specific
     * audio channels. The values you can assign to a channel are 0 and 1. The agent and the customer must each have
     * their own channel. You can't assign more than one channel to an agent or customer.
     * </p>
     * 
     * @param channelDefinitions
     *        When you start a call analytics job, you must pass an array that maps the agent and the customer to
     *        specific audio channels. The values you can assign to a channel are 0 and 1. The agent and the customer
     *        must each have their own channel. You can't assign more than one channel to an agent or customer.
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
     * When you start a call analytics job, you must pass an array that maps the agent and the customer to specific
     * audio channels. The values you can assign to a channel are 0 and 1. The agent and the customer must each have
     * their own channel. You can't assign more than one channel to an agent or customer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannelDefinitions(java.util.Collection)} or {@link #withChannelDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param channelDefinitions
     *        When you start a call analytics job, you must pass an array that maps the agent and the customer to
     *        specific audio channels. The values you can assign to a channel are 0 and 1. The agent and the customer
     *        must each have their own channel. You can't assign more than one channel to an agent or customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCallAnalyticsJobRequest withChannelDefinitions(ChannelDefinition... channelDefinitions) {
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
     * When you start a call analytics job, you must pass an array that maps the agent and the customer to specific
     * audio channels. The values you can assign to a channel are 0 and 1. The agent and the customer must each have
     * their own channel. You can't assign more than one channel to an agent or customer.
     * </p>
     * 
     * @param channelDefinitions
     *        When you start a call analytics job, you must pass an array that maps the agent and the customer to
     *        specific audio channels. The values you can assign to a channel are 0 and 1. The agent and the customer
     *        must each have their own channel. You can't assign more than one channel to an agent or customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCallAnalyticsJobRequest withChannelDefinitions(java.util.Collection<ChannelDefinition> channelDefinitions) {
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
        if (getMedia() != null)
            sb.append("Media: ").append(getMedia()).append(",");
        if (getOutputLocation() != null)
            sb.append("OutputLocation: ").append(getOutputLocation()).append(",");
        if (getOutputEncryptionKMSKeyId() != null)
            sb.append("OutputEncryptionKMSKeyId: ").append(getOutputEncryptionKMSKeyId()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
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

        if (obj instanceof StartCallAnalyticsJobRequest == false)
            return false;
        StartCallAnalyticsJobRequest other = (StartCallAnalyticsJobRequest) obj;
        if (other.getCallAnalyticsJobName() == null ^ this.getCallAnalyticsJobName() == null)
            return false;
        if (other.getCallAnalyticsJobName() != null && other.getCallAnalyticsJobName().equals(this.getCallAnalyticsJobName()) == false)
            return false;
        if (other.getMedia() == null ^ this.getMedia() == null)
            return false;
        if (other.getMedia() != null && other.getMedia().equals(this.getMedia()) == false)
            return false;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        if (other.getOutputEncryptionKMSKeyId() == null ^ this.getOutputEncryptionKMSKeyId() == null)
            return false;
        if (other.getOutputEncryptionKMSKeyId() != null && other.getOutputEncryptionKMSKeyId().equals(this.getOutputEncryptionKMSKeyId()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
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
        hashCode = prime * hashCode + ((getMedia() == null) ? 0 : getMedia().hashCode());
        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime * hashCode + ((getOutputEncryptionKMSKeyId() == null) ? 0 : getOutputEncryptionKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getChannelDefinitions() == null) ? 0 : getChannelDefinitions().hashCode());
        return hashCode;
    }

    @Override
    public StartCallAnalyticsJobRequest clone() {
        return (StartCallAnalyticsJobRequest) super.clone();
    }

}

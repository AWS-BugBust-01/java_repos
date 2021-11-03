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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A mapping between an Amazon Web Services resource and a Lambda function. For details, see
 * <a>CreateEventSourceMapping</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateEventSourceMapping" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventSourceMappingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the event source mapping.
     * </p>
     */
    private String uUID;
    /**
     * <p>
     * The position in a stream from which to start reading. Required for Amazon Kinesis, Amazon DynamoDB, and Amazon
     * MSK stream sources. <code>AT_TIMESTAMP</code> is supported only for Amazon Kinesis streams.
     * </p>
     */
    private String startingPosition;
    /**
     * <p>
     * With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start reading.
     * </p>
     */
    private java.util.Date startingPositionTimestamp;
    /**
     * <p>
     * The maximum number of records in each batch that Lambda pulls from your stream or queue and sends to your
     * function. Lambda passes all of the records in the batch to the function in a single call, up to the payload limit
     * for synchronous invocation (6 MB).
     * </p>
     * <p>
     * Default value: Varies by service. For Amazon SQS, the default is 10. For all other services, the default is 100.
     * </p>
     * <p>
     * Related setting: When you set <code>BatchSize</code> to a value greater than 10, you must set
     * <code>MaximumBatchingWindowInSeconds</code> to at least 1.
     * </p>
     */
    private Integer batchSize;
    /**
     * <p>
     * (Streams and Amazon SQS standard queues) The maximum amount of time, in seconds, that Lambda spends gathering
     * records before invoking the function.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Related setting: When you set <code>BatchSize</code> to a value greater than 10, you must set
     * <code>MaximumBatchingWindowInSeconds</code> to at least 1.
     * </p>
     */
    private Integer maximumBatchingWindowInSeconds;
    /**
     * <p>
     * (Streams only) The number of batches to process concurrently from each shard. The default value is 1.
     * </p>
     */
    private Integer parallelizationFactor;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event source.
     * </p>
     */
    private String eventSourceArn;
    /**
     * <p>
     * The ARN of the Lambda function.
     * </p>
     */
    private String functionArn;
    /**
     * <p>
     * The date that the event source mapping was last updated or that its state changed.
     * </p>
     */
    private java.util.Date lastModified;
    /**
     * <p>
     * The result of the last Lambda invocation of your function.
     * </p>
     */
    private String lastProcessingResult;
    /**
     * <p>
     * The state of the event source mapping. It can be one of the following: <code>Creating</code>,
     * <code>Enabling</code>, <code>Enabled</code>, <code>Disabling</code>, <code>Disabled</code>, <code>Updating</code>
     * , or <code>Deleting</code>.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Indicates whether a user or Lambda made the last change to the event source mapping.
     * </p>
     */
    private String stateTransitionReason;
    /**
     * <p>
     * (Streams only) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     * </p>
     */
    private DestinationConfig destinationConfig;
    /**
     * <p>
     * The name of the Kafka topic.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> topics;
    /**
     * <p>
     * (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> queues;
    /**
     * <p>
     * An array of the authentication protocol, VPC components, or virtual host to secure and define your event source.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SourceAccessConfiguration> sourceAccessConfigurations;
    /**
     * <p>
     * The self-managed Apache Kafka cluster for your event source.
     * </p>
     */
    private SelfManagedEventSource selfManagedEventSource;
    /**
     * <p>
     * (Streams only) Discard records older than the specified age. The default value is -1, which sets the maximum age
     * to infinite. When the value is set to infinite, Lambda never discards old records.
     * </p>
     */
    private Integer maximumRecordAgeInSeconds;
    /**
     * <p>
     * (Streams only) If the function returns an error, split the batch in two and retry. The default value is false.
     * </p>
     */
    private Boolean bisectBatchOnFunctionError;
    /**
     * <p>
     * (Streams only) Discard records after the specified number of retries. The default value is -1, which sets the
     * maximum number of retries to infinite. When MaximumRetryAttempts is infinite, Lambda retries failed records until
     * the record expires in the event source.
     * </p>
     */
    private Integer maximumRetryAttempts;
    /**
     * <p>
     * (Streams only) The duration in seconds of a processing window. The range is 1–900 seconds.
     * </p>
     */
    private Integer tumblingWindowInSeconds;
    /**
     * <p>
     * (Streams only) A list of current response type enums applied to the event source mapping.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> functionResponseTypes;

    /**
     * <p>
     * The identifier of the event source mapping.
     * </p>
     * 
     * @param uUID
     *        The identifier of the event source mapping.
     */

    public void setUUID(String uUID) {
        this.uUID = uUID;
    }

    /**
     * <p>
     * The identifier of the event source mapping.
     * </p>
     * 
     * @return The identifier of the event source mapping.
     */

    public String getUUID() {
        return this.uUID;
    }

    /**
     * <p>
     * The identifier of the event source mapping.
     * </p>
     * 
     * @param uUID
     *        The identifier of the event source mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withUUID(String uUID) {
        setUUID(uUID);
        return this;
    }

    /**
     * <p>
     * The position in a stream from which to start reading. Required for Amazon Kinesis, Amazon DynamoDB, and Amazon
     * MSK stream sources. <code>AT_TIMESTAMP</code> is supported only for Amazon Kinesis streams.
     * </p>
     * 
     * @param startingPosition
     *        The position in a stream from which to start reading. Required for Amazon Kinesis, Amazon DynamoDB, and
     *        Amazon MSK stream sources. <code>AT_TIMESTAMP</code> is supported only for Amazon Kinesis streams.
     * @see EventSourcePosition
     */

    public void setStartingPosition(String startingPosition) {
        this.startingPosition = startingPosition;
    }

    /**
     * <p>
     * The position in a stream from which to start reading. Required for Amazon Kinesis, Amazon DynamoDB, and Amazon
     * MSK stream sources. <code>AT_TIMESTAMP</code> is supported only for Amazon Kinesis streams.
     * </p>
     * 
     * @return The position in a stream from which to start reading. Required for Amazon Kinesis, Amazon DynamoDB, and
     *         Amazon MSK stream sources. <code>AT_TIMESTAMP</code> is supported only for Amazon Kinesis streams.
     * @see EventSourcePosition
     */

    public String getStartingPosition() {
        return this.startingPosition;
    }

    /**
     * <p>
     * The position in a stream from which to start reading. Required for Amazon Kinesis, Amazon DynamoDB, and Amazon
     * MSK stream sources. <code>AT_TIMESTAMP</code> is supported only for Amazon Kinesis streams.
     * </p>
     * 
     * @param startingPosition
     *        The position in a stream from which to start reading. Required for Amazon Kinesis, Amazon DynamoDB, and
     *        Amazon MSK stream sources. <code>AT_TIMESTAMP</code> is supported only for Amazon Kinesis streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourcePosition
     */

    public CreateEventSourceMappingResult withStartingPosition(String startingPosition) {
        setStartingPosition(startingPosition);
        return this;
    }

    /**
     * <p>
     * The position in a stream from which to start reading. Required for Amazon Kinesis, Amazon DynamoDB, and Amazon
     * MSK stream sources. <code>AT_TIMESTAMP</code> is supported only for Amazon Kinesis streams.
     * </p>
     * 
     * @param startingPosition
     *        The position in a stream from which to start reading. Required for Amazon Kinesis, Amazon DynamoDB, and
     *        Amazon MSK stream sources. <code>AT_TIMESTAMP</code> is supported only for Amazon Kinesis streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourcePosition
     */

    public CreateEventSourceMappingResult withStartingPosition(EventSourcePosition startingPosition) {
        this.startingPosition = startingPosition.toString();
        return this;
    }

    /**
     * <p>
     * With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start reading.
     * </p>
     * 
     * @param startingPositionTimestamp
     *        With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start reading.
     */

    public void setStartingPositionTimestamp(java.util.Date startingPositionTimestamp) {
        this.startingPositionTimestamp = startingPositionTimestamp;
    }

    /**
     * <p>
     * With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start reading.
     * </p>
     * 
     * @return With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start
     *         reading.
     */

    public java.util.Date getStartingPositionTimestamp() {
        return this.startingPositionTimestamp;
    }

    /**
     * <p>
     * With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start reading.
     * </p>
     * 
     * @param startingPositionTimestamp
     *        With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start reading.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withStartingPositionTimestamp(java.util.Date startingPositionTimestamp) {
        setStartingPositionTimestamp(startingPositionTimestamp);
        return this;
    }

    /**
     * <p>
     * The maximum number of records in each batch that Lambda pulls from your stream or queue and sends to your
     * function. Lambda passes all of the records in the batch to the function in a single call, up to the payload limit
     * for synchronous invocation (6 MB).
     * </p>
     * <p>
     * Default value: Varies by service. For Amazon SQS, the default is 10. For all other services, the default is 100.
     * </p>
     * <p>
     * Related setting: When you set <code>BatchSize</code> to a value greater than 10, you must set
     * <code>MaximumBatchingWindowInSeconds</code> to at least 1.
     * </p>
     * 
     * @param batchSize
     *        The maximum number of records in each batch that Lambda pulls from your stream or queue and sends to your
     *        function. Lambda passes all of the records in the batch to the function in a single call, up to the
     *        payload limit for synchronous invocation (6 MB).</p>
     *        <p>
     *        Default value: Varies by service. For Amazon SQS, the default is 10. For all other services, the default
     *        is 100.
     *        </p>
     *        <p>
     *        Related setting: When you set <code>BatchSize</code> to a value greater than 10, you must set
     *        <code>MaximumBatchingWindowInSeconds</code> to at least 1.
     */

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * <p>
     * The maximum number of records in each batch that Lambda pulls from your stream or queue and sends to your
     * function. Lambda passes all of the records in the batch to the function in a single call, up to the payload limit
     * for synchronous invocation (6 MB).
     * </p>
     * <p>
     * Default value: Varies by service. For Amazon SQS, the default is 10. For all other services, the default is 100.
     * </p>
     * <p>
     * Related setting: When you set <code>BatchSize</code> to a value greater than 10, you must set
     * <code>MaximumBatchingWindowInSeconds</code> to at least 1.
     * </p>
     * 
     * @return The maximum number of records in each batch that Lambda pulls from your stream or queue and sends to your
     *         function. Lambda passes all of the records in the batch to the function in a single call, up to the
     *         payload limit for synchronous invocation (6 MB).</p>
     *         <p>
     *         Default value: Varies by service. For Amazon SQS, the default is 10. For all other services, the default
     *         is 100.
     *         </p>
     *         <p>
     *         Related setting: When you set <code>BatchSize</code> to a value greater than 10, you must set
     *         <code>MaximumBatchingWindowInSeconds</code> to at least 1.
     */

    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * <p>
     * The maximum number of records in each batch that Lambda pulls from your stream or queue and sends to your
     * function. Lambda passes all of the records in the batch to the function in a single call, up to the payload limit
     * for synchronous invocation (6 MB).
     * </p>
     * <p>
     * Default value: Varies by service. For Amazon SQS, the default is 10. For all other services, the default is 100.
     * </p>
     * <p>
     * Related setting: When you set <code>BatchSize</code> to a value greater than 10, you must set
     * <code>MaximumBatchingWindowInSeconds</code> to at least 1.
     * </p>
     * 
     * @param batchSize
     *        The maximum number of records in each batch that Lambda pulls from your stream or queue and sends to your
     *        function. Lambda passes all of the records in the batch to the function in a single call, up to the
     *        payload limit for synchronous invocation (6 MB).</p>
     *        <p>
     *        Default value: Varies by service. For Amazon SQS, the default is 10. For all other services, the default
     *        is 100.
     *        </p>
     *        <p>
     *        Related setting: When you set <code>BatchSize</code> to a value greater than 10, you must set
     *        <code>MaximumBatchingWindowInSeconds</code> to at least 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withBatchSize(Integer batchSize) {
        setBatchSize(batchSize);
        return this;
    }

    /**
     * <p>
     * (Streams and Amazon SQS standard queues) The maximum amount of time, in seconds, that Lambda spends gathering
     * records before invoking the function.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Related setting: When you set <code>BatchSize</code> to a value greater than 10, you must set
     * <code>MaximumBatchingWindowInSeconds</code> to at least 1.
     * </p>
     * 
     * @param maximumBatchingWindowInSeconds
     *        (Streams and Amazon SQS standard queues) The maximum amount of time, in seconds, that Lambda spends
     *        gathering records before invoking the function.</p>
     *        <p>
     *        Default: 0
     *        </p>
     *        <p>
     *        Related setting: When you set <code>BatchSize</code> to a value greater than 10, you must set
     *        <code>MaximumBatchingWindowInSeconds</code> to at least 1.
     */

    public void setMaximumBatchingWindowInSeconds(Integer maximumBatchingWindowInSeconds) {
        this.maximumBatchingWindowInSeconds = maximumBatchingWindowInSeconds;
    }

    /**
     * <p>
     * (Streams and Amazon SQS standard queues) The maximum amount of time, in seconds, that Lambda spends gathering
     * records before invoking the function.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Related setting: When you set <code>BatchSize</code> to a value greater than 10, you must set
     * <code>MaximumBatchingWindowInSeconds</code> to at least 1.
     * </p>
     * 
     * @return (Streams and Amazon SQS standard queues) The maximum amount of time, in seconds, that Lambda spends
     *         gathering records before invoking the function.</p>
     *         <p>
     *         Default: 0
     *         </p>
     *         <p>
     *         Related setting: When you set <code>BatchSize</code> to a value greater than 10, you must set
     *         <code>MaximumBatchingWindowInSeconds</code> to at least 1.
     */

    public Integer getMaximumBatchingWindowInSeconds() {
        return this.maximumBatchingWindowInSeconds;
    }

    /**
     * <p>
     * (Streams and Amazon SQS standard queues) The maximum amount of time, in seconds, that Lambda spends gathering
     * records before invoking the function.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Related setting: When you set <code>BatchSize</code> to a value greater than 10, you must set
     * <code>MaximumBatchingWindowInSeconds</code> to at least 1.
     * </p>
     * 
     * @param maximumBatchingWindowInSeconds
     *        (Streams and Amazon SQS standard queues) The maximum amount of time, in seconds, that Lambda spends
     *        gathering records before invoking the function.</p>
     *        <p>
     *        Default: 0
     *        </p>
     *        <p>
     *        Related setting: When you set <code>BatchSize</code> to a value greater than 10, you must set
     *        <code>MaximumBatchingWindowInSeconds</code> to at least 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withMaximumBatchingWindowInSeconds(Integer maximumBatchingWindowInSeconds) {
        setMaximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds);
        return this;
    }

    /**
     * <p>
     * (Streams only) The number of batches to process concurrently from each shard. The default value is 1.
     * </p>
     * 
     * @param parallelizationFactor
     *        (Streams only) The number of batches to process concurrently from each shard. The default value is 1.
     */

    public void setParallelizationFactor(Integer parallelizationFactor) {
        this.parallelizationFactor = parallelizationFactor;
    }

    /**
     * <p>
     * (Streams only) The number of batches to process concurrently from each shard. The default value is 1.
     * </p>
     * 
     * @return (Streams only) The number of batches to process concurrently from each shard. The default value is 1.
     */

    public Integer getParallelizationFactor() {
        return this.parallelizationFactor;
    }

    /**
     * <p>
     * (Streams only) The number of batches to process concurrently from each shard. The default value is 1.
     * </p>
     * 
     * @param parallelizationFactor
     *        (Streams only) The number of batches to process concurrently from each shard. The default value is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withParallelizationFactor(Integer parallelizationFactor) {
        setParallelizationFactor(parallelizationFactor);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event source.
     * </p>
     * 
     * @param eventSourceArn
     *        The Amazon Resource Name (ARN) of the event source.
     */

    public void setEventSourceArn(String eventSourceArn) {
        this.eventSourceArn = eventSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event source.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the event source.
     */

    public String getEventSourceArn() {
        return this.eventSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event source.
     * </p>
     * 
     * @param eventSourceArn
     *        The Amazon Resource Name (ARN) of the event source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withEventSourceArn(String eventSourceArn) {
        setEventSourceArn(eventSourceArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the Lambda function.
     * </p>
     * 
     * @param functionArn
     *        The ARN of the Lambda function.
     */

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * <p>
     * The ARN of the Lambda function.
     * </p>
     * 
     * @return The ARN of the Lambda function.
     */

    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * <p>
     * The ARN of the Lambda function.
     * </p>
     * 
     * @param functionArn
     *        The ARN of the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
        return this;
    }

    /**
     * <p>
     * The date that the event source mapping was last updated or that its state changed.
     * </p>
     * 
     * @param lastModified
     *        The date that the event source mapping was last updated or that its state changed.
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date that the event source mapping was last updated or that its state changed.
     * </p>
     * 
     * @return The date that the event source mapping was last updated or that its state changed.
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The date that the event source mapping was last updated or that its state changed.
     * </p>
     * 
     * @param lastModified
     *        The date that the event source mapping was last updated or that its state changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * The result of the last Lambda invocation of your function.
     * </p>
     * 
     * @param lastProcessingResult
     *        The result of the last Lambda invocation of your function.
     */

    public void setLastProcessingResult(String lastProcessingResult) {
        this.lastProcessingResult = lastProcessingResult;
    }

    /**
     * <p>
     * The result of the last Lambda invocation of your function.
     * </p>
     * 
     * @return The result of the last Lambda invocation of your function.
     */

    public String getLastProcessingResult() {
        return this.lastProcessingResult;
    }

    /**
     * <p>
     * The result of the last Lambda invocation of your function.
     * </p>
     * 
     * @param lastProcessingResult
     *        The result of the last Lambda invocation of your function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withLastProcessingResult(String lastProcessingResult) {
        setLastProcessingResult(lastProcessingResult);
        return this;
    }

    /**
     * <p>
     * The state of the event source mapping. It can be one of the following: <code>Creating</code>,
     * <code>Enabling</code>, <code>Enabled</code>, <code>Disabling</code>, <code>Disabled</code>, <code>Updating</code>
     * , or <code>Deleting</code>.
     * </p>
     * 
     * @param state
     *        The state of the event source mapping. It can be one of the following: <code>Creating</code>,
     *        <code>Enabling</code>, <code>Enabled</code>, <code>Disabling</code>, <code>Disabled</code>,
     *        <code>Updating</code>, or <code>Deleting</code>.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the event source mapping. It can be one of the following: <code>Creating</code>,
     * <code>Enabling</code>, <code>Enabled</code>, <code>Disabling</code>, <code>Disabled</code>, <code>Updating</code>
     * , or <code>Deleting</code>.
     * </p>
     * 
     * @return The state of the event source mapping. It can be one of the following: <code>Creating</code>,
     *         <code>Enabling</code>, <code>Enabled</code>, <code>Disabling</code>, <code>Disabled</code>,
     *         <code>Updating</code>, or <code>Deleting</code>.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the event source mapping. It can be one of the following: <code>Creating</code>,
     * <code>Enabling</code>, <code>Enabled</code>, <code>Disabling</code>, <code>Disabled</code>, <code>Updating</code>
     * , or <code>Deleting</code>.
     * </p>
     * 
     * @param state
     *        The state of the event source mapping. It can be one of the following: <code>Creating</code>,
     *        <code>Enabling</code>, <code>Enabled</code>, <code>Disabling</code>, <code>Disabled</code>,
     *        <code>Updating</code>, or <code>Deleting</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Indicates whether a user or Lambda made the last change to the event source mapping.
     * </p>
     * 
     * @param stateTransitionReason
     *        Indicates whether a user or Lambda made the last change to the event source mapping.
     */

    public void setStateTransitionReason(String stateTransitionReason) {
        this.stateTransitionReason = stateTransitionReason;
    }

    /**
     * <p>
     * Indicates whether a user or Lambda made the last change to the event source mapping.
     * </p>
     * 
     * @return Indicates whether a user or Lambda made the last change to the event source mapping.
     */

    public String getStateTransitionReason() {
        return this.stateTransitionReason;
    }

    /**
     * <p>
     * Indicates whether a user or Lambda made the last change to the event source mapping.
     * </p>
     * 
     * @param stateTransitionReason
     *        Indicates whether a user or Lambda made the last change to the event source mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withStateTransitionReason(String stateTransitionReason) {
        setStateTransitionReason(stateTransitionReason);
        return this;
    }

    /**
     * <p>
     * (Streams only) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     * </p>
     * 
     * @param destinationConfig
     *        (Streams only) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     */

    public void setDestinationConfig(DestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
    }

    /**
     * <p>
     * (Streams only) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     * </p>
     * 
     * @return (Streams only) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     */

    public DestinationConfig getDestinationConfig() {
        return this.destinationConfig;
    }

    /**
     * <p>
     * (Streams only) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     * </p>
     * 
     * @param destinationConfig
     *        (Streams only) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withDestinationConfig(DestinationConfig destinationConfig) {
        setDestinationConfig(destinationConfig);
        return this;
    }

    /**
     * <p>
     * The name of the Kafka topic.
     * </p>
     * 
     * @return The name of the Kafka topic.
     */

    public java.util.List<String> getTopics() {
        if (topics == null) {
            topics = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return topics;
    }

    /**
     * <p>
     * The name of the Kafka topic.
     * </p>
     * 
     * @param topics
     *        The name of the Kafka topic.
     */

    public void setTopics(java.util.Collection<String> topics) {
        if (topics == null) {
            this.topics = null;
            return;
        }

        this.topics = new com.amazonaws.internal.SdkInternalList<String>(topics);
    }

    /**
     * <p>
     * The name of the Kafka topic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopics(java.util.Collection)} or {@link #withTopics(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param topics
     *        The name of the Kafka topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withTopics(String... topics) {
        if (this.topics == null) {
            setTopics(new com.amazonaws.internal.SdkInternalList<String>(topics.length));
        }
        for (String ele : topics) {
            this.topics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the Kafka topic.
     * </p>
     * 
     * @param topics
     *        The name of the Kafka topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withTopics(java.util.Collection<String> topics) {
        setTopics(topics);
        return this;
    }

    /**
     * <p>
     * (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     * </p>
     * 
     * @return (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     */

    public java.util.List<String> getQueues() {
        if (queues == null) {
            queues = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return queues;
    }

    /**
     * <p>
     * (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     * </p>
     * 
     * @param queues
     *        (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     */

    public void setQueues(java.util.Collection<String> queues) {
        if (queues == null) {
            this.queues = null;
            return;
        }

        this.queues = new com.amazonaws.internal.SdkInternalList<String>(queues);
    }

    /**
     * <p>
     * (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueues(java.util.Collection)} or {@link #withQueues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param queues
     *        (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withQueues(String... queues) {
        if (this.queues == null) {
            setQueues(new com.amazonaws.internal.SdkInternalList<String>(queues.length));
        }
        for (String ele : queues) {
            this.queues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     * </p>
     * 
     * @param queues
     *        (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withQueues(java.util.Collection<String> queues) {
        setQueues(queues);
        return this;
    }

    /**
     * <p>
     * An array of the authentication protocol, VPC components, or virtual host to secure and define your event source.
     * </p>
     * 
     * @return An array of the authentication protocol, VPC components, or virtual host to secure and define your event
     *         source.
     */

    public java.util.List<SourceAccessConfiguration> getSourceAccessConfigurations() {
        if (sourceAccessConfigurations == null) {
            sourceAccessConfigurations = new com.amazonaws.internal.SdkInternalList<SourceAccessConfiguration>();
        }
        return sourceAccessConfigurations;
    }

    /**
     * <p>
     * An array of the authentication protocol, VPC components, or virtual host to secure and define your event source.
     * </p>
     * 
     * @param sourceAccessConfigurations
     *        An array of the authentication protocol, VPC components, or virtual host to secure and define your event
     *        source.
     */

    public void setSourceAccessConfigurations(java.util.Collection<SourceAccessConfiguration> sourceAccessConfigurations) {
        if (sourceAccessConfigurations == null) {
            this.sourceAccessConfigurations = null;
            return;
        }

        this.sourceAccessConfigurations = new com.amazonaws.internal.SdkInternalList<SourceAccessConfiguration>(sourceAccessConfigurations);
    }

    /**
     * <p>
     * An array of the authentication protocol, VPC components, or virtual host to secure and define your event source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceAccessConfigurations(java.util.Collection)} or
     * {@link #withSourceAccessConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param sourceAccessConfigurations
     *        An array of the authentication protocol, VPC components, or virtual host to secure and define your event
     *        source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withSourceAccessConfigurations(SourceAccessConfiguration... sourceAccessConfigurations) {
        if (this.sourceAccessConfigurations == null) {
            setSourceAccessConfigurations(new com.amazonaws.internal.SdkInternalList<SourceAccessConfiguration>(sourceAccessConfigurations.length));
        }
        for (SourceAccessConfiguration ele : sourceAccessConfigurations) {
            this.sourceAccessConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the authentication protocol, VPC components, or virtual host to secure and define your event source.
     * </p>
     * 
     * @param sourceAccessConfigurations
     *        An array of the authentication protocol, VPC components, or virtual host to secure and define your event
     *        source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withSourceAccessConfigurations(java.util.Collection<SourceAccessConfiguration> sourceAccessConfigurations) {
        setSourceAccessConfigurations(sourceAccessConfigurations);
        return this;
    }

    /**
     * <p>
     * The self-managed Apache Kafka cluster for your event source.
     * </p>
     * 
     * @param selfManagedEventSource
     *        The self-managed Apache Kafka cluster for your event source.
     */

    public void setSelfManagedEventSource(SelfManagedEventSource selfManagedEventSource) {
        this.selfManagedEventSource = selfManagedEventSource;
    }

    /**
     * <p>
     * The self-managed Apache Kafka cluster for your event source.
     * </p>
     * 
     * @return The self-managed Apache Kafka cluster for your event source.
     */

    public SelfManagedEventSource getSelfManagedEventSource() {
        return this.selfManagedEventSource;
    }

    /**
     * <p>
     * The self-managed Apache Kafka cluster for your event source.
     * </p>
     * 
     * @param selfManagedEventSource
     *        The self-managed Apache Kafka cluster for your event source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withSelfManagedEventSource(SelfManagedEventSource selfManagedEventSource) {
        setSelfManagedEventSource(selfManagedEventSource);
        return this;
    }

    /**
     * <p>
     * (Streams only) Discard records older than the specified age. The default value is -1, which sets the maximum age
     * to infinite. When the value is set to infinite, Lambda never discards old records.
     * </p>
     * 
     * @param maximumRecordAgeInSeconds
     *        (Streams only) Discard records older than the specified age. The default value is -1, which sets the
     *        maximum age to infinite. When the value is set to infinite, Lambda never discards old records.
     */

    public void setMaximumRecordAgeInSeconds(Integer maximumRecordAgeInSeconds) {
        this.maximumRecordAgeInSeconds = maximumRecordAgeInSeconds;
    }

    /**
     * <p>
     * (Streams only) Discard records older than the specified age. The default value is -1, which sets the maximum age
     * to infinite. When the value is set to infinite, Lambda never discards old records.
     * </p>
     * 
     * @return (Streams only) Discard records older than the specified age. The default value is -1, which sets the
     *         maximum age to infinite. When the value is set to infinite, Lambda never discards old records.
     */

    public Integer getMaximumRecordAgeInSeconds() {
        return this.maximumRecordAgeInSeconds;
    }

    /**
     * <p>
     * (Streams only) Discard records older than the specified age. The default value is -1, which sets the maximum age
     * to infinite. When the value is set to infinite, Lambda never discards old records.
     * </p>
     * 
     * @param maximumRecordAgeInSeconds
     *        (Streams only) Discard records older than the specified age. The default value is -1, which sets the
     *        maximum age to infinite. When the value is set to infinite, Lambda never discards old records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withMaximumRecordAgeInSeconds(Integer maximumRecordAgeInSeconds) {
        setMaximumRecordAgeInSeconds(maximumRecordAgeInSeconds);
        return this;
    }

    /**
     * <p>
     * (Streams only) If the function returns an error, split the batch in two and retry. The default value is false.
     * </p>
     * 
     * @param bisectBatchOnFunctionError
     *        (Streams only) If the function returns an error, split the batch in two and retry. The default value is
     *        false.
     */

    public void setBisectBatchOnFunctionError(Boolean bisectBatchOnFunctionError) {
        this.bisectBatchOnFunctionError = bisectBatchOnFunctionError;
    }

    /**
     * <p>
     * (Streams only) If the function returns an error, split the batch in two and retry. The default value is false.
     * </p>
     * 
     * @return (Streams only) If the function returns an error, split the batch in two and retry. The default value is
     *         false.
     */

    public Boolean getBisectBatchOnFunctionError() {
        return this.bisectBatchOnFunctionError;
    }

    /**
     * <p>
     * (Streams only) If the function returns an error, split the batch in two and retry. The default value is false.
     * </p>
     * 
     * @param bisectBatchOnFunctionError
     *        (Streams only) If the function returns an error, split the batch in two and retry. The default value is
     *        false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withBisectBatchOnFunctionError(Boolean bisectBatchOnFunctionError) {
        setBisectBatchOnFunctionError(bisectBatchOnFunctionError);
        return this;
    }

    /**
     * <p>
     * (Streams only) If the function returns an error, split the batch in two and retry. The default value is false.
     * </p>
     * 
     * @return (Streams only) If the function returns an error, split the batch in two and retry. The default value is
     *         false.
     */

    public Boolean isBisectBatchOnFunctionError() {
        return this.bisectBatchOnFunctionError;
    }

    /**
     * <p>
     * (Streams only) Discard records after the specified number of retries. The default value is -1, which sets the
     * maximum number of retries to infinite. When MaximumRetryAttempts is infinite, Lambda retries failed records until
     * the record expires in the event source.
     * </p>
     * 
     * @param maximumRetryAttempts
     *        (Streams only) Discard records after the specified number of retries. The default value is -1, which sets
     *        the maximum number of retries to infinite. When MaximumRetryAttempts is infinite, Lambda retries failed
     *        records until the record expires in the event source.
     */

    public void setMaximumRetryAttempts(Integer maximumRetryAttempts) {
        this.maximumRetryAttempts = maximumRetryAttempts;
    }

    /**
     * <p>
     * (Streams only) Discard records after the specified number of retries. The default value is -1, which sets the
     * maximum number of retries to infinite. When MaximumRetryAttempts is infinite, Lambda retries failed records until
     * the record expires in the event source.
     * </p>
     * 
     * @return (Streams only) Discard records after the specified number of retries. The default value is -1, which sets
     *         the maximum number of retries to infinite. When MaximumRetryAttempts is infinite, Lambda retries failed
     *         records until the record expires in the event source.
     */

    public Integer getMaximumRetryAttempts() {
        return this.maximumRetryAttempts;
    }

    /**
     * <p>
     * (Streams only) Discard records after the specified number of retries. The default value is -1, which sets the
     * maximum number of retries to infinite. When MaximumRetryAttempts is infinite, Lambda retries failed records until
     * the record expires in the event source.
     * </p>
     * 
     * @param maximumRetryAttempts
     *        (Streams only) Discard records after the specified number of retries. The default value is -1, which sets
     *        the maximum number of retries to infinite. When MaximumRetryAttempts is infinite, Lambda retries failed
     *        records until the record expires in the event source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withMaximumRetryAttempts(Integer maximumRetryAttempts) {
        setMaximumRetryAttempts(maximumRetryAttempts);
        return this;
    }

    /**
     * <p>
     * (Streams only) The duration in seconds of a processing window. The range is 1–900 seconds.
     * </p>
     * 
     * @param tumblingWindowInSeconds
     *        (Streams only) The duration in seconds of a processing window. The range is 1–900 seconds.
     */

    public void setTumblingWindowInSeconds(Integer tumblingWindowInSeconds) {
        this.tumblingWindowInSeconds = tumblingWindowInSeconds;
    }

    /**
     * <p>
     * (Streams only) The duration in seconds of a processing window. The range is 1–900 seconds.
     * </p>
     * 
     * @return (Streams only) The duration in seconds of a processing window. The range is 1–900 seconds.
     */

    public Integer getTumblingWindowInSeconds() {
        return this.tumblingWindowInSeconds;
    }

    /**
     * <p>
     * (Streams only) The duration in seconds of a processing window. The range is 1–900 seconds.
     * </p>
     * 
     * @param tumblingWindowInSeconds
     *        (Streams only) The duration in seconds of a processing window. The range is 1–900 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withTumblingWindowInSeconds(Integer tumblingWindowInSeconds) {
        setTumblingWindowInSeconds(tumblingWindowInSeconds);
        return this;
    }

    /**
     * <p>
     * (Streams only) A list of current response type enums applied to the event source mapping.
     * </p>
     * 
     * @return (Streams only) A list of current response type enums applied to the event source mapping.
     * @see FunctionResponseType
     */

    public java.util.List<String> getFunctionResponseTypes() {
        if (functionResponseTypes == null) {
            functionResponseTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return functionResponseTypes;
    }

    /**
     * <p>
     * (Streams only) A list of current response type enums applied to the event source mapping.
     * </p>
     * 
     * @param functionResponseTypes
     *        (Streams only) A list of current response type enums applied to the event source mapping.
     * @see FunctionResponseType
     */

    public void setFunctionResponseTypes(java.util.Collection<String> functionResponseTypes) {
        if (functionResponseTypes == null) {
            this.functionResponseTypes = null;
            return;
        }

        this.functionResponseTypes = new com.amazonaws.internal.SdkInternalList<String>(functionResponseTypes);
    }

    /**
     * <p>
     * (Streams only) A list of current response type enums applied to the event source mapping.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFunctionResponseTypes(java.util.Collection)} or
     * {@link #withFunctionResponseTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param functionResponseTypes
     *        (Streams only) A list of current response type enums applied to the event source mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunctionResponseType
     */

    public CreateEventSourceMappingResult withFunctionResponseTypes(String... functionResponseTypes) {
        if (this.functionResponseTypes == null) {
            setFunctionResponseTypes(new com.amazonaws.internal.SdkInternalList<String>(functionResponseTypes.length));
        }
        for (String ele : functionResponseTypes) {
            this.functionResponseTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Streams only) A list of current response type enums applied to the event source mapping.
     * </p>
     * 
     * @param functionResponseTypes
     *        (Streams only) A list of current response type enums applied to the event source mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunctionResponseType
     */

    public CreateEventSourceMappingResult withFunctionResponseTypes(java.util.Collection<String> functionResponseTypes) {
        setFunctionResponseTypes(functionResponseTypes);
        return this;
    }

    /**
     * <p>
     * (Streams only) A list of current response type enums applied to the event source mapping.
     * </p>
     * 
     * @param functionResponseTypes
     *        (Streams only) A list of current response type enums applied to the event source mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunctionResponseType
     */

    public CreateEventSourceMappingResult withFunctionResponseTypes(FunctionResponseType... functionResponseTypes) {
        com.amazonaws.internal.SdkInternalList<String> functionResponseTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                functionResponseTypes.length);
        for (FunctionResponseType value : functionResponseTypes) {
            functionResponseTypesCopy.add(value.toString());
        }
        if (getFunctionResponseTypes() == null) {
            setFunctionResponseTypes(functionResponseTypesCopy);
        } else {
            getFunctionResponseTypes().addAll(functionResponseTypesCopy);
        }
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
        if (getUUID() != null)
            sb.append("UUID: ").append(getUUID()).append(",");
        if (getStartingPosition() != null)
            sb.append("StartingPosition: ").append(getStartingPosition()).append(",");
        if (getStartingPositionTimestamp() != null)
            sb.append("StartingPositionTimestamp: ").append(getStartingPositionTimestamp()).append(",");
        if (getBatchSize() != null)
            sb.append("BatchSize: ").append(getBatchSize()).append(",");
        if (getMaximumBatchingWindowInSeconds() != null)
            sb.append("MaximumBatchingWindowInSeconds: ").append(getMaximumBatchingWindowInSeconds()).append(",");
        if (getParallelizationFactor() != null)
            sb.append("ParallelizationFactor: ").append(getParallelizationFactor()).append(",");
        if (getEventSourceArn() != null)
            sb.append("EventSourceArn: ").append(getEventSourceArn()).append(",");
        if (getFunctionArn() != null)
            sb.append("FunctionArn: ").append(getFunctionArn()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getLastProcessingResult() != null)
            sb.append("LastProcessingResult: ").append(getLastProcessingResult()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateTransitionReason() != null)
            sb.append("StateTransitionReason: ").append(getStateTransitionReason()).append(",");
        if (getDestinationConfig() != null)
            sb.append("DestinationConfig: ").append(getDestinationConfig()).append(",");
        if (getTopics() != null)
            sb.append("Topics: ").append(getTopics()).append(",");
        if (getQueues() != null)
            sb.append("Queues: ").append(getQueues()).append(",");
        if (getSourceAccessConfigurations() != null)
            sb.append("SourceAccessConfigurations: ").append(getSourceAccessConfigurations()).append(",");
        if (getSelfManagedEventSource() != null)
            sb.append("SelfManagedEventSource: ").append(getSelfManagedEventSource()).append(",");
        if (getMaximumRecordAgeInSeconds() != null)
            sb.append("MaximumRecordAgeInSeconds: ").append(getMaximumRecordAgeInSeconds()).append(",");
        if (getBisectBatchOnFunctionError() != null)
            sb.append("BisectBatchOnFunctionError: ").append(getBisectBatchOnFunctionError()).append(",");
        if (getMaximumRetryAttempts() != null)
            sb.append("MaximumRetryAttempts: ").append(getMaximumRetryAttempts()).append(",");
        if (getTumblingWindowInSeconds() != null)
            sb.append("TumblingWindowInSeconds: ").append(getTumblingWindowInSeconds()).append(",");
        if (getFunctionResponseTypes() != null)
            sb.append("FunctionResponseTypes: ").append(getFunctionResponseTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEventSourceMappingResult == false)
            return false;
        CreateEventSourceMappingResult other = (CreateEventSourceMappingResult) obj;
        if (other.getUUID() == null ^ this.getUUID() == null)
            return false;
        if (other.getUUID() != null && other.getUUID().equals(this.getUUID()) == false)
            return false;
        if (other.getStartingPosition() == null ^ this.getStartingPosition() == null)
            return false;
        if (other.getStartingPosition() != null && other.getStartingPosition().equals(this.getStartingPosition()) == false)
            return false;
        if (other.getStartingPositionTimestamp() == null ^ this.getStartingPositionTimestamp() == null)
            return false;
        if (other.getStartingPositionTimestamp() != null && other.getStartingPositionTimestamp().equals(this.getStartingPositionTimestamp()) == false)
            return false;
        if (other.getBatchSize() == null ^ this.getBatchSize() == null)
            return false;
        if (other.getBatchSize() != null && other.getBatchSize().equals(this.getBatchSize()) == false)
            return false;
        if (other.getMaximumBatchingWindowInSeconds() == null ^ this.getMaximumBatchingWindowInSeconds() == null)
            return false;
        if (other.getMaximumBatchingWindowInSeconds() != null
                && other.getMaximumBatchingWindowInSeconds().equals(this.getMaximumBatchingWindowInSeconds()) == false)
            return false;
        if (other.getParallelizationFactor() == null ^ this.getParallelizationFactor() == null)
            return false;
        if (other.getParallelizationFactor() != null && other.getParallelizationFactor().equals(this.getParallelizationFactor()) == false)
            return false;
        if (other.getEventSourceArn() == null ^ this.getEventSourceArn() == null)
            return false;
        if (other.getEventSourceArn() != null && other.getEventSourceArn().equals(this.getEventSourceArn()) == false)
            return false;
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null && other.getFunctionArn().equals(this.getFunctionArn()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getLastProcessingResult() == null ^ this.getLastProcessingResult() == null)
            return false;
        if (other.getLastProcessingResult() != null && other.getLastProcessingResult().equals(this.getLastProcessingResult()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateTransitionReason() == null ^ this.getStateTransitionReason() == null)
            return false;
        if (other.getStateTransitionReason() != null && other.getStateTransitionReason().equals(this.getStateTransitionReason()) == false)
            return false;
        if (other.getDestinationConfig() == null ^ this.getDestinationConfig() == null)
            return false;
        if (other.getDestinationConfig() != null && other.getDestinationConfig().equals(this.getDestinationConfig()) == false)
            return false;
        if (other.getTopics() == null ^ this.getTopics() == null)
            return false;
        if (other.getTopics() != null && other.getTopics().equals(this.getTopics()) == false)
            return false;
        if (other.getQueues() == null ^ this.getQueues() == null)
            return false;
        if (other.getQueues() != null && other.getQueues().equals(this.getQueues()) == false)
            return false;
        if (other.getSourceAccessConfigurations() == null ^ this.getSourceAccessConfigurations() == null)
            return false;
        if (other.getSourceAccessConfigurations() != null && other.getSourceAccessConfigurations().equals(this.getSourceAccessConfigurations()) == false)
            return false;
        if (other.getSelfManagedEventSource() == null ^ this.getSelfManagedEventSource() == null)
            return false;
        if (other.getSelfManagedEventSource() != null && other.getSelfManagedEventSource().equals(this.getSelfManagedEventSource()) == false)
            return false;
        if (other.getMaximumRecordAgeInSeconds() == null ^ this.getMaximumRecordAgeInSeconds() == null)
            return false;
        if (other.getMaximumRecordAgeInSeconds() != null && other.getMaximumRecordAgeInSeconds().equals(this.getMaximumRecordAgeInSeconds()) == false)
            return false;
        if (other.getBisectBatchOnFunctionError() == null ^ this.getBisectBatchOnFunctionError() == null)
            return false;
        if (other.getBisectBatchOnFunctionError() != null && other.getBisectBatchOnFunctionError().equals(this.getBisectBatchOnFunctionError()) == false)
            return false;
        if (other.getMaximumRetryAttempts() == null ^ this.getMaximumRetryAttempts() == null)
            return false;
        if (other.getMaximumRetryAttempts() != null && other.getMaximumRetryAttempts().equals(this.getMaximumRetryAttempts()) == false)
            return false;
        if (other.getTumblingWindowInSeconds() == null ^ this.getTumblingWindowInSeconds() == null)
            return false;
        if (other.getTumblingWindowInSeconds() != null && other.getTumblingWindowInSeconds().equals(this.getTumblingWindowInSeconds()) == false)
            return false;
        if (other.getFunctionResponseTypes() == null ^ this.getFunctionResponseTypes() == null)
            return false;
        if (other.getFunctionResponseTypes() != null && other.getFunctionResponseTypes().equals(this.getFunctionResponseTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUUID() == null) ? 0 : getUUID().hashCode());
        hashCode = prime * hashCode + ((getStartingPosition() == null) ? 0 : getStartingPosition().hashCode());
        hashCode = prime * hashCode + ((getStartingPositionTimestamp() == null) ? 0 : getStartingPositionTimestamp().hashCode());
        hashCode = prime * hashCode + ((getBatchSize() == null) ? 0 : getBatchSize().hashCode());
        hashCode = prime * hashCode + ((getMaximumBatchingWindowInSeconds() == null) ? 0 : getMaximumBatchingWindowInSeconds().hashCode());
        hashCode = prime * hashCode + ((getParallelizationFactor() == null) ? 0 : getParallelizationFactor().hashCode());
        hashCode = prime * hashCode + ((getEventSourceArn() == null) ? 0 : getEventSourceArn().hashCode());
        hashCode = prime * hashCode + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getLastProcessingResult() == null) ? 0 : getLastProcessingResult().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateTransitionReason() == null) ? 0 : getStateTransitionReason().hashCode());
        hashCode = prime * hashCode + ((getDestinationConfig() == null) ? 0 : getDestinationConfig().hashCode());
        hashCode = prime * hashCode + ((getTopics() == null) ? 0 : getTopics().hashCode());
        hashCode = prime * hashCode + ((getQueues() == null) ? 0 : getQueues().hashCode());
        hashCode = prime * hashCode + ((getSourceAccessConfigurations() == null) ? 0 : getSourceAccessConfigurations().hashCode());
        hashCode = prime * hashCode + ((getSelfManagedEventSource() == null) ? 0 : getSelfManagedEventSource().hashCode());
        hashCode = prime * hashCode + ((getMaximumRecordAgeInSeconds() == null) ? 0 : getMaximumRecordAgeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getBisectBatchOnFunctionError() == null) ? 0 : getBisectBatchOnFunctionError().hashCode());
        hashCode = prime * hashCode + ((getMaximumRetryAttempts() == null) ? 0 : getMaximumRetryAttempts().hashCode());
        hashCode = prime * hashCode + ((getTumblingWindowInSeconds() == null) ? 0 : getTumblingWindowInSeconds().hashCode());
        hashCode = prime * hashCode + ((getFunctionResponseTypes() == null) ? 0 : getFunctionResponseTypes().hashCode());
        return hashCode;
    }

    @Override
    public CreateEventSourceMappingResult clone() {
        try {
            return (CreateEventSourceMappingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

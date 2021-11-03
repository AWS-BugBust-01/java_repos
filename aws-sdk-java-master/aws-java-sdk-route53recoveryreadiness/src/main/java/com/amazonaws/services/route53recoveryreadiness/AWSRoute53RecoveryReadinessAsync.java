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
package com.amazonaws.services.route53recoveryreadiness;

import javax.annotation.Generated;

import com.amazonaws.services.route53recoveryreadiness.model.*;

/**
 * Interface for accessing AWS Route53 Recovery Readiness asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.route53recoveryreadiness.AbstractAWSRoute53RecoveryReadinessAsync} instead.
 * </p>
 * <p>
 * AWS Route53 Recovery Readiness
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRoute53RecoveryReadinessAsync extends AWSRoute53RecoveryReadiness {

    /**
     * Creates a new Cell.
     * 
     * @param createCellRequest
     *        The Cell to create
     * @return A Java Future containing the result of the CreateCell operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.CreateCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateCell"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCellResult> createCellAsync(CreateCellRequest createCellRequest);

    /**
     * Creates a new Cell.
     * 
     * @param createCellRequest
     *        The Cell to create
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCell operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.CreateCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateCell"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCellResult> createCellAsync(CreateCellRequest createCellRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCellRequest, CreateCellResult> asyncHandler);

    /**
     * Create a new cross account readiness authorization.
     * 
     * @param createCrossAccountAuthorizationRequest
     *        The cross account authorization
     * @return A Java Future containing the result of the CreateCrossAccountAuthorization operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsync.CreateCrossAccountAuthorization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateCrossAccountAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCrossAccountAuthorizationResult> createCrossAccountAuthorizationAsync(
            CreateCrossAccountAuthorizationRequest createCrossAccountAuthorizationRequest);

    /**
     * Create a new cross account readiness authorization.
     * 
     * @param createCrossAccountAuthorizationRequest
     *        The cross account authorization
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCrossAccountAuthorization operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.CreateCrossAccountAuthorization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateCrossAccountAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCrossAccountAuthorizationResult> createCrossAccountAuthorizationAsync(
            CreateCrossAccountAuthorizationRequest createCrossAccountAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCrossAccountAuthorizationRequest, CreateCrossAccountAuthorizationResult> asyncHandler);

    /**
     * Creates a new Readiness Check.
     * 
     * @param createReadinessCheckRequest
     *        The ReadinessCheck to create
     * @return A Java Future containing the result of the CreateReadinessCheck operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.CreateReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateReadinessCheckResult> createReadinessCheckAsync(CreateReadinessCheckRequest createReadinessCheckRequest);

    /**
     * Creates a new Readiness Check.
     * 
     * @param createReadinessCheckRequest
     *        The ReadinessCheck to create
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReadinessCheck operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.CreateReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateReadinessCheckResult> createReadinessCheckAsync(CreateReadinessCheckRequest createReadinessCheckRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReadinessCheckRequest, CreateReadinessCheckResult> asyncHandler);

    /**
     * Creates a new Recovery Group.
     * 
     * @param createRecoveryGroupRequest
     *        The RecoveryGroup to create
     * @return A Java Future containing the result of the CreateRecoveryGroup operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.CreateRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRecoveryGroupResult> createRecoveryGroupAsync(CreateRecoveryGroupRequest createRecoveryGroupRequest);

    /**
     * Creates a new Recovery Group.
     * 
     * @param createRecoveryGroupRequest
     *        The RecoveryGroup to create
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRecoveryGroup operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.CreateRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRecoveryGroupResult> createRecoveryGroupAsync(CreateRecoveryGroupRequest createRecoveryGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRecoveryGroupRequest, CreateRecoveryGroupResult> asyncHandler);

    /**
     * Creates a new Resource Set.
     * 
     * @param createResourceSetRequest
     *        The ResourceSet to create
     * @return A Java Future containing the result of the CreateResourceSet operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.CreateResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResourceSetResult> createResourceSetAsync(CreateResourceSetRequest createResourceSetRequest);

    /**
     * Creates a new Resource Set.
     * 
     * @param createResourceSetRequest
     *        The ResourceSet to create
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResourceSet operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.CreateResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResourceSetResult> createResourceSetAsync(CreateResourceSetRequest createResourceSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResourceSetRequest, CreateResourceSetResult> asyncHandler);

    /**
     * Deletes an existing Cell.
     * 
     * @param deleteCellRequest
     * @return A Java Future containing the result of the DeleteCell operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.DeleteCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteCell"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCellResult> deleteCellAsync(DeleteCellRequest deleteCellRequest);

    /**
     * Deletes an existing Cell.
     * 
     * @param deleteCellRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCell operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.DeleteCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteCell"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCellResult> deleteCellAsync(DeleteCellRequest deleteCellRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCellRequest, DeleteCellResult> asyncHandler);

    /**
     * Delete cross account readiness authorization
     * 
     * @param deleteCrossAccountAuthorizationRequest
     * @return A Java Future containing the result of the DeleteCrossAccountAuthorization operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsync.DeleteCrossAccountAuthorization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteCrossAccountAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCrossAccountAuthorizationResult> deleteCrossAccountAuthorizationAsync(
            DeleteCrossAccountAuthorizationRequest deleteCrossAccountAuthorizationRequest);

    /**
     * Delete cross account readiness authorization
     * 
     * @param deleteCrossAccountAuthorizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCrossAccountAuthorization operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.DeleteCrossAccountAuthorization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteCrossAccountAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCrossAccountAuthorizationResult> deleteCrossAccountAuthorizationAsync(
            DeleteCrossAccountAuthorizationRequest deleteCrossAccountAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCrossAccountAuthorizationRequest, DeleteCrossAccountAuthorizationResult> asyncHandler);

    /**
     * Deletes an existing Readiness Check.
     * 
     * @param deleteReadinessCheckRequest
     * @return A Java Future containing the result of the DeleteReadinessCheck operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.DeleteReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReadinessCheckResult> deleteReadinessCheckAsync(DeleteReadinessCheckRequest deleteReadinessCheckRequest);

    /**
     * Deletes an existing Readiness Check.
     * 
     * @param deleteReadinessCheckRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReadinessCheck operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.DeleteReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReadinessCheckResult> deleteReadinessCheckAsync(DeleteReadinessCheckRequest deleteReadinessCheckRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReadinessCheckRequest, DeleteReadinessCheckResult> asyncHandler);

    /**
     * Deletes an existing Recovery Group.
     * 
     * @param deleteRecoveryGroupRequest
     * @return A Java Future containing the result of the DeleteRecoveryGroup operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.DeleteRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecoveryGroupResult> deleteRecoveryGroupAsync(DeleteRecoveryGroupRequest deleteRecoveryGroupRequest);

    /**
     * Deletes an existing Recovery Group.
     * 
     * @param deleteRecoveryGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRecoveryGroup operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.DeleteRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecoveryGroupResult> deleteRecoveryGroupAsync(DeleteRecoveryGroupRequest deleteRecoveryGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRecoveryGroupRequest, DeleteRecoveryGroupResult> asyncHandler);

    /**
     * Deletes an existing Resource Set.
     * 
     * @param deleteResourceSetRequest
     * @return A Java Future containing the result of the DeleteResourceSet operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.DeleteResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceSetResult> deleteResourceSetAsync(DeleteResourceSetRequest deleteResourceSetRequest);

    /**
     * Deletes an existing Resource Set.
     * 
     * @param deleteResourceSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourceSet operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.DeleteResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceSetResult> deleteResourceSetAsync(DeleteResourceSetRequest deleteResourceSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourceSetRequest, DeleteResourceSetResult> asyncHandler);

    /**
     * Returns a collection of recommendations to improve resilliance and readiness check quality for a Recovery Group.
     * 
     * @param getArchitectureRecommendationsRequest
     * @return A Java Future containing the result of the GetArchitectureRecommendations operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsync.GetArchitectureRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetArchitectureRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetArchitectureRecommendationsResult> getArchitectureRecommendationsAsync(
            GetArchitectureRecommendationsRequest getArchitectureRecommendationsRequest);

    /**
     * Returns a collection of recommendations to improve resilliance and readiness check quality for a Recovery Group.
     * 
     * @param getArchitectureRecommendationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetArchitectureRecommendations operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.GetArchitectureRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetArchitectureRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetArchitectureRecommendationsResult> getArchitectureRecommendationsAsync(
            GetArchitectureRecommendationsRequest getArchitectureRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetArchitectureRecommendationsRequest, GetArchitectureRecommendationsResult> asyncHandler);

    /**
     * Returns information about a Cell.
     * 
     * @param getCellRequest
     * @return A Java Future containing the result of the GetCell operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.GetCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetCell"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCellResult> getCellAsync(GetCellRequest getCellRequest);

    /**
     * Returns information about a Cell.
     * 
     * @param getCellRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCell operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.GetCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetCell"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCellResult> getCellAsync(GetCellRequest getCellRequest,
            com.amazonaws.handlers.AsyncHandler<GetCellRequest, GetCellResult> asyncHandler);

    /**
     * Returns information about readiness of a Cell.
     * 
     * @param getCellReadinessSummaryRequest
     * @return A Java Future containing the result of the GetCellReadinessSummary operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.GetCellReadinessSummary
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetCellReadinessSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCellReadinessSummaryResult> getCellReadinessSummaryAsync(GetCellReadinessSummaryRequest getCellReadinessSummaryRequest);

    /**
     * Returns information about readiness of a Cell.
     * 
     * @param getCellReadinessSummaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCellReadinessSummary operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.GetCellReadinessSummary
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetCellReadinessSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCellReadinessSummaryResult> getCellReadinessSummaryAsync(GetCellReadinessSummaryRequest getCellReadinessSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetCellReadinessSummaryRequest, GetCellReadinessSummaryResult> asyncHandler);

    /**
     * Returns information about a ReadinessCheck.
     * 
     * @param getReadinessCheckRequest
     * @return A Java Future containing the result of the GetReadinessCheck operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.GetReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReadinessCheckResult> getReadinessCheckAsync(GetReadinessCheckRequest getReadinessCheckRequest);

    /**
     * Returns information about a ReadinessCheck.
     * 
     * @param getReadinessCheckRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReadinessCheck operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.GetReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReadinessCheckResult> getReadinessCheckAsync(GetReadinessCheckRequest getReadinessCheckRequest,
            com.amazonaws.handlers.AsyncHandler<GetReadinessCheckRequest, GetReadinessCheckResult> asyncHandler);

    /**
     * Returns detailed information about the status of an individual resource within a Readiness Check's Resource Set.
     * 
     * @param getReadinessCheckResourceStatusRequest
     * @return A Java Future containing the result of the GetReadinessCheckResourceStatus operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsync.GetReadinessCheckResourceStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheckResourceStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReadinessCheckResourceStatusResult> getReadinessCheckResourceStatusAsync(
            GetReadinessCheckResourceStatusRequest getReadinessCheckResourceStatusRequest);

    /**
     * Returns detailed information about the status of an individual resource within a Readiness Check's Resource Set.
     * 
     * @param getReadinessCheckResourceStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReadinessCheckResourceStatus operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.GetReadinessCheckResourceStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheckResourceStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReadinessCheckResourceStatusResult> getReadinessCheckResourceStatusAsync(
            GetReadinessCheckResourceStatusRequest getReadinessCheckResourceStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetReadinessCheckResourceStatusRequest, GetReadinessCheckResourceStatusResult> asyncHandler);

    /**
     * Returns information about the status of a Readiness Check.
     * 
     * @param getReadinessCheckStatusRequest
     * @return A Java Future containing the result of the GetReadinessCheckStatus operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.GetReadinessCheckStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheckStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReadinessCheckStatusResult> getReadinessCheckStatusAsync(GetReadinessCheckStatusRequest getReadinessCheckStatusRequest);

    /**
     * Returns information about the status of a Readiness Check.
     * 
     * @param getReadinessCheckStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReadinessCheckStatus operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.GetReadinessCheckStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheckStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReadinessCheckStatusResult> getReadinessCheckStatusAsync(GetReadinessCheckStatusRequest getReadinessCheckStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetReadinessCheckStatusRequest, GetReadinessCheckStatusResult> asyncHandler);

    /**
     * Returns information about a Recovery Group.
     * 
     * @param getRecoveryGroupRequest
     * @return A Java Future containing the result of the GetRecoveryGroup operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.GetRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecoveryGroupResult> getRecoveryGroupAsync(GetRecoveryGroupRequest getRecoveryGroupRequest);

    /**
     * Returns information about a Recovery Group.
     * 
     * @param getRecoveryGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRecoveryGroup operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.GetRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecoveryGroupResult> getRecoveryGroupAsync(GetRecoveryGroupRequest getRecoveryGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetRecoveryGroupRequest, GetRecoveryGroupResult> asyncHandler);

    /**
     * Returns information about a Recovery Group.
     * 
     * @param getRecoveryGroupReadinessSummaryRequest
     * @return A Java Future containing the result of the GetRecoveryGroupReadinessSummary operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsync.GetRecoveryGroupReadinessSummary
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetRecoveryGroupReadinessSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecoveryGroupReadinessSummaryResult> getRecoveryGroupReadinessSummaryAsync(
            GetRecoveryGroupReadinessSummaryRequest getRecoveryGroupReadinessSummaryRequest);

    /**
     * Returns information about a Recovery Group.
     * 
     * @param getRecoveryGroupReadinessSummaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRecoveryGroupReadinessSummary operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.GetRecoveryGroupReadinessSummary
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetRecoveryGroupReadinessSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecoveryGroupReadinessSummaryResult> getRecoveryGroupReadinessSummaryAsync(
            GetRecoveryGroupReadinessSummaryRequest getRecoveryGroupReadinessSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetRecoveryGroupReadinessSummaryRequest, GetRecoveryGroupReadinessSummaryResult> asyncHandler);

    /**
     * Returns information about a Resource Set.
     * 
     * @param getResourceSetRequest
     * @return A Java Future containing the result of the GetResourceSet operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.GetResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceSetResult> getResourceSetAsync(GetResourceSetRequest getResourceSetRequest);

    /**
     * Returns information about a Resource Set.
     * 
     * @param getResourceSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceSet operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.GetResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceSetResult> getResourceSetAsync(GetResourceSetRequest getResourceSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceSetRequest, GetResourceSetResult> asyncHandler);

    /**
     * Returns a collection of Cells.
     * 
     * @param listCellsRequest
     * @return A Java Future containing the result of the ListCells operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.ListCells
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListCells"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCellsResult> listCellsAsync(ListCellsRequest listCellsRequest);

    /**
     * Returns a collection of Cells.
     * 
     * @param listCellsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCells operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.ListCells
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListCells"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCellsResult> listCellsAsync(ListCellsRequest listCellsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCellsRequest, ListCellsResult> asyncHandler);

    /**
     * Returns a collection of cross account readiness authorizations.
     * 
     * @param listCrossAccountAuthorizationsRequest
     * @return A Java Future containing the result of the ListCrossAccountAuthorizations operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsync.ListCrossAccountAuthorizations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListCrossAccountAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCrossAccountAuthorizationsResult> listCrossAccountAuthorizationsAsync(
            ListCrossAccountAuthorizationsRequest listCrossAccountAuthorizationsRequest);

    /**
     * Returns a collection of cross account readiness authorizations.
     * 
     * @param listCrossAccountAuthorizationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCrossAccountAuthorizations operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.ListCrossAccountAuthorizations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListCrossAccountAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCrossAccountAuthorizationsResult> listCrossAccountAuthorizationsAsync(
            ListCrossAccountAuthorizationsRequest listCrossAccountAuthorizationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCrossAccountAuthorizationsRequest, ListCrossAccountAuthorizationsResult> asyncHandler);

    /**
     * Returns a collection of Readiness Checks.
     * 
     * @param listReadinessChecksRequest
     * @return A Java Future containing the result of the ListReadinessChecks operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.ListReadinessChecks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListReadinessChecks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReadinessChecksResult> listReadinessChecksAsync(ListReadinessChecksRequest listReadinessChecksRequest);

    /**
     * Returns a collection of Readiness Checks.
     * 
     * @param listReadinessChecksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReadinessChecks operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.ListReadinessChecks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListReadinessChecks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReadinessChecksResult> listReadinessChecksAsync(ListReadinessChecksRequest listReadinessChecksRequest,
            com.amazonaws.handlers.AsyncHandler<ListReadinessChecksRequest, ListReadinessChecksResult> asyncHandler);

    /**
     * Returns a collection of Recovery Groups.
     * 
     * @param listRecoveryGroupsRequest
     * @return A Java Future containing the result of the ListRecoveryGroups operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.ListRecoveryGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListRecoveryGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecoveryGroupsResult> listRecoveryGroupsAsync(ListRecoveryGroupsRequest listRecoveryGroupsRequest);

    /**
     * Returns a collection of Recovery Groups.
     * 
     * @param listRecoveryGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecoveryGroups operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.ListRecoveryGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListRecoveryGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecoveryGroupsResult> listRecoveryGroupsAsync(ListRecoveryGroupsRequest listRecoveryGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecoveryGroupsRequest, ListRecoveryGroupsResult> asyncHandler);

    /**
     * Returns a collection of Resource Sets.
     * 
     * @param listResourceSetsRequest
     * @return A Java Future containing the result of the ListResourceSets operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.ListResourceSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListResourceSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceSetsResult> listResourceSetsAsync(ListResourceSetsRequest listResourceSetsRequest);

    /**
     * Returns a collection of Resource Sets.
     * 
     * @param listResourceSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceSets operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.ListResourceSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListResourceSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceSetsResult> listResourceSetsAsync(ListResourceSetsRequest listResourceSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceSetsRequest, ListResourceSetsResult> asyncHandler);

    /**
     * Returns a collection of rules that are applied as part of Readiness Checks.
     * 
     * @param listRulesRequest
     * @return A Java Future containing the result of the ListRules operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest);

    /**
     * Returns a collection of rules that are applied as part of Readiness Checks.
     * 
     * @param listRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRules operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler);

    /**
     * Returns a list of the tags assigned to the specified resource.
     * 
     * @param listTagsForResourcesRequest
     * @return A Java Future containing the result of the ListTagsForResources operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.ListTagsForResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListTagsForResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourcesResult> listTagsForResourcesAsync(ListTagsForResourcesRequest listTagsForResourcesRequest);

    /**
     * Returns a list of the tags assigned to the specified resource.
     * 
     * @param listTagsForResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResources operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.ListTagsForResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListTagsForResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourcesResult> listTagsForResourcesAsync(ListTagsForResourcesRequest listTagsForResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourcesRequest, ListTagsForResourcesResult> asyncHandler);

    /**
     * Adds tags to the specified resource. You can specify one or more tags to add.
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * Adds tags to the specified resource. You can specify one or more tags to add.
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * Removes tags from the specified resource. You can specify one or more tags to remove.
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * Removes tags from the specified resource. You can specify one or more tags to remove.
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * Updates an existing Cell.
     * 
     * @param updateCellRequest
     *        Parameters to update for the Cell
     * @return A Java Future containing the result of the UpdateCell operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.UpdateCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateCell"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCellResult> updateCellAsync(UpdateCellRequest updateCellRequest);

    /**
     * Updates an existing Cell.
     * 
     * @param updateCellRequest
     *        Parameters to update for the Cell
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCell operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.UpdateCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateCell"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCellResult> updateCellAsync(UpdateCellRequest updateCellRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCellRequest, UpdateCellResult> asyncHandler);

    /**
     * Updates an exisiting Readiness Check.
     * 
     * @param updateReadinessCheckRequest
     *        The new Readiness Check values
     * @return A Java Future containing the result of the UpdateReadinessCheck operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.UpdateReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReadinessCheckResult> updateReadinessCheckAsync(UpdateReadinessCheckRequest updateReadinessCheckRequest);

    /**
     * Updates an exisiting Readiness Check.
     * 
     * @param updateReadinessCheckRequest
     *        The new Readiness Check values
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateReadinessCheck operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.UpdateReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReadinessCheckResult> updateReadinessCheckAsync(UpdateReadinessCheckRequest updateReadinessCheckRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateReadinessCheckRequest, UpdateReadinessCheckResult> asyncHandler);

    /**
     * Updates an existing Recovery Group.
     * 
     * @param updateRecoveryGroupRequest
     *        Parameters to update for the RecoveryGroup
     * @return A Java Future containing the result of the UpdateRecoveryGroup operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.UpdateRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRecoveryGroupResult> updateRecoveryGroupAsync(UpdateRecoveryGroupRequest updateRecoveryGroupRequest);

    /**
     * Updates an existing Recovery Group.
     * 
     * @param updateRecoveryGroupRequest
     *        Parameters to update for the RecoveryGroup
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRecoveryGroup operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.UpdateRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRecoveryGroupResult> updateRecoveryGroupAsync(UpdateRecoveryGroupRequest updateRecoveryGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRecoveryGroupRequest, UpdateRecoveryGroupResult> asyncHandler);

    /**
     * Updates an existing Resource Set.
     * 
     * @param updateResourceSetRequest
     *        configuration for the desired
     * @return A Java Future containing the result of the UpdateResourceSet operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.UpdateResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceSetResult> updateResourceSetAsync(UpdateResourceSetRequest updateResourceSetRequest);

    /**
     * Updates an existing Resource Set.
     * 
     * @param updateResourceSetRequest
     *        configuration for the desired
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResourceSet operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.UpdateResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceSetResult> updateResourceSetAsync(UpdateResourceSetRequest updateResourceSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceSetRequest, UpdateResourceSetResult> asyncHandler);

}

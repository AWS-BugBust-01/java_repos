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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.route53recoveryreadiness.model.*;

/**
 * Interface for accessing AWS Route53 Recovery Readiness.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.route53recoveryreadiness.AbstractAWSRoute53RecoveryReadiness} instead.
 * </p>
 * <p>
 * AWS Route53 Recovery Readiness
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRoute53RecoveryReadiness {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "route53-recovery-readiness";

    /**
     * Creates a new Cell.
     * 
     * @param createCellRequest
     *        The Cell to create
     * @return Result of the CreateCell operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.CreateCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateCell"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCellResult createCell(CreateCellRequest createCellRequest);

    /**
     * Create a new cross account readiness authorization.
     * 
     * @param createCrossAccountAuthorizationRequest
     *        The cross account authorization
     * @return Result of the CreateCrossAccountAuthorization operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.CreateCrossAccountAuthorization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateCrossAccountAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCrossAccountAuthorizationResult createCrossAccountAuthorization(CreateCrossAccountAuthorizationRequest createCrossAccountAuthorizationRequest);

    /**
     * Creates a new Readiness Check.
     * 
     * @param createReadinessCheckRequest
     *        The ReadinessCheck to create
     * @return Result of the CreateReadinessCheck operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.CreateReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    CreateReadinessCheckResult createReadinessCheck(CreateReadinessCheckRequest createReadinessCheckRequest);

    /**
     * Creates a new Recovery Group.
     * 
     * @param createRecoveryGroupRequest
     *        The RecoveryGroup to create
     * @return Result of the CreateRecoveryGroup operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.CreateRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRecoveryGroupResult createRecoveryGroup(CreateRecoveryGroupRequest createRecoveryGroupRequest);

    /**
     * Creates a new Resource Set.
     * 
     * @param createResourceSetRequest
     *        The ResourceSet to create
     * @return Result of the CreateResourceSet operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.CreateResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    CreateResourceSetResult createResourceSet(CreateResourceSetRequest createResourceSetRequest);

    /**
     * Deletes an existing Cell.
     * 
     * @param deleteCellRequest
     * @return Result of the DeleteCell operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.DeleteCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteCell"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCellResult deleteCell(DeleteCellRequest deleteCellRequest);

    /**
     * Delete cross account readiness authorization
     * 
     * @param deleteCrossAccountAuthorizationRequest
     * @return Result of the DeleteCrossAccountAuthorization operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.DeleteCrossAccountAuthorization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteCrossAccountAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCrossAccountAuthorizationResult deleteCrossAccountAuthorization(DeleteCrossAccountAuthorizationRequest deleteCrossAccountAuthorizationRequest);

    /**
     * Deletes an existing Readiness Check.
     * 
     * @param deleteReadinessCheckRequest
     * @return Result of the DeleteReadinessCheck operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.DeleteReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteReadinessCheckResult deleteReadinessCheck(DeleteReadinessCheckRequest deleteReadinessCheckRequest);

    /**
     * Deletes an existing Recovery Group.
     * 
     * @param deleteRecoveryGroupRequest
     * @return Result of the DeleteRecoveryGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.DeleteRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRecoveryGroupResult deleteRecoveryGroup(DeleteRecoveryGroupRequest deleteRecoveryGroupRequest);

    /**
     * Deletes an existing Resource Set.
     * 
     * @param deleteResourceSetRequest
     * @return Result of the DeleteResourceSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.DeleteResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResourceSetResult deleteResourceSet(DeleteResourceSetRequest deleteResourceSetRequest);

    /**
     * Returns a collection of recommendations to improve resilliance and readiness check quality for a Recovery Group.
     * 
     * @param getArchitectureRecommendationsRequest
     * @return Result of the GetArchitectureRecommendations operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetArchitectureRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetArchitectureRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    GetArchitectureRecommendationsResult getArchitectureRecommendations(GetArchitectureRecommendationsRequest getArchitectureRecommendationsRequest);

    /**
     * Returns information about a Cell.
     * 
     * @param getCellRequest
     * @return Result of the GetCell operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetCell"
     *      target="_top">AWS API Documentation</a>
     */
    GetCellResult getCell(GetCellRequest getCellRequest);

    /**
     * Returns information about readiness of a Cell.
     * 
     * @param getCellReadinessSummaryRequest
     * @return Result of the GetCellReadinessSummary operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetCellReadinessSummary
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetCellReadinessSummary"
     *      target="_top">AWS API Documentation</a>
     */
    GetCellReadinessSummaryResult getCellReadinessSummary(GetCellReadinessSummaryRequest getCellReadinessSummaryRequest);

    /**
     * Returns information about a ReadinessCheck.
     * 
     * @param getReadinessCheckRequest
     * @return Result of the GetReadinessCheck operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    GetReadinessCheckResult getReadinessCheck(GetReadinessCheckRequest getReadinessCheckRequest);

    /**
     * Returns detailed information about the status of an individual resource within a Readiness Check's Resource Set.
     * 
     * @param getReadinessCheckResourceStatusRequest
     * @return Result of the GetReadinessCheckResourceStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetReadinessCheckResourceStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheckResourceStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetReadinessCheckResourceStatusResult getReadinessCheckResourceStatus(GetReadinessCheckResourceStatusRequest getReadinessCheckResourceStatusRequest);

    /**
     * Returns information about the status of a Readiness Check.
     * 
     * @param getReadinessCheckStatusRequest
     * @return Result of the GetReadinessCheckStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetReadinessCheckStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheckStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetReadinessCheckStatusResult getReadinessCheckStatus(GetReadinessCheckStatusRequest getReadinessCheckStatusRequest);

    /**
     * Returns information about a Recovery Group.
     * 
     * @param getRecoveryGroupRequest
     * @return Result of the GetRecoveryGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GetRecoveryGroupResult getRecoveryGroup(GetRecoveryGroupRequest getRecoveryGroupRequest);

    /**
     * Returns information about a Recovery Group.
     * 
     * @param getRecoveryGroupReadinessSummaryRequest
     * @return Result of the GetRecoveryGroupReadinessSummary operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetRecoveryGroupReadinessSummary
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetRecoveryGroupReadinessSummary"
     *      target="_top">AWS API Documentation</a>
     */
    GetRecoveryGroupReadinessSummaryResult getRecoveryGroupReadinessSummary(GetRecoveryGroupReadinessSummaryRequest getRecoveryGroupReadinessSummaryRequest);

    /**
     * Returns information about a Resource Set.
     * 
     * @param getResourceSetRequest
     * @return Result of the GetResourceSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourceSetResult getResourceSet(GetResourceSetRequest getResourceSetRequest);

    /**
     * Returns a collection of Cells.
     * 
     * @param listCellsRequest
     * @return Result of the ListCells operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.ListCells
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListCells"
     *      target="_top">AWS API Documentation</a>
     */
    ListCellsResult listCells(ListCellsRequest listCellsRequest);

    /**
     * Returns a collection of cross account readiness authorizations.
     * 
     * @param listCrossAccountAuthorizationsRequest
     * @return Result of the ListCrossAccountAuthorizations operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.ListCrossAccountAuthorizations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListCrossAccountAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    ListCrossAccountAuthorizationsResult listCrossAccountAuthorizations(ListCrossAccountAuthorizationsRequest listCrossAccountAuthorizationsRequest);

    /**
     * Returns a collection of Readiness Checks.
     * 
     * @param listReadinessChecksRequest
     * @return Result of the ListReadinessChecks operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.ListReadinessChecks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListReadinessChecks"
     *      target="_top">AWS API Documentation</a>
     */
    ListReadinessChecksResult listReadinessChecks(ListReadinessChecksRequest listReadinessChecksRequest);

    /**
     * Returns a collection of Recovery Groups.
     * 
     * @param listRecoveryGroupsRequest
     * @return Result of the ListRecoveryGroups operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.ListRecoveryGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListRecoveryGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListRecoveryGroupsResult listRecoveryGroups(ListRecoveryGroupsRequest listRecoveryGroupsRequest);

    /**
     * Returns a collection of Resource Sets.
     * 
     * @param listResourceSetsRequest
     * @return Result of the ListResourceSets operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.ListResourceSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListResourceSets"
     *      target="_top">AWS API Documentation</a>
     */
    ListResourceSetsResult listResourceSets(ListResourceSetsRequest listResourceSetsRequest);

    /**
     * Returns a collection of rules that are applied as part of Readiness Checks.
     * 
     * @param listRulesRequest
     * @return Result of the ListRules operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListRules"
     *      target="_top">AWS API Documentation</a>
     */
    ListRulesResult listRules(ListRulesRequest listRulesRequest);

    /**
     * Returns a list of the tags assigned to the specified resource.
     * 
     * @param listTagsForResourcesRequest
     * @return Result of the ListTagsForResources operation returned by the service.
     * @throws ResourceNotFoundException
     *         requested resource was not found
     * @throws ValidationException
     *         an invalid request
     * @throws InternalServerException
     *         Internal service error
     * @sample AWSRoute53RecoveryReadiness.ListTagsForResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListTagsForResources"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourcesResult listTagsForResources(ListTagsForResourcesRequest listTagsForResourcesRequest);

    /**
     * Adds tags to the specified resource. You can specify one or more tags to add.
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         requested resource was not found
     * @throws ValidationException
     *         an invalid request
     * @throws InternalServerException
     *         Internal service error
     * @sample AWSRoute53RecoveryReadiness.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * Removes tags from the specified resource. You can specify one or more tags to remove.
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         requested resource was not found
     * @throws ValidationException
     *         an invalid request
     * @throws InternalServerException
     *         Internal service error
     * @sample AWSRoute53RecoveryReadiness.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * Updates an existing Cell.
     * 
     * @param updateCellRequest
     *        Parameters to update for the Cell
     * @return Result of the UpdateCell operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.UpdateCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateCell"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCellResult updateCell(UpdateCellRequest updateCellRequest);

    /**
     * Updates an exisiting Readiness Check.
     * 
     * @param updateReadinessCheckRequest
     *        The new Readiness Check values
     * @return Result of the UpdateReadinessCheck operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.UpdateReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateReadinessCheckResult updateReadinessCheck(UpdateReadinessCheckRequest updateReadinessCheckRequest);

    /**
     * Updates an existing Recovery Group.
     * 
     * @param updateRecoveryGroupRequest
     *        Parameters to update for the RecoveryGroup
     * @return Result of the UpdateRecoveryGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.UpdateRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRecoveryGroupResult updateRecoveryGroup(UpdateRecoveryGroupRequest updateRecoveryGroupRequest);

    /**
     * Updates an existing Resource Set.
     * 
     * @param updateResourceSetRequest
     *        configuration for the desired
     * @return Result of the UpdateResourceSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         An unexpected error occurred.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.UpdateResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateResourceSetResult updateResourceSet(UpdateResourceSetRequest updateResourceSetRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}

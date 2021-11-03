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
package com.amazonaws.services.opensearch;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.opensearch.model.*;

/**
 * Interface for accessing Amazon OpenSearch Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.opensearch.AbstractAmazonOpenSearch} instead.
 * </p>
 * <p>
 * <fullname>Amazon OpenSearch Configuration Service</fullname>
 * <p>
 * Use the Amazon OpenSearch configuration API to create, configure, and manage Amazon OpenSearch Service domains.
 * </p>
 * <p>
 * For sample code that uses the configuration API, see the <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/opensearch-configuration-samples.html">
 * Amazon OpenSearch Service Developer Guide</a>. The guide also contains <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/request-signing.html"> sample code for
 * sending signed HTTP requests to the OpenSearch APIs</a>.
 * </p>
 * <p>
 * The endpoint for configuration service requests is region-specific: es.<i>region</i>.amazonaws.com. For example,
 * es.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#service-regions" target="_blank">Regions and
 * Endpoints</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonOpenSearch {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "es";

    /**
     * <p>
     * Allows the remote domain owner to accept an inbound cross-cluster connection request.
     * </p>
     * 
     * @param acceptInboundConnectionRequest
     *        Container for the parameters to the <code> <a>AcceptInboundConnection</a> </code> operation.
     * @return Result of the AcceptInboundConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AmazonOpenSearch.AcceptInboundConnection
     */
    AcceptInboundConnectionResult acceptInboundConnection(AcceptInboundConnectionRequest acceptInboundConnectionRequest);

    /**
     * <p>
     * Attaches tags to an existing domain. Tags are a set of case-sensitive key value pairs. An domain can have up to
     * 10 tags. See <a href=
     * "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains.html#managedomains-awsresorcetagging"
     * target="_blank"> Tagging Amazon OpenSearch Service domains</a> for more information.
     * </p>
     * 
     * @param addTagsRequest
     *        Container for the parameters to the <code> <a>AddTags</a> </code> operation. Specifies the tags to attach
     *        to the domain.
     * @return Result of the AddTags operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AmazonOpenSearch.AddTags
     */
    AddTagsResult addTags(AddTagsRequest addTagsRequest);

    /**
     * <p>
     * Associates a package with an Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param associatePackageRequest
     *        Container for the request parameters to the <code> <a>AssociatePackage</a> </code> operation.
     * @return Result of the AssociatePackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws ConflictException
     *         An error occurred because the client attempts to remove a resource that is currently in use. Returns HTTP
     *         status code 409.
     * @sample AmazonOpenSearch.AssociatePackage
     */
    AssociatePackageResult associatePackage(AssociatePackageRequest associatePackageRequest);

    /**
     * <p>
     * Cancels a scheduled service software update for an Amazon OpenSearch Service domain. You can only perform this
     * operation before the <code>AutomatedUpdateDate</code> and when the <code>UpdateStatus</code> is in the
     * <code>PENDING_UPDATE</code> state.
     * </p>
     * 
     * @param cancelServiceSoftwareUpdateRequest
     *        Container for the parameters to the <code> <a>CancelServiceSoftwareUpdate</a> </code> operation. Specifies
     *        the name of the domain that you wish to cancel a service software update on.
     * @return Result of the CancelServiceSoftwareUpdate operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.CancelServiceSoftwareUpdate
     */
    CancelServiceSoftwareUpdateResult cancelServiceSoftwareUpdate(CancelServiceSoftwareUpdateRequest cancelServiceSoftwareUpdateRequest);

    /**
     * <p>
     * Creates a new Amazon OpenSearch Service domain. For more information, see <a
     * href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html"
     * target="_blank">Creating and managing Amazon OpenSearch Service domains </a> in the <i>Amazon OpenSearch Service
     * Developer Guide</i>.
     * </p>
     * 
     * @param createDomainRequest
     * @return Result of the CreateDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws InvalidTypeException
     *         An exception for trying to create or access sub-resource that is either invalid or not supported. Gives
     *         http status code of 409.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.CreateDomain
     */
    CreateDomainResult createDomain(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Creates a new cross-cluster connection from a local OpenSearch domain to a remote OpenSearch domain.
     * </p>
     * 
     * @param createOutboundConnectionRequest
     *        Container for the parameters to the <code> <a>CreateOutboundConnection</a> </code> operation.
     * @return Result of the CreateOutboundConnection operation returned by the service.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AmazonOpenSearch.CreateOutboundConnection
     */
    CreateOutboundConnectionResult createOutboundConnection(CreateOutboundConnectionRequest createOutboundConnectionRequest);

    /**
     * <p>
     * Create a package for use with Amazon OpenSearch Service domains.
     * </p>
     * 
     * @param createPackageRequest
     *        Container for request parameters to the <code> <a>CreatePackage</a> </code> operation.
     * @return Result of the CreatePackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws InvalidTypeException
     *         An exception for trying to create or access sub-resource that is either invalid or not supported. Gives
     *         http status code of 409.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.CreatePackage
     */
    CreatePackageResult createPackage(CreatePackageRequest createPackageRequest);

    /**
     * <p>
     * Permanently deletes the specified domain and all of its data. Once a domain is deleted, it cannot be recovered.
     * </p>
     * 
     * @param deleteDomainRequest
     *        Container for the parameters to the <code> <a>DeleteDomain</a> </code> operation. Specifies the name of
     *        the domain you want to delete.
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.DeleteDomain
     */
    DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Allows the remote domain owner to delete an existing inbound cross-cluster connection.
     * </p>
     * 
     * @param deleteInboundConnectionRequest
     *        Container for the parameters to the <code> <a>DeleteInboundConnection</a> </code> operation.
     * @return Result of the DeleteInboundConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AmazonOpenSearch.DeleteInboundConnection
     */
    DeleteInboundConnectionResult deleteInboundConnection(DeleteInboundConnectionRequest deleteInboundConnectionRequest);

    /**
     * <p>
     * Allows the local domain owner to delete an existing outbound cross-cluster connection.
     * </p>
     * 
     * @param deleteOutboundConnectionRequest
     *        Container for the parameters to the <code> <a>DeleteOutboundConnection</a> </code> operation.
     * @return Result of the DeleteOutboundConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AmazonOpenSearch.DeleteOutboundConnection
     */
    DeleteOutboundConnectionResult deleteOutboundConnection(DeleteOutboundConnectionRequest deleteOutboundConnectionRequest);

    /**
     * <p>
     * Deletes the package.
     * </p>
     * 
     * @param deletePackageRequest
     *        Container for the request parameters to the <code> <a>DeletePackage</a> </code> operation.
     * @return Result of the DeletePackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws ConflictException
     *         An error occurred because the client attempts to remove a resource that is currently in use. Returns HTTP
     *         status code 409.
     * @sample AmazonOpenSearch.DeletePackage
     */
    DeletePackageResult deletePackage(DeletePackageRequest deletePackageRequest);

    /**
     * <p>
     * Returns domain configuration information about the specified domain, including the domain ID, domain endpoint,
     * and domain ARN.
     * </p>
     * 
     * @param describeDomainRequest
     *        Container for the parameters to the <code> <a>DescribeDomain</a> </code> operation.
     * @return Result of the DescribeDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.DescribeDomain
     */
    DescribeDomainResult describeDomain(DescribeDomainRequest describeDomainRequest);

    /**
     * <p>
     * Provides scheduled Auto-Tune action details for the domain, such as Auto-Tune action type, description, severity,
     * and scheduled date.
     * </p>
     * 
     * @param describeDomainAutoTunesRequest
     *        Container for the parameters to the <code>DescribeDomainAutoTunes</code> operation.
     * @return Result of the DescribeDomainAutoTunes operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.DescribeDomainAutoTunes
     */
    DescribeDomainAutoTunesResult describeDomainAutoTunes(DescribeDomainAutoTunesRequest describeDomainAutoTunesRequest);

    /**
     * <p>
     * Provides cluster configuration information about the specified domain, such as the state, creation date, update
     * version, and update date for cluster options.
     * </p>
     * 
     * @param describeDomainConfigRequest
     *        Container for the parameters to the <code>DescribeDomainConfig</code> operation. Specifies the domain name
     *        for which you want configuration information.
     * @return Result of the DescribeDomainConfig operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.DescribeDomainConfig
     */
    DescribeDomainConfigResult describeDomainConfig(DescribeDomainConfigRequest describeDomainConfigRequest);

    /**
     * <p>
     * Returns domain configuration information about the specified domains, including the domain ID, domain endpoint,
     * and domain ARN.
     * </p>
     * 
     * @param describeDomainsRequest
     *        Container for the parameters to the <code> <a>DescribeDomains</a> </code> operation. By default, the API
     *        returns the status of all domains.
     * @return Result of the DescribeDomains operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.DescribeDomains
     */
    DescribeDomainsResult describeDomains(DescribeDomainsRequest describeDomainsRequest);

    /**
     * <p>
     * Lists all the inbound cross-cluster connections for a remote domain.
     * </p>
     * 
     * @param describeInboundConnectionsRequest
     *        Container for the parameters to the <code> <a>DescribeInboundConnections</a> </code> operation.
     * @return Result of the DescribeInboundConnections operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         The request processing has failed because of invalid pagination token provided by customer. Returns an
     *         HTTP status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AmazonOpenSearch.DescribeInboundConnections
     */
    DescribeInboundConnectionsResult describeInboundConnections(DescribeInboundConnectionsRequest describeInboundConnectionsRequest);

    /**
     * <p>
     * Describe the limits for a given instance type and OpenSearch or Elasticsearch version. When modifying an existing
     * domain, specify the <code> <a>DomainName</a> </code> to see which limits you can modify.
     * </p>
     * 
     * @param describeInstanceTypeLimitsRequest
     *        Container for the parameters to the <code> <a>DescribeInstanceTypeLimits</a> </code> operation.
     * @return Result of the DescribeInstanceTypeLimits operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws InvalidTypeException
     *         An exception for trying to create or access sub-resource that is either invalid or not supported. Gives
     *         http status code of 409.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.DescribeInstanceTypeLimits
     */
    DescribeInstanceTypeLimitsResult describeInstanceTypeLimits(DescribeInstanceTypeLimitsRequest describeInstanceTypeLimitsRequest);

    /**
     * <p>
     * Lists all the outbound cross-cluster connections for a local domain.
     * </p>
     * 
     * @param describeOutboundConnectionsRequest
     *        Container for the parameters to the <code> <a>DescribeOutboundConnections</a> </code> operation.
     * @return Result of the DescribeOutboundConnections operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         The request processing has failed because of invalid pagination token provided by customer. Returns an
     *         HTTP status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AmazonOpenSearch.DescribeOutboundConnections
     */
    DescribeOutboundConnectionsResult describeOutboundConnections(DescribeOutboundConnectionsRequest describeOutboundConnectionsRequest);

    /**
     * <p>
     * Describes all packages available to Amazon OpenSearch Service domains. Includes options for filtering, limiting
     * the number of results, and pagination.
     * </p>
     * 
     * @param describePackagesRequest
     *        Container for the request parameters to the <code> <a>DescribePackage</a> </code> operation.
     * @return Result of the DescribePackages operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.DescribePackages
     */
    DescribePackagesResult describePackages(DescribePackagesRequest describePackagesRequest);

    /**
     * <p>
     * Lists available reserved OpenSearch instance offerings.
     * </p>
     * 
     * @param describeReservedInstanceOfferingsRequest
     *        Container for parameters to <code>DescribeReservedInstanceOfferings</code>
     * @return Result of the DescribeReservedInstanceOfferings operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AmazonOpenSearch.DescribeReservedInstanceOfferings
     */
    DescribeReservedInstanceOfferingsResult describeReservedInstanceOfferings(DescribeReservedInstanceOfferingsRequest describeReservedInstanceOfferingsRequest);

    /**
     * <p>
     * Returns information about reserved OpenSearch instances for this account.
     * </p>
     * 
     * @param describeReservedInstancesRequest
     *        Container for parameters to <code>DescribeReservedInstances</code>
     * @return Result of the DescribeReservedInstances operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AmazonOpenSearch.DescribeReservedInstances
     */
    DescribeReservedInstancesResult describeReservedInstances(DescribeReservedInstancesRequest describeReservedInstancesRequest);

    /**
     * <p>
     * Dissociates a package from the Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param dissociatePackageRequest
     *        Container for the request parameters to the <code> <a>DissociatePackage</a> </code> operation.
     * @return Result of the DissociatePackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws ConflictException
     *         An error occurred because the client attempts to remove a resource that is currently in use. Returns HTTP
     *         status code 409.
     * @sample AmazonOpenSearch.DissociatePackage
     */
    DissociatePackageResult dissociatePackage(DissociatePackageRequest dissociatePackageRequest);

    /**
     * <p>
     * Returns a list of upgrade-compatible versions of OpenSearch/Elasticsearch. You can optionally pass a
     * <code> <a>DomainName</a> </code> to get all upgrade-compatible versions of OpenSearch/Elasticsearch for that
     * specific domain.
     * </p>
     * 
     * @param getCompatibleVersionsRequest
     *        Container for the request parameters to <code> <a>GetCompatibleVersions</a> </code> operation.
     * @return Result of the GetCompatibleVersions operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AmazonOpenSearch.GetCompatibleVersions
     */
    GetCompatibleVersionsResult getCompatibleVersions(GetCompatibleVersionsRequest getCompatibleVersionsRequest);

    /**
     * <p>
     * Returns a list of package versions, along with their creation time and commit message.
     * </p>
     * 
     * @param getPackageVersionHistoryRequest
     *        Container for the request parameters to the <code> <a>GetPackageVersionHistory</a> </code> operation.
     * @return Result of the GetPackageVersionHistory operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.GetPackageVersionHistory
     */
    GetPackageVersionHistoryResult getPackageVersionHistory(GetPackageVersionHistoryRequest getPackageVersionHistoryRequest);

    /**
     * <p>
     * Retrieves the complete history of the last 10 upgrades performed on the domain.
     * </p>
     * 
     * @param getUpgradeHistoryRequest
     *        Container for the request parameters to the <code> <a>GetUpgradeHistory</a> </code> operation.
     * @return Result of the GetUpgradeHistory operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AmazonOpenSearch.GetUpgradeHistory
     */
    GetUpgradeHistoryResult getUpgradeHistory(GetUpgradeHistoryRequest getUpgradeHistoryRequest);

    /**
     * <p>
     * Retrieves the latest status of the last upgrade or upgrade eligibility check performed on the domain.
     * </p>
     * 
     * @param getUpgradeStatusRequest
     *        Container for the request parameters to the <code> <a>GetUpgradeStatus</a> </code> operation.
     * @return Result of the GetUpgradeStatus operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AmazonOpenSearch.GetUpgradeStatus
     */
    GetUpgradeStatusResult getUpgradeStatus(GetUpgradeStatusRequest getUpgradeStatusRequest);

    /**
     * <p>
     * Returns the names of all domains owned by the current user's account.
     * </p>
     * 
     * @param listDomainNamesRequest
     *        Container for the parameters to the <code><a>ListDomainNames</a></code> operation.
     * @return Result of the ListDomainNames operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.ListDomainNames
     */
    ListDomainNamesResult listDomainNames(ListDomainNamesRequest listDomainNamesRequest);

    /**
     * <p>
     * Lists all Amazon OpenSearch Service domains associated with the package.
     * </p>
     * 
     * @param listDomainsForPackageRequest
     *        Container for the request parameters to the <code> <a>ListDomainsForPackage</a> </code> operation.
     * @return Result of the ListDomainsForPackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.ListDomainsForPackage
     */
    ListDomainsForPackageResult listDomainsForPackage(ListDomainsForPackageRequest listDomainsForPackageRequest);

    /**
     * @param listInstanceTypeDetailsRequest
     * @return Result of the ListInstanceTypeDetails operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.ListInstanceTypeDetails
     */
    ListInstanceTypeDetailsResult listInstanceTypeDetails(ListInstanceTypeDetailsRequest listInstanceTypeDetailsRequest);

    /**
     * <p>
     * Lists all packages associated with the Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param listPackagesForDomainRequest
     *        Container for the request parameters to the <code> <a>ListPackagesForDomain</a> </code> operation.
     * @return Result of the ListPackagesForDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.ListPackagesForDomain
     */
    ListPackagesForDomainResult listPackagesForDomain(ListPackagesForDomainRequest listPackagesForDomainRequest);

    /**
     * <p>
     * Returns all tags for the given domain.
     * </p>
     * 
     * @param listTagsRequest
     *        Container for the parameters to the <code> <a>ListTags</a> </code> operation. Specify the <code>ARN</code>
     *        of the domain that the tags you want to view are attached to.
     * @return Result of the ListTags operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AmazonOpenSearch.ListTags
     */
    ListTagsResult listTags(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * List all supported versions of OpenSearch and Elasticsearch.
     * </p>
     * 
     * @param listVersionsRequest
     *        Container for the parameters to the <code> <a>ListVersions</a> </code> operation.
     *        <p>
     *        Use <code> <a>MaxResults</a> </code> to control the maximum number of results to retrieve in a single
     *        call.
     *        </p>
     *        <p>
     *        Use <code> <a>NextToken</a> </code> in response to retrieve more results. If the received response does
     *        not contain a NextToken, there are no more results to retrieve.
     *        </p>
     * @return Result of the ListVersions operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.ListVersions
     */
    ListVersionsResult listVersions(ListVersionsRequest listVersionsRequest);

    /**
     * <p>
     * Allows you to purchase reserved OpenSearch instances.
     * </p>
     * 
     * @param purchaseReservedInstanceOfferingRequest
     *        Container for parameters to <code>PurchaseReservedInstanceOffering</code>
     * @return Result of the PurchaseReservedInstanceOffering operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists. Gives http status code of 400.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AmazonOpenSearch.PurchaseReservedInstanceOffering
     */
    PurchaseReservedInstanceOfferingResult purchaseReservedInstanceOffering(PurchaseReservedInstanceOfferingRequest purchaseReservedInstanceOfferingRequest);

    /**
     * <p>
     * Allows the remote domain owner to reject an inbound cross-cluster connection request.
     * </p>
     * 
     * @param rejectInboundConnectionRequest
     *        Container for the parameters to the <code> <a>RejectInboundConnection</a> </code> operation.
     * @return Result of the RejectInboundConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @sample AmazonOpenSearch.RejectInboundConnection
     */
    RejectInboundConnectionResult rejectInboundConnection(RejectInboundConnectionRequest rejectInboundConnectionRequest);

    /**
     * <p>
     * Removes the specified set of tags from the given domain.
     * </p>
     * 
     * @param removeTagsRequest
     *        Container for the parameters to the <code> <a>RemoveTags</a> </code> operation. Specify the
     *        <code>ARN</code> for the domain from which you want to remove the specified <code>TagKey</code>.
     * @return Result of the RemoveTags operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AmazonOpenSearch.RemoveTags
     */
    RemoveTagsResult removeTags(RemoveTagsRequest removeTagsRequest);

    /**
     * <p>
     * Schedules a service software update for an Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param startServiceSoftwareUpdateRequest
     *        Container for the parameters to the <code> <a>StartServiceSoftwareUpdate</a> </code> operation. Specifies
     *        the name of the domain to schedule a service software update for.
     * @return Result of the StartServiceSoftwareUpdate operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.StartServiceSoftwareUpdate
     */
    StartServiceSoftwareUpdateResult startServiceSoftwareUpdate(StartServiceSoftwareUpdateRequest startServiceSoftwareUpdateRequest);

    /**
     * <p>
     * Modifies the cluster configuration of the specified domain, such as setting the instance type and the number of
     * instances.
     * </p>
     * 
     * @param updateDomainConfigRequest
     *        Container for the parameters to the <code> <a>UpdateDomain</a> </code> operation. Specifies the type and
     *        number of instances in the domain cluster.
     * @return Result of the UpdateDomainConfig operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws InvalidTypeException
     *         An exception for trying to create or access sub-resource that is either invalid or not supported. Gives
     *         http status code of 409.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.UpdateDomainConfig
     */
    UpdateDomainConfigResult updateDomainConfig(UpdateDomainConfigRequest updateDomainConfigRequest);

    /**
     * <p>
     * Updates a package for use with Amazon OpenSearch Service domains.
     * </p>
     * 
     * @param updatePackageRequest
     *        Container for request parameters to the <code> <a>UpdatePackage</a> </code> operation.
     * @return Result of the UpdatePackage operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @throws LimitExceededException
     *         An exception for trying to create more than allowed resources or sub-resources. Gives http status code of
     *         409.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws AccessDeniedException
     *         An error occurred because user does not have permissions to access the resource. Returns HTTP status code
     *         403.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @sample AmazonOpenSearch.UpdatePackage
     */
    UpdatePackageResult updatePackage(UpdatePackageRequest updatePackageRequest);

    /**
     * <p>
     * Allows you to either upgrade your domain or perform an upgrade eligibility check to a compatible version of
     * OpenSearch or Elasticsearch.
     * </p>
     * 
     * @param upgradeDomainRequest
     *        Container for the request parameters to <code> <a>UpgradeDomain</a> </code> operation.
     * @return Result of the UpgradeDomain operation returned by the service.
     * @throws BaseException
     *         An error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         An exception for accessing or deleting a resource that does not exist. Gives http status code of 400.
     * @throws ResourceAlreadyExistsException
     *         An exception for creating a resource that already exists. Gives http status code of 400.
     * @throws DisabledOperationException
     *         An error occured because the client wanted to access a not supported operation. Gives http status code of
     *         409.
     * @throws ValidationException
     *         An exception for missing / invalid input fields. Gives http status code of 400.
     * @throws InternalException
     *         The request processing has failed because of an unknown error, exception or failure (the failure is
     *         internal to the service) . Gives http status code of 500.
     * @sample AmazonOpenSearch.UpgradeDomain
     */
    UpgradeDomainResult upgradeDomain(UpgradeDomainRequest upgradeDomainRequest);

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

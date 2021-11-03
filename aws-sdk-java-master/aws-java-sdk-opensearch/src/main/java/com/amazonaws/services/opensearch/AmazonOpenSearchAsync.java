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

import com.amazonaws.services.opensearch.model.*;

/**
 * Interface for accessing Amazon OpenSearch Service asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.opensearch.AbstractAmazonOpenSearchAsync} instead.
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
public interface AmazonOpenSearchAsync extends AmazonOpenSearch {

    /**
     * <p>
     * Allows the remote domain owner to accept an inbound cross-cluster connection request.
     * </p>
     * 
     * @param acceptInboundConnectionRequest
     *        Container for the parameters to the <code> <a>AcceptInboundConnection</a> </code> operation.
     * @return A Java Future containing the result of the AcceptInboundConnection operation returned by the service.
     * @sample AmazonOpenSearchAsync.AcceptInboundConnection
     */
    java.util.concurrent.Future<AcceptInboundConnectionResult> acceptInboundConnectionAsync(AcceptInboundConnectionRequest acceptInboundConnectionRequest);

    /**
     * <p>
     * Allows the remote domain owner to accept an inbound cross-cluster connection request.
     * </p>
     * 
     * @param acceptInboundConnectionRequest
     *        Container for the parameters to the <code> <a>AcceptInboundConnection</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptInboundConnection operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.AcceptInboundConnection
     */
    java.util.concurrent.Future<AcceptInboundConnectionResult> acceptInboundConnectionAsync(AcceptInboundConnectionRequest acceptInboundConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptInboundConnectionRequest, AcceptInboundConnectionResult> asyncHandler);

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
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AmazonOpenSearchAsync.AddTags
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.AddTags
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler);

    /**
     * <p>
     * Associates a package with an Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param associatePackageRequest
     *        Container for the request parameters to the <code> <a>AssociatePackage</a> </code> operation.
     * @return A Java Future containing the result of the AssociatePackage operation returned by the service.
     * @sample AmazonOpenSearchAsync.AssociatePackage
     */
    java.util.concurrent.Future<AssociatePackageResult> associatePackageAsync(AssociatePackageRequest associatePackageRequest);

    /**
     * <p>
     * Associates a package with an Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param associatePackageRequest
     *        Container for the request parameters to the <code> <a>AssociatePackage</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociatePackage operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.AssociatePackage
     */
    java.util.concurrent.Future<AssociatePackageResult> associatePackageAsync(AssociatePackageRequest associatePackageRequest,
            com.amazonaws.handlers.AsyncHandler<AssociatePackageRequest, AssociatePackageResult> asyncHandler);

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
     * @return A Java Future containing the result of the CancelServiceSoftwareUpdate operation returned by the service.
     * @sample AmazonOpenSearchAsync.CancelServiceSoftwareUpdate
     */
    java.util.concurrent.Future<CancelServiceSoftwareUpdateResult> cancelServiceSoftwareUpdateAsync(
            CancelServiceSoftwareUpdateRequest cancelServiceSoftwareUpdateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelServiceSoftwareUpdate operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.CancelServiceSoftwareUpdate
     */
    java.util.concurrent.Future<CancelServiceSoftwareUpdateResult> cancelServiceSoftwareUpdateAsync(
            CancelServiceSoftwareUpdateRequest cancelServiceSoftwareUpdateRequest,
            com.amazonaws.handlers.AsyncHandler<CancelServiceSoftwareUpdateRequest, CancelServiceSoftwareUpdateResult> asyncHandler);

    /**
     * <p>
     * Creates a new Amazon OpenSearch Service domain. For more information, see <a
     * href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html"
     * target="_blank">Creating and managing Amazon OpenSearch Service domains </a> in the <i>Amazon OpenSearch Service
     * Developer Guide</i>.
     * </p>
     * 
     * @param createDomainRequest
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonOpenSearchAsync.CreateDomain
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Creates a new Amazon OpenSearch Service domain. For more information, see <a
     * href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html"
     * target="_blank">Creating and managing Amazon OpenSearch Service domains </a> in the <i>Amazon OpenSearch Service
     * Developer Guide</i>.
     * </p>
     * 
     * @param createDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.CreateDomain
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler);

    /**
     * <p>
     * Creates a new cross-cluster connection from a local OpenSearch domain to a remote OpenSearch domain.
     * </p>
     * 
     * @param createOutboundConnectionRequest
     *        Container for the parameters to the <code> <a>CreateOutboundConnection</a> </code> operation.
     * @return A Java Future containing the result of the CreateOutboundConnection operation returned by the service.
     * @sample AmazonOpenSearchAsync.CreateOutboundConnection
     */
    java.util.concurrent.Future<CreateOutboundConnectionResult> createOutboundConnectionAsync(CreateOutboundConnectionRequest createOutboundConnectionRequest);

    /**
     * <p>
     * Creates a new cross-cluster connection from a local OpenSearch domain to a remote OpenSearch domain.
     * </p>
     * 
     * @param createOutboundConnectionRequest
     *        Container for the parameters to the <code> <a>CreateOutboundConnection</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateOutboundConnection operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.CreateOutboundConnection
     */
    java.util.concurrent.Future<CreateOutboundConnectionResult> createOutboundConnectionAsync(CreateOutboundConnectionRequest createOutboundConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOutboundConnectionRequest, CreateOutboundConnectionResult> asyncHandler);

    /**
     * <p>
     * Create a package for use with Amazon OpenSearch Service domains.
     * </p>
     * 
     * @param createPackageRequest
     *        Container for request parameters to the <code> <a>CreatePackage</a> </code> operation.
     * @return A Java Future containing the result of the CreatePackage operation returned by the service.
     * @sample AmazonOpenSearchAsync.CreatePackage
     */
    java.util.concurrent.Future<CreatePackageResult> createPackageAsync(CreatePackageRequest createPackageRequest);

    /**
     * <p>
     * Create a package for use with Amazon OpenSearch Service domains.
     * </p>
     * 
     * @param createPackageRequest
     *        Container for request parameters to the <code> <a>CreatePackage</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePackage operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.CreatePackage
     */
    java.util.concurrent.Future<CreatePackageResult> createPackageAsync(CreatePackageRequest createPackageRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePackageRequest, CreatePackageResult> asyncHandler);

    /**
     * <p>
     * Permanently deletes the specified domain and all of its data. Once a domain is deleted, it cannot be recovered.
     * </p>
     * 
     * @param deleteDomainRequest
     *        Container for the parameters to the <code> <a>DeleteDomain</a> </code> operation. Specifies the name of
     *        the domain you want to delete.
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonOpenSearchAsync.DeleteDomain
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Permanently deletes the specified domain and all of its data. Once a domain is deleted, it cannot be recovered.
     * </p>
     * 
     * @param deleteDomainRequest
     *        Container for the parameters to the <code> <a>DeleteDomain</a> </code> operation. Specifies the name of
     *        the domain you want to delete.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DeleteDomain
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler);

    /**
     * <p>
     * Allows the remote domain owner to delete an existing inbound cross-cluster connection.
     * </p>
     * 
     * @param deleteInboundConnectionRequest
     *        Container for the parameters to the <code> <a>DeleteInboundConnection</a> </code> operation.
     * @return A Java Future containing the result of the DeleteInboundConnection operation returned by the service.
     * @sample AmazonOpenSearchAsync.DeleteInboundConnection
     */
    java.util.concurrent.Future<DeleteInboundConnectionResult> deleteInboundConnectionAsync(DeleteInboundConnectionRequest deleteInboundConnectionRequest);

    /**
     * <p>
     * Allows the remote domain owner to delete an existing inbound cross-cluster connection.
     * </p>
     * 
     * @param deleteInboundConnectionRequest
     *        Container for the parameters to the <code> <a>DeleteInboundConnection</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInboundConnection operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DeleteInboundConnection
     */
    java.util.concurrent.Future<DeleteInboundConnectionResult> deleteInboundConnectionAsync(DeleteInboundConnectionRequest deleteInboundConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInboundConnectionRequest, DeleteInboundConnectionResult> asyncHandler);

    /**
     * <p>
     * Allows the local domain owner to delete an existing outbound cross-cluster connection.
     * </p>
     * 
     * @param deleteOutboundConnectionRequest
     *        Container for the parameters to the <code> <a>DeleteOutboundConnection</a> </code> operation.
     * @return A Java Future containing the result of the DeleteOutboundConnection operation returned by the service.
     * @sample AmazonOpenSearchAsync.DeleteOutboundConnection
     */
    java.util.concurrent.Future<DeleteOutboundConnectionResult> deleteOutboundConnectionAsync(DeleteOutboundConnectionRequest deleteOutboundConnectionRequest);

    /**
     * <p>
     * Allows the local domain owner to delete an existing outbound cross-cluster connection.
     * </p>
     * 
     * @param deleteOutboundConnectionRequest
     *        Container for the parameters to the <code> <a>DeleteOutboundConnection</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOutboundConnection operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DeleteOutboundConnection
     */
    java.util.concurrent.Future<DeleteOutboundConnectionResult> deleteOutboundConnectionAsync(DeleteOutboundConnectionRequest deleteOutboundConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOutboundConnectionRequest, DeleteOutboundConnectionResult> asyncHandler);

    /**
     * <p>
     * Deletes the package.
     * </p>
     * 
     * @param deletePackageRequest
     *        Container for the request parameters to the <code> <a>DeletePackage</a> </code> operation.
     * @return A Java Future containing the result of the DeletePackage operation returned by the service.
     * @sample AmazonOpenSearchAsync.DeletePackage
     */
    java.util.concurrent.Future<DeletePackageResult> deletePackageAsync(DeletePackageRequest deletePackageRequest);

    /**
     * <p>
     * Deletes the package.
     * </p>
     * 
     * @param deletePackageRequest
     *        Container for the request parameters to the <code> <a>DeletePackage</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePackage operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DeletePackage
     */
    java.util.concurrent.Future<DeletePackageResult> deletePackageAsync(DeletePackageRequest deletePackageRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePackageRequest, DeletePackageResult> asyncHandler);

    /**
     * <p>
     * Returns domain configuration information about the specified domain, including the domain ID, domain endpoint,
     * and domain ARN.
     * </p>
     * 
     * @param describeDomainRequest
     *        Container for the parameters to the <code> <a>DescribeDomain</a> </code> operation.
     * @return A Java Future containing the result of the DescribeDomain operation returned by the service.
     * @sample AmazonOpenSearchAsync.DescribeDomain
     */
    java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest describeDomainRequest);

    /**
     * <p>
     * Returns domain configuration information about the specified domain, including the domain ID, domain endpoint,
     * and domain ARN.
     * </p>
     * 
     * @param describeDomainRequest
     *        Container for the parameters to the <code> <a>DescribeDomain</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDomain operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DescribeDomain
     */
    java.util.concurrent.Future<DescribeDomainResult> describeDomainAsync(DescribeDomainRequest describeDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDomainRequest, DescribeDomainResult> asyncHandler);

    /**
     * <p>
     * Provides scheduled Auto-Tune action details for the domain, such as Auto-Tune action type, description, severity,
     * and scheduled date.
     * </p>
     * 
     * @param describeDomainAutoTunesRequest
     *        Container for the parameters to the <code>DescribeDomainAutoTunes</code> operation.
     * @return A Java Future containing the result of the DescribeDomainAutoTunes operation returned by the service.
     * @sample AmazonOpenSearchAsync.DescribeDomainAutoTunes
     */
    java.util.concurrent.Future<DescribeDomainAutoTunesResult> describeDomainAutoTunesAsync(DescribeDomainAutoTunesRequest describeDomainAutoTunesRequest);

    /**
     * <p>
     * Provides scheduled Auto-Tune action details for the domain, such as Auto-Tune action type, description, severity,
     * and scheduled date.
     * </p>
     * 
     * @param describeDomainAutoTunesRequest
     *        Container for the parameters to the <code>DescribeDomainAutoTunes</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDomainAutoTunes operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DescribeDomainAutoTunes
     */
    java.util.concurrent.Future<DescribeDomainAutoTunesResult> describeDomainAutoTunesAsync(DescribeDomainAutoTunesRequest describeDomainAutoTunesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDomainAutoTunesRequest, DescribeDomainAutoTunesResult> asyncHandler);

    /**
     * <p>
     * Provides cluster configuration information about the specified domain, such as the state, creation date, update
     * version, and update date for cluster options.
     * </p>
     * 
     * @param describeDomainConfigRequest
     *        Container for the parameters to the <code>DescribeDomainConfig</code> operation. Specifies the domain name
     *        for which you want configuration information.
     * @return A Java Future containing the result of the DescribeDomainConfig operation returned by the service.
     * @sample AmazonOpenSearchAsync.DescribeDomainConfig
     */
    java.util.concurrent.Future<DescribeDomainConfigResult> describeDomainConfigAsync(DescribeDomainConfigRequest describeDomainConfigRequest);

    /**
     * <p>
     * Provides cluster configuration information about the specified domain, such as the state, creation date, update
     * version, and update date for cluster options.
     * </p>
     * 
     * @param describeDomainConfigRequest
     *        Container for the parameters to the <code>DescribeDomainConfig</code> operation. Specifies the domain name
     *        for which you want configuration information.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDomainConfig operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DescribeDomainConfig
     */
    java.util.concurrent.Future<DescribeDomainConfigResult> describeDomainConfigAsync(DescribeDomainConfigRequest describeDomainConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDomainConfigRequest, DescribeDomainConfigResult> asyncHandler);

    /**
     * <p>
     * Returns domain configuration information about the specified domains, including the domain ID, domain endpoint,
     * and domain ARN.
     * </p>
     * 
     * @param describeDomainsRequest
     *        Container for the parameters to the <code> <a>DescribeDomains</a> </code> operation. By default, the API
     *        returns the status of all domains.
     * @return A Java Future containing the result of the DescribeDomains operation returned by the service.
     * @sample AmazonOpenSearchAsync.DescribeDomains
     */
    java.util.concurrent.Future<DescribeDomainsResult> describeDomainsAsync(DescribeDomainsRequest describeDomainsRequest);

    /**
     * <p>
     * Returns domain configuration information about the specified domains, including the domain ID, domain endpoint,
     * and domain ARN.
     * </p>
     * 
     * @param describeDomainsRequest
     *        Container for the parameters to the <code> <a>DescribeDomains</a> </code> operation. By default, the API
     *        returns the status of all domains.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDomains operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DescribeDomains
     */
    java.util.concurrent.Future<DescribeDomainsResult> describeDomainsAsync(DescribeDomainsRequest describeDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDomainsRequest, DescribeDomainsResult> asyncHandler);

    /**
     * <p>
     * Lists all the inbound cross-cluster connections for a remote domain.
     * </p>
     * 
     * @param describeInboundConnectionsRequest
     *        Container for the parameters to the <code> <a>DescribeInboundConnections</a> </code> operation.
     * @return A Java Future containing the result of the DescribeInboundConnections operation returned by the service.
     * @sample AmazonOpenSearchAsync.DescribeInboundConnections
     */
    java.util.concurrent.Future<DescribeInboundConnectionsResult> describeInboundConnectionsAsync(
            DescribeInboundConnectionsRequest describeInboundConnectionsRequest);

    /**
     * <p>
     * Lists all the inbound cross-cluster connections for a remote domain.
     * </p>
     * 
     * @param describeInboundConnectionsRequest
     *        Container for the parameters to the <code> <a>DescribeInboundConnections</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInboundConnections operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DescribeInboundConnections
     */
    java.util.concurrent.Future<DescribeInboundConnectionsResult> describeInboundConnectionsAsync(
            DescribeInboundConnectionsRequest describeInboundConnectionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInboundConnectionsRequest, DescribeInboundConnectionsResult> asyncHandler);

    /**
     * <p>
     * Describe the limits for a given instance type and OpenSearch or Elasticsearch version. When modifying an existing
     * domain, specify the <code> <a>DomainName</a> </code> to see which limits you can modify.
     * </p>
     * 
     * @param describeInstanceTypeLimitsRequest
     *        Container for the parameters to the <code> <a>DescribeInstanceTypeLimits</a> </code> operation.
     * @return A Java Future containing the result of the DescribeInstanceTypeLimits operation returned by the service.
     * @sample AmazonOpenSearchAsync.DescribeInstanceTypeLimits
     */
    java.util.concurrent.Future<DescribeInstanceTypeLimitsResult> describeInstanceTypeLimitsAsync(
            DescribeInstanceTypeLimitsRequest describeInstanceTypeLimitsRequest);

    /**
     * <p>
     * Describe the limits for a given instance type and OpenSearch or Elasticsearch version. When modifying an existing
     * domain, specify the <code> <a>DomainName</a> </code> to see which limits you can modify.
     * </p>
     * 
     * @param describeInstanceTypeLimitsRequest
     *        Container for the parameters to the <code> <a>DescribeInstanceTypeLimits</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstanceTypeLimits operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DescribeInstanceTypeLimits
     */
    java.util.concurrent.Future<DescribeInstanceTypeLimitsResult> describeInstanceTypeLimitsAsync(
            DescribeInstanceTypeLimitsRequest describeInstanceTypeLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceTypeLimitsRequest, DescribeInstanceTypeLimitsResult> asyncHandler);

    /**
     * <p>
     * Lists all the outbound cross-cluster connections for a local domain.
     * </p>
     * 
     * @param describeOutboundConnectionsRequest
     *        Container for the parameters to the <code> <a>DescribeOutboundConnections</a> </code> operation.
     * @return A Java Future containing the result of the DescribeOutboundConnections operation returned by the service.
     * @sample AmazonOpenSearchAsync.DescribeOutboundConnections
     */
    java.util.concurrent.Future<DescribeOutboundConnectionsResult> describeOutboundConnectionsAsync(
            DescribeOutboundConnectionsRequest describeOutboundConnectionsRequest);

    /**
     * <p>
     * Lists all the outbound cross-cluster connections for a local domain.
     * </p>
     * 
     * @param describeOutboundConnectionsRequest
     *        Container for the parameters to the <code> <a>DescribeOutboundConnections</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOutboundConnections operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DescribeOutboundConnections
     */
    java.util.concurrent.Future<DescribeOutboundConnectionsResult> describeOutboundConnectionsAsync(
            DescribeOutboundConnectionsRequest describeOutboundConnectionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOutboundConnectionsRequest, DescribeOutboundConnectionsResult> asyncHandler);

    /**
     * <p>
     * Describes all packages available to Amazon OpenSearch Service domains. Includes options for filtering, limiting
     * the number of results, and pagination.
     * </p>
     * 
     * @param describePackagesRequest
     *        Container for the request parameters to the <code> <a>DescribePackage</a> </code> operation.
     * @return A Java Future containing the result of the DescribePackages operation returned by the service.
     * @sample AmazonOpenSearchAsync.DescribePackages
     */
    java.util.concurrent.Future<DescribePackagesResult> describePackagesAsync(DescribePackagesRequest describePackagesRequest);

    /**
     * <p>
     * Describes all packages available to Amazon OpenSearch Service domains. Includes options for filtering, limiting
     * the number of results, and pagination.
     * </p>
     * 
     * @param describePackagesRequest
     *        Container for the request parameters to the <code> <a>DescribePackage</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePackages operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DescribePackages
     */
    java.util.concurrent.Future<DescribePackagesResult> describePackagesAsync(DescribePackagesRequest describePackagesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePackagesRequest, DescribePackagesResult> asyncHandler);

    /**
     * <p>
     * Lists available reserved OpenSearch instance offerings.
     * </p>
     * 
     * @param describeReservedInstanceOfferingsRequest
     *        Container for parameters to <code>DescribeReservedInstanceOfferings</code>
     * @return A Java Future containing the result of the DescribeReservedInstanceOfferings operation returned by the
     *         service.
     * @sample AmazonOpenSearchAsync.DescribeReservedInstanceOfferings
     */
    java.util.concurrent.Future<DescribeReservedInstanceOfferingsResult> describeReservedInstanceOfferingsAsync(
            DescribeReservedInstanceOfferingsRequest describeReservedInstanceOfferingsRequest);

    /**
     * <p>
     * Lists available reserved OpenSearch instance offerings.
     * </p>
     * 
     * @param describeReservedInstanceOfferingsRequest
     *        Container for parameters to <code>DescribeReservedInstanceOfferings</code>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReservedInstanceOfferings operation returned by the
     *         service.
     * @sample AmazonOpenSearchAsyncHandler.DescribeReservedInstanceOfferings
     */
    java.util.concurrent.Future<DescribeReservedInstanceOfferingsResult> describeReservedInstanceOfferingsAsync(
            DescribeReservedInstanceOfferingsRequest describeReservedInstanceOfferingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstanceOfferingsRequest, DescribeReservedInstanceOfferingsResult> asyncHandler);

    /**
     * <p>
     * Returns information about reserved OpenSearch instances for this account.
     * </p>
     * 
     * @param describeReservedInstancesRequest
     *        Container for parameters to <code>DescribeReservedInstances</code>
     * @return A Java Future containing the result of the DescribeReservedInstances operation returned by the service.
     * @sample AmazonOpenSearchAsync.DescribeReservedInstances
     */
    java.util.concurrent.Future<DescribeReservedInstancesResult> describeReservedInstancesAsync(
            DescribeReservedInstancesRequest describeReservedInstancesRequest);

    /**
     * <p>
     * Returns information about reserved OpenSearch instances for this account.
     * </p>
     * 
     * @param describeReservedInstancesRequest
     *        Container for parameters to <code>DescribeReservedInstances</code>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReservedInstances operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DescribeReservedInstances
     */
    java.util.concurrent.Future<DescribeReservedInstancesResult> describeReservedInstancesAsync(
            DescribeReservedInstancesRequest describeReservedInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedInstancesRequest, DescribeReservedInstancesResult> asyncHandler);

    /**
     * <p>
     * Dissociates a package from the Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param dissociatePackageRequest
     *        Container for the request parameters to the <code> <a>DissociatePackage</a> </code> operation.
     * @return A Java Future containing the result of the DissociatePackage operation returned by the service.
     * @sample AmazonOpenSearchAsync.DissociatePackage
     */
    java.util.concurrent.Future<DissociatePackageResult> dissociatePackageAsync(DissociatePackageRequest dissociatePackageRequest);

    /**
     * <p>
     * Dissociates a package from the Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param dissociatePackageRequest
     *        Container for the request parameters to the <code> <a>DissociatePackage</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DissociatePackage operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.DissociatePackage
     */
    java.util.concurrent.Future<DissociatePackageResult> dissociatePackageAsync(DissociatePackageRequest dissociatePackageRequest,
            com.amazonaws.handlers.AsyncHandler<DissociatePackageRequest, DissociatePackageResult> asyncHandler);

    /**
     * <p>
     * Returns a list of upgrade-compatible versions of OpenSearch/Elasticsearch. You can optionally pass a
     * <code> <a>DomainName</a> </code> to get all upgrade-compatible versions of OpenSearch/Elasticsearch for that
     * specific domain.
     * </p>
     * 
     * @param getCompatibleVersionsRequest
     *        Container for the request parameters to <code> <a>GetCompatibleVersions</a> </code> operation.
     * @return A Java Future containing the result of the GetCompatibleVersions operation returned by the service.
     * @sample AmazonOpenSearchAsync.GetCompatibleVersions
     */
    java.util.concurrent.Future<GetCompatibleVersionsResult> getCompatibleVersionsAsync(GetCompatibleVersionsRequest getCompatibleVersionsRequest);

    /**
     * <p>
     * Returns a list of upgrade-compatible versions of OpenSearch/Elasticsearch. You can optionally pass a
     * <code> <a>DomainName</a> </code> to get all upgrade-compatible versions of OpenSearch/Elasticsearch for that
     * specific domain.
     * </p>
     * 
     * @param getCompatibleVersionsRequest
     *        Container for the request parameters to <code> <a>GetCompatibleVersions</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCompatibleVersions operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.GetCompatibleVersions
     */
    java.util.concurrent.Future<GetCompatibleVersionsResult> getCompatibleVersionsAsync(GetCompatibleVersionsRequest getCompatibleVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetCompatibleVersionsRequest, GetCompatibleVersionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of package versions, along with their creation time and commit message.
     * </p>
     * 
     * @param getPackageVersionHistoryRequest
     *        Container for the request parameters to the <code> <a>GetPackageVersionHistory</a> </code> operation.
     * @return A Java Future containing the result of the GetPackageVersionHistory operation returned by the service.
     * @sample AmazonOpenSearchAsync.GetPackageVersionHistory
     */
    java.util.concurrent.Future<GetPackageVersionHistoryResult> getPackageVersionHistoryAsync(GetPackageVersionHistoryRequest getPackageVersionHistoryRequest);

    /**
     * <p>
     * Returns a list of package versions, along with their creation time and commit message.
     * </p>
     * 
     * @param getPackageVersionHistoryRequest
     *        Container for the request parameters to the <code> <a>GetPackageVersionHistory</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPackageVersionHistory operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.GetPackageVersionHistory
     */
    java.util.concurrent.Future<GetPackageVersionHistoryResult> getPackageVersionHistoryAsync(GetPackageVersionHistoryRequest getPackageVersionHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetPackageVersionHistoryRequest, GetPackageVersionHistoryResult> asyncHandler);

    /**
     * <p>
     * Retrieves the complete history of the last 10 upgrades performed on the domain.
     * </p>
     * 
     * @param getUpgradeHistoryRequest
     *        Container for the request parameters to the <code> <a>GetUpgradeHistory</a> </code> operation.
     * @return A Java Future containing the result of the GetUpgradeHistory operation returned by the service.
     * @sample AmazonOpenSearchAsync.GetUpgradeHistory
     */
    java.util.concurrent.Future<GetUpgradeHistoryResult> getUpgradeHistoryAsync(GetUpgradeHistoryRequest getUpgradeHistoryRequest);

    /**
     * <p>
     * Retrieves the complete history of the last 10 upgrades performed on the domain.
     * </p>
     * 
     * @param getUpgradeHistoryRequest
     *        Container for the request parameters to the <code> <a>GetUpgradeHistory</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUpgradeHistory operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.GetUpgradeHistory
     */
    java.util.concurrent.Future<GetUpgradeHistoryResult> getUpgradeHistoryAsync(GetUpgradeHistoryRequest getUpgradeHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetUpgradeHistoryRequest, GetUpgradeHistoryResult> asyncHandler);

    /**
     * <p>
     * Retrieves the latest status of the last upgrade or upgrade eligibility check performed on the domain.
     * </p>
     * 
     * @param getUpgradeStatusRequest
     *        Container for the request parameters to the <code> <a>GetUpgradeStatus</a> </code> operation.
     * @return A Java Future containing the result of the GetUpgradeStatus operation returned by the service.
     * @sample AmazonOpenSearchAsync.GetUpgradeStatus
     */
    java.util.concurrent.Future<GetUpgradeStatusResult> getUpgradeStatusAsync(GetUpgradeStatusRequest getUpgradeStatusRequest);

    /**
     * <p>
     * Retrieves the latest status of the last upgrade or upgrade eligibility check performed on the domain.
     * </p>
     * 
     * @param getUpgradeStatusRequest
     *        Container for the request parameters to the <code> <a>GetUpgradeStatus</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUpgradeStatus operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.GetUpgradeStatus
     */
    java.util.concurrent.Future<GetUpgradeStatusResult> getUpgradeStatusAsync(GetUpgradeStatusRequest getUpgradeStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetUpgradeStatusRequest, GetUpgradeStatusResult> asyncHandler);

    /**
     * <p>
     * Returns the names of all domains owned by the current user's account.
     * </p>
     * 
     * @param listDomainNamesRequest
     *        Container for the parameters to the <code><a>ListDomainNames</a></code> operation.
     * @return A Java Future containing the result of the ListDomainNames operation returned by the service.
     * @sample AmazonOpenSearchAsync.ListDomainNames
     */
    java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync(ListDomainNamesRequest listDomainNamesRequest);

    /**
     * <p>
     * Returns the names of all domains owned by the current user's account.
     * </p>
     * 
     * @param listDomainNamesRequest
     *        Container for the parameters to the <code><a>ListDomainNames</a></code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDomainNames operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.ListDomainNames
     */
    java.util.concurrent.Future<ListDomainNamesResult> listDomainNamesAsync(ListDomainNamesRequest listDomainNamesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDomainNamesRequest, ListDomainNamesResult> asyncHandler);

    /**
     * <p>
     * Lists all Amazon OpenSearch Service domains associated with the package.
     * </p>
     * 
     * @param listDomainsForPackageRequest
     *        Container for the request parameters to the <code> <a>ListDomainsForPackage</a> </code> operation.
     * @return A Java Future containing the result of the ListDomainsForPackage operation returned by the service.
     * @sample AmazonOpenSearchAsync.ListDomainsForPackage
     */
    java.util.concurrent.Future<ListDomainsForPackageResult> listDomainsForPackageAsync(ListDomainsForPackageRequest listDomainsForPackageRequest);

    /**
     * <p>
     * Lists all Amazon OpenSearch Service domains associated with the package.
     * </p>
     * 
     * @param listDomainsForPackageRequest
     *        Container for the request parameters to the <code> <a>ListDomainsForPackage</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDomainsForPackage operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.ListDomainsForPackage
     */
    java.util.concurrent.Future<ListDomainsForPackageResult> listDomainsForPackageAsync(ListDomainsForPackageRequest listDomainsForPackageRequest,
            com.amazonaws.handlers.AsyncHandler<ListDomainsForPackageRequest, ListDomainsForPackageResult> asyncHandler);

    /**
     * @param listInstanceTypeDetailsRequest
     * @return A Java Future containing the result of the ListInstanceTypeDetails operation returned by the service.
     * @sample AmazonOpenSearchAsync.ListInstanceTypeDetails
     */
    java.util.concurrent.Future<ListInstanceTypeDetailsResult> listInstanceTypeDetailsAsync(ListInstanceTypeDetailsRequest listInstanceTypeDetailsRequest);

    /**
     * @param listInstanceTypeDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInstanceTypeDetails operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.ListInstanceTypeDetails
     */
    java.util.concurrent.Future<ListInstanceTypeDetailsResult> listInstanceTypeDetailsAsync(ListInstanceTypeDetailsRequest listInstanceTypeDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInstanceTypeDetailsRequest, ListInstanceTypeDetailsResult> asyncHandler);

    /**
     * <p>
     * Lists all packages associated with the Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param listPackagesForDomainRequest
     *        Container for the request parameters to the <code> <a>ListPackagesForDomain</a> </code> operation.
     * @return A Java Future containing the result of the ListPackagesForDomain operation returned by the service.
     * @sample AmazonOpenSearchAsync.ListPackagesForDomain
     */
    java.util.concurrent.Future<ListPackagesForDomainResult> listPackagesForDomainAsync(ListPackagesForDomainRequest listPackagesForDomainRequest);

    /**
     * <p>
     * Lists all packages associated with the Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param listPackagesForDomainRequest
     *        Container for the request parameters to the <code> <a>ListPackagesForDomain</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPackagesForDomain operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.ListPackagesForDomain
     */
    java.util.concurrent.Future<ListPackagesForDomainResult> listPackagesForDomainAsync(ListPackagesForDomainRequest listPackagesForDomainRequest,
            com.amazonaws.handlers.AsyncHandler<ListPackagesForDomainRequest, ListPackagesForDomainResult> asyncHandler);

    /**
     * <p>
     * Returns all tags for the given domain.
     * </p>
     * 
     * @param listTagsRequest
     *        Container for the parameters to the <code> <a>ListTags</a> </code> operation. Specify the <code>ARN</code>
     *        of the domain that the tags you want to view are attached to.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AmazonOpenSearchAsync.ListTags
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Returns all tags for the given domain.
     * </p>
     * 
     * @param listTagsRequest
     *        Container for the parameters to the <code> <a>ListTags</a> </code> operation. Specify the <code>ARN</code>
     *        of the domain that the tags you want to view are attached to.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.ListTags
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListVersions operation returned by the service.
     * @sample AmazonOpenSearchAsync.ListVersions
     */
    java.util.concurrent.Future<ListVersionsResult> listVersionsAsync(ListVersionsRequest listVersionsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVersions operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.ListVersions
     */
    java.util.concurrent.Future<ListVersionsResult> listVersionsAsync(ListVersionsRequest listVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVersionsRequest, ListVersionsResult> asyncHandler);

    /**
     * <p>
     * Allows you to purchase reserved OpenSearch instances.
     * </p>
     * 
     * @param purchaseReservedInstanceOfferingRequest
     *        Container for parameters to <code>PurchaseReservedInstanceOffering</code>
     * @return A Java Future containing the result of the PurchaseReservedInstanceOffering operation returned by the
     *         service.
     * @sample AmazonOpenSearchAsync.PurchaseReservedInstanceOffering
     */
    java.util.concurrent.Future<PurchaseReservedInstanceOfferingResult> purchaseReservedInstanceOfferingAsync(
            PurchaseReservedInstanceOfferingRequest purchaseReservedInstanceOfferingRequest);

    /**
     * <p>
     * Allows you to purchase reserved OpenSearch instances.
     * </p>
     * 
     * @param purchaseReservedInstanceOfferingRequest
     *        Container for parameters to <code>PurchaseReservedInstanceOffering</code>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PurchaseReservedInstanceOffering operation returned by the
     *         service.
     * @sample AmazonOpenSearchAsyncHandler.PurchaseReservedInstanceOffering
     */
    java.util.concurrent.Future<PurchaseReservedInstanceOfferingResult> purchaseReservedInstanceOfferingAsync(
            PurchaseReservedInstanceOfferingRequest purchaseReservedInstanceOfferingRequest,
            com.amazonaws.handlers.AsyncHandler<PurchaseReservedInstanceOfferingRequest, PurchaseReservedInstanceOfferingResult> asyncHandler);

    /**
     * <p>
     * Allows the remote domain owner to reject an inbound cross-cluster connection request.
     * </p>
     * 
     * @param rejectInboundConnectionRequest
     *        Container for the parameters to the <code> <a>RejectInboundConnection</a> </code> operation.
     * @return A Java Future containing the result of the RejectInboundConnection operation returned by the service.
     * @sample AmazonOpenSearchAsync.RejectInboundConnection
     */
    java.util.concurrent.Future<RejectInboundConnectionResult> rejectInboundConnectionAsync(RejectInboundConnectionRequest rejectInboundConnectionRequest);

    /**
     * <p>
     * Allows the remote domain owner to reject an inbound cross-cluster connection request.
     * </p>
     * 
     * @param rejectInboundConnectionRequest
     *        Container for the parameters to the <code> <a>RejectInboundConnection</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RejectInboundConnection operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.RejectInboundConnection
     */
    java.util.concurrent.Future<RejectInboundConnectionResult> rejectInboundConnectionAsync(RejectInboundConnectionRequest rejectInboundConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<RejectInboundConnectionRequest, RejectInboundConnectionResult> asyncHandler);

    /**
     * <p>
     * Removes the specified set of tags from the given domain.
     * </p>
     * 
     * @param removeTagsRequest
     *        Container for the parameters to the <code> <a>RemoveTags</a> </code> operation. Specify the
     *        <code>ARN</code> for the domain from which you want to remove the specified <code>TagKey</code>.
     * @return A Java Future containing the result of the RemoveTags operation returned by the service.
     * @sample AmazonOpenSearchAsync.RemoveTags
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest);

    /**
     * <p>
     * Removes the specified set of tags from the given domain.
     * </p>
     * 
     * @param removeTagsRequest
     *        Container for the parameters to the <code> <a>RemoveTags</a> </code> operation. Specify the
     *        <code>ARN</code> for the domain from which you want to remove the specified <code>TagKey</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTags operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.RemoveTags
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler);

    /**
     * <p>
     * Schedules a service software update for an Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param startServiceSoftwareUpdateRequest
     *        Container for the parameters to the <code> <a>StartServiceSoftwareUpdate</a> </code> operation. Specifies
     *        the name of the domain to schedule a service software update for.
     * @return A Java Future containing the result of the StartServiceSoftwareUpdate operation returned by the service.
     * @sample AmazonOpenSearchAsync.StartServiceSoftwareUpdate
     */
    java.util.concurrent.Future<StartServiceSoftwareUpdateResult> startServiceSoftwareUpdateAsync(
            StartServiceSoftwareUpdateRequest startServiceSoftwareUpdateRequest);

    /**
     * <p>
     * Schedules a service software update for an Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param startServiceSoftwareUpdateRequest
     *        Container for the parameters to the <code> <a>StartServiceSoftwareUpdate</a> </code> operation. Specifies
     *        the name of the domain to schedule a service software update for.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartServiceSoftwareUpdate operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.StartServiceSoftwareUpdate
     */
    java.util.concurrent.Future<StartServiceSoftwareUpdateResult> startServiceSoftwareUpdateAsync(
            StartServiceSoftwareUpdateRequest startServiceSoftwareUpdateRequest,
            com.amazonaws.handlers.AsyncHandler<StartServiceSoftwareUpdateRequest, StartServiceSoftwareUpdateResult> asyncHandler);

    /**
     * <p>
     * Modifies the cluster configuration of the specified domain, such as setting the instance type and the number of
     * instances.
     * </p>
     * 
     * @param updateDomainConfigRequest
     *        Container for the parameters to the <code> <a>UpdateDomain</a> </code> operation. Specifies the type and
     *        number of instances in the domain cluster.
     * @return A Java Future containing the result of the UpdateDomainConfig operation returned by the service.
     * @sample AmazonOpenSearchAsync.UpdateDomainConfig
     */
    java.util.concurrent.Future<UpdateDomainConfigResult> updateDomainConfigAsync(UpdateDomainConfigRequest updateDomainConfigRequest);

    /**
     * <p>
     * Modifies the cluster configuration of the specified domain, such as setting the instance type and the number of
     * instances.
     * </p>
     * 
     * @param updateDomainConfigRequest
     *        Container for the parameters to the <code> <a>UpdateDomain</a> </code> operation. Specifies the type and
     *        number of instances in the domain cluster.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDomainConfig operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.UpdateDomainConfig
     */
    java.util.concurrent.Future<UpdateDomainConfigResult> updateDomainConfigAsync(UpdateDomainConfigRequest updateDomainConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainConfigRequest, UpdateDomainConfigResult> asyncHandler);

    /**
     * <p>
     * Updates a package for use with Amazon OpenSearch Service domains.
     * </p>
     * 
     * @param updatePackageRequest
     *        Container for request parameters to the <code> <a>UpdatePackage</a> </code> operation.
     * @return A Java Future containing the result of the UpdatePackage operation returned by the service.
     * @sample AmazonOpenSearchAsync.UpdatePackage
     */
    java.util.concurrent.Future<UpdatePackageResult> updatePackageAsync(UpdatePackageRequest updatePackageRequest);

    /**
     * <p>
     * Updates a package for use with Amazon OpenSearch Service domains.
     * </p>
     * 
     * @param updatePackageRequest
     *        Container for request parameters to the <code> <a>UpdatePackage</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePackage operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.UpdatePackage
     */
    java.util.concurrent.Future<UpdatePackageResult> updatePackageAsync(UpdatePackageRequest updatePackageRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePackageRequest, UpdatePackageResult> asyncHandler);

    /**
     * <p>
     * Allows you to either upgrade your domain or perform an upgrade eligibility check to a compatible version of
     * OpenSearch or Elasticsearch.
     * </p>
     * 
     * @param upgradeDomainRequest
     *        Container for the request parameters to <code> <a>UpgradeDomain</a> </code> operation.
     * @return A Java Future containing the result of the UpgradeDomain operation returned by the service.
     * @sample AmazonOpenSearchAsync.UpgradeDomain
     */
    java.util.concurrent.Future<UpgradeDomainResult> upgradeDomainAsync(UpgradeDomainRequest upgradeDomainRequest);

    /**
     * <p>
     * Allows you to either upgrade your domain or perform an upgrade eligibility check to a compatible version of
     * OpenSearch or Elasticsearch.
     * </p>
     * 
     * @param upgradeDomainRequest
     *        Container for the request parameters to <code> <a>UpgradeDomain</a> </code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpgradeDomain operation returned by the service.
     * @sample AmazonOpenSearchAsyncHandler.UpgradeDomain
     */
    java.util.concurrent.Future<UpgradeDomainResult> upgradeDomainAsync(UpgradeDomainRequest upgradeDomainRequest,
            com.amazonaws.handlers.AsyncHandler<UpgradeDomainRequest, UpgradeDomainResult> asyncHandler);

}

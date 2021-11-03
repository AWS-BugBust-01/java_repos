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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.opensearch.AmazonOpenSearchClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.opensearch.model.*;
import com.amazonaws.services.opensearch.model.transform.*;

/**
 * Client for accessing Amazon OpenSearch Service. All service calls made using this client are blocking, and will not
 * return until the service call completes.
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
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonOpenSearchClient extends AmazonWebServiceClient implements AmazonOpenSearch {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonOpenSearch.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "es";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DisabledOperationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.DisabledOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTypeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.InvalidTypeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BaseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.BaseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.ResourceAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.InternalExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPaginationTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.opensearch.model.transform.InvalidPaginationTokenExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.opensearch.model.AmazonOpenSearchException.class));

    public static AmazonOpenSearchClientBuilder builder() {
        return AmazonOpenSearchClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon OpenSearch Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonOpenSearchClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon OpenSearch Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonOpenSearchClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("es.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/opensearch/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/opensearch/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

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
    @Override
    public AcceptInboundConnectionResult acceptInboundConnection(AcceptInboundConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptInboundConnection(request);
    }

    @SdkInternalApi
    final AcceptInboundConnectionResult executeAcceptInboundConnection(AcceptInboundConnectionRequest acceptInboundConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptInboundConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptInboundConnectionRequest> request = null;
        Response<AcceptInboundConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptInboundConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(acceptInboundConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptInboundConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptInboundConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AcceptInboundConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public AddTagsResult addTags(AddTagsRequest request) {
        request = beforeClientExecution(request);
        return executeAddTags(request);
    }

    @SdkInternalApi
    final AddTagsResult executeAddTags(AddTagsRequest addTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(addTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsRequest> request = null;
        Response<AddTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public AssociatePackageResult associatePackage(AssociatePackageRequest request) {
        request = beforeClientExecution(request);
        return executeAssociatePackage(request);
    }

    @SdkInternalApi
    final AssociatePackageResult executeAssociatePackage(AssociatePackageRequest associatePackageRequest) {

        ExecutionContext executionContext = createExecutionContext(associatePackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociatePackageRequest> request = null;
        Response<AssociatePackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociatePackageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associatePackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociatePackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociatePackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociatePackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public CancelServiceSoftwareUpdateResult cancelServiceSoftwareUpdate(CancelServiceSoftwareUpdateRequest request) {
        request = beforeClientExecution(request);
        return executeCancelServiceSoftwareUpdate(request);
    }

    @SdkInternalApi
    final CancelServiceSoftwareUpdateResult executeCancelServiceSoftwareUpdate(CancelServiceSoftwareUpdateRequest cancelServiceSoftwareUpdateRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelServiceSoftwareUpdateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelServiceSoftwareUpdateRequest> request = null;
        Response<CancelServiceSoftwareUpdateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelServiceSoftwareUpdateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelServiceSoftwareUpdateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelServiceSoftwareUpdate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelServiceSoftwareUpdateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelServiceSoftwareUpdateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public CreateDomainResult createDomain(CreateDomainRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDomain(request);
    }

    @SdkInternalApi
    final CreateDomainResult executeCreateDomain(CreateDomainRequest createDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(createDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainRequest> request = null;
        Response<CreateDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public CreateOutboundConnectionResult createOutboundConnection(CreateOutboundConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateOutboundConnection(request);
    }

    @SdkInternalApi
    final CreateOutboundConnectionResult executeCreateOutboundConnection(CreateOutboundConnectionRequest createOutboundConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(createOutboundConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOutboundConnectionRequest> request = null;
        Response<CreateOutboundConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateOutboundConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createOutboundConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateOutboundConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateOutboundConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateOutboundConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public CreatePackageResult createPackage(CreatePackageRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePackage(request);
    }

    @SdkInternalApi
    final CreatePackageResult executeCreatePackage(CreatePackageRequest createPackageRequest) {

        ExecutionContext executionContext = createExecutionContext(createPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePackageRequest> request = null;
        Response<CreatePackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePackageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeleteDomainResult deleteDomain(DeleteDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDomain(request);
    }

    @SdkInternalApi
    final DeleteDomainResult executeDeleteDomain(DeleteDomainRequest deleteDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainRequest> request = null;
        Response<DeleteDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeleteInboundConnectionResult deleteInboundConnection(DeleteInboundConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInboundConnection(request);
    }

    @SdkInternalApi
    final DeleteInboundConnectionResult executeDeleteInboundConnection(DeleteInboundConnectionRequest deleteInboundConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInboundConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInboundConnectionRequest> request = null;
        Response<DeleteInboundConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInboundConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteInboundConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInboundConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInboundConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteInboundConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeleteOutboundConnectionResult deleteOutboundConnection(DeleteOutboundConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteOutboundConnection(request);
    }

    @SdkInternalApi
    final DeleteOutboundConnectionResult executeDeleteOutboundConnection(DeleteOutboundConnectionRequest deleteOutboundConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteOutboundConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOutboundConnectionRequest> request = null;
        Response<DeleteOutboundConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOutboundConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteOutboundConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteOutboundConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteOutboundConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteOutboundConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeletePackageResult deletePackage(DeletePackageRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePackage(request);
    }

    @SdkInternalApi
    final DeletePackageResult executeDeletePackage(DeletePackageRequest deletePackageRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePackageRequest> request = null;
        Response<DeletePackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePackageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DescribeDomainResult describeDomain(DescribeDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDomain(request);
    }

    @SdkInternalApi
    final DescribeDomainResult executeDescribeDomain(DescribeDomainRequest describeDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainRequest> request = null;
        Response<DescribeDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DescribeDomainAutoTunesResult describeDomainAutoTunes(DescribeDomainAutoTunesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDomainAutoTunes(request);
    }

    @SdkInternalApi
    final DescribeDomainAutoTunesResult executeDescribeDomainAutoTunes(DescribeDomainAutoTunesRequest describeDomainAutoTunesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDomainAutoTunesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainAutoTunesRequest> request = null;
        Response<DescribeDomainAutoTunesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainAutoTunesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDomainAutoTunesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDomainAutoTunes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDomainAutoTunesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDomainAutoTunesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DescribeDomainConfigResult describeDomainConfig(DescribeDomainConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDomainConfig(request);
    }

    @SdkInternalApi
    final DescribeDomainConfigResult executeDescribeDomainConfig(DescribeDomainConfigRequest describeDomainConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDomainConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainConfigRequest> request = null;
        Response<DescribeDomainConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDomainConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDomainConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDomainConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDomainConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DescribeDomainsResult describeDomains(DescribeDomainsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDomains(request);
    }

    @SdkInternalApi
    final DescribeDomainsResult executeDescribeDomains(DescribeDomainsRequest describeDomainsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainsRequest> request = null;
        Response<DescribeDomainsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDomains");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDomainsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDomainsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DescribeInboundConnectionsResult describeInboundConnections(DescribeInboundConnectionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInboundConnections(request);
    }

    @SdkInternalApi
    final DescribeInboundConnectionsResult executeDescribeInboundConnections(DescribeInboundConnectionsRequest describeInboundConnectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInboundConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInboundConnectionsRequest> request = null;
        Response<DescribeInboundConnectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInboundConnectionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInboundConnectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInboundConnections");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInboundConnectionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeInboundConnectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DescribeInstanceTypeLimitsResult describeInstanceTypeLimits(DescribeInstanceTypeLimitsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInstanceTypeLimits(request);
    }

    @SdkInternalApi
    final DescribeInstanceTypeLimitsResult executeDescribeInstanceTypeLimits(DescribeInstanceTypeLimitsRequest describeInstanceTypeLimitsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInstanceTypeLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstanceTypeLimitsRequest> request = null;
        Response<DescribeInstanceTypeLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstanceTypeLimitsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInstanceTypeLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInstanceTypeLimits");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInstanceTypeLimitsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeInstanceTypeLimitsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DescribeOutboundConnectionsResult describeOutboundConnections(DescribeOutboundConnectionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOutboundConnections(request);
    }

    @SdkInternalApi
    final DescribeOutboundConnectionsResult executeDescribeOutboundConnections(DescribeOutboundConnectionsRequest describeOutboundConnectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOutboundConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOutboundConnectionsRequest> request = null;
        Response<DescribeOutboundConnectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOutboundConnectionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeOutboundConnectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOutboundConnections");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeOutboundConnectionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeOutboundConnectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DescribePackagesResult describePackages(DescribePackagesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePackages(request);
    }

    @SdkInternalApi
    final DescribePackagesResult executeDescribePackages(DescribePackagesRequest describePackagesRequest) {

        ExecutionContext executionContext = createExecutionContext(describePackagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePackagesRequest> request = null;
        Response<DescribePackagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePackagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePackagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePackages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePackagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribePackagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DescribeReservedInstanceOfferingsResult describeReservedInstanceOfferings(DescribeReservedInstanceOfferingsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReservedInstanceOfferings(request);
    }

    @SdkInternalApi
    final DescribeReservedInstanceOfferingsResult executeDescribeReservedInstanceOfferings(
            DescribeReservedInstanceOfferingsRequest describeReservedInstanceOfferingsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReservedInstanceOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedInstanceOfferingsRequest> request = null;
        Response<DescribeReservedInstanceOfferingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedInstanceOfferingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeReservedInstanceOfferingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReservedInstanceOfferings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReservedInstanceOfferingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeReservedInstanceOfferingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DescribeReservedInstancesResult describeReservedInstances(DescribeReservedInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReservedInstances(request);
    }

    @SdkInternalApi
    final DescribeReservedInstancesResult executeDescribeReservedInstances(DescribeReservedInstancesRequest describeReservedInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReservedInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedInstancesRequest> request = null;
        Response<DescribeReservedInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedInstancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeReservedInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReservedInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReservedInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeReservedInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DissociatePackageResult dissociatePackage(DissociatePackageRequest request) {
        request = beforeClientExecution(request);
        return executeDissociatePackage(request);
    }

    @SdkInternalApi
    final DissociatePackageResult executeDissociatePackage(DissociatePackageRequest dissociatePackageRequest) {

        ExecutionContext executionContext = createExecutionContext(dissociatePackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DissociatePackageRequest> request = null;
        Response<DissociatePackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DissociatePackageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(dissociatePackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DissociatePackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DissociatePackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DissociatePackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetCompatibleVersionsResult getCompatibleVersions(GetCompatibleVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetCompatibleVersions(request);
    }

    @SdkInternalApi
    final GetCompatibleVersionsResult executeGetCompatibleVersions(GetCompatibleVersionsRequest getCompatibleVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getCompatibleVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCompatibleVersionsRequest> request = null;
        Response<GetCompatibleVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCompatibleVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCompatibleVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCompatibleVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCompatibleVersionsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetCompatibleVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetPackageVersionHistoryResult getPackageVersionHistory(GetPackageVersionHistoryRequest request) {
        request = beforeClientExecution(request);
        return executeGetPackageVersionHistory(request);
    }

    @SdkInternalApi
    final GetPackageVersionHistoryResult executeGetPackageVersionHistory(GetPackageVersionHistoryRequest getPackageVersionHistoryRequest) {

        ExecutionContext executionContext = createExecutionContext(getPackageVersionHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPackageVersionHistoryRequest> request = null;
        Response<GetPackageVersionHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPackageVersionHistoryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getPackageVersionHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPackageVersionHistory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPackageVersionHistoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetPackageVersionHistoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetUpgradeHistoryResult getUpgradeHistory(GetUpgradeHistoryRequest request) {
        request = beforeClientExecution(request);
        return executeGetUpgradeHistory(request);
    }

    @SdkInternalApi
    final GetUpgradeHistoryResult executeGetUpgradeHistory(GetUpgradeHistoryRequest getUpgradeHistoryRequest) {

        ExecutionContext executionContext = createExecutionContext(getUpgradeHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUpgradeHistoryRequest> request = null;
        Response<GetUpgradeHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUpgradeHistoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUpgradeHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUpgradeHistory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUpgradeHistoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUpgradeHistoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetUpgradeStatusResult getUpgradeStatus(GetUpgradeStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetUpgradeStatus(request);
    }

    @SdkInternalApi
    final GetUpgradeStatusResult executeGetUpgradeStatus(GetUpgradeStatusRequest getUpgradeStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getUpgradeStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUpgradeStatusRequest> request = null;
        Response<GetUpgradeStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUpgradeStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUpgradeStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUpgradeStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUpgradeStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUpgradeStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListDomainNamesResult listDomainNames(ListDomainNamesRequest request) {
        request = beforeClientExecution(request);
        return executeListDomainNames(request);
    }

    @SdkInternalApi
    final ListDomainNamesResult executeListDomainNames(ListDomainNamesRequest listDomainNamesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDomainNamesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainNamesRequest> request = null;
        Response<ListDomainNamesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainNamesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDomainNamesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDomainNames");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDomainNamesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDomainNamesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListDomainsForPackageResult listDomainsForPackage(ListDomainsForPackageRequest request) {
        request = beforeClientExecution(request);
        return executeListDomainsForPackage(request);
    }

    @SdkInternalApi
    final ListDomainsForPackageResult executeListDomainsForPackage(ListDomainsForPackageRequest listDomainsForPackageRequest) {

        ExecutionContext executionContext = createExecutionContext(listDomainsForPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainsForPackageRequest> request = null;
        Response<ListDomainsForPackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainsForPackageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDomainsForPackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDomainsForPackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDomainsForPackageResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListDomainsForPackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListInstanceTypeDetailsResult listInstanceTypeDetails(ListInstanceTypeDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeListInstanceTypeDetails(request);
    }

    @SdkInternalApi
    final ListInstanceTypeDetailsResult executeListInstanceTypeDetails(ListInstanceTypeDetailsRequest listInstanceTypeDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(listInstanceTypeDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstanceTypeDetailsRequest> request = null;
        Response<ListInstanceTypeDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstanceTypeDetailsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listInstanceTypeDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInstanceTypeDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInstanceTypeDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListInstanceTypeDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListPackagesForDomainResult listPackagesForDomain(ListPackagesForDomainRequest request) {
        request = beforeClientExecution(request);
        return executeListPackagesForDomain(request);
    }

    @SdkInternalApi
    final ListPackagesForDomainResult executeListPackagesForDomain(ListPackagesForDomainRequest listPackagesForDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(listPackagesForDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPackagesForDomainRequest> request = null;
        Response<ListPackagesForDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPackagesForDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPackagesForDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPackagesForDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPackagesForDomainResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListPackagesForDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListTagsResult listTags(ListTagsRequest request) {
        request = beforeClientExecution(request);
        return executeListTags(request);
    }

    @SdkInternalApi
    final ListTagsResult executeListTags(ListTagsRequest listTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsRequest> request = null;
        Response<ListTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListVersionsResult listVersions(ListVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListVersions(request);
    }

    @SdkInternalApi
    final ListVersionsResult executeListVersions(ListVersionsRequest listVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVersionsRequest> request = null;
        Response<ListVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public PurchaseReservedInstanceOfferingResult purchaseReservedInstanceOffering(PurchaseReservedInstanceOfferingRequest request) {
        request = beforeClientExecution(request);
        return executePurchaseReservedInstanceOffering(request);
    }

    @SdkInternalApi
    final PurchaseReservedInstanceOfferingResult executePurchaseReservedInstanceOffering(
            PurchaseReservedInstanceOfferingRequest purchaseReservedInstanceOfferingRequest) {

        ExecutionContext executionContext = createExecutionContext(purchaseReservedInstanceOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurchaseReservedInstanceOfferingRequest> request = null;
        Response<PurchaseReservedInstanceOfferingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PurchaseReservedInstanceOfferingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(purchaseReservedInstanceOfferingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PurchaseReservedInstanceOffering");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PurchaseReservedInstanceOfferingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PurchaseReservedInstanceOfferingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public RejectInboundConnectionResult rejectInboundConnection(RejectInboundConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeRejectInboundConnection(request);
    }

    @SdkInternalApi
    final RejectInboundConnectionResult executeRejectInboundConnection(RejectInboundConnectionRequest rejectInboundConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(rejectInboundConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectInboundConnectionRequest> request = null;
        Response<RejectInboundConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectInboundConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(rejectInboundConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RejectInboundConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RejectInboundConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RejectInboundConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public RemoveTagsResult removeTags(RemoveTagsRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveTags(request);
    }

    @SdkInternalApi
    final RemoveTagsResult executeRemoveTags(RemoveTagsRequest removeTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(removeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsRequest> request = null;
        Response<RemoveTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemoveTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public StartServiceSoftwareUpdateResult startServiceSoftwareUpdate(StartServiceSoftwareUpdateRequest request) {
        request = beforeClientExecution(request);
        return executeStartServiceSoftwareUpdate(request);
    }

    @SdkInternalApi
    final StartServiceSoftwareUpdateResult executeStartServiceSoftwareUpdate(StartServiceSoftwareUpdateRequest startServiceSoftwareUpdateRequest) {

        ExecutionContext executionContext = createExecutionContext(startServiceSoftwareUpdateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartServiceSoftwareUpdateRequest> request = null;
        Response<StartServiceSoftwareUpdateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartServiceSoftwareUpdateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startServiceSoftwareUpdateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartServiceSoftwareUpdate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartServiceSoftwareUpdateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartServiceSoftwareUpdateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public UpdateDomainConfigResult updateDomainConfig(UpdateDomainConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDomainConfig(request);
    }

    @SdkInternalApi
    final UpdateDomainConfigResult executeUpdateDomainConfig(UpdateDomainConfigRequest updateDomainConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDomainConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainConfigRequest> request = null;
        Response<UpdateDomainConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDomainConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDomainConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDomainConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDomainConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public UpdatePackageResult updatePackage(UpdatePackageRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePackage(request);
    }

    @SdkInternalApi
    final UpdatePackageResult executeUpdatePackage(UpdatePackageRequest updatePackageRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePackageRequest> request = null;
        Response<UpdatePackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePackageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePackage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePackageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePackageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public UpgradeDomainResult upgradeDomain(UpgradeDomainRequest request) {
        request = beforeClientExecution(request);
        return executeUpgradeDomain(request);
    }

    @SdkInternalApi
    final UpgradeDomainResult executeUpgradeDomain(UpgradeDomainRequest upgradeDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(upgradeDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpgradeDomainRequest> request = null;
        Response<UpgradeDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpgradeDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(upgradeDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpenSearch");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpgradeDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpgradeDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpgradeDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

}

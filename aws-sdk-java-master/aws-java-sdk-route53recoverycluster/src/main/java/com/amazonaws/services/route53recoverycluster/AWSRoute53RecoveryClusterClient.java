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
package com.amazonaws.services.route53recoverycluster;

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

import com.amazonaws.services.route53recoverycluster.AWSRoute53RecoveryClusterClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.route53recoverycluster.model.*;
import com.amazonaws.services.route53recoverycluster.model.transform.*;

/**
 * Client for accessing Route53 Recovery Cluster. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Welcome to the Amazon Route 53 Application Recovery Controller API Reference Guide for Recovery Control Data Plane .
 * </p>
 * <p>
 * Recovery control in Route 53 Application Recovery Controller includes extremely reliable routing controls that enable
 * you to recover applications by rerouting traffic, for example, across Availability Zones or AWS Regions. Routing
 * controls are simple on/off switches hosted on a cluster. A cluster is a set of five redundant regional endpoints
 * against which you can execute API calls to update or get the state of routing controls. You use routing controls to
 * failover traffic to recover your application across Availability Zones or Regions.
 * </p>
 * <p>
 * This API guide includes information about how to get and update routing control states in Route 53 Application
 * Recovery Controller.
 * </p>
 * <p>
 * For more information about Route 53 Application Recovery Controller, see the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You can create clusters, routing controls, and control panels by using the control plane API for Recovery Control.
 * For more information, see <a href="https://docs.aws.amazon.com/recovery-cluster/latest/api/">Amazon Route 53
 * Application Recovery Controller Recovery Control API Reference</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Route 53 Application Recovery Controller also provides continuous readiness checks to ensure that your applications
 * are scaled to handle failover traffic. For more information about the related API actions, see <a
 * href="https://docs.aws.amazon.com/recovery-readiness/latest/api/">Amazon Route 53 Application Recovery Controller
 * Recovery Readiness API Reference</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For more information about creating resilient applications and preparing for recovery readiness with Route 53
 * Application Recovery Controller, see the <a href="r53recovery/latest/dg/">Amazon Route 53 Application Recovery
 * Controller Developer Guide</a>.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSRoute53RecoveryClusterClient extends AmazonWebServiceClient implements AWSRoute53RecoveryCluster {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSRoute53RecoveryCluster.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "route53-recovery-cluster";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53recoverycluster.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53recoverycluster.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53recoverycluster.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53recoverycluster.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EndpointTemporarilyUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53recoverycluster.model.transform.EndpointTemporarilyUnavailableExceptionUnmarshaller
                                            .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53recoverycluster.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53recoverycluster.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.route53recoverycluster.model.AWSRoute53RecoveryClusterException.class));

    public static AWSRoute53RecoveryClusterClientBuilder builder() {
        return AWSRoute53RecoveryClusterClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Route53 Recovery Cluster using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSRoute53RecoveryClusterClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Route53 Recovery Cluster using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSRoute53RecoveryClusterClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("route53-recovery-cluster.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/route53recoverycluster/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/route53recoverycluster/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Get the state for a routing control. A routing control is a simple on/off switch that you can use to route
     * traffic to cells. When the state is On, traffic flows to a cell. When it's off, traffic does not flow.
     * </p>
     * <p>
     * Before you can create a routing control, you first must create a cluster to host the control. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/recovery-cluster/latest/api/cluster.html">CreateCluster</a>. Access one of the
     * endpoints for the cluster to get or update the routing control state to redirect traffic.
     * </p>
     * <p>
     * For more information about working with routing controls, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.html">Routing control</a> in the Route 53
     * Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param getRoutingControlStateRequest
     * @return Result of the GetRoutingControlState operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to query the routing control state.
     * @throws InternalServerException
     *         There was an unexpected error during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a routing control that was not found.
     * @throws ValidationException
     *         There was a validation error on the request.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @throws EndpointTemporarilyUnavailableException
     *         The cluster endpoint isn't available. Try another cluster endpoint.
     * @sample AWSRoute53RecoveryCluster.GetRoutingControlState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/GetRoutingControlState"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRoutingControlStateResult getRoutingControlState(GetRoutingControlStateRequest request) {
        request = beforeClientExecution(request);
        return executeGetRoutingControlState(request);
    }

    @SdkInternalApi
    final GetRoutingControlStateResult executeGetRoutingControlState(GetRoutingControlStateRequest getRoutingControlStateRequest) {

        ExecutionContext executionContext = createExecutionContext(getRoutingControlStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRoutingControlStateRequest> request = null;
        Response<GetRoutingControlStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRoutingControlStateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRoutingControlStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Cluster");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRoutingControlState");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRoutingControlStateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRoutingControlStateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Set the state of the routing control to reroute traffic. You can set the value to be On or Off. When the state is
     * On, traffic flows to a cell. When it's off, traffic does not flow.
     * </p>
     * <p>
     * For more information about working with routing controls, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.html">Routing control</a> in the Route 53
     * Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param updateRoutingControlStateRequest
     * @return Result of the UpdateRoutingControlState operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to query the routing control state.
     * @throws InternalServerException
     *         There was an unexpected error during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a routing control that was not found.
     * @throws ValidationException
     *         There was a validation error on the request.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @throws EndpointTemporarilyUnavailableException
     *         The cluster endpoint isn't available. Try another cluster endpoint.
     * @throws ConflictException
     *         There was a conflict with this request. Try again.
     * @sample AWSRoute53RecoveryCluster.UpdateRoutingControlState
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/UpdateRoutingControlState"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRoutingControlStateResult updateRoutingControlState(UpdateRoutingControlStateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRoutingControlState(request);
    }

    @SdkInternalApi
    final UpdateRoutingControlStateResult executeUpdateRoutingControlState(UpdateRoutingControlStateRequest updateRoutingControlStateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRoutingControlStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRoutingControlStateRequest> request = null;
        Response<UpdateRoutingControlStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRoutingControlStateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateRoutingControlStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Cluster");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRoutingControlState");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRoutingControlStateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateRoutingControlStateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Set multiple routing control states. You can set the value for each state to be On or Off. When the state is On,
     * traffic flows to a cell. When it's off, traffic does not flow.
     * </p>
     * <p>
     * For more information about working with routing controls, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.html">Routing control</a> in the Route 53
     * Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param updateRoutingControlStatesRequest
     * @return Result of the UpdateRoutingControlStates operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to query the routing control state.
     * @throws InternalServerException
     *         There was an unexpected error during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a routing control that was not found.
     * @throws ValidationException
     *         There was a validation error on the request.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @throws EndpointTemporarilyUnavailableException
     *         The cluster endpoint isn't available. Try another cluster endpoint.
     * @throws ConflictException
     *         There was a conflict with this request. Try again.
     * @sample AWSRoute53RecoveryCluster.UpdateRoutingControlStates
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/UpdateRoutingControlStates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRoutingControlStatesResult updateRoutingControlStates(UpdateRoutingControlStatesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRoutingControlStates(request);
    }

    @SdkInternalApi
    final UpdateRoutingControlStatesResult executeUpdateRoutingControlStates(UpdateRoutingControlStatesRequest updateRoutingControlStatesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRoutingControlStatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRoutingControlStatesRequest> request = null;
        Response<UpdateRoutingControlStatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRoutingControlStatesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateRoutingControlStatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Cluster");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRoutingControlStates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRoutingControlStatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateRoutingControlStatesResultJsonUnmarshaller());
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

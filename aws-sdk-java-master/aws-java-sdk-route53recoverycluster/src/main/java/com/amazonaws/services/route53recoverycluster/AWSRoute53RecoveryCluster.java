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

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.route53recoverycluster.model.*;

/**
 * Interface for accessing Route53 Recovery Cluster.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.route53recoverycluster.AbstractAWSRoute53RecoveryCluster} instead.
 * </p>
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRoute53RecoveryCluster {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "route53-recovery-cluster";

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
    GetRoutingControlStateResult getRoutingControlState(GetRoutingControlStateRequest getRoutingControlStateRequest);

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
    UpdateRoutingControlStateResult updateRoutingControlState(UpdateRoutingControlStateRequest updateRoutingControlStateRequest);

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
    UpdateRoutingControlStatesResult updateRoutingControlStates(UpdateRoutingControlStatesRequest updateRoutingControlStatesRequest);

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

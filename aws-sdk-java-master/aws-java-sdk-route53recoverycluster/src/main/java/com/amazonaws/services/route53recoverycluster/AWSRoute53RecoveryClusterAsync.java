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

import com.amazonaws.services.route53recoverycluster.model.*;

/**
 * Interface for accessing Route53 Recovery Cluster asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.route53recoverycluster.AbstractAWSRoute53RecoveryClusterAsync} instead.
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
public interface AWSRoute53RecoveryClusterAsync extends AWSRoute53RecoveryCluster {

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
     * @return A Java Future containing the result of the GetRoutingControlState operation returned by the service.
     * @sample AWSRoute53RecoveryClusterAsync.GetRoutingControlState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/GetRoutingControlState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRoutingControlStateResult> getRoutingControlStateAsync(GetRoutingControlStateRequest getRoutingControlStateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRoutingControlState operation returned by the service.
     * @sample AWSRoute53RecoveryClusterAsyncHandler.GetRoutingControlState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/GetRoutingControlState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRoutingControlStateResult> getRoutingControlStateAsync(GetRoutingControlStateRequest getRoutingControlStateRequest,
            com.amazonaws.handlers.AsyncHandler<GetRoutingControlStateRequest, GetRoutingControlStateResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateRoutingControlState operation returned by the service.
     * @sample AWSRoute53RecoveryClusterAsync.UpdateRoutingControlState
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/UpdateRoutingControlState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoutingControlStateResult> updateRoutingControlStateAsync(
            UpdateRoutingControlStateRequest updateRoutingControlStateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRoutingControlState operation returned by the service.
     * @sample AWSRoute53RecoveryClusterAsyncHandler.UpdateRoutingControlState
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/UpdateRoutingControlState"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoutingControlStateResult> updateRoutingControlStateAsync(
            UpdateRoutingControlStateRequest updateRoutingControlStateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRoutingControlStateRequest, UpdateRoutingControlStateResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateRoutingControlStates operation returned by the service.
     * @sample AWSRoute53RecoveryClusterAsync.UpdateRoutingControlStates
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/UpdateRoutingControlStates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoutingControlStatesResult> updateRoutingControlStatesAsync(
            UpdateRoutingControlStatesRequest updateRoutingControlStatesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRoutingControlStates operation returned by the service.
     * @sample AWSRoute53RecoveryClusterAsyncHandler.UpdateRoutingControlStates
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/UpdateRoutingControlStates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoutingControlStatesResult> updateRoutingControlStatesAsync(
            UpdateRoutingControlStatesRequest updateRoutingControlStatesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRoutingControlStatesRequest, UpdateRoutingControlStatesResult> asyncHandler);

}

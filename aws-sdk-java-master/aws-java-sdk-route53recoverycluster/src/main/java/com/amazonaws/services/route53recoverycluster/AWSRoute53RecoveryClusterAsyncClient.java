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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Route53 Recovery Cluster asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
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
public class AWSRoute53RecoveryClusterAsyncClient extends AWSRoute53RecoveryClusterClient implements AWSRoute53RecoveryClusterAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSRoute53RecoveryClusterAsyncClientBuilder asyncBuilder() {
        return AWSRoute53RecoveryClusterAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Route53 Recovery Cluster using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSRoute53RecoveryClusterAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Route53 Recovery Cluster using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSRoute53RecoveryClusterAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<GetRoutingControlStateResult> getRoutingControlStateAsync(GetRoutingControlStateRequest request) {

        return getRoutingControlStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRoutingControlStateResult> getRoutingControlStateAsync(final GetRoutingControlStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRoutingControlStateRequest, GetRoutingControlStateResult> asyncHandler) {
        final GetRoutingControlStateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRoutingControlStateResult>() {
            @Override
            public GetRoutingControlStateResult call() throws Exception {
                GetRoutingControlStateResult result = null;

                try {
                    result = executeGetRoutingControlState(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingControlStateResult> updateRoutingControlStateAsync(UpdateRoutingControlStateRequest request) {

        return updateRoutingControlStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingControlStateResult> updateRoutingControlStateAsync(final UpdateRoutingControlStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRoutingControlStateRequest, UpdateRoutingControlStateResult> asyncHandler) {
        final UpdateRoutingControlStateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRoutingControlStateResult>() {
            @Override
            public UpdateRoutingControlStateResult call() throws Exception {
                UpdateRoutingControlStateResult result = null;

                try {
                    result = executeUpdateRoutingControlState(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingControlStatesResult> updateRoutingControlStatesAsync(UpdateRoutingControlStatesRequest request) {

        return updateRoutingControlStatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingControlStatesResult> updateRoutingControlStatesAsync(final UpdateRoutingControlStatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRoutingControlStatesRequest, UpdateRoutingControlStatesResult> asyncHandler) {
        final UpdateRoutingControlStatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRoutingControlStatesResult>() {
            @Override
            public UpdateRoutingControlStatesResult call() throws Exception {
                UpdateRoutingControlStatesResult result = null;

                try {
                    result = executeUpdateRoutingControlStates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}

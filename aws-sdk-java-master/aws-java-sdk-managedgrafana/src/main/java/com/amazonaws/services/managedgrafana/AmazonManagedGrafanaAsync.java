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
package com.amazonaws.services.managedgrafana;

import javax.annotation.Generated;

import com.amazonaws.services.managedgrafana.model.*;

/**
 * Interface for accessing Amazon Managed Grafana asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.managedgrafana.AbstractAmazonManagedGrafanaAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Managed Grafana is a fully managed and secure data visualization service that you can use to instantly query,
 * correlate, and visualize operational metrics, logs, and traces from multiple sources. Amazon Managed Grafana makes it
 * easy to deploy, operate, and scale Grafana, a widely deployed data visualization tool that is popular for its
 * extensible data support.
 * </p>
 * <p>
 * With Amazon Managed Grafana, you create logically isolated Grafana servers called <i>workspaces</i>. In a workspace,
 * you can create Grafana dashboards and visualizations to analyze your metrics, logs, and traces without having to
 * build, package, or deploy any hardware to run Grafana servers.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonManagedGrafanaAsync extends AmazonManagedGrafana {

    /**
     * <p>
     * Assigns a Grafana Enterprise license to a workspace. Upgrading to Grafana Enterprise incurs additional fees. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/upgrade-to-Grafana-Enterprise.html">Upgrade a
     * workspace to Grafana Enterprise</a>.
     * </p>
     * 
     * @param associateLicenseRequest
     * @return A Java Future containing the result of the AssociateLicense operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.AssociateLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/AssociateLicense" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateLicenseResult> associateLicenseAsync(AssociateLicenseRequest associateLicenseRequest);

    /**
     * <p>
     * Assigns a Grafana Enterprise license to a workspace. Upgrading to Grafana Enterprise incurs additional fees. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/upgrade-to-Grafana-Enterprise.html">Upgrade a
     * workspace to Grafana Enterprise</a>.
     * </p>
     * 
     * @param associateLicenseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateLicense operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.AssociateLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/AssociateLicense" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateLicenseResult> associateLicenseAsync(AssociateLicenseRequest associateLicenseRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateLicenseRequest, AssociateLicenseResult> asyncHandler);

    /**
     * <p>
     * Creates a <i>workspace</i>. In a workspace, you can create Grafana dashboards and visualizations to analyze your
     * metrics, logs, and traces. You don't have to build, package, or deploy any hardware to run the Grafana server.
     * </p>
     * <p>
     * Don't use <code>CreateWorkspace</code> to modify an existing workspace. Instead, use <a
     * href="https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateWorkspace.html">UpdateWorkspace</a>.
     * </p>
     * 
     * @param createWorkspaceRequest
     * @return A Java Future containing the result of the CreateWorkspace operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.CreateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspaceResult> createWorkspaceAsync(CreateWorkspaceRequest createWorkspaceRequest);

    /**
     * <p>
     * Creates a <i>workspace</i>. In a workspace, you can create Grafana dashboards and visualizations to analyze your
     * metrics, logs, and traces. You don't have to build, package, or deploy any hardware to run the Grafana server.
     * </p>
     * <p>
     * Don't use <code>CreateWorkspace</code> to modify an existing workspace. Instead, use <a
     * href="https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateWorkspace.html">UpdateWorkspace</a>.
     * </p>
     * 
     * @param createWorkspaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkspace operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.CreateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkspaceResult> createWorkspaceAsync(CreateWorkspaceRequest createWorkspaceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkspaceRequest, CreateWorkspaceResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param deleteWorkspaceRequest
     * @return A Java Future containing the result of the DeleteWorkspace operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.DeleteWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DeleteWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkspaceResult> deleteWorkspaceAsync(DeleteWorkspaceRequest deleteWorkspaceRequest);

    /**
     * <p>
     * Deletes an Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param deleteWorkspaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkspace operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.DeleteWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DeleteWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkspaceResult> deleteWorkspaceAsync(DeleteWorkspaceRequest deleteWorkspaceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkspaceRequest, DeleteWorkspaceResult> asyncHandler);

    /**
     * <p>
     * Displays information about one Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param describeWorkspaceRequest
     * @return A Java Future containing the result of the DescribeWorkspace operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.DescribeWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DescribeWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceResult> describeWorkspaceAsync(DescribeWorkspaceRequest describeWorkspaceRequest);

    /**
     * <p>
     * Displays information about one Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param describeWorkspaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkspace operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.DescribeWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DescribeWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceResult> describeWorkspaceAsync(DescribeWorkspaceRequest describeWorkspaceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceRequest, DescribeWorkspaceResult> asyncHandler);

    /**
     * <p>
     * Displays information about the authentication methods used in one Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param describeWorkspaceAuthenticationRequest
     * @return A Java Future containing the result of the DescribeWorkspaceAuthentication operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsync.DescribeWorkspaceAuthentication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DescribeWorkspaceAuthentication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceAuthenticationResult> describeWorkspaceAuthenticationAsync(
            DescribeWorkspaceAuthenticationRequest describeWorkspaceAuthenticationRequest);

    /**
     * <p>
     * Displays information about the authentication methods used in one Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param describeWorkspaceAuthenticationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkspaceAuthentication operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsyncHandler.DescribeWorkspaceAuthentication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DescribeWorkspaceAuthentication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkspaceAuthenticationResult> describeWorkspaceAuthenticationAsync(
            DescribeWorkspaceAuthenticationRequest describeWorkspaceAuthenticationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceAuthenticationRequest, DescribeWorkspaceAuthenticationResult> asyncHandler);

    /**
     * <p>
     * Removes the Grafana Enterprise license from a workspace.
     * </p>
     * 
     * @param disassociateLicenseRequest
     * @return A Java Future containing the result of the DisassociateLicense operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.DisassociateLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DisassociateLicense" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateLicenseResult> disassociateLicenseAsync(DisassociateLicenseRequest disassociateLicenseRequest);

    /**
     * <p>
     * Removes the Grafana Enterprise license from a workspace.
     * </p>
     * 
     * @param disassociateLicenseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateLicense operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.DisassociateLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DisassociateLicense" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateLicenseResult> disassociateLicenseAsync(DisassociateLicenseRequest disassociateLicenseRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateLicenseRequest, DisassociateLicenseResult> asyncHandler);

    /**
     * <p>
     * Lists the users and groups who have the Grafana <code>Admin</code> and <code>Editor</code> roles in this
     * workspace. If you use this operation without specifying <code>userId</code> or <code>groupId</code>, the
     * operation returns the roles of all users and groups. If you specify a <code>userId</code> or a
     * <code>groupId</code>, only the roles for that user or group are returned. If you do this, you can specify only
     * one <code>userId</code> or one <code>groupId</code>.
     * </p>
     * 
     * @param listPermissionsRequest
     * @return A Java Future containing the result of the ListPermissions operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.ListPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListPermissions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest listPermissionsRequest);

    /**
     * <p>
     * Lists the users and groups who have the Grafana <code>Admin</code> and <code>Editor</code> roles in this
     * workspace. If you use this operation without specifying <code>userId</code> or <code>groupId</code>, the
     * operation returns the roles of all users and groups. If you specify a <code>userId</code> or a
     * <code>groupId</code>, only the roles for that user or group are returned. If you do this, you can specify only
     * one <code>userId</code> or one <code>groupId</code>.
     * </p>
     * 
     * @param listPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPermissions operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.ListPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListPermissions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest listPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPermissionsRequest, ListPermissionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of Amazon Managed Grafana workspaces in the account, with some information about each workspace.
     * For more complete information about one workspace, use <a
     * href="https://docs.aws.amazon.com/AAMG/latest/APIReference/API_DescribeWorkspace.html">DescribeWorkspace</a>.
     * </p>
     * 
     * @param listWorkspacesRequest
     * @return A Java Future containing the result of the ListWorkspaces operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.ListWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkspacesResult> listWorkspacesAsync(ListWorkspacesRequest listWorkspacesRequest);

    /**
     * <p>
     * Returns a list of Amazon Managed Grafana workspaces in the account, with some information about each workspace.
     * For more complete information about one workspace, use <a
     * href="https://docs.aws.amazon.com/AAMG/latest/APIReference/API_DescribeWorkspace.html">DescribeWorkspace</a>.
     * </p>
     * 
     * @param listWorkspacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkspaces operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.ListWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkspacesResult> listWorkspacesAsync(ListWorkspacesRequest listWorkspacesRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkspacesRequest, ListWorkspacesResult> asyncHandler);

    /**
     * <p>
     * Updates which users in a workspace have the Grafana <code>Admin</code> or <code>Editor</code> roles.
     * </p>
     * 
     * @param updatePermissionsRequest
     * @return A Java Future containing the result of the UpdatePermissions operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.UpdatePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdatePermissions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePermissionsResult> updatePermissionsAsync(UpdatePermissionsRequest updatePermissionsRequest);

    /**
     * <p>
     * Updates which users in a workspace have the Grafana <code>Admin</code> or <code>Editor</code> roles.
     * </p>
     * 
     * @param updatePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePermissions operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.UpdatePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdatePermissions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePermissionsResult> updatePermissionsAsync(UpdatePermissionsRequest updatePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePermissionsRequest, UpdatePermissionsResult> asyncHandler);

    /**
     * <p>
     * Modifies an existing Amazon Managed Grafana workspace. If you use this operation and omit any optional
     * parameters, the existing values of those parameters are not changed.
     * </p>
     * <p>
     * To modify the user authentication methods that the workspace uses, such as SAML or Amazon Web Services SSO, use
     * <a href="https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateWorkspaceAuthentication.html">
     * UpdateWorkspaceAuthentication</a>.
     * </p>
     * <p>
     * To modify which users in the workspace have the <code>Admin</code> and <code>Editor</code> Grafana roles, use <a
     * href="https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdatePermissions.html">UpdatePermissions</a>.
     * </p>
     * 
     * @param updateWorkspaceRequest
     * @return A Java Future containing the result of the UpdateWorkspace operation returned by the service.
     * @sample AmazonManagedGrafanaAsync.UpdateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdateWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkspaceResult> updateWorkspaceAsync(UpdateWorkspaceRequest updateWorkspaceRequest);

    /**
     * <p>
     * Modifies an existing Amazon Managed Grafana workspace. If you use this operation and omit any optional
     * parameters, the existing values of those parameters are not changed.
     * </p>
     * <p>
     * To modify the user authentication methods that the workspace uses, such as SAML or Amazon Web Services SSO, use
     * <a href="https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateWorkspaceAuthentication.html">
     * UpdateWorkspaceAuthentication</a>.
     * </p>
     * <p>
     * To modify which users in the workspace have the <code>Admin</code> and <code>Editor</code> Grafana roles, use <a
     * href="https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdatePermissions.html">UpdatePermissions</a>.
     * </p>
     * 
     * @param updateWorkspaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkspace operation returned by the service.
     * @sample AmazonManagedGrafanaAsyncHandler.UpdateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdateWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkspaceResult> updateWorkspaceAsync(UpdateWorkspaceRequest updateWorkspaceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceRequest, UpdateWorkspaceResult> asyncHandler);

    /**
     * <p>
     * Use this operation to define the identity provider (IdP) that this workspace authenticates users from, using
     * SAML. You can also map SAML assertion attributes to workspace user information and define which groups in the
     * assertion attribute are to have the <code>Admin</code> and <code>Editor</code> roles in the workspace.
     * </p>
     * 
     * @param updateWorkspaceAuthenticationRequest
     * @return A Java Future containing the result of the UpdateWorkspaceAuthentication operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsync.UpdateWorkspaceAuthentication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdateWorkspaceAuthentication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkspaceAuthenticationResult> updateWorkspaceAuthenticationAsync(
            UpdateWorkspaceAuthenticationRequest updateWorkspaceAuthenticationRequest);

    /**
     * <p>
     * Use this operation to define the identity provider (IdP) that this workspace authenticates users from, using
     * SAML. You can also map SAML assertion attributes to workspace user information and define which groups in the
     * assertion attribute are to have the <code>Admin</code> and <code>Editor</code> roles in the workspace.
     * </p>
     * 
     * @param updateWorkspaceAuthenticationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkspaceAuthentication operation returned by the
     *         service.
     * @sample AmazonManagedGrafanaAsyncHandler.UpdateWorkspaceAuthentication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdateWorkspaceAuthentication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkspaceAuthenticationResult> updateWorkspaceAuthenticationAsync(
            UpdateWorkspaceAuthenticationRequest updateWorkspaceAuthenticationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceAuthenticationRequest, UpdateWorkspaceAuthenticationResult> asyncHandler);

}

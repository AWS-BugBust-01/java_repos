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
package com.amazonaws.services.transfer;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.transfer.model.*;

/**
 * Interface for accessing AWS Transfer.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.transfer.AbstractAWSTransfer} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services Transfer Family is a fully managed service that enables the transfer of files over the File
 * Transfer Protocol (FTP), File Transfer Protocol over SSL (FTPS), or Secure Shell (SSH) File Transfer Protocol (SFTP)
 * directly into and out of Amazon Simple Storage Service (Amazon S3). Amazon Web Services helps you seamlessly migrate
 * your file transfer workflows to Amazon Web Services Transfer Family by integrating with existing authentication
 * systems, and providing DNS routing with Amazon Route 53 so nothing changes for your customers and partners, or their
 * applications. With your data in Amazon S3, you can use it with Amazon Web Services services for processing,
 * analytics, machine learning, and archiving. Getting started with Amazon Web Services Transfer Family is easy since
 * there is no infrastructure to buy and set up.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSTransfer {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "transfer";

    /**
     * <p>
     * Used by administrators to choose which groups in the directory should have access to upload and download files
     * over the enabled protocols using Amazon Web Services Transfer Family. For example, a Microsoft Active Directory
     * might contain 50,000 users, but only a small fraction might need the ability to transfer files to the server. An
     * administrator can use <code>CreateAccess</code> to limit the access to the correct set of users who need this
     * ability.
     * </p>
     * 
     * @param createAccessRequest
     * @return Result of the CreateAccess operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.CreateAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateAccess" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAccessResult createAccess(CreateAccessRequest createAccessRequest);

    /**
     * <p>
     * Instantiates an auto-scaling virtual server based on the selected file transfer protocol in Amazon Web Services.
     * When you make updates to your file transfer protocol-enabled server or when you work with users, use the
     * service-generated <code>ServerId</code> property that is assigned to the newly created server.
     * </p>
     * 
     * @param createServerRequest
     * @return Result of the CreateServer operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.</p>
     *         <p>
     *         HTTP Status Code: 400
     * @sample AWSTransfer.CreateServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateServer" target="_top">AWS API
     *      Documentation</a>
     */
    CreateServerResult createServer(CreateServerRequest createServerRequest);

    /**
     * <p>
     * Creates a user and associates them with an existing file transfer protocol-enabled server. You can only create
     * and associate users with servers that have the <code>IdentityProviderType</code> set to
     * <code>SERVICE_MANAGED</code>. Using parameters for <code>CreateUser</code>, you can specify the user name, set
     * the home directory, store the user's public key, and assign the user's Amazon Web Services Identity and Access
     * Management (IAM) role. You can also optionally add a session policy, and assign metadata with tags that can be
     * used to group and search for users.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Allows you to create a workflow with specified steps and step details the workflow invokes after file transfer
     * completes. After creating a workflow, you can associate the workflow created with any transfer servers by
     * specifying the <code>workflow-details</code> field in <code>CreateServer</code> and <code>UpdateServer</code>
     * operations.
     * </p>
     * 
     * @param createWorkflowRequest
     * @return Result of the CreateWorkflow operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.</p>
     *         <p>
     *         HTTP Status Code: 400
     * @sample AWSTransfer.CreateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/CreateWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    CreateWorkflowResult createWorkflow(CreateWorkflowRequest createWorkflowRequest);

    /**
     * <p>
     * Allows you to delete the access specified in the <code>ServerID</code> and <code>ExternalID</code> parameters.
     * </p>
     * 
     * @param deleteAccessRequest
     * @return Result of the DeleteAccess operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DeleteAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteAccess" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAccessResult deleteAccess(DeleteAccessRequest deleteAccessRequest);

    /**
     * <p>
     * Deletes the file transfer protocol-enabled server that you specify.
     * </p>
     * <p>
     * No response returns from this operation.
     * </p>
     * 
     * @param deleteServerRequest
     * @return Result of the DeleteServer operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DeleteServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteServer" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteServerResult deleteServer(DeleteServerRequest deleteServerRequest);

    /**
     * <p>
     * Deletes a user's Secure Shell (SSH) public key.
     * </p>
     * 
     * @param deleteSshPublicKeyRequest
     * @return Result of the DeleteSshPublicKey operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.</p>
     *         <p>
     *         HTTP Status Code: 400
     * @sample AWSTransfer.DeleteSshPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteSshPublicKey" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteSshPublicKeyResult deleteSshPublicKey(DeleteSshPublicKeyRequest deleteSshPublicKeyRequest);

    /**
     * <p>
     * Deletes the user belonging to a file transfer protocol-enabled server you specify.
     * </p>
     * <p>
     * No response returns from this operation.
     * </p>
     * <note>
     * <p>
     * When you delete a user from a server, the user's information is lost.
     * </p>
     * </note>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Deletes the specified workflow.
     * </p>
     * 
     * @param deleteWorkflowRequest
     * @return Result of the DeleteWorkflow operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DeleteWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteWorkflowResult deleteWorkflow(DeleteWorkflowRequest deleteWorkflowRequest);

    /**
     * <p>
     * Describes the access that is assigned to the specific file transfer protocol-enabled server, as identified by its
     * <code>ServerId</code> property and its <code>ExternalID</code>.
     * </p>
     * <p>
     * The response from this call returns the properties of the access that is associated with the
     * <code>ServerId</code> value that was specified.
     * </p>
     * 
     * @param describeAccessRequest
     * @return Result of the DescribeAccess operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeAccess" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAccessResult describeAccess(DescribeAccessRequest describeAccessRequest);

    /**
     * <p>
     * You can use <code>DescribeExecution</code> to check the details of the execution of the specified workflow.
     * </p>
     * 
     * @param describeExecutionRequest
     * @return Result of the DescribeExecution operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeExecution" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeExecutionResult describeExecution(DescribeExecutionRequest describeExecutionRequest);

    /**
     * <p>
     * Describes the security policy that is attached to your file transfer protocol-enabled server. The response
     * contains a description of the security policy's properties. For more information about security policies, see <a
     * href="https://docs.aws.amazon.com/transfer/latest/userguide/security-policies.html">Working with security
     * policies</a>.
     * </p>
     * 
     * @param describeSecurityPolicyRequest
     * @return Result of the DescribeSecurityPolicy operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeSecurityPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeSecurityPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSecurityPolicyResult describeSecurityPolicy(DescribeSecurityPolicyRequest describeSecurityPolicyRequest);

    /**
     * <p>
     * Describes a file transfer protocol-enabled server that you specify by passing the <code>ServerId</code>
     * parameter.
     * </p>
     * <p>
     * The response contains a description of a server's properties. When you set <code>EndpointType</code> to VPC, the
     * response will contain the <code>EndpointDetails</code>.
     * </p>
     * 
     * @param describeServerRequest
     * @return Result of the DescribeServer operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeServer" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeServerResult describeServer(DescribeServerRequest describeServerRequest);

    /**
     * <p>
     * Describes the user assigned to the specific file transfer protocol-enabled server, as identified by its
     * <code>ServerId</code> property.
     * </p>
     * <p>
     * The response from this call returns the properties of the user associated with the <code>ServerId</code> value
     * that was specified.
     * </p>
     * 
     * @param describeUserRequest
     * @return Result of the DescribeUser operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeUserResult describeUser(DescribeUserRequest describeUserRequest);

    /**
     * <p>
     * Describes the specified workflow.
     * </p>
     * 
     * @param describeWorkflowRequest
     * @return Result of the DescribeWorkflow operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.DescribeWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeWorkflowResult describeWorkflow(DescribeWorkflowRequest describeWorkflowRequest);

    /**
     * <p>
     * Adds a Secure Shell (SSH) public key to a user account identified by a <code>UserName</code> value assigned to
     * the specific file transfer protocol-enabled server, identified by <code>ServerId</code>.
     * </p>
     * <p>
     * The response returns the <code>UserName</code> value, the <code>ServerId</code> value, and the name of the
     * <code>SshPublicKeyId</code>.
     * </p>
     * 
     * @param importSshPublicKeyRequest
     * @return Result of the ImportSshPublicKey operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.</p>
     *         <p>
     *         HTTP Status Code: 400
     * @sample AWSTransfer.ImportSshPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ImportSshPublicKey" target="_top">AWS
     *      API Documentation</a>
     */
    ImportSshPublicKeyResult importSshPublicKey(ImportSshPublicKeyRequest importSshPublicKeyRequest);

    /**
     * <p>
     * Lists the details for all the accesses you have on your server.
     * </p>
     * 
     * @param listAccessesRequest
     * @return Result of the ListAccesses operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ListAccesses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListAccesses" target="_top">AWS API
     *      Documentation</a>
     */
    ListAccessesResult listAccesses(ListAccessesRequest listAccessesRequest);

    /**
     * <p>
     * Lists all executions for the specified workflow.
     * </p>
     * 
     * @param listExecutionsRequest
     * @return Result of the ListExecutions operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ListExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListExecutions" target="_top">AWS API
     *      Documentation</a>
     */
    ListExecutionsResult listExecutions(ListExecutionsRequest listExecutionsRequest);

    /**
     * <p>
     * Lists the security policies that are attached to your file transfer protocol-enabled servers.
     * </p>
     * 
     * @param listSecurityPoliciesRequest
     * @return Result of the ListSecurityPolicies operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @sample AWSTransfer.ListSecurityPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListSecurityPolicies" target="_top">AWS
     *      API Documentation</a>
     */
    ListSecurityPoliciesResult listSecurityPolicies(ListSecurityPoliciesRequest listSecurityPoliciesRequest);

    /**
     * <p>
     * Lists the file transfer protocol-enabled servers that are associated with your Amazon Web Services account.
     * </p>
     * 
     * @param listServersRequest
     * @return Result of the ListServers operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @sample AWSTransfer.ListServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListServers" target="_top">AWS API
     *      Documentation</a>
     */
    ListServersResult listServers(ListServersRequest listServersRequest);

    /**
     * <p>
     * Lists all of the tags associated with the Amazon Resource Name (ARN) that you specify. The resource can be a
     * user, server, or role.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @sample AWSTransfer.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the users for a file transfer protocol-enabled server that you specify by passing the <code>ServerId</code>
     * parameter.
     * </p>
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    ListUsersResult listUsers(ListUsersRequest listUsersRequest);

    /**
     * <p>
     * Lists all of your workflows.
     * </p>
     * 
     * @param listWorkflowsRequest
     * @return Result of the ListWorkflows operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> parameter that was passed is invalid.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @sample AWSTransfer.ListWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListWorkflows" target="_top">AWS API
     *      Documentation</a>
     */
    ListWorkflowsResult listWorkflows(ListWorkflowsRequest listWorkflowsRequest);

    /**
     * <p>
     * Sends a callback for asynchronous custom steps.
     * </p>
     * <p>
     * The <code>ExecutionId</code>, <code>WorkflowId</code>, and <code>Token</code> are passed to the target resource
     * during execution of a custom step of a workflow. You must include those with their callback as well as providing
     * a status.
     * </p>
     * 
     * @param sendWorkflowStepStateRequest
     * @return Result of the SendWorkflowStepState operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.</p>
     *         <p>
     *         HTTP Status Code: 400
     * @sample AWSTransfer.SendWorkflowStepState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/SendWorkflowStepState" target="_top">AWS
     *      API Documentation</a>
     */
    SendWorkflowStepStateResult sendWorkflowStepState(SendWorkflowStepStateRequest sendWorkflowStepStateRequest);

    /**
     * <p>
     * Changes the state of a file transfer protocol-enabled server from <code>OFFLINE</code> to <code>ONLINE</code>. It
     * has no impact on a server that is already <code>ONLINE</code>. An <code>ONLINE</code> server can accept and
     * process file transfer jobs.
     * </p>
     * <p>
     * The state of <code>STARTING</code> indicates that the server is in an intermediate state, either not fully able
     * to respond, or not fully online. The values of <code>START_FAILED</code> can indicate an error condition.
     * </p>
     * <p>
     * No response is returned from this call.
     * </p>
     * 
     * @param startServerRequest
     * @return Result of the StartServer operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.</p>
     *         <p>
     *         HTTP Status Code: 400
     * @sample AWSTransfer.StartServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/StartServer" target="_top">AWS API
     *      Documentation</a>
     */
    StartServerResult startServer(StartServerRequest startServerRequest);

    /**
     * <p>
     * Changes the state of a file transfer protocol-enabled server from <code>ONLINE</code> to <code>OFFLINE</code>. An
     * <code>OFFLINE</code> server cannot accept and process file transfer jobs. Information tied to your server, such
     * as server and user properties, are not affected by stopping your server.
     * </p>
     * <note>
     * <p>
     * Stopping the server will not reduce or impact your file transfer protocol endpoint billing; you must delete the
     * server to stop being billed.
     * </p>
     * </note>
     * <p>
     * The state of <code>STOPPING</code> indicates that the server is in an intermediate state, either not fully able
     * to respond, or not fully offline. The values of <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * <p>
     * No response is returned from this call.
     * </p>
     * 
     * @param stopServerRequest
     * @return Result of the StopServer operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.</p>
     *         <p>
     *         HTTP Status Code: 400
     * @sample AWSTransfer.StopServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/StopServer" target="_top">AWS API
     *      Documentation</a>
     */
    StopServerResult stopServer(StopServerRequest stopServerRequest);

    /**
     * <p>
     * Attaches a key-value pair to a resource, as identified by its Amazon Resource Name (ARN). Resources are users,
     * servers, roles, and other entities.
     * </p>
     * <p>
     * There is no response returned from this call.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * If the <code>IdentityProviderType</code> of a file transfer protocol-enabled server is
     * <code>AWS_DIRECTORY_SERVICE</code> or <code>API_Gateway</code>, tests whether your identity provider is set up
     * successfully. We highly recommend that you call this operation to test your authentication method as soon as you
     * create your server. By doing so, you can troubleshoot issues with the identity provider integration to ensure
     * that your users can successfully use the service.
     * </p>
     * <p>
     * The <code>ServerId</code> and <code>UserName</code> parameters are required. The <code>ServerProtocol</code>,
     * <code>SourceIp</code>, and <code>UserPassword</code> are all optional.
     * </p>
     * <note>
     * <p>
     * You cannot use <code>TestIdentityProvider</code> if the <code>IdentityProviderType</code> of your server is
     * <code>SERVICE_MANAGED</code>.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * If you provide any incorrect values for any parameters, the <code>Response</code> field is empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you provide a server ID for a server that uses service-managed users, you get an error:
     * </p>
     * <p>
     * <code> An error occurred (InvalidRequestException) when calling the TestIdentityProvider operation: s-<i>server-ID</i> not configured for external auth </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you enter a Server ID for the <code>--server-id</code> parameter that does not identify an actual Transfer
     * server, you receive the following error:
     * </p>
     * <p>
     * <code>An error occurred (ResourceNotFoundException) when calling the TestIdentityProvider operation: Unknown server</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param testIdentityProviderRequest
     * @return Result of the TestIdentityProvider operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.TestIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/TestIdentityProvider" target="_top">AWS
     *      API Documentation</a>
     */
    TestIdentityProviderResult testIdentityProvider(TestIdentityProviderRequest testIdentityProviderRequest);

    /**
     * <p>
     * Detaches a key-value pair from a resource, as identified by its Amazon Resource Name (ARN). Resources are users,
     * servers, roles, and other entities.
     * </p>
     * <p>
     * No response is returned from this call.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Allows you to update parameters for the access specified in the <code>ServerID</code> and <code>ExternalID</code>
     * parameters.
     * </p>
     * 
     * @param updateAccessRequest
     * @return Result of the UpdateAccess operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @sample AWSTransfer.UpdateAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateAccess" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAccessResult updateAccess(UpdateAccessRequest updateAccessRequest);

    /**
     * <p>
     * Updates the file transfer protocol-enabled server's properties after that server has been created.
     * </p>
     * <p>
     * The <code>UpdateServer</code> call returns the <code>ServerId</code> of the server you updated.
     * </p>
     * 
     * @param updateServerRequest
     * @return Result of the UpdateServer operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws ConflictException
     *         This exception is thrown when the <code>UpdateServer</code> is called for a file transfer
     *         protocol-enabled server that has VPC as the endpoint type and the server's <code>VpcEndpointID</code> is
     *         not in the available state.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceExistsException
     *         The requested resource does not exist.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.</p>
     *         <p>
     *         HTTP Status Code: 400
     * @sample AWSTransfer.UpdateServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateServer" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateServerResult updateServer(UpdateServerRequest updateServerRequest);

    /**
     * <p>
     * Assigns new properties to a user. Parameters you pass modify any or all of the following: the home directory,
     * role, and policy for the <code>UserName</code> and <code>ServerId</code> you specify.
     * </p>
     * <p>
     * The response returns the <code>ServerId</code> and the <code>UserName</code> for the updated user.
     * </p>
     * 
     * @param updateUserRequest
     * @return Result of the UpdateUser operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request has failed because the Amazon Web ServicesTransfer Family service is not available.
     * @throws InternalServiceErrorException
     *         This exception is thrown when an error occurs in the Amazon Web ServicesTransfer Family service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource is not found by the Amazon Web ServicesTransfer Family service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.</p>
     *         <p>
     *         HTTP Status Code: 400
     * @sample AWSTransfer.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateUserResult updateUser(UpdateUserRequest updateUserRequest);

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

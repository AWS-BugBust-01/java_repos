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
package com.amazonaws.services.greengrassv2;

import javax.annotation.Generated;

import com.amazonaws.services.greengrassv2.model.*;

/**
 * Interface for accessing AWS GreengrassV2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.greengrassv2.AbstractAWSGreengrassV2Async} instead.
 * </p>
 * <p>
 * <p>
 * IoT Greengrass brings local compute, messaging, data management, sync, and ML inference capabilities to edge devices.
 * This enables devices to collect and analyze data closer to the source of information, react autonomously to local
 * events, and communicate securely with each other on local networks. Local devices can also communicate securely with
 * Amazon Web Services IoT Core and export IoT data to the Amazon Web Services Cloud. IoT Greengrass developers can use
 * Lambda functions and components to create and deploy applications to fleets of edge devices for local operation.
 * </p>
 * <p>
 * IoT Greengrass Version 2 provides a new major version of the IoT Greengrass Core software, new APIs, and a new
 * console. Use this API reference to learn how to use the IoT Greengrass V2 API operations to manage components, manage
 * deployments, and core devices.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/what-is-iot-greengrass.html">What is IoT
 * Greengrass?</a> in the <i>IoT Greengrass V2 Developer Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSGreengrassV2Async extends AWSGreengrassV2 {

    /**
     * <p>
     * Associate a list of client devices with a core device. Use this API operation to specify which client devices can
     * discover a core device through cloud discovery. With cloud discovery, client devices connect to IoT Greengrass to
     * retrieve associated core devices' connectivity information and certificates. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-cloud-discovery.html">Configure cloud
     * discovery</a> in the <i>IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Client devices are local IoT devices that connect to and communicate with an IoT Greengrass core device over
     * MQTT. You can connect client devices to a core device to sync MQTT messages and data to Amazon Web Services IoT
     * Core and interact with client devices in Greengrass components. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/interact-with-local-iot-devices.html">Interact
     * with local IoT devices</a> in the <i>IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param batchAssociateClientDeviceWithCoreDeviceRequest
     * @return A Java Future containing the result of the BatchAssociateClientDeviceWithCoreDevice operation returned by
     *         the service.
     * @sample AWSGreengrassV2Async.BatchAssociateClientDeviceWithCoreDevice
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/BatchAssociateClientDeviceWithCoreDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchAssociateClientDeviceWithCoreDeviceResult> batchAssociateClientDeviceWithCoreDeviceAsync(
            BatchAssociateClientDeviceWithCoreDeviceRequest batchAssociateClientDeviceWithCoreDeviceRequest);

    /**
     * <p>
     * Associate a list of client devices with a core device. Use this API operation to specify which client devices can
     * discover a core device through cloud discovery. With cloud discovery, client devices connect to IoT Greengrass to
     * retrieve associated core devices' connectivity information and certificates. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-cloud-discovery.html">Configure cloud
     * discovery</a> in the <i>IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Client devices are local IoT devices that connect to and communicate with an IoT Greengrass core device over
     * MQTT. You can connect client devices to a core device to sync MQTT messages and data to Amazon Web Services IoT
     * Core and interact with client devices in Greengrass components. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/interact-with-local-iot-devices.html">Interact
     * with local IoT devices</a> in the <i>IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param batchAssociateClientDeviceWithCoreDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchAssociateClientDeviceWithCoreDevice operation returned by
     *         the service.
     * @sample AWSGreengrassV2AsyncHandler.BatchAssociateClientDeviceWithCoreDevice
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/BatchAssociateClientDeviceWithCoreDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchAssociateClientDeviceWithCoreDeviceResult> batchAssociateClientDeviceWithCoreDeviceAsync(
            BatchAssociateClientDeviceWithCoreDeviceRequest batchAssociateClientDeviceWithCoreDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<BatchAssociateClientDeviceWithCoreDeviceRequest, BatchAssociateClientDeviceWithCoreDeviceResult> asyncHandler);

    /**
     * <p>
     * Disassociate a list of client devices from a core device. After you disassociate a client device from a core
     * device, the client device won't be able to use cloud discovery to retrieve the core device's connectivity
     * information and certificates.
     * </p>
     * 
     * @param batchDisassociateClientDeviceFromCoreDeviceRequest
     * @return A Java Future containing the result of the BatchDisassociateClientDeviceFromCoreDevice operation returned
     *         by the service.
     * @sample AWSGreengrassV2Async.BatchDisassociateClientDeviceFromCoreDevice
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/BatchDisassociateClientDeviceFromCoreDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisassociateClientDeviceFromCoreDeviceResult> batchDisassociateClientDeviceFromCoreDeviceAsync(
            BatchDisassociateClientDeviceFromCoreDeviceRequest batchDisassociateClientDeviceFromCoreDeviceRequest);

    /**
     * <p>
     * Disassociate a list of client devices from a core device. After you disassociate a client device from a core
     * device, the client device won't be able to use cloud discovery to retrieve the core device's connectivity
     * information and certificates.
     * </p>
     * 
     * @param batchDisassociateClientDeviceFromCoreDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDisassociateClientDeviceFromCoreDevice operation returned
     *         by the service.
     * @sample AWSGreengrassV2AsyncHandler.BatchDisassociateClientDeviceFromCoreDevice
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/BatchDisassociateClientDeviceFromCoreDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisassociateClientDeviceFromCoreDeviceResult> batchDisassociateClientDeviceFromCoreDeviceAsync(
            BatchDisassociateClientDeviceFromCoreDeviceRequest batchDisassociateClientDeviceFromCoreDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDisassociateClientDeviceFromCoreDeviceRequest, BatchDisassociateClientDeviceFromCoreDeviceResult> asyncHandler);

    /**
     * <p>
     * Cancels a deployment. This operation cancels the deployment for devices that haven't yet received it. If a device
     * already received the deployment, this operation doesn't change anything for that device.
     * </p>
     * 
     * @param cancelDeploymentRequest
     * @return A Java Future containing the result of the CancelDeployment operation returned by the service.
     * @sample AWSGreengrassV2Async.CancelDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/CancelDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelDeploymentResult> cancelDeploymentAsync(CancelDeploymentRequest cancelDeploymentRequest);

    /**
     * <p>
     * Cancels a deployment. This operation cancels the deployment for devices that haven't yet received it. If a device
     * already received the deployment, this operation doesn't change anything for that device.
     * </p>
     * 
     * @param cancelDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelDeployment operation returned by the service.
     * @sample AWSGreengrassV2AsyncHandler.CancelDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/CancelDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelDeploymentResult> cancelDeploymentAsync(CancelDeploymentRequest cancelDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<CancelDeploymentRequest, CancelDeploymentResult> asyncHandler);

    /**
     * <p>
     * Creates a component. Components are software that run on Greengrass core devices. After you develop and test a
     * component on your core device, you can use this operation to upload your component to IoT Greengrass. Then, you
     * can deploy the component to other core devices.
     * </p>
     * <p>
     * You can use this operation to do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Create components from recipes</b>
     * </p>
     * <p>
     * Create a component from a recipe, which is a file that defines the component's metadata, parameters,
     * dependencies, lifecycle, artifacts, and platform capability. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/component-recipe-reference.html">IoT Greengrass
     * component recipe reference</a> in the <i>IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * <p>
     * To create a component from a recipe, specify <code>inlineRecipe</code> when you call this operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Create components from Lambda functions</b>
     * </p>
     * <p>
     * Create a component from an Lambda function that runs on IoT Greengrass. This creates a recipe and artifacts from
     * the Lambda function's deployment package. You can use this operation to migrate Lambda functions from IoT
     * Greengrass V1 to IoT Greengrass V2.
     * </p>
     * <p>
     * This function only accepts Lambda functions that use the following runtimes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Python 2.7 – <code>python2.7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Python 3.7 – <code>python3.7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Python 3.8 – <code>python3.8</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Java 8 – <code>java8</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Node.js 10 – <code>nodejs10.x</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Node.js 12 – <code>nodejs12.x</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create a component from a Lambda function, specify <code>lambdaFunction</code> when you call this operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createComponentVersionRequest
     * @return A Java Future containing the result of the CreateComponentVersion operation returned by the service.
     * @sample AWSGreengrassV2Async.CreateComponentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/CreateComponentVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateComponentVersionResult> createComponentVersionAsync(CreateComponentVersionRequest createComponentVersionRequest);

    /**
     * <p>
     * Creates a component. Components are software that run on Greengrass core devices. After you develop and test a
     * component on your core device, you can use this operation to upload your component to IoT Greengrass. Then, you
     * can deploy the component to other core devices.
     * </p>
     * <p>
     * You can use this operation to do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Create components from recipes</b>
     * </p>
     * <p>
     * Create a component from a recipe, which is a file that defines the component's metadata, parameters,
     * dependencies, lifecycle, artifacts, and platform capability. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/component-recipe-reference.html">IoT Greengrass
     * component recipe reference</a> in the <i>IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * <p>
     * To create a component from a recipe, specify <code>inlineRecipe</code> when you call this operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Create components from Lambda functions</b>
     * </p>
     * <p>
     * Create a component from an Lambda function that runs on IoT Greengrass. This creates a recipe and artifacts from
     * the Lambda function's deployment package. You can use this operation to migrate Lambda functions from IoT
     * Greengrass V1 to IoT Greengrass V2.
     * </p>
     * <p>
     * This function only accepts Lambda functions that use the following runtimes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Python 2.7 – <code>python2.7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Python 3.7 – <code>python3.7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Python 3.8 – <code>python3.8</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Java 8 – <code>java8</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Node.js 10 – <code>nodejs10.x</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Node.js 12 – <code>nodejs12.x</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create a component from a Lambda function, specify <code>lambdaFunction</code> when you call this operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createComponentVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateComponentVersion operation returned by the service.
     * @sample AWSGreengrassV2AsyncHandler.CreateComponentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/CreateComponentVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateComponentVersionResult> createComponentVersionAsync(CreateComponentVersionRequest createComponentVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateComponentVersionRequest, CreateComponentVersionResult> asyncHandler);

    /**
     * <p>
     * Creates a continuous deployment for a target, which is a Greengrass core device or group of core devices. When
     * you add a new core device to a group of core devices that has a deployment, IoT Greengrass deploys that group's
     * deployment to the new device.
     * </p>
     * <p>
     * You can define one deployment for each target. When you create a new deployment for a target that has an existing
     * deployment, you replace the previous deployment. IoT Greengrass applies the new deployment to the target devices.
     * </p>
     * <p>
     * Every deployment has a revision number that indicates how many deployment revisions you define for a target. Use
     * this operation to create a new revision of an existing deployment. This operation returns the revision number of
     * the new deployment when you create it.
     * </p>
     * <p>
     * For more information, see the <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html">Create deployments</a> in
     * the <i>IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param createDeploymentRequest
     * @return A Java Future containing the result of the CreateDeployment operation returned by the service.
     * @sample AWSGreengrassV2Async.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/CreateDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest);

    /**
     * <p>
     * Creates a continuous deployment for a target, which is a Greengrass core device or group of core devices. When
     * you add a new core device to a group of core devices that has a deployment, IoT Greengrass deploys that group's
     * deployment to the new device.
     * </p>
     * <p>
     * You can define one deployment for each target. When you create a new deployment for a target that has an existing
     * deployment, you replace the previous deployment. IoT Greengrass applies the new deployment to the target devices.
     * </p>
     * <p>
     * Every deployment has a revision number that indicates how many deployment revisions you define for a target. Use
     * this operation to create a new revision of an existing deployment. This operation returns the revision number of
     * the new deployment when you create it.
     * </p>
     * <p>
     * For more information, see the <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html">Create deployments</a> in
     * the <i>IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param createDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeployment operation returned by the service.
     * @sample AWSGreengrassV2AsyncHandler.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/CreateDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler);

    /**
     * <p>
     * Deletes a version of a component from IoT Greengrass.
     * </p>
     * <note>
     * <p>
     * This operation deletes the component's recipe and artifacts. As a result, deployments that refer to this
     * component version will fail. If you have deployments that use this component version, you can remove the
     * component from the deployment or update the deployment to use a valid version.
     * </p>
     * </note>
     * 
     * @param deleteComponentRequest
     * @return A Java Future containing the result of the DeleteComponent operation returned by the service.
     * @sample AWSGreengrassV2Async.DeleteComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/DeleteComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(DeleteComponentRequest deleteComponentRequest);

    /**
     * <p>
     * Deletes a version of a component from IoT Greengrass.
     * </p>
     * <note>
     * <p>
     * This operation deletes the component's recipe and artifacts. As a result, deployments that refer to this
     * component version will fail. If you have deployments that use this component version, you can remove the
     * component from the deployment or update the deployment to use a valid version.
     * </p>
     * </note>
     * 
     * @param deleteComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteComponent operation returned by the service.
     * @sample AWSGreengrassV2AsyncHandler.DeleteComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/DeleteComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(DeleteComponentRequest deleteComponentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteComponentRequest, DeleteComponentResult> asyncHandler);

    /**
     * <p>
     * Deletes a Greengrass core device, which is an IoT thing. This operation removes the core device from the list of
     * core devices. This operation doesn't delete the IoT thing. For more information about how to delete the IoT
     * thing, see <a href="https://docs.aws.amazon.com/iot/latest/apireference/API_DeleteThing.html">DeleteThing</a> in
     * the <i>IoT API Reference</i>.
     * </p>
     * 
     * @param deleteCoreDeviceRequest
     * @return A Java Future containing the result of the DeleteCoreDevice operation returned by the service.
     * @sample AWSGreengrassV2Async.DeleteCoreDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/DeleteCoreDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCoreDeviceResult> deleteCoreDeviceAsync(DeleteCoreDeviceRequest deleteCoreDeviceRequest);

    /**
     * <p>
     * Deletes a Greengrass core device, which is an IoT thing. This operation removes the core device from the list of
     * core devices. This operation doesn't delete the IoT thing. For more information about how to delete the IoT
     * thing, see <a href="https://docs.aws.amazon.com/iot/latest/apireference/API_DeleteThing.html">DeleteThing</a> in
     * the <i>IoT API Reference</i>.
     * </p>
     * 
     * @param deleteCoreDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCoreDevice operation returned by the service.
     * @sample AWSGreengrassV2AsyncHandler.DeleteCoreDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/DeleteCoreDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCoreDeviceResult> deleteCoreDeviceAsync(DeleteCoreDeviceRequest deleteCoreDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCoreDeviceRequest, DeleteCoreDeviceResult> asyncHandler);

    /**
     * <p>
     * Retrieves metadata for a version of a component.
     * </p>
     * 
     * @param describeComponentRequest
     * @return A Java Future containing the result of the DescribeComponent operation returned by the service.
     * @sample AWSGreengrassV2Async.DescribeComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/DescribeComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeComponentResult> describeComponentAsync(DescribeComponentRequest describeComponentRequest);

    /**
     * <p>
     * Retrieves metadata for a version of a component.
     * </p>
     * 
     * @param describeComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeComponent operation returned by the service.
     * @sample AWSGreengrassV2AsyncHandler.DescribeComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/DescribeComponent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeComponentResult> describeComponentAsync(DescribeComponentRequest describeComponentRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeComponentRequest, DescribeComponentResult> asyncHandler);

    /**
     * <p>
     * Gets the recipe for a version of a component. Core devices can call this operation to identify the artifacts and
     * requirements to install a component.
     * </p>
     * 
     * @param getComponentRequest
     * @return A Java Future containing the result of the GetComponent operation returned by the service.
     * @sample AWSGreengrassV2Async.GetComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetComponent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetComponentResult> getComponentAsync(GetComponentRequest getComponentRequest);

    /**
     * <p>
     * Gets the recipe for a version of a component. Core devices can call this operation to identify the artifacts and
     * requirements to install a component.
     * </p>
     * 
     * @param getComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComponent operation returned by the service.
     * @sample AWSGreengrassV2AsyncHandler.GetComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetComponent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetComponentResult> getComponentAsync(GetComponentRequest getComponentRequest,
            com.amazonaws.handlers.AsyncHandler<GetComponentRequest, GetComponentResult> asyncHandler);

    /**
     * <p>
     * Gets the pre-signed URL to download a public component artifact. Core devices call this operation to identify the
     * URL that they can use to download an artifact to install.
     * </p>
     * 
     * @param getComponentVersionArtifactRequest
     * @return A Java Future containing the result of the GetComponentVersionArtifact operation returned by the service.
     * @sample AWSGreengrassV2Async.GetComponentVersionArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetComponentVersionArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetComponentVersionArtifactResult> getComponentVersionArtifactAsync(
            GetComponentVersionArtifactRequest getComponentVersionArtifactRequest);

    /**
     * <p>
     * Gets the pre-signed URL to download a public component artifact. Core devices call this operation to identify the
     * URL that they can use to download an artifact to install.
     * </p>
     * 
     * @param getComponentVersionArtifactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComponentVersionArtifact operation returned by the service.
     * @sample AWSGreengrassV2AsyncHandler.GetComponentVersionArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetComponentVersionArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetComponentVersionArtifactResult> getComponentVersionArtifactAsync(
            GetComponentVersionArtifactRequest getComponentVersionArtifactRequest,
            com.amazonaws.handlers.AsyncHandler<GetComponentVersionArtifactRequest, GetComponentVersionArtifactResult> asyncHandler);

    /**
     * <p>
     * Retrieves metadata for a Greengrass core device.
     * </p>
     * 
     * @param getCoreDeviceRequest
     * @return A Java Future containing the result of the GetCoreDevice operation returned by the service.
     * @sample AWSGreengrassV2Async.GetCoreDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetCoreDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCoreDeviceResult> getCoreDeviceAsync(GetCoreDeviceRequest getCoreDeviceRequest);

    /**
     * <p>
     * Retrieves metadata for a Greengrass core device.
     * </p>
     * 
     * @param getCoreDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCoreDevice operation returned by the service.
     * @sample AWSGreengrassV2AsyncHandler.GetCoreDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetCoreDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCoreDeviceResult> getCoreDeviceAsync(GetCoreDeviceRequest getCoreDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<GetCoreDeviceRequest, GetCoreDeviceResult> asyncHandler);

    /**
     * <p>
     * Gets a deployment. Deployments define the components that run on Greengrass core devices.
     * </p>
     * 
     * @param getDeploymentRequest
     * @return A Java Future containing the result of the GetDeployment operation returned by the service.
     * @sample AWSGreengrassV2Async.GetDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest getDeploymentRequest);

    /**
     * <p>
     * Gets a deployment. Deployments define the components that run on Greengrass core devices.
     * </p>
     * 
     * @param getDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeployment operation returned by the service.
     * @sample AWSGreengrassV2AsyncHandler.GetDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest getDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler);

    /**
     * <p>
     * Retrieves a paginated list of client devices that are associated with a core device.
     * </p>
     * 
     * @param listClientDevicesAssociatedWithCoreDeviceRequest
     * @return A Java Future containing the result of the ListClientDevicesAssociatedWithCoreDevice operation returned
     *         by the service.
     * @sample AWSGreengrassV2Async.ListClientDevicesAssociatedWithCoreDevice
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListClientDevicesAssociatedWithCoreDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListClientDevicesAssociatedWithCoreDeviceResult> listClientDevicesAssociatedWithCoreDeviceAsync(
            ListClientDevicesAssociatedWithCoreDeviceRequest listClientDevicesAssociatedWithCoreDeviceRequest);

    /**
     * <p>
     * Retrieves a paginated list of client devices that are associated with a core device.
     * </p>
     * 
     * @param listClientDevicesAssociatedWithCoreDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListClientDevicesAssociatedWithCoreDevice operation returned
     *         by the service.
     * @sample AWSGreengrassV2AsyncHandler.ListClientDevicesAssociatedWithCoreDevice
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListClientDevicesAssociatedWithCoreDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListClientDevicesAssociatedWithCoreDeviceResult> listClientDevicesAssociatedWithCoreDeviceAsync(
            ListClientDevicesAssociatedWithCoreDeviceRequest listClientDevicesAssociatedWithCoreDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<ListClientDevicesAssociatedWithCoreDeviceRequest, ListClientDevicesAssociatedWithCoreDeviceResult> asyncHandler);

    /**
     * <p>
     * Retrieves a paginated list of all versions for a component. Greater versions are listed first.
     * </p>
     * 
     * @param listComponentVersionsRequest
     * @return A Java Future containing the result of the ListComponentVersions operation returned by the service.
     * @sample AWSGreengrassV2Async.ListComponentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListComponentVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListComponentVersionsResult> listComponentVersionsAsync(ListComponentVersionsRequest listComponentVersionsRequest);

    /**
     * <p>
     * Retrieves a paginated list of all versions for a component. Greater versions are listed first.
     * </p>
     * 
     * @param listComponentVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListComponentVersions operation returned by the service.
     * @sample AWSGreengrassV2AsyncHandler.ListComponentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListComponentVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListComponentVersionsResult> listComponentVersionsAsync(ListComponentVersionsRequest listComponentVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListComponentVersionsRequest, ListComponentVersionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a paginated list of component summaries. This list includes components that you have permission to
     * view.
     * </p>
     * 
     * @param listComponentsRequest
     * @return A Java Future containing the result of the ListComponents operation returned by the service.
     * @sample AWSGreengrassV2Async.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListComponents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest listComponentsRequest);

    /**
     * <p>
     * Retrieves a paginated list of component summaries. This list includes components that you have permission to
     * view.
     * </p>
     * 
     * @param listComponentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListComponents operation returned by the service.
     * @sample AWSGreengrassV2AsyncHandler.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListComponents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest listComponentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListComponentsRequest, ListComponentsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a paginated list of Greengrass core devices.
     * </p>
     * 
     * @param listCoreDevicesRequest
     * @return A Java Future containing the result of the ListCoreDevices operation returned by the service.
     * @sample AWSGreengrassV2Async.ListCoreDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListCoreDevices" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCoreDevicesResult> listCoreDevicesAsync(ListCoreDevicesRequest listCoreDevicesRequest);

    /**
     * <p>
     * Retrieves a paginated list of Greengrass core devices.
     * </p>
     * 
     * @param listCoreDevicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCoreDevices operation returned by the service.
     * @sample AWSGreengrassV2AsyncHandler.ListCoreDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListCoreDevices" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCoreDevicesResult> listCoreDevicesAsync(ListCoreDevicesRequest listCoreDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCoreDevicesRequest, ListCoreDevicesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a paginated list of deployments.
     * </p>
     * 
     * @param listDeploymentsRequest
     * @return A Java Future containing the result of the ListDeployments operation returned by the service.
     * @sample AWSGreengrassV2Async.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListDeployments" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest listDeploymentsRequest);

    /**
     * <p>
     * Retrieves a paginated list of deployments.
     * </p>
     * 
     * @param listDeploymentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeployments operation returned by the service.
     * @sample AWSGreengrassV2AsyncHandler.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListDeployments" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest listDeploymentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a paginated list of deployment jobs that IoT Greengrass sends to Greengrass core devices.
     * </p>
     * 
     * @param listEffectiveDeploymentsRequest
     * @return A Java Future containing the result of the ListEffectiveDeployments operation returned by the service.
     * @sample AWSGreengrassV2Async.ListEffectiveDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListEffectiveDeployments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEffectiveDeploymentsResult> listEffectiveDeploymentsAsync(ListEffectiveDeploymentsRequest listEffectiveDeploymentsRequest);

    /**
     * <p>
     * Retrieves a paginated list of deployment jobs that IoT Greengrass sends to Greengrass core devices.
     * </p>
     * 
     * @param listEffectiveDeploymentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEffectiveDeployments operation returned by the service.
     * @sample AWSGreengrassV2AsyncHandler.ListEffectiveDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListEffectiveDeployments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEffectiveDeploymentsResult> listEffectiveDeploymentsAsync(ListEffectiveDeploymentsRequest listEffectiveDeploymentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEffectiveDeploymentsRequest, ListEffectiveDeploymentsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a paginated list of the components that a Greengrass core device runs.
     * </p>
     * 
     * @param listInstalledComponentsRequest
     * @return A Java Future containing the result of the ListInstalledComponents operation returned by the service.
     * @sample AWSGreengrassV2Async.ListInstalledComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListInstalledComponents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInstalledComponentsResult> listInstalledComponentsAsync(ListInstalledComponentsRequest listInstalledComponentsRequest);

    /**
     * <p>
     * Retrieves a paginated list of the components that a Greengrass core device runs.
     * </p>
     * 
     * @param listInstalledComponentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInstalledComponents operation returned by the service.
     * @sample AWSGreengrassV2AsyncHandler.ListInstalledComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListInstalledComponents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInstalledComponentsResult> listInstalledComponentsAsync(ListInstalledComponentsRequest listInstalledComponentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInstalledComponentsRequest, ListInstalledComponentsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the list of tags for an IoT Greengrass resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSGreengrassV2Async.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves the list of tags for an IoT Greengrass resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSGreengrassV2AsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of components that meet the component, version, and platform requirements of a deployment.
     * Greengrass core devices call this operation when they receive a deployment to identify the components to install.
     * </p>
     * <p>
     * This operation identifies components that meet all dependency requirements for a deployment. If the requirements
     * conflict, then this operation returns an error and the deployment fails. For example, this occurs if component
     * <code>A</code> requires version <code>&gt;2.0.0</code> and component <code>B</code> requires version
     * <code>&lt;2.0.0</code> of a component dependency.
     * </p>
     * <p>
     * When you specify the component candidates to resolve, IoT Greengrass compares each component's digest from the
     * core device with the component's digest in the Amazon Web Services Cloud. If the digests don't match, then IoT
     * Greengrass specifies to use the version from the Amazon Web Services Cloud.
     * </p>
     * <important>
     * <p>
     * To use this operation, you must use the data plane API endpoint and authenticate with an IoT device certificate.
     * For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/greengrass.html">IoT Greengrass
     * endpoints and quotas</a>.
     * </p>
     * </important>
     * 
     * @param resolveComponentCandidatesRequest
     * @return A Java Future containing the result of the ResolveComponentCandidates operation returned by the service.
     * @sample AWSGreengrassV2Async.ResolveComponentCandidates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ResolveComponentCandidates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResolveComponentCandidatesResult> resolveComponentCandidatesAsync(
            ResolveComponentCandidatesRequest resolveComponentCandidatesRequest);

    /**
     * <p>
     * Retrieves a list of components that meet the component, version, and platform requirements of a deployment.
     * Greengrass core devices call this operation when they receive a deployment to identify the components to install.
     * </p>
     * <p>
     * This operation identifies components that meet all dependency requirements for a deployment. If the requirements
     * conflict, then this operation returns an error and the deployment fails. For example, this occurs if component
     * <code>A</code> requires version <code>&gt;2.0.0</code> and component <code>B</code> requires version
     * <code>&lt;2.0.0</code> of a component dependency.
     * </p>
     * <p>
     * When you specify the component candidates to resolve, IoT Greengrass compares each component's digest from the
     * core device with the component's digest in the Amazon Web Services Cloud. If the digests don't match, then IoT
     * Greengrass specifies to use the version from the Amazon Web Services Cloud.
     * </p>
     * <important>
     * <p>
     * To use this operation, you must use the data plane API endpoint and authenticate with an IoT device certificate.
     * For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/greengrass.html">IoT Greengrass
     * endpoints and quotas</a>.
     * </p>
     * </important>
     * 
     * @param resolveComponentCandidatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResolveComponentCandidates operation returned by the service.
     * @sample AWSGreengrassV2AsyncHandler.ResolveComponentCandidates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ResolveComponentCandidates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResolveComponentCandidatesResult> resolveComponentCandidatesAsync(
            ResolveComponentCandidatesRequest resolveComponentCandidatesRequest,
            com.amazonaws.handlers.AsyncHandler<ResolveComponentCandidatesRequest, ResolveComponentCandidatesResult> asyncHandler);

    /**
     * <p>
     * Adds tags to an IoT Greengrass resource. If a tag already exists for the resource, this operation updates the
     * tag's value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSGreengrassV2Async.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds tags to an IoT Greengrass resource. If a tag already exists for the resource, this operation updates the
     * tag's value.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSGreengrassV2AsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from an IoT Greengrass resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSGreengrassV2Async.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag from an IoT Greengrass resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSGreengrassV2AsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}

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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.greengrassv2.model.*;

/**
 * Interface for accessing AWS GreengrassV2.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.greengrassv2.AbstractAWSGreengrassV2} instead.
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
public interface AWSGreengrassV2 {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "greengrass";

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
     * @return Result of the BatchAssociateClientDeviceWithCoreDevice operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @sample AWSGreengrassV2.BatchAssociateClientDeviceWithCoreDevice
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/BatchAssociateClientDeviceWithCoreDevice"
     *      target="_top">AWS API Documentation</a>
     */
    BatchAssociateClientDeviceWithCoreDeviceResult batchAssociateClientDeviceWithCoreDevice(
            BatchAssociateClientDeviceWithCoreDeviceRequest batchAssociateClientDeviceWithCoreDeviceRequest);

    /**
     * <p>
     * Disassociate a list of client devices from a core device. After you disassociate a client device from a core
     * device, the client device won't be able to use cloud discovery to retrieve the core device's connectivity
     * information and certificates.
     * </p>
     * 
     * @param batchDisassociateClientDeviceFromCoreDeviceRequest
     * @return Result of the BatchDisassociateClientDeviceFromCoreDevice operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @sample AWSGreengrassV2.BatchDisassociateClientDeviceFromCoreDevice
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/BatchDisassociateClientDeviceFromCoreDevice"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDisassociateClientDeviceFromCoreDeviceResult batchDisassociateClientDeviceFromCoreDevice(
            BatchDisassociateClientDeviceFromCoreDeviceRequest batchDisassociateClientDeviceFromCoreDeviceRequest);

    /**
     * <p>
     * Cancels a deployment. This operation cancels the deployment for devices that haven't yet received it. If a device
     * already received the deployment, this operation doesn't change anything for that device.
     * </p>
     * 
     * @param cancelDeploymentRequest
     * @return Result of the CancelDeployment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @sample AWSGreengrassV2.CancelDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/CancelDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    CancelDeploymentResult cancelDeployment(CancelDeploymentRequest cancelDeploymentRequest);

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
     * @return Result of the CreateComponentVersion operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         Your request exceeds a service quota. For example, you might have the maximum number of components that
     *         you can create.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @throws RequestAlreadyInProgressException
     *         The request is already in progress. This exception occurs when you use a client token for multiple
     *         requests while IoT Greengrass is still processing an earlier request that uses the same client token.
     * @sample AWSGreengrassV2.CreateComponentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/CreateComponentVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateComponentVersionResult createComponentVersion(CreateComponentVersionRequest createComponentVersionRequest);

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
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @throws RequestAlreadyInProgressException
     *         The request is already in progress. This exception occurs when you use a client token for multiple
     *         requests while IoT Greengrass is still processing an earlier request that uses the same client token.
     * @sample AWSGreengrassV2.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/CreateDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest);

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
     * @return Result of the DeleteComponent operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @sample AWSGreengrassV2.DeleteComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/DeleteComponent" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteComponentResult deleteComponent(DeleteComponentRequest deleteComponentRequest);

    /**
     * <p>
     * Deletes a Greengrass core device, which is an IoT thing. This operation removes the core device from the list of
     * core devices. This operation doesn't delete the IoT thing. For more information about how to delete the IoT
     * thing, see <a href="https://docs.aws.amazon.com/iot/latest/apireference/API_DeleteThing.html">DeleteThing</a> in
     * the <i>IoT API Reference</i>.
     * </p>
     * 
     * @param deleteCoreDeviceRequest
     * @return Result of the DeleteCoreDevice operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSGreengrassV2.DeleteCoreDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/DeleteCoreDevice" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteCoreDeviceResult deleteCoreDevice(DeleteCoreDeviceRequest deleteCoreDeviceRequest);

    /**
     * <p>
     * Retrieves metadata for a version of a component.
     * </p>
     * 
     * @param describeComponentRequest
     * @return Result of the DescribeComponent operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @sample AWSGreengrassV2.DescribeComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/DescribeComponent" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeComponentResult describeComponent(DescribeComponentRequest describeComponentRequest);

    /**
     * <p>
     * Gets the recipe for a version of a component. Core devices can call this operation to identify the artifacts and
     * requirements to install a component.
     * </p>
     * 
     * @param getComponentRequest
     * @return Result of the GetComponent operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @sample AWSGreengrassV2.GetComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetComponent" target="_top">AWS API
     *      Documentation</a>
     */
    GetComponentResult getComponent(GetComponentRequest getComponentRequest);

    /**
     * <p>
     * Gets the pre-signed URL to download a public component artifact. Core devices call this operation to identify the
     * URL that they can use to download an artifact to install.
     * </p>
     * 
     * @param getComponentVersionArtifactRequest
     * @return Result of the GetComponentVersionArtifact operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @sample AWSGreengrassV2.GetComponentVersionArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetComponentVersionArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    GetComponentVersionArtifactResult getComponentVersionArtifact(GetComponentVersionArtifactRequest getComponentVersionArtifactRequest);

    /**
     * <p>
     * Retrieves metadata for a Greengrass core device.
     * </p>
     * 
     * @param getCoreDeviceRequest
     * @return Result of the GetCoreDevice operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @sample AWSGreengrassV2.GetCoreDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetCoreDevice" target="_top">AWS API
     *      Documentation</a>
     */
    GetCoreDeviceResult getCoreDevice(GetCoreDeviceRequest getCoreDeviceRequest);

    /**
     * <p>
     * Gets a deployment. Deployments define the components that run on Greengrass core devices.
     * </p>
     * 
     * @param getDeploymentRequest
     * @return Result of the GetDeployment operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @sample AWSGreengrassV2.GetDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    GetDeploymentResult getDeployment(GetDeploymentRequest getDeploymentRequest);

    /**
     * <p>
     * Retrieves a paginated list of client devices that are associated with a core device.
     * </p>
     * 
     * @param listClientDevicesAssociatedWithCoreDeviceRequest
     * @return Result of the ListClientDevicesAssociatedWithCoreDevice operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @sample AWSGreengrassV2.ListClientDevicesAssociatedWithCoreDevice
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListClientDevicesAssociatedWithCoreDevice"
     *      target="_top">AWS API Documentation</a>
     */
    ListClientDevicesAssociatedWithCoreDeviceResult listClientDevicesAssociatedWithCoreDevice(
            ListClientDevicesAssociatedWithCoreDeviceRequest listClientDevicesAssociatedWithCoreDeviceRequest);

    /**
     * <p>
     * Retrieves a paginated list of all versions for a component. Greater versions are listed first.
     * </p>
     * 
     * @param listComponentVersionsRequest
     * @return Result of the ListComponentVersions operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @sample AWSGreengrassV2.ListComponentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListComponentVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListComponentVersionsResult listComponentVersions(ListComponentVersionsRequest listComponentVersionsRequest);

    /**
     * <p>
     * Retrieves a paginated list of component summaries. This list includes components that you have permission to
     * view.
     * </p>
     * 
     * @param listComponentsRequest
     * @return Result of the ListComponents operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @sample AWSGreengrassV2.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListComponents" target="_top">AWS
     *      API Documentation</a>
     */
    ListComponentsResult listComponents(ListComponentsRequest listComponentsRequest);

    /**
     * <p>
     * Retrieves a paginated list of Greengrass core devices.
     * </p>
     * 
     * @param listCoreDevicesRequest
     * @return Result of the ListCoreDevices operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @sample AWSGreengrassV2.ListCoreDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListCoreDevices" target="_top">AWS
     *      API Documentation</a>
     */
    ListCoreDevicesResult listCoreDevices(ListCoreDevicesRequest listCoreDevicesRequest);

    /**
     * <p>
     * Retrieves a paginated list of deployments.
     * </p>
     * 
     * @param listDeploymentsRequest
     * @return Result of the ListDeployments operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @sample AWSGreengrassV2.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListDeployments" target="_top">AWS
     *      API Documentation</a>
     */
    ListDeploymentsResult listDeployments(ListDeploymentsRequest listDeploymentsRequest);

    /**
     * <p>
     * Retrieves a paginated list of deployment jobs that IoT Greengrass sends to Greengrass core devices.
     * </p>
     * 
     * @param listEffectiveDeploymentsRequest
     * @return Result of the ListEffectiveDeployments operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @sample AWSGreengrassV2.ListEffectiveDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListEffectiveDeployments"
     *      target="_top">AWS API Documentation</a>
     */
    ListEffectiveDeploymentsResult listEffectiveDeployments(ListEffectiveDeploymentsRequest listEffectiveDeploymentsRequest);

    /**
     * <p>
     * Retrieves a paginated list of the components that a Greengrass core device runs.
     * </p>
     * 
     * @param listInstalledComponentsRequest
     * @return Result of the ListInstalledComponents operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @sample AWSGreengrassV2.ListInstalledComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListInstalledComponents"
     *      target="_top">AWS API Documentation</a>
     */
    ListInstalledComponentsResult listInstalledComponents(ListInstalledComponentsRequest listInstalledComponentsRequest);

    /**
     * <p>
     * Retrieves the list of tags for an IoT Greengrass resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @sample AWSGreengrassV2.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @return Result of the ResolveComponentCandidates operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota. For example, you might have exceeded the amount of times that
     *         you can retrieve device or deployment status per second.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @sample AWSGreengrassV2.ResolveComponentCandidates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ResolveComponentCandidates"
     *      target="_top">AWS API Documentation</a>
     */
    ResolveComponentCandidatesResult resolveComponentCandidates(ResolveComponentCandidatesRequest resolveComponentCandidatesRequest);

    /**
     * <p>
     * Adds tags to an IoT Greengrass resource. If a tag already exists for the resource, this operation updates the
     * tag's value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @sample AWSGreengrassV2.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag from an IoT Greengrass resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         IoT Greengrass can't process your request right now. Try again later.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @sample AWSGreengrassV2.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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

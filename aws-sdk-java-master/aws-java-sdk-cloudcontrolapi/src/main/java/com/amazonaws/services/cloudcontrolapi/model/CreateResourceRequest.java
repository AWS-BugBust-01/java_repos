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
package com.amazonaws.services.cloudcontrolapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/CreateResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the resource type.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * For private resource types, the type version to use in this resource operation. If you do not specify a resource
     * version, CloudFormation uses the default version.
     * </p>
     */
    private String typeVersionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) for Cloud Control API to use when
     * performing this resource operation. The role specified must have the permissions required for this operation. The
     * necessary permissions for each event handler are defined in the
     * <code> <a href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-handlers">handlers</a> </code>
     * section of the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">resource type
     * definition schema</a>.
     * </p>
     * <p>
     * If you do not specify a role, Cloud Control API uses a temporary session created using your Amazon Web Services
     * user credentials.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-permissions"
     * >Specifying credentials</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A unique identifier to ensure the idempotency of the resource request. As a best practice, specify this token to
     * ensure idempotency, so that Amazon Web Services Cloud Control API can accurately distinguish between request
     * retries and new resource requests. You might retry a resource request to ensure that it was successfully
     * received.
     * </p>
     * <p>
     * A client token is valid for 36 hours once used. After that, a resource request with the same client token is
     * treated as a new request.
     * </p>
     * <p>
     * If you do not specify a client token, one is generated for inclusion in the request.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-idempotency"
     * >Ensuring resource operation requests are unique</a> in the <i>Amazon Web Services Cloud Control API User
     * Guide</i>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Structured data format representing the desired state of the resource, consisting of that resource's properties
     * and their desired values.
     * </p>
     * <note>
     * <p>
     * Cloud Control API currently supports JSON as a structured data format.
     * </p>
     * </note>
     * <p>
     * Specify the desired state as one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A JSON blob
     * </p>
     * </li>
     * <li>
     * <p>
     * A local path containing the desired state in JSON data format
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-create.html#resource-operations-create-desiredstate"
     * >Composing the desired state of the resource</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <p>
     * For more information about the properties of a specific resource, refer to the related topic for the resource in
     * the <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">
     * Resource and property types reference</a> in the <i>Amazon Web Services CloudFormation Users Guide</i>.
     * </p>
     */
    private String desiredState;

    /**
     * <p>
     * The name of the resource type.
     * </p>
     * 
     * @param typeName
     *        The name of the resource type.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the resource type.
     * </p>
     * 
     * @return The name of the resource type.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the resource type.
     * </p>
     * 
     * @param typeName
     *        The name of the resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceRequest withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * For private resource types, the type version to use in this resource operation. If you do not specify a resource
     * version, CloudFormation uses the default version.
     * </p>
     * 
     * @param typeVersionId
     *        For private resource types, the type version to use in this resource operation. If you do not specify a
     *        resource version, CloudFormation uses the default version.
     */

    public void setTypeVersionId(String typeVersionId) {
        this.typeVersionId = typeVersionId;
    }

    /**
     * <p>
     * For private resource types, the type version to use in this resource operation. If you do not specify a resource
     * version, CloudFormation uses the default version.
     * </p>
     * 
     * @return For private resource types, the type version to use in this resource operation. If you do not specify a
     *         resource version, CloudFormation uses the default version.
     */

    public String getTypeVersionId() {
        return this.typeVersionId;
    }

    /**
     * <p>
     * For private resource types, the type version to use in this resource operation. If you do not specify a resource
     * version, CloudFormation uses the default version.
     * </p>
     * 
     * @param typeVersionId
     *        For private resource types, the type version to use in this resource operation. If you do not specify a
     *        resource version, CloudFormation uses the default version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceRequest withTypeVersionId(String typeVersionId) {
        setTypeVersionId(typeVersionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) for Cloud Control API to use when
     * performing this resource operation. The role specified must have the permissions required for this operation. The
     * necessary permissions for each event handler are defined in the
     * <code> <a href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-handlers">handlers</a> </code>
     * section of the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">resource type
     * definition schema</a>.
     * </p>
     * <p>
     * If you do not specify a role, Cloud Control API uses a temporary session created using your Amazon Web Services
     * user credentials.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-permissions"
     * >Specifying credentials</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) for Cloud Control API to use
     *        when performing this resource operation. The role specified must have the permissions required for this
     *        operation. The necessary permissions for each event handler are defined in the
     *        <code> <a href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-handlers">handlers</a> </code>
     *        section of the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">resource
     *        type definition schema</a>.</p>
     *        <p>
     *        If you do not specify a role, Cloud Control API uses a temporary session created using your Amazon Web
     *        Services user credentials.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-permissions"
     *        >Specifying credentials</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) for Cloud Control API to use when
     * performing this resource operation. The role specified must have the permissions required for this operation. The
     * necessary permissions for each event handler are defined in the
     * <code> <a href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-handlers">handlers</a> </code>
     * section of the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">resource type
     * definition schema</a>.
     * </p>
     * <p>
     * If you do not specify a role, Cloud Control API uses a temporary session created using your Amazon Web Services
     * user credentials.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-permissions"
     * >Specifying credentials</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) for Cloud Control API to use
     *         when performing this resource operation. The role specified must have the permissions required for this
     *         operation. The necessary permissions for each event handler are defined in the
     *         <code> <a href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-handlers">handlers</a> </code>
     *         section of the <a
     *         href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">resource
     *         type definition schema</a>.</p>
     *         <p>
     *         If you do not specify a role, Cloud Control API uses a temporary session created using your Amazon Web
     *         Services user credentials.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-permissions"
     *         >Specifying credentials</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) for Cloud Control API to use when
     * performing this resource operation. The role specified must have the permissions required for this operation. The
     * necessary permissions for each event handler are defined in the
     * <code> <a href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-handlers">handlers</a> </code>
     * section of the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">resource type
     * definition schema</a>.
     * </p>
     * <p>
     * If you do not specify a role, Cloud Control API uses a temporary session created using your Amazon Web Services
     * user credentials.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-permissions"
     * >Specifying credentials</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) for Cloud Control API to use
     *        when performing this resource operation. The role specified must have the permissions required for this
     *        operation. The necessary permissions for each event handler are defined in the
     *        <code> <a href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-handlers">handlers</a> </code>
     *        section of the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">resource
     *        type definition schema</a>.</p>
     *        <p>
     *        If you do not specify a role, Cloud Control API uses a temporary session created using your Amazon Web
     *        Services user credentials.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-permissions"
     *        >Specifying credentials</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A unique identifier to ensure the idempotency of the resource request. As a best practice, specify this token to
     * ensure idempotency, so that Amazon Web Services Cloud Control API can accurately distinguish between request
     * retries and new resource requests. You might retry a resource request to ensure that it was successfully
     * received.
     * </p>
     * <p>
     * A client token is valid for 36 hours once used. After that, a resource request with the same client token is
     * treated as a new request.
     * </p>
     * <p>
     * If you do not specify a client token, one is generated for inclusion in the request.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-idempotency"
     * >Ensuring resource operation requests are unique</a> in the <i>Amazon Web Services Cloud Control API User
     * Guide</i>.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier to ensure the idempotency of the resource request. As a best practice, specify this
     *        token to ensure idempotency, so that Amazon Web Services Cloud Control API can accurately distinguish
     *        between request retries and new resource requests. You might retry a resource request to ensure that it
     *        was successfully received.</p>
     *        <p>
     *        A client token is valid for 36 hours once used. After that, a resource request with the same client token
     *        is treated as a new request.
     *        </p>
     *        <p>
     *        If you do not specify a client token, one is generated for inclusion in the request.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-idempotency"
     *        >Ensuring resource operation requests are unique</a> in the <i>Amazon Web Services Cloud Control API User
     *        Guide</i>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier to ensure the idempotency of the resource request. As a best practice, specify this token to
     * ensure idempotency, so that Amazon Web Services Cloud Control API can accurately distinguish between request
     * retries and new resource requests. You might retry a resource request to ensure that it was successfully
     * received.
     * </p>
     * <p>
     * A client token is valid for 36 hours once used. After that, a resource request with the same client token is
     * treated as a new request.
     * </p>
     * <p>
     * If you do not specify a client token, one is generated for inclusion in the request.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-idempotency"
     * >Ensuring resource operation requests are unique</a> in the <i>Amazon Web Services Cloud Control API User
     * Guide</i>.
     * </p>
     * 
     * @return A unique identifier to ensure the idempotency of the resource request. As a best practice, specify this
     *         token to ensure idempotency, so that Amazon Web Services Cloud Control API can accurately distinguish
     *         between request retries and new resource requests. You might retry a resource request to ensure that it
     *         was successfully received.</p>
     *         <p>
     *         A client token is valid for 36 hours once used. After that, a resource request with the same client token
     *         is treated as a new request.
     *         </p>
     *         <p>
     *         If you do not specify a client token, one is generated for inclusion in the request.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-idempotency"
     *         >Ensuring resource operation requests are unique</a> in the <i>Amazon Web Services Cloud Control API User
     *         Guide</i>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique identifier to ensure the idempotency of the resource request. As a best practice, specify this token to
     * ensure idempotency, so that Amazon Web Services Cloud Control API can accurately distinguish between request
     * retries and new resource requests. You might retry a resource request to ensure that it was successfully
     * received.
     * </p>
     * <p>
     * A client token is valid for 36 hours once used. After that, a resource request with the same client token is
     * treated as a new request.
     * </p>
     * <p>
     * If you do not specify a client token, one is generated for inclusion in the request.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-idempotency"
     * >Ensuring resource operation requests are unique</a> in the <i>Amazon Web Services Cloud Control API User
     * Guide</i>.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier to ensure the idempotency of the resource request. As a best practice, specify this
     *        token to ensure idempotency, so that Amazon Web Services Cloud Control API can accurately distinguish
     *        between request retries and new resource requests. You might retry a resource request to ensure that it
     *        was successfully received.</p>
     *        <p>
     *        A client token is valid for 36 hours once used. After that, a resource request with the same client token
     *        is treated as a new request.
     *        </p>
     *        <p>
     *        If you do not specify a client token, one is generated for inclusion in the request.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-idempotency"
     *        >Ensuring resource operation requests are unique</a> in the <i>Amazon Web Services Cloud Control API User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Structured data format representing the desired state of the resource, consisting of that resource's properties
     * and their desired values.
     * </p>
     * <note>
     * <p>
     * Cloud Control API currently supports JSON as a structured data format.
     * </p>
     * </note>
     * <p>
     * Specify the desired state as one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A JSON blob
     * </p>
     * </li>
     * <li>
     * <p>
     * A local path containing the desired state in JSON data format
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-create.html#resource-operations-create-desiredstate"
     * >Composing the desired state of the resource</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <p>
     * For more information about the properties of a specific resource, refer to the related topic for the resource in
     * the <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">
     * Resource and property types reference</a> in the <i>Amazon Web Services CloudFormation Users Guide</i>.
     * </p>
     * 
     * @param desiredState
     *        Structured data format representing the desired state of the resource, consisting of that resource's
     *        properties and their desired values. </p> <note>
     *        <p>
     *        Cloud Control API currently supports JSON as a structured data format.
     *        </p>
     *        </note>
     *        <p>
     *        Specify the desired state as one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A JSON blob
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A local path containing the desired state in JSON data format
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-create.html#resource-operations-create-desiredstate"
     *        >Composing the desired state of the resource</a> in the <i>Amazon Web Services Cloud Control API User
     *        Guide</i>.
     *        </p>
     *        <p>
     *        For more information about the properties of a specific resource, refer to the related topic for the
     *        resource in the <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *        >Resource and property types reference</a> in the <i>Amazon Web Services CloudFormation Users Guide</i>.
     */

    public void setDesiredState(String desiredState) {
        this.desiredState = desiredState;
    }

    /**
     * <p>
     * Structured data format representing the desired state of the resource, consisting of that resource's properties
     * and their desired values.
     * </p>
     * <note>
     * <p>
     * Cloud Control API currently supports JSON as a structured data format.
     * </p>
     * </note>
     * <p>
     * Specify the desired state as one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A JSON blob
     * </p>
     * </li>
     * <li>
     * <p>
     * A local path containing the desired state in JSON data format
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-create.html#resource-operations-create-desiredstate"
     * >Composing the desired state of the resource</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <p>
     * For more information about the properties of a specific resource, refer to the related topic for the resource in
     * the <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">
     * Resource and property types reference</a> in the <i>Amazon Web Services CloudFormation Users Guide</i>.
     * </p>
     * 
     * @return Structured data format representing the desired state of the resource, consisting of that resource's
     *         properties and their desired values. </p> <note>
     *         <p>
     *         Cloud Control API currently supports JSON as a structured data format.
     *         </p>
     *         </note>
     *         <p>
     *         Specify the desired state as one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A JSON blob
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A local path containing the desired state in JSON data format
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-create.html#resource-operations-create-desiredstate"
     *         >Composing the desired state of the resource</a> in the <i>Amazon Web Services Cloud Control API User
     *         Guide</i>.
     *         </p>
     *         <p>
     *         For more information about the properties of a specific resource, refer to the related topic for the
     *         resource in the <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *         >Resource and property types reference</a> in the <i>Amazon Web Services CloudFormation Users Guide</i>.
     */

    public String getDesiredState() {
        return this.desiredState;
    }

    /**
     * <p>
     * Structured data format representing the desired state of the resource, consisting of that resource's properties
     * and their desired values.
     * </p>
     * <note>
     * <p>
     * Cloud Control API currently supports JSON as a structured data format.
     * </p>
     * </note>
     * <p>
     * Specify the desired state as one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A JSON blob
     * </p>
     * </li>
     * <li>
     * <p>
     * A local path containing the desired state in JSON data format
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-create.html#resource-operations-create-desiredstate"
     * >Composing the desired state of the resource</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <p>
     * For more information about the properties of a specific resource, refer to the related topic for the resource in
     * the <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">
     * Resource and property types reference</a> in the <i>Amazon Web Services CloudFormation Users Guide</i>.
     * </p>
     * 
     * @param desiredState
     *        Structured data format representing the desired state of the resource, consisting of that resource's
     *        properties and their desired values. </p> <note>
     *        <p>
     *        Cloud Control API currently supports JSON as a structured data format.
     *        </p>
     *        </note>
     *        <p>
     *        Specify the desired state as one of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A JSON blob
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A local path containing the desired state in JSON data format
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-create.html#resource-operations-create-desiredstate"
     *        >Composing the desired state of the resource</a> in the <i>Amazon Web Services Cloud Control API User
     *        Guide</i>.
     *        </p>
     *        <p>
     *        For more information about the properties of a specific resource, refer to the related topic for the
     *        resource in the <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *        >Resource and property types reference</a> in the <i>Amazon Web Services CloudFormation Users Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceRequest withDesiredState(String desiredState) {
        setDesiredState(desiredState);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getTypeVersionId() != null)
            sb.append("TypeVersionId: ").append(getTypeVersionId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDesiredState() != null)
            sb.append("DesiredState: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResourceRequest == false)
            return false;
        CreateResourceRequest other = (CreateResourceRequest) obj;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getTypeVersionId() == null ^ this.getTypeVersionId() == null)
            return false;
        if (other.getTypeVersionId() != null && other.getTypeVersionId().equals(this.getTypeVersionId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDesiredState() == null ^ this.getDesiredState() == null)
            return false;
        if (other.getDesiredState() != null && other.getDesiredState().equals(this.getDesiredState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getTypeVersionId() == null) ? 0 : getTypeVersionId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDesiredState() == null) ? 0 : getDesiredState().hashCode());
        return hashCode;
    }

    @Override
    public CreateResourceRequest clone() {
        return (CreateResourceRequest) super.clone();
    }

}

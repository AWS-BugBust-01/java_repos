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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RegisterUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code>: A user whose identity maps to an existing IAMuser or role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT</code>: A user whose identity is owned and managed internally by Amazon QuickSight.
     * </p>
     * </li>
     * </ul>
     */
    private String identityType;
    /**
     * <p>
     * The email address of the user that you want to register.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for use.
     * </p>
     * </li>
     * </ul>
     */
    private String userRole;
    /**
     * <p>
     * The ARN of the IAMuser or role that you are registering with Amazon QuickSight.
     * </p>
     */
    private String iamArn;
    /**
     * <p>
     * You need to use this parameter only when you register one or more users using an assumed IAMrole. You don't need
     * to provide the session name for other scenarios, for example when you are registering an IAMuser or an Amazon
     * QuickSight user. You can register multiple users using the same IAMrole if each user has a different session
     * name. For more information on assuming IAMroles, see <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/sts/assume-role.html"> <code>assume-role</code> </a> in
     * the <i>AWS CLI Reference.</i>
     * </p>
     */
    private String sessionName;
    /**
     * <p>
     * The ID for the Amazon Web Services account that the user is in. Currently, you use the ID for the Amazon Web
     * Services account that contains your Amazon QuickSight account.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The Amazon QuickSight user name that you want to create for the user you are registering.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * (Enterprise edition only) The name of the custom permissions profile that you want to assign to this user.
     * Customized permissions allows you to control a user's access by restricting access the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Create and update data sources
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update datasets
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update email reports
     * </p>
     * </li>
     * <li>
     * <p>
     * Subscribe to email reports
     * </p>
     * </li>
     * </ul>
     * <p>
     * To add custom permissions to an existing user, use <code> <a>UpdateUser</a> </code> instead.
     * </p>
     * <p>
     * A set of custom permissions includes any combination of these restrictions. Currently, you need to create the
     * profile names for custom permission sets by using the Amazon QuickSight console. Then, you use the
     * <code>RegisterUser</code> API operation to assign the named set of permissions to a Amazon QuickSight user.
     * </p>
     * <p>
     * Amazon QuickSight custom permissions are applied through IAMpolicies. Therefore, they override the permissions
     * typically granted by assigning Amazon QuickSight users to one of the default security cohorts in Amazon
     * QuickSight (admin, author, reader).
     * </p>
     * <p>
     * This feature is available only to Amazon QuickSight Enterprise edition subscriptions.
     * </p>
     */
    private String customPermissionsName;
    /**
     * <p>
     * The type of supported external login provider that provides identity to let a user federate into Amazon
     * QuickSight with an associated Identity and Access Management(IAM) role. The type of supported external login
     * provider can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COGNITO</code>: Amazon Cognito. The provider URL is cognito-identity.amazonaws.com. When choosing the
     * <code>COGNITO</code> provider type, don’t use the "CustomFederationProviderUrl" parameter which is only needed
     * when the external provider is custom.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_OIDC</code>: Custom OpenID Connect (OIDC) provider. When choosing <code>CUSTOM_OIDC</code> type, use
     * the <code>CustomFederationProviderUrl</code> parameter to provide the custom OIDC provider URL.
     * </p>
     * </li>
     * </ul>
     */
    private String externalLoginFederationProviderType;
    /**
     * <p>
     * The URL of the custom OpenID Connect (OIDC) provider that provides identity to let a user federate into Amazon
     * QuickSight with an associated Identity and Access Management(IAM) role. This parameter should only be used when
     * <code>ExternalLoginFederationProviderType</code> parameter is set to <code>CUSTOM_OIDC</code>.
     * </p>
     */
    private String customFederationProviderUrl;
    /**
     * <p>
     * The identity ID for a user in the external login provider.
     * </p>
     */
    private String externalLoginId;

    /**
     * <p>
     * Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code>: A user whose identity maps to an existing IAMuser or role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT</code>: A user whose identity is owned and managed internally by Amazon QuickSight.
     * </p>
     * </li>
     * </ul>
     * 
     * @param identityType
     *        Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts two
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IAM</code>: A user whose identity maps to an existing IAMuser or role.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUICKSIGHT</code>: A user whose identity is owned and managed internally by Amazon QuickSight.
     *        </p>
     *        </li>
     * @see IdentityType
     */

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * <p>
     * Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code>: A user whose identity maps to an existing IAMuser or role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT</code>: A user whose identity is owned and managed internally by Amazon QuickSight.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts two
     *         values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IAM</code>: A user whose identity maps to an existing IAMuser or role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>QUICKSIGHT</code>: A user whose identity is owned and managed internally by Amazon QuickSight.
     *         </p>
     *         </li>
     * @see IdentityType
     */

    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * <p>
     * Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code>: A user whose identity maps to an existing IAMuser or role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT</code>: A user whose identity is owned and managed internally by Amazon QuickSight.
     * </p>
     * </li>
     * </ul>
     * 
     * @param identityType
     *        Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts two
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IAM</code>: A user whose identity maps to an existing IAMuser or role.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUICKSIGHT</code>: A user whose identity is owned and managed internally by Amazon QuickSight.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public RegisterUserRequest withIdentityType(String identityType) {
        setIdentityType(identityType);
        return this;
    }

    /**
     * <p>
     * Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code>: A user whose identity maps to an existing IAMuser or role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT</code>: A user whose identity is owned and managed internally by Amazon QuickSight.
     * </p>
     * </li>
     * </ul>
     * 
     * @param identityType
     *        Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts two
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IAM</code>: A user whose identity maps to an existing IAMuser or role.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUICKSIGHT</code>: A user whose identity is owned and managed internally by Amazon QuickSight.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public RegisterUserRequest withIdentityType(IdentityType identityType) {
        this.identityType = identityType.toString();
        return this;
    }

    /**
     * <p>
     * The email address of the user that you want to register.
     * </p>
     * 
     * @param email
     *        The email address of the user that you want to register.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address of the user that you want to register.
     * </p>
     * 
     * @return The email address of the user that you want to register.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email address of the user that you want to register.
     * </p>
     * 
     * @param email
     *        The email address of the user that you want to register.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterUserRequest withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param userRole
     *        The Amazon QuickSight role for the user. The user role can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>READER</code>: A user who has read-only access to dashboards.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESTRICTED_READER</code>: This role isn't currently available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for use.
     *        </p>
     *        </li>
     * @see UserRole
     */

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon QuickSight role for the user. The user role can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>READER</code>: A user who has read-only access to dashboards.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESTRICTED_READER</code>: This role isn't currently available for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for use.
     *         </p>
     *         </li>
     * @see UserRole
     */

    public String getUserRole() {
        return this.userRole;
    }

    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param userRole
     *        The Amazon QuickSight role for the user. The user role can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>READER</code>: A user who has read-only access to dashboards.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESTRICTED_READER</code>: This role isn't currently available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserRole
     */

    public RegisterUserRequest withUserRole(String userRole) {
        setUserRole(userRole);
        return this;
    }

    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param userRole
     *        The Amazon QuickSight role for the user. The user role can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>READER</code>: A user who has read-only access to dashboards.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AUTHOR</code>: A user who can create data sources, datasets, analyses, and dashboards.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADMIN</code>: A user who is an author, who can also manage Amazon QuickSight settings.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESTRICTED_READER</code>: This role isn't currently available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserRole
     */

    public RegisterUserRequest withUserRole(UserRole userRole) {
        this.userRole = userRole.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the IAMuser or role that you are registering with Amazon QuickSight.
     * </p>
     * 
     * @param iamArn
     *        The ARN of the IAMuser or role that you are registering with Amazon QuickSight.
     */

    public void setIamArn(String iamArn) {
        this.iamArn = iamArn;
    }

    /**
     * <p>
     * The ARN of the IAMuser or role that you are registering with Amazon QuickSight.
     * </p>
     * 
     * @return The ARN of the IAMuser or role that you are registering with Amazon QuickSight.
     */

    public String getIamArn() {
        return this.iamArn;
    }

    /**
     * <p>
     * The ARN of the IAMuser or role that you are registering with Amazon QuickSight.
     * </p>
     * 
     * @param iamArn
     *        The ARN of the IAMuser or role that you are registering with Amazon QuickSight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterUserRequest withIamArn(String iamArn) {
        setIamArn(iamArn);
        return this;
    }

    /**
     * <p>
     * You need to use this parameter only when you register one or more users using an assumed IAMrole. You don't need
     * to provide the session name for other scenarios, for example when you are registering an IAMuser or an Amazon
     * QuickSight user. You can register multiple users using the same IAMrole if each user has a different session
     * name. For more information on assuming IAMroles, see <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/sts/assume-role.html"> <code>assume-role</code> </a> in
     * the <i>AWS CLI Reference.</i>
     * </p>
     * 
     * @param sessionName
     *        You need to use this parameter only when you register one or more users using an assumed IAMrole. You
     *        don't need to provide the session name for other scenarios, for example when you are registering an
     *        IAMuser or an Amazon QuickSight user. You can register multiple users using the same IAMrole if each user
     *        has a different session name. For more information on assuming IAMroles, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/sts/assume-role.html"> <code>assume-role</code>
     *        </a> in the <i>AWS CLI Reference.</i>
     */

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    /**
     * <p>
     * You need to use this parameter only when you register one or more users using an assumed IAMrole. You don't need
     * to provide the session name for other scenarios, for example when you are registering an IAMuser or an Amazon
     * QuickSight user. You can register multiple users using the same IAMrole if each user has a different session
     * name. For more information on assuming IAMroles, see <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/sts/assume-role.html"> <code>assume-role</code> </a> in
     * the <i>AWS CLI Reference.</i>
     * </p>
     * 
     * @return You need to use this parameter only when you register one or more users using an assumed IAMrole. You
     *         don't need to provide the session name for other scenarios, for example when you are registering an
     *         IAMuser or an Amazon QuickSight user. You can register multiple users using the same IAMrole if each user
     *         has a different session name. For more information on assuming IAMroles, see <a
     *         href="https://docs.aws.amazon.com/cli/latest/reference/sts/assume-role.html"> <code>assume-role</code>
     *         </a> in the <i>AWS CLI Reference.</i>
     */

    public String getSessionName() {
        return this.sessionName;
    }

    /**
     * <p>
     * You need to use this parameter only when you register one or more users using an assumed IAMrole. You don't need
     * to provide the session name for other scenarios, for example when you are registering an IAMuser or an Amazon
     * QuickSight user. You can register multiple users using the same IAMrole if each user has a different session
     * name. For more information on assuming IAMroles, see <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/sts/assume-role.html"> <code>assume-role</code> </a> in
     * the <i>AWS CLI Reference.</i>
     * </p>
     * 
     * @param sessionName
     *        You need to use this parameter only when you register one or more users using an assumed IAMrole. You
     *        don't need to provide the session name for other scenarios, for example when you are registering an
     *        IAMuser or an Amazon QuickSight user. You can register multiple users using the same IAMrole if each user
     *        has a different session name. For more information on assuming IAMroles, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/sts/assume-role.html"> <code>assume-role</code>
     *        </a> in the <i>AWS CLI Reference.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterUserRequest withSessionName(String sessionName) {
        setSessionName(sessionName);
        return this;
    }

    /**
     * <p>
     * The ID for the Amazon Web Services account that the user is in. Currently, you use the ID for the Amazon Web
     * Services account that contains your Amazon QuickSight account.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the Amazon Web Services account that the user is in. Currently, you use the ID for the Amazon
     *        Web Services account that contains your Amazon QuickSight account.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the Amazon Web Services account that the user is in. Currently, you use the ID for the Amazon Web
     * Services account that contains your Amazon QuickSight account.
     * </p>
     * 
     * @return The ID for the Amazon Web Services account that the user is in. Currently, you use the ID for the Amazon
     *         Web Services account that contains your Amazon QuickSight account.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID for the Amazon Web Services account that the user is in. Currently, you use the ID for the Amazon Web
     * Services account that contains your Amazon QuickSight account.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the Amazon Web Services account that the user is in. Currently, you use the ID for the Amazon
     *        Web Services account that contains your Amazon QuickSight account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterUserRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * 
     * @param namespace
     *        The namespace. Currently, you should set this to <code>default</code>.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * 
     * @return The namespace. Currently, you should set this to <code>default</code>.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * 
     * @param namespace
     *        The namespace. Currently, you should set this to <code>default</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterUserRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The Amazon QuickSight user name that you want to create for the user you are registering.
     * </p>
     * 
     * @param userName
     *        The Amazon QuickSight user name that you want to create for the user you are registering.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The Amazon QuickSight user name that you want to create for the user you are registering.
     * </p>
     * 
     * @return The Amazon QuickSight user name that you want to create for the user you are registering.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The Amazon QuickSight user name that you want to create for the user you are registering.
     * </p>
     * 
     * @param userName
     *        The Amazon QuickSight user name that you want to create for the user you are registering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterUserRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * (Enterprise edition only) The name of the custom permissions profile that you want to assign to this user.
     * Customized permissions allows you to control a user's access by restricting access the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Create and update data sources
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update datasets
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update email reports
     * </p>
     * </li>
     * <li>
     * <p>
     * Subscribe to email reports
     * </p>
     * </li>
     * </ul>
     * <p>
     * To add custom permissions to an existing user, use <code> <a>UpdateUser</a> </code> instead.
     * </p>
     * <p>
     * A set of custom permissions includes any combination of these restrictions. Currently, you need to create the
     * profile names for custom permission sets by using the Amazon QuickSight console. Then, you use the
     * <code>RegisterUser</code> API operation to assign the named set of permissions to a Amazon QuickSight user.
     * </p>
     * <p>
     * Amazon QuickSight custom permissions are applied through IAMpolicies. Therefore, they override the permissions
     * typically granted by assigning Amazon QuickSight users to one of the default security cohorts in Amazon
     * QuickSight (admin, author, reader).
     * </p>
     * <p>
     * This feature is available only to Amazon QuickSight Enterprise edition subscriptions.
     * </p>
     * 
     * @param customPermissionsName
     *        (Enterprise edition only) The name of the custom permissions profile that you want to assign to this user.
     *        Customized permissions allows you to control a user's access by restricting access the following
     *        operations:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Create and update data sources
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Create and update datasets
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Create and update email reports
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Subscribe to email reports
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To add custom permissions to an existing user, use <code> <a>UpdateUser</a> </code> instead.
     *        </p>
     *        <p>
     *        A set of custom permissions includes any combination of these restrictions. Currently, you need to create
     *        the profile names for custom permission sets by using the Amazon QuickSight console. Then, you use the
     *        <code>RegisterUser</code> API operation to assign the named set of permissions to a Amazon QuickSight
     *        user.
     *        </p>
     *        <p>
     *        Amazon QuickSight custom permissions are applied through IAMpolicies. Therefore, they override the
     *        permissions typically granted by assigning Amazon QuickSight users to one of the default security cohorts
     *        in Amazon QuickSight (admin, author, reader).
     *        </p>
     *        <p>
     *        This feature is available only to Amazon QuickSight Enterprise edition subscriptions.
     */

    public void setCustomPermissionsName(String customPermissionsName) {
        this.customPermissionsName = customPermissionsName;
    }

    /**
     * <p>
     * (Enterprise edition only) The name of the custom permissions profile that you want to assign to this user.
     * Customized permissions allows you to control a user's access by restricting access the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Create and update data sources
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update datasets
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update email reports
     * </p>
     * </li>
     * <li>
     * <p>
     * Subscribe to email reports
     * </p>
     * </li>
     * </ul>
     * <p>
     * To add custom permissions to an existing user, use <code> <a>UpdateUser</a> </code> instead.
     * </p>
     * <p>
     * A set of custom permissions includes any combination of these restrictions. Currently, you need to create the
     * profile names for custom permission sets by using the Amazon QuickSight console. Then, you use the
     * <code>RegisterUser</code> API operation to assign the named set of permissions to a Amazon QuickSight user.
     * </p>
     * <p>
     * Amazon QuickSight custom permissions are applied through IAMpolicies. Therefore, they override the permissions
     * typically granted by assigning Amazon QuickSight users to one of the default security cohorts in Amazon
     * QuickSight (admin, author, reader).
     * </p>
     * <p>
     * This feature is available only to Amazon QuickSight Enterprise edition subscriptions.
     * </p>
     * 
     * @return (Enterprise edition only) The name of the custom permissions profile that you want to assign to this
     *         user. Customized permissions allows you to control a user's access by restricting access the following
     *         operations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Create and update data sources
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Create and update datasets
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Create and update email reports
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Subscribe to email reports
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To add custom permissions to an existing user, use <code> <a>UpdateUser</a> </code> instead.
     *         </p>
     *         <p>
     *         A set of custom permissions includes any combination of these restrictions. Currently, you need to create
     *         the profile names for custom permission sets by using the Amazon QuickSight console. Then, you use the
     *         <code>RegisterUser</code> API operation to assign the named set of permissions to a Amazon QuickSight
     *         user.
     *         </p>
     *         <p>
     *         Amazon QuickSight custom permissions are applied through IAMpolicies. Therefore, they override the
     *         permissions typically granted by assigning Amazon QuickSight users to one of the default security cohorts
     *         in Amazon QuickSight (admin, author, reader).
     *         </p>
     *         <p>
     *         This feature is available only to Amazon QuickSight Enterprise edition subscriptions.
     */

    public String getCustomPermissionsName() {
        return this.customPermissionsName;
    }

    /**
     * <p>
     * (Enterprise edition only) The name of the custom permissions profile that you want to assign to this user.
     * Customized permissions allows you to control a user's access by restricting access the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Create and update data sources
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update datasets
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update email reports
     * </p>
     * </li>
     * <li>
     * <p>
     * Subscribe to email reports
     * </p>
     * </li>
     * </ul>
     * <p>
     * To add custom permissions to an existing user, use <code> <a>UpdateUser</a> </code> instead.
     * </p>
     * <p>
     * A set of custom permissions includes any combination of these restrictions. Currently, you need to create the
     * profile names for custom permission sets by using the Amazon QuickSight console. Then, you use the
     * <code>RegisterUser</code> API operation to assign the named set of permissions to a Amazon QuickSight user.
     * </p>
     * <p>
     * Amazon QuickSight custom permissions are applied through IAMpolicies. Therefore, they override the permissions
     * typically granted by assigning Amazon QuickSight users to one of the default security cohorts in Amazon
     * QuickSight (admin, author, reader).
     * </p>
     * <p>
     * This feature is available only to Amazon QuickSight Enterprise edition subscriptions.
     * </p>
     * 
     * @param customPermissionsName
     *        (Enterprise edition only) The name of the custom permissions profile that you want to assign to this user.
     *        Customized permissions allows you to control a user's access by restricting access the following
     *        operations:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Create and update data sources
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Create and update datasets
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Create and update email reports
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Subscribe to email reports
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To add custom permissions to an existing user, use <code> <a>UpdateUser</a> </code> instead.
     *        </p>
     *        <p>
     *        A set of custom permissions includes any combination of these restrictions. Currently, you need to create
     *        the profile names for custom permission sets by using the Amazon QuickSight console. Then, you use the
     *        <code>RegisterUser</code> API operation to assign the named set of permissions to a Amazon QuickSight
     *        user.
     *        </p>
     *        <p>
     *        Amazon QuickSight custom permissions are applied through IAMpolicies. Therefore, they override the
     *        permissions typically granted by assigning Amazon QuickSight users to one of the default security cohorts
     *        in Amazon QuickSight (admin, author, reader).
     *        </p>
     *        <p>
     *        This feature is available only to Amazon QuickSight Enterprise edition subscriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterUserRequest withCustomPermissionsName(String customPermissionsName) {
        setCustomPermissionsName(customPermissionsName);
        return this;
    }

    /**
     * <p>
     * The type of supported external login provider that provides identity to let a user federate into Amazon
     * QuickSight with an associated Identity and Access Management(IAM) role. The type of supported external login
     * provider can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COGNITO</code>: Amazon Cognito. The provider URL is cognito-identity.amazonaws.com. When choosing the
     * <code>COGNITO</code> provider type, don’t use the "CustomFederationProviderUrl" parameter which is only needed
     * when the external provider is custom.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_OIDC</code>: Custom OpenID Connect (OIDC) provider. When choosing <code>CUSTOM_OIDC</code> type, use
     * the <code>CustomFederationProviderUrl</code> parameter to provide the custom OIDC provider URL.
     * </p>
     * </li>
     * </ul>
     * 
     * @param externalLoginFederationProviderType
     *        The type of supported external login provider that provides identity to let a user federate into Amazon
     *        QuickSight with an associated Identity and Access Management(IAM) role. The type of supported external
     *        login provider can be one of the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COGNITO</code>: Amazon Cognito. The provider URL is cognito-identity.amazonaws.com. When choosing
     *        the <code>COGNITO</code> provider type, don’t use the "CustomFederationProviderUrl" parameter which is
     *        only needed when the external provider is custom.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOM_OIDC</code>: Custom OpenID Connect (OIDC) provider. When choosing <code>CUSTOM_OIDC</code>
     *        type, use the <code>CustomFederationProviderUrl</code> parameter to provide the custom OIDC provider URL.
     *        </p>
     *        </li>
     */

    public void setExternalLoginFederationProviderType(String externalLoginFederationProviderType) {
        this.externalLoginFederationProviderType = externalLoginFederationProviderType;
    }

    /**
     * <p>
     * The type of supported external login provider that provides identity to let a user federate into Amazon
     * QuickSight with an associated Identity and Access Management(IAM) role. The type of supported external login
     * provider can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COGNITO</code>: Amazon Cognito. The provider URL is cognito-identity.amazonaws.com. When choosing the
     * <code>COGNITO</code> provider type, don’t use the "CustomFederationProviderUrl" parameter which is only needed
     * when the external provider is custom.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_OIDC</code>: Custom OpenID Connect (OIDC) provider. When choosing <code>CUSTOM_OIDC</code> type, use
     * the <code>CustomFederationProviderUrl</code> parameter to provide the custom OIDC provider URL.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of supported external login provider that provides identity to let a user federate into Amazon
     *         QuickSight with an associated Identity and Access Management(IAM) role. The type of supported external
     *         login provider can be one of the following.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>COGNITO</code>: Amazon Cognito. The provider URL is cognito-identity.amazonaws.com. When choosing
     *         the <code>COGNITO</code> provider type, don’t use the "CustomFederationProviderUrl" parameter which is
     *         only needed when the external provider is custom.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CUSTOM_OIDC</code>: Custom OpenID Connect (OIDC) provider. When choosing <code>CUSTOM_OIDC</code>
     *         type, use the <code>CustomFederationProviderUrl</code> parameter to provide the custom OIDC provider URL.
     *         </p>
     *         </li>
     */

    public String getExternalLoginFederationProviderType() {
        return this.externalLoginFederationProviderType;
    }

    /**
     * <p>
     * The type of supported external login provider that provides identity to let a user federate into Amazon
     * QuickSight with an associated Identity and Access Management(IAM) role. The type of supported external login
     * provider can be one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COGNITO</code>: Amazon Cognito. The provider URL is cognito-identity.amazonaws.com. When choosing the
     * <code>COGNITO</code> provider type, don’t use the "CustomFederationProviderUrl" parameter which is only needed
     * when the external provider is custom.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CUSTOM_OIDC</code>: Custom OpenID Connect (OIDC) provider. When choosing <code>CUSTOM_OIDC</code> type, use
     * the <code>CustomFederationProviderUrl</code> parameter to provide the custom OIDC provider URL.
     * </p>
     * </li>
     * </ul>
     * 
     * @param externalLoginFederationProviderType
     *        The type of supported external login provider that provides identity to let a user federate into Amazon
     *        QuickSight with an associated Identity and Access Management(IAM) role. The type of supported external
     *        login provider can be one of the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COGNITO</code>: Amazon Cognito. The provider URL is cognito-identity.amazonaws.com. When choosing
     *        the <code>COGNITO</code> provider type, don’t use the "CustomFederationProviderUrl" parameter which is
     *        only needed when the external provider is custom.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CUSTOM_OIDC</code>: Custom OpenID Connect (OIDC) provider. When choosing <code>CUSTOM_OIDC</code>
     *        type, use the <code>CustomFederationProviderUrl</code> parameter to provide the custom OIDC provider URL.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterUserRequest withExternalLoginFederationProviderType(String externalLoginFederationProviderType) {
        setExternalLoginFederationProviderType(externalLoginFederationProviderType);
        return this;
    }

    /**
     * <p>
     * The URL of the custom OpenID Connect (OIDC) provider that provides identity to let a user federate into Amazon
     * QuickSight with an associated Identity and Access Management(IAM) role. This parameter should only be used when
     * <code>ExternalLoginFederationProviderType</code> parameter is set to <code>CUSTOM_OIDC</code>.
     * </p>
     * 
     * @param customFederationProviderUrl
     *        The URL of the custom OpenID Connect (OIDC) provider that provides identity to let a user federate into
     *        Amazon QuickSight with an associated Identity and Access Management(IAM) role. This parameter should only
     *        be used when <code>ExternalLoginFederationProviderType</code> parameter is set to <code>CUSTOM_OIDC</code>
     *        .
     */

    public void setCustomFederationProviderUrl(String customFederationProviderUrl) {
        this.customFederationProviderUrl = customFederationProviderUrl;
    }

    /**
     * <p>
     * The URL of the custom OpenID Connect (OIDC) provider that provides identity to let a user federate into Amazon
     * QuickSight with an associated Identity and Access Management(IAM) role. This parameter should only be used when
     * <code>ExternalLoginFederationProviderType</code> parameter is set to <code>CUSTOM_OIDC</code>.
     * </p>
     * 
     * @return The URL of the custom OpenID Connect (OIDC) provider that provides identity to let a user federate into
     *         Amazon QuickSight with an associated Identity and Access Management(IAM) role. This parameter should only
     *         be used when <code>ExternalLoginFederationProviderType</code> parameter is set to
     *         <code>CUSTOM_OIDC</code>.
     */

    public String getCustomFederationProviderUrl() {
        return this.customFederationProviderUrl;
    }

    /**
     * <p>
     * The URL of the custom OpenID Connect (OIDC) provider that provides identity to let a user federate into Amazon
     * QuickSight with an associated Identity and Access Management(IAM) role. This parameter should only be used when
     * <code>ExternalLoginFederationProviderType</code> parameter is set to <code>CUSTOM_OIDC</code>.
     * </p>
     * 
     * @param customFederationProviderUrl
     *        The URL of the custom OpenID Connect (OIDC) provider that provides identity to let a user federate into
     *        Amazon QuickSight with an associated Identity and Access Management(IAM) role. This parameter should only
     *        be used when <code>ExternalLoginFederationProviderType</code> parameter is set to <code>CUSTOM_OIDC</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterUserRequest withCustomFederationProviderUrl(String customFederationProviderUrl) {
        setCustomFederationProviderUrl(customFederationProviderUrl);
        return this;
    }

    /**
     * <p>
     * The identity ID for a user in the external login provider.
     * </p>
     * 
     * @param externalLoginId
     *        The identity ID for a user in the external login provider.
     */

    public void setExternalLoginId(String externalLoginId) {
        this.externalLoginId = externalLoginId;
    }

    /**
     * <p>
     * The identity ID for a user in the external login provider.
     * </p>
     * 
     * @return The identity ID for a user in the external login provider.
     */

    public String getExternalLoginId() {
        return this.externalLoginId;
    }

    /**
     * <p>
     * The identity ID for a user in the external login provider.
     * </p>
     * 
     * @param externalLoginId
     *        The identity ID for a user in the external login provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterUserRequest withExternalLoginId(String externalLoginId) {
        setExternalLoginId(externalLoginId);
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
        if (getIdentityType() != null)
            sb.append("IdentityType: ").append(getIdentityType()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getUserRole() != null)
            sb.append("UserRole: ").append(getUserRole()).append(",");
        if (getIamArn() != null)
            sb.append("IamArn: ").append(getIamArn()).append(",");
        if (getSessionName() != null)
            sb.append("SessionName: ").append(getSessionName()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getCustomPermissionsName() != null)
            sb.append("CustomPermissionsName: ").append(getCustomPermissionsName()).append(",");
        if (getExternalLoginFederationProviderType() != null)
            sb.append("ExternalLoginFederationProviderType: ").append(getExternalLoginFederationProviderType()).append(",");
        if (getCustomFederationProviderUrl() != null)
            sb.append("CustomFederationProviderUrl: ").append(getCustomFederationProviderUrl()).append(",");
        if (getExternalLoginId() != null)
            sb.append("ExternalLoginId: ").append(getExternalLoginId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterUserRequest == false)
            return false;
        RegisterUserRequest other = (RegisterUserRequest) obj;
        if (other.getIdentityType() == null ^ this.getIdentityType() == null)
            return false;
        if (other.getIdentityType() != null && other.getIdentityType().equals(this.getIdentityType()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getUserRole() == null ^ this.getUserRole() == null)
            return false;
        if (other.getUserRole() != null && other.getUserRole().equals(this.getUserRole()) == false)
            return false;
        if (other.getIamArn() == null ^ this.getIamArn() == null)
            return false;
        if (other.getIamArn() != null && other.getIamArn().equals(this.getIamArn()) == false)
            return false;
        if (other.getSessionName() == null ^ this.getSessionName() == null)
            return false;
        if (other.getSessionName() != null && other.getSessionName().equals(this.getSessionName()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getCustomPermissionsName() == null ^ this.getCustomPermissionsName() == null)
            return false;
        if (other.getCustomPermissionsName() != null && other.getCustomPermissionsName().equals(this.getCustomPermissionsName()) == false)
            return false;
        if (other.getExternalLoginFederationProviderType() == null ^ this.getExternalLoginFederationProviderType() == null)
            return false;
        if (other.getExternalLoginFederationProviderType() != null
                && other.getExternalLoginFederationProviderType().equals(this.getExternalLoginFederationProviderType()) == false)
            return false;
        if (other.getCustomFederationProviderUrl() == null ^ this.getCustomFederationProviderUrl() == null)
            return false;
        if (other.getCustomFederationProviderUrl() != null && other.getCustomFederationProviderUrl().equals(this.getCustomFederationProviderUrl()) == false)
            return false;
        if (other.getExternalLoginId() == null ^ this.getExternalLoginId() == null)
            return false;
        if (other.getExternalLoginId() != null && other.getExternalLoginId().equals(this.getExternalLoginId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityType() == null) ? 0 : getIdentityType().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getUserRole() == null) ? 0 : getUserRole().hashCode());
        hashCode = prime * hashCode + ((getIamArn() == null) ? 0 : getIamArn().hashCode());
        hashCode = prime * hashCode + ((getSessionName() == null) ? 0 : getSessionName().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getCustomPermissionsName() == null) ? 0 : getCustomPermissionsName().hashCode());
        hashCode = prime * hashCode + ((getExternalLoginFederationProviderType() == null) ? 0 : getExternalLoginFederationProviderType().hashCode());
        hashCode = prime * hashCode + ((getCustomFederationProviderUrl() == null) ? 0 : getCustomFederationProviderUrl().hashCode());
        hashCode = prime * hashCode + ((getExternalLoginId() == null) ? 0 : getExternalLoginId().hashCode());
        return hashCode;
    }

    @Override
    public RegisterUserRequest clone() {
        return (RegisterUserRequest) super.clone();
    }

}

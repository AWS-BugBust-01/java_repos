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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the configuration information to fetch access levels of groups and users from an AWS Single Sign-On identity
 * source. This is useful for setting up user context filtering, where Amazon Kendra filters search results for
 * different users based on their group's access to documents. You can also map your users to their groups for user
 * context filtering using the <a
 * href="https://docs.aws.amazon.com/latest/dg/API_PutPrincipalMapping.html">PutPrincipalMapping operation</a>.
 * </p>
 * <p>
 * To set up an AWS SSO identity source in the console to use with Amazon Kendra, see <a
 * href="https://docs.aws.amazon.com/kendra/latest/dg/getting-started-aws-sso.html">Getting started with an AWS SSO
 * identity source</a>. You must also grant the required permissions to use AWS SSO with Amazon Kendra. For more
 * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html#iam-roles-aws-sso">IAM roles
 * for AWS Single Sign-On</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UserGroupResolutionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserGroupResolutionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identity store provider (mode) you want to use to fetch access levels of groups and users. AWS Single Sign-On
     * is currently the only available mode. Your users and groups must exist in an AWS SSO identity source in order to
     * use this mode.
     * </p>
     */
    private String userGroupResolutionMode;

    /**
     * <p>
     * The identity store provider (mode) you want to use to fetch access levels of groups and users. AWS Single Sign-On
     * is currently the only available mode. Your users and groups must exist in an AWS SSO identity source in order to
     * use this mode.
     * </p>
     * 
     * @param userGroupResolutionMode
     *        The identity store provider (mode) you want to use to fetch access levels of groups and users. AWS Single
     *        Sign-On is currently the only available mode. Your users and groups must exist in an AWS SSO identity
     *        source in order to use this mode.
     * @see UserGroupResolutionMode
     */

    public void setUserGroupResolutionMode(String userGroupResolutionMode) {
        this.userGroupResolutionMode = userGroupResolutionMode;
    }

    /**
     * <p>
     * The identity store provider (mode) you want to use to fetch access levels of groups and users. AWS Single Sign-On
     * is currently the only available mode. Your users and groups must exist in an AWS SSO identity source in order to
     * use this mode.
     * </p>
     * 
     * @return The identity store provider (mode) you want to use to fetch access levels of groups and users. AWS Single
     *         Sign-On is currently the only available mode. Your users and groups must exist in an AWS SSO identity
     *         source in order to use this mode.
     * @see UserGroupResolutionMode
     */

    public String getUserGroupResolutionMode() {
        return this.userGroupResolutionMode;
    }

    /**
     * <p>
     * The identity store provider (mode) you want to use to fetch access levels of groups and users. AWS Single Sign-On
     * is currently the only available mode. Your users and groups must exist in an AWS SSO identity source in order to
     * use this mode.
     * </p>
     * 
     * @param userGroupResolutionMode
     *        The identity store provider (mode) you want to use to fetch access levels of groups and users. AWS Single
     *        Sign-On is currently the only available mode. Your users and groups must exist in an AWS SSO identity
     *        source in order to use this mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserGroupResolutionMode
     */

    public UserGroupResolutionConfiguration withUserGroupResolutionMode(String userGroupResolutionMode) {
        setUserGroupResolutionMode(userGroupResolutionMode);
        return this;
    }

    /**
     * <p>
     * The identity store provider (mode) you want to use to fetch access levels of groups and users. AWS Single Sign-On
     * is currently the only available mode. Your users and groups must exist in an AWS SSO identity source in order to
     * use this mode.
     * </p>
     * 
     * @param userGroupResolutionMode
     *        The identity store provider (mode) you want to use to fetch access levels of groups and users. AWS Single
     *        Sign-On is currently the only available mode. Your users and groups must exist in an AWS SSO identity
     *        source in order to use this mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserGroupResolutionMode
     */

    public UserGroupResolutionConfiguration withUserGroupResolutionMode(UserGroupResolutionMode userGroupResolutionMode) {
        this.userGroupResolutionMode = userGroupResolutionMode.toString();
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
        if (getUserGroupResolutionMode() != null)
            sb.append("UserGroupResolutionMode: ").append(getUserGroupResolutionMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserGroupResolutionConfiguration == false)
            return false;
        UserGroupResolutionConfiguration other = (UserGroupResolutionConfiguration) obj;
        if (other.getUserGroupResolutionMode() == null ^ this.getUserGroupResolutionMode() == null)
            return false;
        if (other.getUserGroupResolutionMode() != null && other.getUserGroupResolutionMode().equals(this.getUserGroupResolutionMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserGroupResolutionMode() == null) ? 0 : getUserGroupResolutionMode().hashCode());
        return hashCode;
    }

    @Override
    public UserGroupResolutionConfiguration clone() {
        try {
            return (UserGroupResolutionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.UserGroupResolutionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

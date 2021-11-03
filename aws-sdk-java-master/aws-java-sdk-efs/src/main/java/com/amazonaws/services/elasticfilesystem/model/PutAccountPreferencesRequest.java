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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/PutAccountPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAccountPreferencesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the EFS resource ID preference to set for the user's Amazon Web Services account, in the current Amazon
     * Web Services Region, either <code>LONG_ID</code> (17 characters), or <code>SHORT_ID</code> (8 characters).
     * </p>
     * <note>
     * <p>
     * Starting in October, 2021, you will receive an error when setting the account preference to <code>SHORT_ID</code>
     * . Contact Amazon Web Services support if you receive an error and need to use short IDs for file system and mount
     * target resources.
     * </p>
     * </note>
     */
    private String resourceIdType;

    /**
     * <p>
     * Specifies the EFS resource ID preference to set for the user's Amazon Web Services account, in the current Amazon
     * Web Services Region, either <code>LONG_ID</code> (17 characters), or <code>SHORT_ID</code> (8 characters).
     * </p>
     * <note>
     * <p>
     * Starting in October, 2021, you will receive an error when setting the account preference to <code>SHORT_ID</code>
     * . Contact Amazon Web Services support if you receive an error and need to use short IDs for file system and mount
     * target resources.
     * </p>
     * </note>
     * 
     * @param resourceIdType
     *        Specifies the EFS resource ID preference to set for the user's Amazon Web Services account, in the current
     *        Amazon Web Services Region, either <code>LONG_ID</code> (17 characters), or <code>SHORT_ID</code> (8
     *        characters).</p> <note>
     *        <p>
     *        Starting in October, 2021, you will receive an error when setting the account preference to
     *        <code>SHORT_ID</code>. Contact Amazon Web Services support if you receive an error and need to use short
     *        IDs for file system and mount target resources.
     *        </p>
     * @see ResourceIdType
     */

    public void setResourceIdType(String resourceIdType) {
        this.resourceIdType = resourceIdType;
    }

    /**
     * <p>
     * Specifies the EFS resource ID preference to set for the user's Amazon Web Services account, in the current Amazon
     * Web Services Region, either <code>LONG_ID</code> (17 characters), or <code>SHORT_ID</code> (8 characters).
     * </p>
     * <note>
     * <p>
     * Starting in October, 2021, you will receive an error when setting the account preference to <code>SHORT_ID</code>
     * . Contact Amazon Web Services support if you receive an error and need to use short IDs for file system and mount
     * target resources.
     * </p>
     * </note>
     * 
     * @return Specifies the EFS resource ID preference to set for the user's Amazon Web Services account, in the
     *         current Amazon Web Services Region, either <code>LONG_ID</code> (17 characters), or <code>SHORT_ID</code>
     *         (8 characters).</p> <note>
     *         <p>
     *         Starting in October, 2021, you will receive an error when setting the account preference to
     *         <code>SHORT_ID</code>. Contact Amazon Web Services support if you receive an error and need to use short
     *         IDs for file system and mount target resources.
     *         </p>
     * @see ResourceIdType
     */

    public String getResourceIdType() {
        return this.resourceIdType;
    }

    /**
     * <p>
     * Specifies the EFS resource ID preference to set for the user's Amazon Web Services account, in the current Amazon
     * Web Services Region, either <code>LONG_ID</code> (17 characters), or <code>SHORT_ID</code> (8 characters).
     * </p>
     * <note>
     * <p>
     * Starting in October, 2021, you will receive an error when setting the account preference to <code>SHORT_ID</code>
     * . Contact Amazon Web Services support if you receive an error and need to use short IDs for file system and mount
     * target resources.
     * </p>
     * </note>
     * 
     * @param resourceIdType
     *        Specifies the EFS resource ID preference to set for the user's Amazon Web Services account, in the current
     *        Amazon Web Services Region, either <code>LONG_ID</code> (17 characters), or <code>SHORT_ID</code> (8
     *        characters).</p> <note>
     *        <p>
     *        Starting in October, 2021, you will receive an error when setting the account preference to
     *        <code>SHORT_ID</code>. Contact Amazon Web Services support if you receive an error and need to use short
     *        IDs for file system and mount target resources.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceIdType
     */

    public PutAccountPreferencesRequest withResourceIdType(String resourceIdType) {
        setResourceIdType(resourceIdType);
        return this;
    }

    /**
     * <p>
     * Specifies the EFS resource ID preference to set for the user's Amazon Web Services account, in the current Amazon
     * Web Services Region, either <code>LONG_ID</code> (17 characters), or <code>SHORT_ID</code> (8 characters).
     * </p>
     * <note>
     * <p>
     * Starting in October, 2021, you will receive an error when setting the account preference to <code>SHORT_ID</code>
     * . Contact Amazon Web Services support if you receive an error and need to use short IDs for file system and mount
     * target resources.
     * </p>
     * </note>
     * 
     * @param resourceIdType
     *        Specifies the EFS resource ID preference to set for the user's Amazon Web Services account, in the current
     *        Amazon Web Services Region, either <code>LONG_ID</code> (17 characters), or <code>SHORT_ID</code> (8
     *        characters).</p> <note>
     *        <p>
     *        Starting in October, 2021, you will receive an error when setting the account preference to
     *        <code>SHORT_ID</code>. Contact Amazon Web Services support if you receive an error and need to use short
     *        IDs for file system and mount target resources.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceIdType
     */

    public PutAccountPreferencesRequest withResourceIdType(ResourceIdType resourceIdType) {
        this.resourceIdType = resourceIdType.toString();
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
        if (getResourceIdType() != null)
            sb.append("ResourceIdType: ").append(getResourceIdType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAccountPreferencesRequest == false)
            return false;
        PutAccountPreferencesRequest other = (PutAccountPreferencesRequest) obj;
        if (other.getResourceIdType() == null ^ this.getResourceIdType() == null)
            return false;
        if (other.getResourceIdType() != null && other.getResourceIdType().equals(this.getResourceIdType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceIdType() == null) ? 0 : getResourceIdType().hashCode());
        return hashCode;
    }

    @Override
    public PutAccountPreferencesRequest clone() {
        return (PutAccountPreferencesRequest) super.clone();
    }

}

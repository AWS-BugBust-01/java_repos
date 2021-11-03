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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListMobileDeviceAccessOverrides"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMobileDeviceAccessOverridesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The list of mobile device access overrides that exist for the specified Amazon WorkMail organization and user.
     * </p>
     */
    private java.util.List<MobileDeviceAccessOverride> overrides;
    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is “null” when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of mobile device access overrides that exist for the specified Amazon WorkMail organization and user.
     * </p>
     * 
     * @return The list of mobile device access overrides that exist for the specified Amazon WorkMail organization and
     *         user.
     */

    public java.util.List<MobileDeviceAccessOverride> getOverrides() {
        return overrides;
    }

    /**
     * <p>
     * The list of mobile device access overrides that exist for the specified Amazon WorkMail organization and user.
     * </p>
     * 
     * @param overrides
     *        The list of mobile device access overrides that exist for the specified Amazon WorkMail organization and
     *        user.
     */

    public void setOverrides(java.util.Collection<MobileDeviceAccessOverride> overrides) {
        if (overrides == null) {
            this.overrides = null;
            return;
        }

        this.overrides = new java.util.ArrayList<MobileDeviceAccessOverride>(overrides);
    }

    /**
     * <p>
     * The list of mobile device access overrides that exist for the specified Amazon WorkMail organization and user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOverrides(java.util.Collection)} or {@link #withOverrides(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param overrides
     *        The list of mobile device access overrides that exist for the specified Amazon WorkMail organization and
     *        user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMobileDeviceAccessOverridesResult withOverrides(MobileDeviceAccessOverride... overrides) {
        if (this.overrides == null) {
            setOverrides(new java.util.ArrayList<MobileDeviceAccessOverride>(overrides.length));
        }
        for (MobileDeviceAccessOverride ele : overrides) {
            this.overrides.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of mobile device access overrides that exist for the specified Amazon WorkMail organization and user.
     * </p>
     * 
     * @param overrides
     *        The list of mobile device access overrides that exist for the specified Amazon WorkMail organization and
     *        user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMobileDeviceAccessOverridesResult withOverrides(java.util.Collection<MobileDeviceAccessOverride> overrides) {
        setOverrides(overrides);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is “null” when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The value is “null” when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is “null” when there are no more results to
     * return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. The value is “null” when there are no more results
     *         to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is “null” when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The value is “null” when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMobileDeviceAccessOverridesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getOverrides() != null)
            sb.append("Overrides: ").append(getOverrides()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMobileDeviceAccessOverridesResult == false)
            return false;
        ListMobileDeviceAccessOverridesResult other = (ListMobileDeviceAccessOverridesResult) obj;
        if (other.getOverrides() == null ^ this.getOverrides() == null)
            return false;
        if (other.getOverrides() != null && other.getOverrides().equals(this.getOverrides()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMobileDeviceAccessOverridesResult clone() {
        try {
            return (ListMobileDeviceAccessOverridesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

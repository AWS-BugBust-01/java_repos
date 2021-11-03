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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeAccountPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccountPreferencesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes the resource ID preference setting for the Amazon Web Services account associated with the user making
     * the request, in the current Amazon Web Services Region.
     * </p>
     */
    private ResourceIdPreference resourceIdPreference;
    /**
     * <p>
     * Present if there are more records than returned in the response. You can use the <code>NextToken</code> in the
     * subsequent request to fetch the additional descriptions.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Describes the resource ID preference setting for the Amazon Web Services account associated with the user making
     * the request, in the current Amazon Web Services Region.
     * </p>
     * 
     * @param resourceIdPreference
     *        Describes the resource ID preference setting for the Amazon Web Services account associated with the user
     *        making the request, in the current Amazon Web Services Region.
     */

    public void setResourceIdPreference(ResourceIdPreference resourceIdPreference) {
        this.resourceIdPreference = resourceIdPreference;
    }

    /**
     * <p>
     * Describes the resource ID preference setting for the Amazon Web Services account associated with the user making
     * the request, in the current Amazon Web Services Region.
     * </p>
     * 
     * @return Describes the resource ID preference setting for the Amazon Web Services account associated with the user
     *         making the request, in the current Amazon Web Services Region.
     */

    public ResourceIdPreference getResourceIdPreference() {
        return this.resourceIdPreference;
    }

    /**
     * <p>
     * Describes the resource ID preference setting for the Amazon Web Services account associated with the user making
     * the request, in the current Amazon Web Services Region.
     * </p>
     * 
     * @param resourceIdPreference
     *        Describes the resource ID preference setting for the Amazon Web Services account associated with the user
     *        making the request, in the current Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountPreferencesResult withResourceIdPreference(ResourceIdPreference resourceIdPreference) {
        setResourceIdPreference(resourceIdPreference);
        return this;
    }

    /**
     * <p>
     * Present if there are more records than returned in the response. You can use the <code>NextToken</code> in the
     * subsequent request to fetch the additional descriptions.
     * </p>
     * 
     * @param nextToken
     *        Present if there are more records than returned in the response. You can use the <code>NextToken</code> in
     *        the subsequent request to fetch the additional descriptions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Present if there are more records than returned in the response. You can use the <code>NextToken</code> in the
     * subsequent request to fetch the additional descriptions.
     * </p>
     * 
     * @return Present if there are more records than returned in the response. You can use the <code>NextToken</code>
     *         in the subsequent request to fetch the additional descriptions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Present if there are more records than returned in the response. You can use the <code>NextToken</code> in the
     * subsequent request to fetch the additional descriptions.
     * </p>
     * 
     * @param nextToken
     *        Present if there are more records than returned in the response. You can use the <code>NextToken</code> in
     *        the subsequent request to fetch the additional descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountPreferencesResult withNextToken(String nextToken) {
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
        if (getResourceIdPreference() != null)
            sb.append("ResourceIdPreference: ").append(getResourceIdPreference()).append(",");
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

        if (obj instanceof DescribeAccountPreferencesResult == false)
            return false;
        DescribeAccountPreferencesResult other = (DescribeAccountPreferencesResult) obj;
        if (other.getResourceIdPreference() == null ^ this.getResourceIdPreference() == null)
            return false;
        if (other.getResourceIdPreference() != null && other.getResourceIdPreference().equals(this.getResourceIdPreference()) == false)
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

        hashCode = prime * hashCode + ((getResourceIdPreference() == null) ? 0 : getResourceIdPreference().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccountPreferencesResult clone() {
        try {
            return (DescribeAccountPreferencesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

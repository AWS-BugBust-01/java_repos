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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListResourceSets"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** A token that can be used to resume pagination from the end of the collection. */
    private String nextToken;
    /** A list of ResourceSets associated with the account */
    private java.util.List<ResourceSetOutput> resourceSets;

    /**
     * A token that can be used to resume pagination from the end of the collection.
     * 
     * @param nextToken
     *        A token that can be used to resume pagination from the end of the collection.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A token that can be used to resume pagination from the end of the collection.
     * 
     * @return A token that can be used to resume pagination from the end of the collection.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A token that can be used to resume pagination from the end of the collection.
     * 
     * @param nextToken
     *        A token that can be used to resume pagination from the end of the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceSetsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * A list of ResourceSets associated with the account
     * 
     * @return A list of ResourceSets associated with the account
     */

    public java.util.List<ResourceSetOutput> getResourceSets() {
        return resourceSets;
    }

    /**
     * A list of ResourceSets associated with the account
     * 
     * @param resourceSets
     *        A list of ResourceSets associated with the account
     */

    public void setResourceSets(java.util.Collection<ResourceSetOutput> resourceSets) {
        if (resourceSets == null) {
            this.resourceSets = null;
            return;
        }

        this.resourceSets = new java.util.ArrayList<ResourceSetOutput>(resourceSets);
    }

    /**
     * A list of ResourceSets associated with the account
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceSets(java.util.Collection)} or {@link #withResourceSets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceSets
     *        A list of ResourceSets associated with the account
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceSetsResult withResourceSets(ResourceSetOutput... resourceSets) {
        if (this.resourceSets == null) {
            setResourceSets(new java.util.ArrayList<ResourceSetOutput>(resourceSets.length));
        }
        for (ResourceSetOutput ele : resourceSets) {
            this.resourceSets.add(ele);
        }
        return this;
    }

    /**
     * A list of ResourceSets associated with the account
     * 
     * @param resourceSets
     *        A list of ResourceSets associated with the account
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceSetsResult withResourceSets(java.util.Collection<ResourceSetOutput> resourceSets) {
        setResourceSets(resourceSets);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getResourceSets() != null)
            sb.append("ResourceSets: ").append(getResourceSets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourceSetsResult == false)
            return false;
        ListResourceSetsResult other = (ListResourceSetsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResourceSets() == null ^ this.getResourceSets() == null)
            return false;
        if (other.getResourceSets() != null && other.getResourceSets().equals(this.getResourceSets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResourceSets() == null) ? 0 : getResourceSets().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceSetsResult clone() {
        try {
            return (ListResourceSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

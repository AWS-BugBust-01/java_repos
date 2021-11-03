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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStreamingSessions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStreamingSessionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters the request to streaming sessions created by the given user.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Filters the request to streaming session owned by the given user
     * </p>
     */
    private String ownedBy;
    /**
     * <p>
     * Filters the request to only the provided session IDs.
     * </p>
     */
    private String sessionIds;
    /**
     * <p>
     * The studio ID.
     * </p>
     */
    private String studioId;

    /**
     * <p>
     * Filters the request to streaming sessions created by the given user.
     * </p>
     * 
     * @param createdBy
     *        Filters the request to streaming sessions created by the given user.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * Filters the request to streaming sessions created by the given user.
     * </p>
     * 
     * @return Filters the request to streaming sessions created by the given user.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * Filters the request to streaming sessions created by the given user.
     * </p>
     * 
     * @param createdBy
     *        Filters the request to streaming sessions created by the given user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamingSessionsRequest withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @return The token to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamingSessionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Filters the request to streaming session owned by the given user
     * </p>
     * 
     * @param ownedBy
     *        Filters the request to streaming session owned by the given user
     */

    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    /**
     * <p>
     * Filters the request to streaming session owned by the given user
     * </p>
     * 
     * @return Filters the request to streaming session owned by the given user
     */

    public String getOwnedBy() {
        return this.ownedBy;
    }

    /**
     * <p>
     * Filters the request to streaming session owned by the given user
     * </p>
     * 
     * @param ownedBy
     *        Filters the request to streaming session owned by the given user
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamingSessionsRequest withOwnedBy(String ownedBy) {
        setOwnedBy(ownedBy);
        return this;
    }

    /**
     * <p>
     * Filters the request to only the provided session IDs.
     * </p>
     * 
     * @param sessionIds
     *        Filters the request to only the provided session IDs.
     */

    public void setSessionIds(String sessionIds) {
        this.sessionIds = sessionIds;
    }

    /**
     * <p>
     * Filters the request to only the provided session IDs.
     * </p>
     * 
     * @return Filters the request to only the provided session IDs.
     */

    public String getSessionIds() {
        return this.sessionIds;
    }

    /**
     * <p>
     * Filters the request to only the provided session IDs.
     * </p>
     * 
     * @param sessionIds
     *        Filters the request to only the provided session IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamingSessionsRequest withSessionIds(String sessionIds) {
        setSessionIds(sessionIds);
        return this;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @param studioId
     *        The studio ID.
     */

    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @return The studio ID.
     */

    public String getStudioId() {
        return this.studioId;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @param studioId
     *        The studio ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamingSessionsRequest withStudioId(String studioId) {
        setStudioId(studioId);
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
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOwnedBy() != null)
            sb.append("OwnedBy: ").append(getOwnedBy()).append(",");
        if (getSessionIds() != null)
            sb.append("SessionIds: ").append(getSessionIds()).append(",");
        if (getStudioId() != null)
            sb.append("StudioId: ").append(getStudioId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStreamingSessionsRequest == false)
            return false;
        ListStreamingSessionsRequest other = (ListStreamingSessionsRequest) obj;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOwnedBy() == null ^ this.getOwnedBy() == null)
            return false;
        if (other.getOwnedBy() != null && other.getOwnedBy().equals(this.getOwnedBy()) == false)
            return false;
        if (other.getSessionIds() == null ^ this.getSessionIds() == null)
            return false;
        if (other.getSessionIds() != null && other.getSessionIds().equals(this.getSessionIds()) == false)
            return false;
        if (other.getStudioId() == null ^ this.getStudioId() == null)
            return false;
        if (other.getStudioId() != null && other.getStudioId().equals(this.getStudioId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOwnedBy() == null) ? 0 : getOwnedBy().hashCode());
        hashCode = prime * hashCode + ((getSessionIds() == null) ? 0 : getSessionIds().hashCode());
        hashCode = prime * hashCode + ((getStudioId() == null) ? 0 : getStudioId().hashCode());
        return hashCode;
    }

    @Override
    public ListStreamingSessionsRequest clone() {
        return (ListStreamingSessionsRequest) super.clone();
    }

}

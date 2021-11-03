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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListPrefetchSchedules" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPrefetchSchedulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists the prefetch schedules. An empty Items list doesn't mean there aren't more items to fetch, just that that
     * page was empty.
     * </p>
     */
    private java.util.List<PrefetchSchedule> items;
    /**
     * <p>
     * The value that you will use forNextToken in the next ListPrefetchSchedulesRequest request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists the prefetch schedules. An empty Items list doesn't mean there aren't more items to fetch, just that that
     * page was empty.
     * </p>
     * 
     * @return Lists the prefetch schedules. An empty Items list doesn't mean there aren't more items to fetch, just
     *         that that page was empty.
     */

    public java.util.List<PrefetchSchedule> getItems() {
        return items;
    }

    /**
     * <p>
     * Lists the prefetch schedules. An empty Items list doesn't mean there aren't more items to fetch, just that that
     * page was empty.
     * </p>
     * 
     * @param items
     *        Lists the prefetch schedules. An empty Items list doesn't mean there aren't more items to fetch, just that
     *        that page was empty.
     */

    public void setItems(java.util.Collection<PrefetchSchedule> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<PrefetchSchedule>(items);
    }

    /**
     * <p>
     * Lists the prefetch schedules. An empty Items list doesn't mean there aren't more items to fetch, just that that
     * page was empty.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        Lists the prefetch schedules. An empty Items list doesn't mean there aren't more items to fetch, just that
     *        that page was empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPrefetchSchedulesResult withItems(PrefetchSchedule... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<PrefetchSchedule>(items.length));
        }
        for (PrefetchSchedule ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the prefetch schedules. An empty Items list doesn't mean there aren't more items to fetch, just that that
     * page was empty.
     * </p>
     * 
     * @param items
     *        Lists the prefetch schedules. An empty Items list doesn't mean there aren't more items to fetch, just that
     *        that page was empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPrefetchSchedulesResult withItems(java.util.Collection<PrefetchSchedule> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * The value that you will use forNextToken in the next ListPrefetchSchedulesRequest request.
     * </p>
     * 
     * @param nextToken
     *        The value that you will use forNextToken in the next ListPrefetchSchedulesRequest request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The value that you will use forNextToken in the next ListPrefetchSchedulesRequest request.
     * </p>
     * 
     * @return The value that you will use forNextToken in the next ListPrefetchSchedulesRequest request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The value that you will use forNextToken in the next ListPrefetchSchedulesRequest request.
     * </p>
     * 
     * @param nextToken
     *        The value that you will use forNextToken in the next ListPrefetchSchedulesRequest request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPrefetchSchedulesResult withNextToken(String nextToken) {
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
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
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

        if (obj instanceof ListPrefetchSchedulesResult == false)
            return false;
        ListPrefetchSchedulesResult other = (ListPrefetchSchedulesResult) obj;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
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

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPrefetchSchedulesResult clone() {
        try {
            return (ListPrefetchSchedulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

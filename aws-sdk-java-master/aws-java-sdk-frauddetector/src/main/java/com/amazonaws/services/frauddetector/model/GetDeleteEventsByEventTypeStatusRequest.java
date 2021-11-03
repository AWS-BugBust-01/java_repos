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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetDeleteEventsByEventTypeStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeleteEventsByEventTypeStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of event type for which to get the deletion status.
     * </p>
     */
    private String eventTypeName;

    /**
     * <p>
     * Name of event type for which to get the deletion status.
     * </p>
     * 
     * @param eventTypeName
     *        Name of event type for which to get the deletion status.
     */

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    /**
     * <p>
     * Name of event type for which to get the deletion status.
     * </p>
     * 
     * @return Name of event type for which to get the deletion status.
     */

    public String getEventTypeName() {
        return this.eventTypeName;
    }

    /**
     * <p>
     * Name of event type for which to get the deletion status.
     * </p>
     * 
     * @param eventTypeName
     *        Name of event type for which to get the deletion status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeleteEventsByEventTypeStatusRequest withEventTypeName(String eventTypeName) {
        setEventTypeName(eventTypeName);
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
        if (getEventTypeName() != null)
            sb.append("EventTypeName: ").append(getEventTypeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeleteEventsByEventTypeStatusRequest == false)
            return false;
        GetDeleteEventsByEventTypeStatusRequest other = (GetDeleteEventsByEventTypeStatusRequest) obj;
        if (other.getEventTypeName() == null ^ this.getEventTypeName() == null)
            return false;
        if (other.getEventTypeName() != null && other.getEventTypeName().equals(this.getEventTypeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventTypeName() == null) ? 0 : getEventTypeName().hashCode());
        return hashCode;
    }

    @Override
    public GetDeleteEventsByEventTypeStatusRequest clone() {
        return (GetDeleteEventsByEventTypeStatusRequest) super.clone();
    }

}

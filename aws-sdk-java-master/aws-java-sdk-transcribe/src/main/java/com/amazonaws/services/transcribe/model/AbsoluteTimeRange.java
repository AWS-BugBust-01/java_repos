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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A time range, set in seconds, between two points in the call.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/AbsoluteTimeRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbsoluteTimeRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A value that indicates the beginning of the time range in seconds. To set absolute time range, you must specify a
     * start time and an end time. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartTime - 10000
     * </p>
     * </li>
     * <li>
     * <p>
     * Endtime - 50000
     * </p>
     * </li>
     * </ul>
     * <p>
     * The time range is set between 10,000 milliseconds and 50,000 milliseconds into the call.
     * </p>
     */
    private Long startTime;
    /**
     * <p>
     * A value that indicates the end of the time range in milliseconds. To set absolute time range, you must specify a
     * start time and an end time. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartTime - 10000
     * </p>
     * </li>
     * <li>
     * <p>
     * Endtime - 50000
     * </p>
     * </li>
     * </ul>
     * <p>
     * The time range is set between 10,000 milliseconds and 50,000 milliseconds into the call.
     * </p>
     */
    private Long endTime;
    /**
     * <p>
     * A time range from the beginning of the call to the value that you've specified. For example, if you specify
     * 100000, the time range is set to the first 100,000 milliseconds of the call.
     * </p>
     */
    private Long first;
    /**
     * <p>
     * A time range from the value that you've specified to the end of the call. For example, if you specify 100000, the
     * time range is set to the last 100,000 milliseconds of the call.
     * </p>
     */
    private Long last;

    /**
     * <p>
     * A value that indicates the beginning of the time range in seconds. To set absolute time range, you must specify a
     * start time and an end time. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartTime - 10000
     * </p>
     * </li>
     * <li>
     * <p>
     * Endtime - 50000
     * </p>
     * </li>
     * </ul>
     * <p>
     * The time range is set between 10,000 milliseconds and 50,000 milliseconds into the call.
     * </p>
     * 
     * @param startTime
     *        A value that indicates the beginning of the time range in seconds. To set absolute time range, you must
     *        specify a start time and an end time. For example, if you specify the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        StartTime - 10000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Endtime - 50000
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The time range is set between 10,000 milliseconds and 50,000 milliseconds into the call.
     */

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A value that indicates the beginning of the time range in seconds. To set absolute time range, you must specify a
     * start time and an end time. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartTime - 10000
     * </p>
     * </li>
     * <li>
     * <p>
     * Endtime - 50000
     * </p>
     * </li>
     * </ul>
     * <p>
     * The time range is set between 10,000 milliseconds and 50,000 milliseconds into the call.
     * </p>
     * 
     * @return A value that indicates the beginning of the time range in seconds. To set absolute time range, you must
     *         specify a start time and an end time. For example, if you specify the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         StartTime - 10000
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Endtime - 50000
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The time range is set between 10,000 milliseconds and 50,000 milliseconds into the call.
     */

    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * A value that indicates the beginning of the time range in seconds. To set absolute time range, you must specify a
     * start time and an end time. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartTime - 10000
     * </p>
     * </li>
     * <li>
     * <p>
     * Endtime - 50000
     * </p>
     * </li>
     * </ul>
     * <p>
     * The time range is set between 10,000 milliseconds and 50,000 milliseconds into the call.
     * </p>
     * 
     * @param startTime
     *        A value that indicates the beginning of the time range in seconds. To set absolute time range, you must
     *        specify a start time and an end time. For example, if you specify the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        StartTime - 10000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Endtime - 50000
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The time range is set between 10,000 milliseconds and 50,000 milliseconds into the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AbsoluteTimeRange withStartTime(Long startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * A value that indicates the end of the time range in milliseconds. To set absolute time range, you must specify a
     * start time and an end time. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartTime - 10000
     * </p>
     * </li>
     * <li>
     * <p>
     * Endtime - 50000
     * </p>
     * </li>
     * </ul>
     * <p>
     * The time range is set between 10,000 milliseconds and 50,000 milliseconds into the call.
     * </p>
     * 
     * @param endTime
     *        A value that indicates the end of the time range in milliseconds. To set absolute time range, you must
     *        specify a start time and an end time. For example, if you specify the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        StartTime - 10000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Endtime - 50000
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The time range is set between 10,000 milliseconds and 50,000 milliseconds into the call.
     */

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * A value that indicates the end of the time range in milliseconds. To set absolute time range, you must specify a
     * start time and an end time. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartTime - 10000
     * </p>
     * </li>
     * <li>
     * <p>
     * Endtime - 50000
     * </p>
     * </li>
     * </ul>
     * <p>
     * The time range is set between 10,000 milliseconds and 50,000 milliseconds into the call.
     * </p>
     * 
     * @return A value that indicates the end of the time range in milliseconds. To set absolute time range, you must
     *         specify a start time and an end time. For example, if you specify the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         StartTime - 10000
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Endtime - 50000
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The time range is set between 10,000 milliseconds and 50,000 milliseconds into the call.
     */

    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * A value that indicates the end of the time range in milliseconds. To set absolute time range, you must specify a
     * start time and an end time. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartTime - 10000
     * </p>
     * </li>
     * <li>
     * <p>
     * Endtime - 50000
     * </p>
     * </li>
     * </ul>
     * <p>
     * The time range is set between 10,000 milliseconds and 50,000 milliseconds into the call.
     * </p>
     * 
     * @param endTime
     *        A value that indicates the end of the time range in milliseconds. To set absolute time range, you must
     *        specify a start time and an end time. For example, if you specify the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        StartTime - 10000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Endtime - 50000
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The time range is set between 10,000 milliseconds and 50,000 milliseconds into the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AbsoluteTimeRange withEndTime(Long endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * A time range from the beginning of the call to the value that you've specified. For example, if you specify
     * 100000, the time range is set to the first 100,000 milliseconds of the call.
     * </p>
     * 
     * @param first
     *        A time range from the beginning of the call to the value that you've specified. For example, if you
     *        specify 100000, the time range is set to the first 100,000 milliseconds of the call.
     */

    public void setFirst(Long first) {
        this.first = first;
    }

    /**
     * <p>
     * A time range from the beginning of the call to the value that you've specified. For example, if you specify
     * 100000, the time range is set to the first 100,000 milliseconds of the call.
     * </p>
     * 
     * @return A time range from the beginning of the call to the value that you've specified. For example, if you
     *         specify 100000, the time range is set to the first 100,000 milliseconds of the call.
     */

    public Long getFirst() {
        return this.first;
    }

    /**
     * <p>
     * A time range from the beginning of the call to the value that you've specified. For example, if you specify
     * 100000, the time range is set to the first 100,000 milliseconds of the call.
     * </p>
     * 
     * @param first
     *        A time range from the beginning of the call to the value that you've specified. For example, if you
     *        specify 100000, the time range is set to the first 100,000 milliseconds of the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AbsoluteTimeRange withFirst(Long first) {
        setFirst(first);
        return this;
    }

    /**
     * <p>
     * A time range from the value that you've specified to the end of the call. For example, if you specify 100000, the
     * time range is set to the last 100,000 milliseconds of the call.
     * </p>
     * 
     * @param last
     *        A time range from the value that you've specified to the end of the call. For example, if you specify
     *        100000, the time range is set to the last 100,000 milliseconds of the call.
     */

    public void setLast(Long last) {
        this.last = last;
    }

    /**
     * <p>
     * A time range from the value that you've specified to the end of the call. For example, if you specify 100000, the
     * time range is set to the last 100,000 milliseconds of the call.
     * </p>
     * 
     * @return A time range from the value that you've specified to the end of the call. For example, if you specify
     *         100000, the time range is set to the last 100,000 milliseconds of the call.
     */

    public Long getLast() {
        return this.last;
    }

    /**
     * <p>
     * A time range from the value that you've specified to the end of the call. For example, if you specify 100000, the
     * time range is set to the last 100,000 milliseconds of the call.
     * </p>
     * 
     * @param last
     *        A time range from the value that you've specified to the end of the call. For example, if you specify
     *        100000, the time range is set to the last 100,000 milliseconds of the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AbsoluteTimeRange withLast(Long last) {
        setLast(last);
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getFirst() != null)
            sb.append("First: ").append(getFirst()).append(",");
        if (getLast() != null)
            sb.append("Last: ").append(getLast());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AbsoluteTimeRange == false)
            return false;
        AbsoluteTimeRange other = (AbsoluteTimeRange) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getFirst() == null ^ this.getFirst() == null)
            return false;
        if (other.getFirst() != null && other.getFirst().equals(this.getFirst()) == false)
            return false;
        if (other.getLast() == null ^ this.getLast() == null)
            return false;
        if (other.getLast() != null && other.getLast().equals(this.getLast()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getFirst() == null) ? 0 : getFirst().hashCode());
        hashCode = prime * hashCode + ((getLast() == null) ? 0 : getLast().hashCode());
        return hashCode;
    }

    @Override
    public AbsoluteTimeRange clone() {
        try {
            return (AbsoluteTimeRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.AbsoluteTimeRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

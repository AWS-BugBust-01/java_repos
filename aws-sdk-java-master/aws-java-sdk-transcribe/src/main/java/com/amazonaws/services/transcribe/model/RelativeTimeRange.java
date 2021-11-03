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
 * An object that allows percentages to specify the proportion of the call where you would like to apply a filter. For
 * example, you can specify the first half of the call. You can also specify the period of time between halfway through
 * to three-quarters of the way through the call. Because the length of conversation can vary between calls, you can
 * apply relative time ranges across all calls.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/RelativeTimeRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelativeTimeRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A value that indicates the percentage of the beginning of the time range. To set a relative time range, you must
     * specify a start percentage and an end percentage. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartPercentage - 10
     * </p>
     * </li>
     * <li>
     * <p>
     * EndPercentage - 50
     * </p>
     * </li>
     * </ul>
     * <p>
     * This looks at the time range starting from 10% of the way into the call to 50% of the way through the call. For a
     * call that lasts 100,000 milliseconds, this example range would apply from the 10,000 millisecond mark to the
     * 50,000 millisecond mark.
     * </p>
     */
    private Integer startPercentage;
    /**
     * <p>
     * A value that indicates the percentage of the end of the time range. To set a relative time range, you must
     * specify a start percentage and an end percentage. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartPercentage - 10
     * </p>
     * </li>
     * <li>
     * <p>
     * EndPercentage - 50
     * </p>
     * </li>
     * </ul>
     * <p>
     * This looks at the time range starting from 10% of the way into the call to 50% of the way through the call. For a
     * call that lasts 100,000 milliseconds, this example range would apply from the 10,000 millisecond mark to the
     * 50,000 millisecond mark.
     * </p>
     */
    private Integer endPercentage;
    /**
     * <p>
     * A range that takes the portion of the call up to the time in milliseconds set by the value that you've specified.
     * For example, if you specify <code>120000</code>, the time range is set for the first 120,000 milliseconds of the
     * call.
     * </p>
     */
    private Integer first;
    /**
     * <p>
     * A range that takes the portion of the call from the time in milliseconds set by the value that you've specified
     * to the end of the call. For example, if you specify <code>120000</code>, the time range is set for the last
     * 120,000 milliseconds of the call.
     * </p>
     */
    private Integer last;

    /**
     * <p>
     * A value that indicates the percentage of the beginning of the time range. To set a relative time range, you must
     * specify a start percentage and an end percentage. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartPercentage - 10
     * </p>
     * </li>
     * <li>
     * <p>
     * EndPercentage - 50
     * </p>
     * </li>
     * </ul>
     * <p>
     * This looks at the time range starting from 10% of the way into the call to 50% of the way through the call. For a
     * call that lasts 100,000 milliseconds, this example range would apply from the 10,000 millisecond mark to the
     * 50,000 millisecond mark.
     * </p>
     * 
     * @param startPercentage
     *        A value that indicates the percentage of the beginning of the time range. To set a relative time range,
     *        you must specify a start percentage and an end percentage. For example, if you specify the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        StartPercentage - 10
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EndPercentage - 50
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This looks at the time range starting from 10% of the way into the call to 50% of the way through the
     *        call. For a call that lasts 100,000 milliseconds, this example range would apply from the 10,000
     *        millisecond mark to the 50,000 millisecond mark.
     */

    public void setStartPercentage(Integer startPercentage) {
        this.startPercentage = startPercentage;
    }

    /**
     * <p>
     * A value that indicates the percentage of the beginning of the time range. To set a relative time range, you must
     * specify a start percentage and an end percentage. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartPercentage - 10
     * </p>
     * </li>
     * <li>
     * <p>
     * EndPercentage - 50
     * </p>
     * </li>
     * </ul>
     * <p>
     * This looks at the time range starting from 10% of the way into the call to 50% of the way through the call. For a
     * call that lasts 100,000 milliseconds, this example range would apply from the 10,000 millisecond mark to the
     * 50,000 millisecond mark.
     * </p>
     * 
     * @return A value that indicates the percentage of the beginning of the time range. To set a relative time range,
     *         you must specify a start percentage and an end percentage. For example, if you specify the following
     *         values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         StartPercentage - 10
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EndPercentage - 50
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This looks at the time range starting from 10% of the way into the call to 50% of the way through the
     *         call. For a call that lasts 100,000 milliseconds, this example range would apply from the 10,000
     *         millisecond mark to the 50,000 millisecond mark.
     */

    public Integer getStartPercentage() {
        return this.startPercentage;
    }

    /**
     * <p>
     * A value that indicates the percentage of the beginning of the time range. To set a relative time range, you must
     * specify a start percentage and an end percentage. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartPercentage - 10
     * </p>
     * </li>
     * <li>
     * <p>
     * EndPercentage - 50
     * </p>
     * </li>
     * </ul>
     * <p>
     * This looks at the time range starting from 10% of the way into the call to 50% of the way through the call. For a
     * call that lasts 100,000 milliseconds, this example range would apply from the 10,000 millisecond mark to the
     * 50,000 millisecond mark.
     * </p>
     * 
     * @param startPercentage
     *        A value that indicates the percentage of the beginning of the time range. To set a relative time range,
     *        you must specify a start percentage and an end percentage. For example, if you specify the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        StartPercentage - 10
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EndPercentage - 50
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This looks at the time range starting from 10% of the way into the call to 50% of the way through the
     *        call. For a call that lasts 100,000 milliseconds, this example range would apply from the 10,000
     *        millisecond mark to the 50,000 millisecond mark.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelativeTimeRange withStartPercentage(Integer startPercentage) {
        setStartPercentage(startPercentage);
        return this;
    }

    /**
     * <p>
     * A value that indicates the percentage of the end of the time range. To set a relative time range, you must
     * specify a start percentage and an end percentage. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartPercentage - 10
     * </p>
     * </li>
     * <li>
     * <p>
     * EndPercentage - 50
     * </p>
     * </li>
     * </ul>
     * <p>
     * This looks at the time range starting from 10% of the way into the call to 50% of the way through the call. For a
     * call that lasts 100,000 milliseconds, this example range would apply from the 10,000 millisecond mark to the
     * 50,000 millisecond mark.
     * </p>
     * 
     * @param endPercentage
     *        A value that indicates the percentage of the end of the time range. To set a relative time range, you must
     *        specify a start percentage and an end percentage. For example, if you specify the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        StartPercentage - 10
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EndPercentage - 50
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This looks at the time range starting from 10% of the way into the call to 50% of the way through the
     *        call. For a call that lasts 100,000 milliseconds, this example range would apply from the 10,000
     *        millisecond mark to the 50,000 millisecond mark.
     */

    public void setEndPercentage(Integer endPercentage) {
        this.endPercentage = endPercentage;
    }

    /**
     * <p>
     * A value that indicates the percentage of the end of the time range. To set a relative time range, you must
     * specify a start percentage and an end percentage. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartPercentage - 10
     * </p>
     * </li>
     * <li>
     * <p>
     * EndPercentage - 50
     * </p>
     * </li>
     * </ul>
     * <p>
     * This looks at the time range starting from 10% of the way into the call to 50% of the way through the call. For a
     * call that lasts 100,000 milliseconds, this example range would apply from the 10,000 millisecond mark to the
     * 50,000 millisecond mark.
     * </p>
     * 
     * @return A value that indicates the percentage of the end of the time range. To set a relative time range, you
     *         must specify a start percentage and an end percentage. For example, if you specify the following
     *         values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         StartPercentage - 10
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EndPercentage - 50
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This looks at the time range starting from 10% of the way into the call to 50% of the way through the
     *         call. For a call that lasts 100,000 milliseconds, this example range would apply from the 10,000
     *         millisecond mark to the 50,000 millisecond mark.
     */

    public Integer getEndPercentage() {
        return this.endPercentage;
    }

    /**
     * <p>
     * A value that indicates the percentage of the end of the time range. To set a relative time range, you must
     * specify a start percentage and an end percentage. For example, if you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * StartPercentage - 10
     * </p>
     * </li>
     * <li>
     * <p>
     * EndPercentage - 50
     * </p>
     * </li>
     * </ul>
     * <p>
     * This looks at the time range starting from 10% of the way into the call to 50% of the way through the call. For a
     * call that lasts 100,000 milliseconds, this example range would apply from the 10,000 millisecond mark to the
     * 50,000 millisecond mark.
     * </p>
     * 
     * @param endPercentage
     *        A value that indicates the percentage of the end of the time range. To set a relative time range, you must
     *        specify a start percentage and an end percentage. For example, if you specify the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        StartPercentage - 10
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        EndPercentage - 50
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This looks at the time range starting from 10% of the way into the call to 50% of the way through the
     *        call. For a call that lasts 100,000 milliseconds, this example range would apply from the 10,000
     *        millisecond mark to the 50,000 millisecond mark.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelativeTimeRange withEndPercentage(Integer endPercentage) {
        setEndPercentage(endPercentage);
        return this;
    }

    /**
     * <p>
     * A range that takes the portion of the call up to the time in milliseconds set by the value that you've specified.
     * For example, if you specify <code>120000</code>, the time range is set for the first 120,000 milliseconds of the
     * call.
     * </p>
     * 
     * @param first
     *        A range that takes the portion of the call up to the time in milliseconds set by the value that you've
     *        specified. For example, if you specify <code>120000</code>, the time range is set for the first 120,000
     *        milliseconds of the call.
     */

    public void setFirst(Integer first) {
        this.first = first;
    }

    /**
     * <p>
     * A range that takes the portion of the call up to the time in milliseconds set by the value that you've specified.
     * For example, if you specify <code>120000</code>, the time range is set for the first 120,000 milliseconds of the
     * call.
     * </p>
     * 
     * @return A range that takes the portion of the call up to the time in milliseconds set by the value that you've
     *         specified. For example, if you specify <code>120000</code>, the time range is set for the first 120,000
     *         milliseconds of the call.
     */

    public Integer getFirst() {
        return this.first;
    }

    /**
     * <p>
     * A range that takes the portion of the call up to the time in milliseconds set by the value that you've specified.
     * For example, if you specify <code>120000</code>, the time range is set for the first 120,000 milliseconds of the
     * call.
     * </p>
     * 
     * @param first
     *        A range that takes the portion of the call up to the time in milliseconds set by the value that you've
     *        specified. For example, if you specify <code>120000</code>, the time range is set for the first 120,000
     *        milliseconds of the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelativeTimeRange withFirst(Integer first) {
        setFirst(first);
        return this;
    }

    /**
     * <p>
     * A range that takes the portion of the call from the time in milliseconds set by the value that you've specified
     * to the end of the call. For example, if you specify <code>120000</code>, the time range is set for the last
     * 120,000 milliseconds of the call.
     * </p>
     * 
     * @param last
     *        A range that takes the portion of the call from the time in milliseconds set by the value that you've
     *        specified to the end of the call. For example, if you specify <code>120000</code>, the time range is set
     *        for the last 120,000 milliseconds of the call.
     */

    public void setLast(Integer last) {
        this.last = last;
    }

    /**
     * <p>
     * A range that takes the portion of the call from the time in milliseconds set by the value that you've specified
     * to the end of the call. For example, if you specify <code>120000</code>, the time range is set for the last
     * 120,000 milliseconds of the call.
     * </p>
     * 
     * @return A range that takes the portion of the call from the time in milliseconds set by the value that you've
     *         specified to the end of the call. For example, if you specify <code>120000</code>, the time range is set
     *         for the last 120,000 milliseconds of the call.
     */

    public Integer getLast() {
        return this.last;
    }

    /**
     * <p>
     * A range that takes the portion of the call from the time in milliseconds set by the value that you've specified
     * to the end of the call. For example, if you specify <code>120000</code>, the time range is set for the last
     * 120,000 milliseconds of the call.
     * </p>
     * 
     * @param last
     *        A range that takes the portion of the call from the time in milliseconds set by the value that you've
     *        specified to the end of the call. For example, if you specify <code>120000</code>, the time range is set
     *        for the last 120,000 milliseconds of the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelativeTimeRange withLast(Integer last) {
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
        if (getStartPercentage() != null)
            sb.append("StartPercentage: ").append(getStartPercentage()).append(",");
        if (getEndPercentage() != null)
            sb.append("EndPercentage: ").append(getEndPercentage()).append(",");
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

        if (obj instanceof RelativeTimeRange == false)
            return false;
        RelativeTimeRange other = (RelativeTimeRange) obj;
        if (other.getStartPercentage() == null ^ this.getStartPercentage() == null)
            return false;
        if (other.getStartPercentage() != null && other.getStartPercentage().equals(this.getStartPercentage()) == false)
            return false;
        if (other.getEndPercentage() == null ^ this.getEndPercentage() == null)
            return false;
        if (other.getEndPercentage() != null && other.getEndPercentage().equals(this.getEndPercentage()) == false)
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

        hashCode = prime * hashCode + ((getStartPercentage() == null) ? 0 : getStartPercentage().hashCode());
        hashCode = prime * hashCode + ((getEndPercentage() == null) ? 0 : getEndPercentage().hashCode());
        hashCode = prime * hashCode + ((getFirst() == null) ? 0 : getFirst().hashCode());
        hashCode = prime * hashCode + ((getLast() == null) ? 0 : getLast().hashCode());
        return hashCode;
    }

    @Override
    public RelativeTimeRange clone() {
        try {
            return (RelativeTimeRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.RelativeTimeRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

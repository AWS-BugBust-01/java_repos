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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The scheduled time period relative to UTC during which Amazon MQ begins to apply pending updates or patches to the
 * broker.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/WeeklyStartTime" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WeeklyStartTime implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Required. The day of the week.
     * </p>
     */
    private String dayOfWeek;
    /**
     * <p>
     * Required. The time, in 24-hour format.
     * </p>
     */
    private String timeOfDay;
    /**
     * <p>
     * The time zone, UTC by default, in either the Country/City format, or the UTC offset format.
     * </p>
     */
    private String timeZone;

    /**
     * <p>
     * Required. The day of the week.
     * </p>
     * 
     * @param dayOfWeek
     *        Required. The day of the week.
     * @see DayOfWeek
     */

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * <p>
     * Required. The day of the week.
     * </p>
     * 
     * @return Required. The day of the week.
     * @see DayOfWeek
     */

    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * <p>
     * Required. The day of the week.
     * </p>
     * 
     * @param dayOfWeek
     *        Required. The day of the week.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfWeek
     */

    public WeeklyStartTime withDayOfWeek(String dayOfWeek) {
        setDayOfWeek(dayOfWeek);
        return this;
    }

    /**
     * <p>
     * Required. The day of the week.
     * </p>
     * 
     * @param dayOfWeek
     *        Required. The day of the week.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfWeek
     */

    public WeeklyStartTime withDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek.toString();
        return this;
    }

    /**
     * <p>
     * Required. The time, in 24-hour format.
     * </p>
     * 
     * @param timeOfDay
     *        Required. The time, in 24-hour format.
     */

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    /**
     * <p>
     * Required. The time, in 24-hour format.
     * </p>
     * 
     * @return Required. The time, in 24-hour format.
     */

    public String getTimeOfDay() {
        return this.timeOfDay;
    }

    /**
     * <p>
     * Required. The time, in 24-hour format.
     * </p>
     * 
     * @param timeOfDay
     *        Required. The time, in 24-hour format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeeklyStartTime withTimeOfDay(String timeOfDay) {
        setTimeOfDay(timeOfDay);
        return this;
    }

    /**
     * <p>
     * The time zone, UTC by default, in either the Country/City format, or the UTC offset format.
     * </p>
     * 
     * @param timeZone
     *        The time zone, UTC by default, in either the Country/City format, or the UTC offset format.
     */

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * <p>
     * The time zone, UTC by default, in either the Country/City format, or the UTC offset format.
     * </p>
     * 
     * @return The time zone, UTC by default, in either the Country/City format, or the UTC offset format.
     */

    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * <p>
     * The time zone, UTC by default, in either the Country/City format, or the UTC offset format.
     * </p>
     * 
     * @param timeZone
     *        The time zone, UTC by default, in either the Country/City format, or the UTC offset format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WeeklyStartTime withTimeZone(String timeZone) {
        setTimeZone(timeZone);
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
        if (getDayOfWeek() != null)
            sb.append("DayOfWeek: ").append(getDayOfWeek()).append(",");
        if (getTimeOfDay() != null)
            sb.append("TimeOfDay: ").append(getTimeOfDay()).append(",");
        if (getTimeZone() != null)
            sb.append("TimeZone: ").append(getTimeZone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WeeklyStartTime == false)
            return false;
        WeeklyStartTime other = (WeeklyStartTime) obj;
        if (other.getDayOfWeek() == null ^ this.getDayOfWeek() == null)
            return false;
        if (other.getDayOfWeek() != null && other.getDayOfWeek().equals(this.getDayOfWeek()) == false)
            return false;
        if (other.getTimeOfDay() == null ^ this.getTimeOfDay() == null)
            return false;
        if (other.getTimeOfDay() != null && other.getTimeOfDay().equals(this.getTimeOfDay()) == false)
            return false;
        if (other.getTimeZone() == null ^ this.getTimeZone() == null)
            return false;
        if (other.getTimeZone() != null && other.getTimeZone().equals(this.getTimeZone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDayOfWeek() == null) ? 0 : getDayOfWeek().hashCode());
        hashCode = prime * hashCode + ((getTimeOfDay() == null) ? 0 : getTimeOfDay().hashCode());
        hashCode = prime * hashCode + ((getTimeZone() == null) ? 0 : getTimeZone().hashCode());
        return hashCode;
    }

    @Override
    public WeeklyStartTime clone() {
        try {
            return (WeeklyStartTime) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.WeeklyStartTimeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

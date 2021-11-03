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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns Amazon CloudWatch log settings for a playback configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/LogConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The percentage of session logs that MediaTailor sends to your Cloudwatch Logs account. For example, if your
     * playback configuration has 1000 sessions and percentEnabled is set to 60, MediaTailor sends logs for 600 of the
     * sessions to CloudWatch Logs. MediaTailor decides at random which of the playback configuration sessions to send
     * logs for. If you want to view logs for a specific session, you can use the <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/debug-log-mode.html">debug log mode</a>.
     * </p>
     * <p>
     * Valid values: 0 - 100
     * </p>
     */
    private Integer percentEnabled;

    /**
     * <p>
     * The percentage of session logs that MediaTailor sends to your Cloudwatch Logs account. For example, if your
     * playback configuration has 1000 sessions and percentEnabled is set to 60, MediaTailor sends logs for 600 of the
     * sessions to CloudWatch Logs. MediaTailor decides at random which of the playback configuration sessions to send
     * logs for. If you want to view logs for a specific session, you can use the <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/debug-log-mode.html">debug log mode</a>.
     * </p>
     * <p>
     * Valid values: 0 - 100
     * </p>
     * 
     * @param percentEnabled
     *        The percentage of session logs that MediaTailor sends to your Cloudwatch Logs account. For example, if
     *        your playback configuration has 1000 sessions and percentEnabled is set to 60, MediaTailor sends logs for
     *        600 of the sessions to CloudWatch Logs. MediaTailor decides at random which of the playback configuration
     *        sessions to send logs for. If you want to view logs for a specific session, you can use the <a
     *        href="https://docs.aws.amazon.com/mediatailor/latest/ug/debug-log-mode.html">debug log mode</a>.</p>
     *        <p>
     *        Valid values: 0 - 100
     */

    public void setPercentEnabled(Integer percentEnabled) {
        this.percentEnabled = percentEnabled;
    }

    /**
     * <p>
     * The percentage of session logs that MediaTailor sends to your Cloudwatch Logs account. For example, if your
     * playback configuration has 1000 sessions and percentEnabled is set to 60, MediaTailor sends logs for 600 of the
     * sessions to CloudWatch Logs. MediaTailor decides at random which of the playback configuration sessions to send
     * logs for. If you want to view logs for a specific session, you can use the <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/debug-log-mode.html">debug log mode</a>.
     * </p>
     * <p>
     * Valid values: 0 - 100
     * </p>
     * 
     * @return The percentage of session logs that MediaTailor sends to your Cloudwatch Logs account. For example, if
     *         your playback configuration has 1000 sessions and percentEnabled is set to 60, MediaTailor sends logs for
     *         600 of the sessions to CloudWatch Logs. MediaTailor decides at random which of the playback configuration
     *         sessions to send logs for. If you want to view logs for a specific session, you can use the <a
     *         href="https://docs.aws.amazon.com/mediatailor/latest/ug/debug-log-mode.html">debug log mode</a>.</p>
     *         <p>
     *         Valid values: 0 - 100
     */

    public Integer getPercentEnabled() {
        return this.percentEnabled;
    }

    /**
     * <p>
     * The percentage of session logs that MediaTailor sends to your Cloudwatch Logs account. For example, if your
     * playback configuration has 1000 sessions and percentEnabled is set to 60, MediaTailor sends logs for 600 of the
     * sessions to CloudWatch Logs. MediaTailor decides at random which of the playback configuration sessions to send
     * logs for. If you want to view logs for a specific session, you can use the <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/debug-log-mode.html">debug log mode</a>.
     * </p>
     * <p>
     * Valid values: 0 - 100
     * </p>
     * 
     * @param percentEnabled
     *        The percentage of session logs that MediaTailor sends to your Cloudwatch Logs account. For example, if
     *        your playback configuration has 1000 sessions and percentEnabled is set to 60, MediaTailor sends logs for
     *        600 of the sessions to CloudWatch Logs. MediaTailor decides at random which of the playback configuration
     *        sessions to send logs for. If you want to view logs for a specific session, you can use the <a
     *        href="https://docs.aws.amazon.com/mediatailor/latest/ug/debug-log-mode.html">debug log mode</a>.</p>
     *        <p>
     *        Valid values: 0 - 100
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogConfiguration withPercentEnabled(Integer percentEnabled) {
        setPercentEnabled(percentEnabled);
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
        if (getPercentEnabled() != null)
            sb.append("PercentEnabled: ").append(getPercentEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogConfiguration == false)
            return false;
        LogConfiguration other = (LogConfiguration) obj;
        if (other.getPercentEnabled() == null ^ this.getPercentEnabled() == null)
            return false;
        if (other.getPercentEnabled() != null && other.getPercentEnabled().equals(this.getPercentEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPercentEnabled() == null) ? 0 : getPercentEnabled().hashCode());
        return hashCode;
    }

    @Override
    public LogConfiguration clone() {
        try {
            return (LogConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.LogConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

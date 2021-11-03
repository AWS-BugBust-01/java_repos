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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreatePrefetchSchedule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePrefetchScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The configuration settings for MediaTailor's <i>consumption</i> of the prefetched ads from the ad decision
     * server. Each consumption configuration contains an end time and an optional start time that define the
     * <i>consumption window</i>. Prefetch schedules automatically expire no earlier than seven days after the end time.
     * </p>
     */
    private PrefetchConsumption consumption;
    /**
     * <p>
     * The identifier for the playback configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the playback configuration.
     * </p>
     */
    private String playbackConfigurationName;
    /**
     * <p>
     * The configuration settings for retrieval of prefetched ads from the ad decision server. Only one set of
     * prefetched ads will be retrieved and subsequently consumed for each ad break.
     * </p>
     */
    private PrefetchRetrieval retrieval;
    /**
     * <p>
     * An optional stream identifier that MediaTailor uses to prefetch ads for multiple streams that use the same
     * playback configuration. If StreamId is specified, MediaTailor returns all of the prefetch schedules with an exact
     * match on StreamId. If not specified, MediaTailor returns all of the prefetch schedules for the playback
     * configuration, regardless of StreamId.
     * </p>
     */
    private String streamId;

    /**
     * <p>
     * The configuration settings for MediaTailor's <i>consumption</i> of the prefetched ads from the ad decision
     * server. Each consumption configuration contains an end time and an optional start time that define the
     * <i>consumption window</i>. Prefetch schedules automatically expire no earlier than seven days after the end time.
     * </p>
     * 
     * @param consumption
     *        The configuration settings for MediaTailor's <i>consumption</i> of the prefetched ads from the ad decision
     *        server. Each consumption configuration contains an end time and an optional start time that define the
     *        <i>consumption window</i>. Prefetch schedules automatically expire no earlier than seven days after the
     *        end time.
     */

    public void setConsumption(PrefetchConsumption consumption) {
        this.consumption = consumption;
    }

    /**
     * <p>
     * The configuration settings for MediaTailor's <i>consumption</i> of the prefetched ads from the ad decision
     * server. Each consumption configuration contains an end time and an optional start time that define the
     * <i>consumption window</i>. Prefetch schedules automatically expire no earlier than seven days after the end time.
     * </p>
     * 
     * @return The configuration settings for MediaTailor's <i>consumption</i> of the prefetched ads from the ad
     *         decision server. Each consumption configuration contains an end time and an optional start time that
     *         define the <i>consumption window</i>. Prefetch schedules automatically expire no earlier than seven days
     *         after the end time.
     */

    public PrefetchConsumption getConsumption() {
        return this.consumption;
    }

    /**
     * <p>
     * The configuration settings for MediaTailor's <i>consumption</i> of the prefetched ads from the ad decision
     * server. Each consumption configuration contains an end time and an optional start time that define the
     * <i>consumption window</i>. Prefetch schedules automatically expire no earlier than seven days after the end time.
     * </p>
     * 
     * @param consumption
     *        The configuration settings for MediaTailor's <i>consumption</i> of the prefetched ads from the ad decision
     *        server. Each consumption configuration contains an end time and an optional start time that define the
     *        <i>consumption window</i>. Prefetch schedules automatically expire no earlier than seven days after the
     *        end time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePrefetchScheduleRequest withConsumption(PrefetchConsumption consumption) {
        setConsumption(consumption);
        return this;
    }

    /**
     * <p>
     * The identifier for the playback configuration.
     * </p>
     * 
     * @param name
     *        The identifier for the playback configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The identifier for the playback configuration.
     * </p>
     * 
     * @return The identifier for the playback configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The identifier for the playback configuration.
     * </p>
     * 
     * @param name
     *        The identifier for the playback configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePrefetchScheduleRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the playback configuration.
     * </p>
     * 
     * @param playbackConfigurationName
     *        The name of the playback configuration.
     */

    public void setPlaybackConfigurationName(String playbackConfigurationName) {
        this.playbackConfigurationName = playbackConfigurationName;
    }

    /**
     * <p>
     * The name of the playback configuration.
     * </p>
     * 
     * @return The name of the playback configuration.
     */

    public String getPlaybackConfigurationName() {
        return this.playbackConfigurationName;
    }

    /**
     * <p>
     * The name of the playback configuration.
     * </p>
     * 
     * @param playbackConfigurationName
     *        The name of the playback configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePrefetchScheduleRequest withPlaybackConfigurationName(String playbackConfigurationName) {
        setPlaybackConfigurationName(playbackConfigurationName);
        return this;
    }

    /**
     * <p>
     * The configuration settings for retrieval of prefetched ads from the ad decision server. Only one set of
     * prefetched ads will be retrieved and subsequently consumed for each ad break.
     * </p>
     * 
     * @param retrieval
     *        The configuration settings for retrieval of prefetched ads from the ad decision server. Only one set of
     *        prefetched ads will be retrieved and subsequently consumed for each ad break.
     */

    public void setRetrieval(PrefetchRetrieval retrieval) {
        this.retrieval = retrieval;
    }

    /**
     * <p>
     * The configuration settings for retrieval of prefetched ads from the ad decision server. Only one set of
     * prefetched ads will be retrieved and subsequently consumed for each ad break.
     * </p>
     * 
     * @return The configuration settings for retrieval of prefetched ads from the ad decision server. Only one set of
     *         prefetched ads will be retrieved and subsequently consumed for each ad break.
     */

    public PrefetchRetrieval getRetrieval() {
        return this.retrieval;
    }

    /**
     * <p>
     * The configuration settings for retrieval of prefetched ads from the ad decision server. Only one set of
     * prefetched ads will be retrieved and subsequently consumed for each ad break.
     * </p>
     * 
     * @param retrieval
     *        The configuration settings for retrieval of prefetched ads from the ad decision server. Only one set of
     *        prefetched ads will be retrieved and subsequently consumed for each ad break.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePrefetchScheduleRequest withRetrieval(PrefetchRetrieval retrieval) {
        setRetrieval(retrieval);
        return this;
    }

    /**
     * <p>
     * An optional stream identifier that MediaTailor uses to prefetch ads for multiple streams that use the same
     * playback configuration. If StreamId is specified, MediaTailor returns all of the prefetch schedules with an exact
     * match on StreamId. If not specified, MediaTailor returns all of the prefetch schedules for the playback
     * configuration, regardless of StreamId.
     * </p>
     * 
     * @param streamId
     *        An optional stream identifier that MediaTailor uses to prefetch ads for multiple streams that use the same
     *        playback configuration. If StreamId is specified, MediaTailor returns all of the prefetch schedules with
     *        an exact match on StreamId. If not specified, MediaTailor returns all of the prefetch schedules for the
     *        playback configuration, regardless of StreamId.
     */

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    /**
     * <p>
     * An optional stream identifier that MediaTailor uses to prefetch ads for multiple streams that use the same
     * playback configuration. If StreamId is specified, MediaTailor returns all of the prefetch schedules with an exact
     * match on StreamId. If not specified, MediaTailor returns all of the prefetch schedules for the playback
     * configuration, regardless of StreamId.
     * </p>
     * 
     * @return An optional stream identifier that MediaTailor uses to prefetch ads for multiple streams that use the
     *         same playback configuration. If StreamId is specified, MediaTailor returns all of the prefetch schedules
     *         with an exact match on StreamId. If not specified, MediaTailor returns all of the prefetch schedules for
     *         the playback configuration, regardless of StreamId.
     */

    public String getStreamId() {
        return this.streamId;
    }

    /**
     * <p>
     * An optional stream identifier that MediaTailor uses to prefetch ads for multiple streams that use the same
     * playback configuration. If StreamId is specified, MediaTailor returns all of the prefetch schedules with an exact
     * match on StreamId. If not specified, MediaTailor returns all of the prefetch schedules for the playback
     * configuration, regardless of StreamId.
     * </p>
     * 
     * @param streamId
     *        An optional stream identifier that MediaTailor uses to prefetch ads for multiple streams that use the same
     *        playback configuration. If StreamId is specified, MediaTailor returns all of the prefetch schedules with
     *        an exact match on StreamId. If not specified, MediaTailor returns all of the prefetch schedules for the
     *        playback configuration, regardless of StreamId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePrefetchScheduleRequest withStreamId(String streamId) {
        setStreamId(streamId);
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
        if (getConsumption() != null)
            sb.append("Consumption: ").append(getConsumption()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPlaybackConfigurationName() != null)
            sb.append("PlaybackConfigurationName: ").append(getPlaybackConfigurationName()).append(",");
        if (getRetrieval() != null)
            sb.append("Retrieval: ").append(getRetrieval()).append(",");
        if (getStreamId() != null)
            sb.append("StreamId: ").append(getStreamId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePrefetchScheduleRequest == false)
            return false;
        CreatePrefetchScheduleRequest other = (CreatePrefetchScheduleRequest) obj;
        if (other.getConsumption() == null ^ this.getConsumption() == null)
            return false;
        if (other.getConsumption() != null && other.getConsumption().equals(this.getConsumption()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPlaybackConfigurationName() == null ^ this.getPlaybackConfigurationName() == null)
            return false;
        if (other.getPlaybackConfigurationName() != null && other.getPlaybackConfigurationName().equals(this.getPlaybackConfigurationName()) == false)
            return false;
        if (other.getRetrieval() == null ^ this.getRetrieval() == null)
            return false;
        if (other.getRetrieval() != null && other.getRetrieval().equals(this.getRetrieval()) == false)
            return false;
        if (other.getStreamId() == null ^ this.getStreamId() == null)
            return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConsumption() == null) ? 0 : getConsumption().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPlaybackConfigurationName() == null) ? 0 : getPlaybackConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getRetrieval() == null) ? 0 : getRetrieval().hashCode());
        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        return hashCode;
    }

    @Override
    public CreatePrefetchScheduleRequest clone() {
        return (CreatePrefetchScheduleRequest) super.clone();
    }

}

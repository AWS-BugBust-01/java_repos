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
 * A complex type that contains settings governing when MediaTailor prefetches ads, and which dynamic variables that
 * MediaTailor includes in the request to the ad decision server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/PrefetchRetrieval" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrefetchRetrieval implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dynamic variables to use for substitution during prefetch requests to the ad decision server (ADS).
     * </p>
     * <p>
     * You intially configure <a href="https://docs.aws.amazon.com/mediatailor/latest/ug/variables.html">dynamic
     * variables</a> for the ADS URL when you set up your playback configuration. When you specify DynamicVariables for
     * prefetch retrieval, MediaTailor includes the dynamic variables in the request to the ADS.
     * </p>
     */
    private java.util.Map<String, String> dynamicVariables;
    /**
     * <p>
     * The time when prefetch retrieval ends for the ad break. Prefetching will be attempted for manifest requests that
     * occur at or before this time.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The time when prefetch retrievals can start for this break. Ad prefetching will be attempted for manifest
     * requests that occur at or after this time. Defaults to the current time. If not specified, the prefetch retrieval
     * starts as soon as possible.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The dynamic variables to use for substitution during prefetch requests to the ad decision server (ADS).
     * </p>
     * <p>
     * You intially configure <a href="https://docs.aws.amazon.com/mediatailor/latest/ug/variables.html">dynamic
     * variables</a> for the ADS URL when you set up your playback configuration. When you specify DynamicVariables for
     * prefetch retrieval, MediaTailor includes the dynamic variables in the request to the ADS.
     * </p>
     * 
     * @return The dynamic variables to use for substitution during prefetch requests to the ad decision server
     *         (ADS).</p>
     *         <p>
     *         You intially configure <a href="https://docs.aws.amazon.com/mediatailor/latest/ug/variables.html">dynamic
     *         variables</a> for the ADS URL when you set up your playback configuration. When you specify
     *         DynamicVariables for prefetch retrieval, MediaTailor includes the dynamic variables in the request to the
     *         ADS.
     */

    public java.util.Map<String, String> getDynamicVariables() {
        return dynamicVariables;
    }

    /**
     * <p>
     * The dynamic variables to use for substitution during prefetch requests to the ad decision server (ADS).
     * </p>
     * <p>
     * You intially configure <a href="https://docs.aws.amazon.com/mediatailor/latest/ug/variables.html">dynamic
     * variables</a> for the ADS URL when you set up your playback configuration. When you specify DynamicVariables for
     * prefetch retrieval, MediaTailor includes the dynamic variables in the request to the ADS.
     * </p>
     * 
     * @param dynamicVariables
     *        The dynamic variables to use for substitution during prefetch requests to the ad decision server
     *        (ADS).</p>
     *        <p>
     *        You intially configure <a href="https://docs.aws.amazon.com/mediatailor/latest/ug/variables.html">dynamic
     *        variables</a> for the ADS URL when you set up your playback configuration. When you specify
     *        DynamicVariables for prefetch retrieval, MediaTailor includes the dynamic variables in the request to the
     *        ADS.
     */

    public void setDynamicVariables(java.util.Map<String, String> dynamicVariables) {
        this.dynamicVariables = dynamicVariables;
    }

    /**
     * <p>
     * The dynamic variables to use for substitution during prefetch requests to the ad decision server (ADS).
     * </p>
     * <p>
     * You intially configure <a href="https://docs.aws.amazon.com/mediatailor/latest/ug/variables.html">dynamic
     * variables</a> for the ADS URL when you set up your playback configuration. When you specify DynamicVariables for
     * prefetch retrieval, MediaTailor includes the dynamic variables in the request to the ADS.
     * </p>
     * 
     * @param dynamicVariables
     *        The dynamic variables to use for substitution during prefetch requests to the ad decision server
     *        (ADS).</p>
     *        <p>
     *        You intially configure <a href="https://docs.aws.amazon.com/mediatailor/latest/ug/variables.html">dynamic
     *        variables</a> for the ADS URL when you set up your playback configuration. When you specify
     *        DynamicVariables for prefetch retrieval, MediaTailor includes the dynamic variables in the request to the
     *        ADS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefetchRetrieval withDynamicVariables(java.util.Map<String, String> dynamicVariables) {
        setDynamicVariables(dynamicVariables);
        return this;
    }

    /**
     * Add a single DynamicVariables entry
     *
     * @see PrefetchRetrieval#withDynamicVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PrefetchRetrieval addDynamicVariablesEntry(String key, String value) {
        if (null == this.dynamicVariables) {
            this.dynamicVariables = new java.util.HashMap<String, String>();
        }
        if (this.dynamicVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.dynamicVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DynamicVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefetchRetrieval clearDynamicVariablesEntries() {
        this.dynamicVariables = null;
        return this;
    }

    /**
     * <p>
     * The time when prefetch retrieval ends for the ad break. Prefetching will be attempted for manifest requests that
     * occur at or before this time.
     * </p>
     * 
     * @param endTime
     *        The time when prefetch retrieval ends for the ad break. Prefetching will be attempted for manifest
     *        requests that occur at or before this time.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time when prefetch retrieval ends for the ad break. Prefetching will be attempted for manifest requests that
     * occur at or before this time.
     * </p>
     * 
     * @return The time when prefetch retrieval ends for the ad break. Prefetching will be attempted for manifest
     *         requests that occur at or before this time.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time when prefetch retrieval ends for the ad break. Prefetching will be attempted for manifest requests that
     * occur at or before this time.
     * </p>
     * 
     * @param endTime
     *        The time when prefetch retrieval ends for the ad break. Prefetching will be attempted for manifest
     *        requests that occur at or before this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefetchRetrieval withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The time when prefetch retrievals can start for this break. Ad prefetching will be attempted for manifest
     * requests that occur at or after this time. Defaults to the current time. If not specified, the prefetch retrieval
     * starts as soon as possible.
     * </p>
     * 
     * @param startTime
     *        The time when prefetch retrievals can start for this break. Ad prefetching will be attempted for manifest
     *        requests that occur at or after this time. Defaults to the current time. If not specified, the prefetch
     *        retrieval starts as soon as possible.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time when prefetch retrievals can start for this break. Ad prefetching will be attempted for manifest
     * requests that occur at or after this time. Defaults to the current time. If not specified, the prefetch retrieval
     * starts as soon as possible.
     * </p>
     * 
     * @return The time when prefetch retrievals can start for this break. Ad prefetching will be attempted for manifest
     *         requests that occur at or after this time. Defaults to the current time. If not specified, the prefetch
     *         retrieval starts as soon as possible.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time when prefetch retrievals can start for this break. Ad prefetching will be attempted for manifest
     * requests that occur at or after this time. Defaults to the current time. If not specified, the prefetch retrieval
     * starts as soon as possible.
     * </p>
     * 
     * @param startTime
     *        The time when prefetch retrievals can start for this break. Ad prefetching will be attempted for manifest
     *        requests that occur at or after this time. Defaults to the current time. If not specified, the prefetch
     *        retrieval starts as soon as possible.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefetchRetrieval withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getDynamicVariables() != null)
            sb.append("DynamicVariables: ").append(getDynamicVariables()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrefetchRetrieval == false)
            return false;
        PrefetchRetrieval other = (PrefetchRetrieval) obj;
        if (other.getDynamicVariables() == null ^ this.getDynamicVariables() == null)
            return false;
        if (other.getDynamicVariables() != null && other.getDynamicVariables().equals(this.getDynamicVariables()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDynamicVariables() == null) ? 0 : getDynamicVariables().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public PrefetchRetrieval clone() {
        try {
            return (PrefetchRetrieval) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.PrefetchRetrievalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

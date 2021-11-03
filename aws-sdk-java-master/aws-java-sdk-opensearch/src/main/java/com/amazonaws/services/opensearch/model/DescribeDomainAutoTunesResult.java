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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a <code>DescribeDomainAutoTunes</code> request. See <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html" target="_blank"> Auto-Tune
 * for Amazon OpenSearch Service </a> for more information.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDomainAutoTunesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of setting adjustments that Auto-Tune has made to the domain. See <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html" target="_blank">
     * Auto-Tune for Amazon OpenSearch Service </a> for more information.
     * </p>
     */
    private java.util.List<AutoTune> autoTunes;
    /**
     * <p>
     * An identifier to allow retrieval of paginated results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of setting adjustments that Auto-Tune has made to the domain. See <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html" target="_blank">
     * Auto-Tune for Amazon OpenSearch Service </a> for more information.
     * </p>
     * 
     * @return The list of setting adjustments that Auto-Tune has made to the domain. See <a
     *         href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html"
     *         target="_blank"> Auto-Tune for Amazon OpenSearch Service </a> for more information.
     */

    public java.util.List<AutoTune> getAutoTunes() {
        return autoTunes;
    }

    /**
     * <p>
     * The list of setting adjustments that Auto-Tune has made to the domain. See <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html" target="_blank">
     * Auto-Tune for Amazon OpenSearch Service </a> for more information.
     * </p>
     * 
     * @param autoTunes
     *        The list of setting adjustments that Auto-Tune has made to the domain. See <a
     *        href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html"
     *        target="_blank"> Auto-Tune for Amazon OpenSearch Service </a> for more information.
     */

    public void setAutoTunes(java.util.Collection<AutoTune> autoTunes) {
        if (autoTunes == null) {
            this.autoTunes = null;
            return;
        }

        this.autoTunes = new java.util.ArrayList<AutoTune>(autoTunes);
    }

    /**
     * <p>
     * The list of setting adjustments that Auto-Tune has made to the domain. See <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html" target="_blank">
     * Auto-Tune for Amazon OpenSearch Service </a> for more information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoTunes(java.util.Collection)} or {@link #withAutoTunes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param autoTunes
     *        The list of setting adjustments that Auto-Tune has made to the domain. See <a
     *        href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html"
     *        target="_blank"> Auto-Tune for Amazon OpenSearch Service </a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainAutoTunesResult withAutoTunes(AutoTune... autoTunes) {
        if (this.autoTunes == null) {
            setAutoTunes(new java.util.ArrayList<AutoTune>(autoTunes.length));
        }
        for (AutoTune ele : autoTunes) {
            this.autoTunes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of setting adjustments that Auto-Tune has made to the domain. See <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html" target="_blank">
     * Auto-Tune for Amazon OpenSearch Service </a> for more information.
     * </p>
     * 
     * @param autoTunes
     *        The list of setting adjustments that Auto-Tune has made to the domain. See <a
     *        href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html"
     *        target="_blank"> Auto-Tune for Amazon OpenSearch Service </a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainAutoTunesResult withAutoTunes(java.util.Collection<AutoTune> autoTunes) {
        setAutoTunes(autoTunes);
        return this;
    }

    /**
     * <p>
     * An identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param nextToken
     *        An identifier to allow retrieval of paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @return An identifier to allow retrieval of paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param nextToken
     *        An identifier to allow retrieval of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainAutoTunesResult withNextToken(String nextToken) {
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
        if (getAutoTunes() != null)
            sb.append("AutoTunes: ").append(getAutoTunes()).append(",");
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

        if (obj instanceof DescribeDomainAutoTunesResult == false)
            return false;
        DescribeDomainAutoTunesResult other = (DescribeDomainAutoTunesResult) obj;
        if (other.getAutoTunes() == null ^ this.getAutoTunes() == null)
            return false;
        if (other.getAutoTunes() != null && other.getAutoTunes().equals(this.getAutoTunes()) == false)
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

        hashCode = prime * hashCode + ((getAutoTunes() == null) ? 0 : getAutoTunes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDomainAutoTunesResult clone() {
        try {
            return (DescribeDomainAutoTunesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

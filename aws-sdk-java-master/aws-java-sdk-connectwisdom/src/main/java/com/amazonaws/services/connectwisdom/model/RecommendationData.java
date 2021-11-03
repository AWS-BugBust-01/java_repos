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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/RecommendationData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The recommended document.
     * </p>
     */
    private Document document;
    /**
     * <p>
     * The identifier of the recommendation.
     * </p>
     */
    private String recommendationId;
    /**
     * <p>
     * The relevance level of the recommendation.
     * </p>
     */
    private String relevanceLevel;
    /**
     * <p>
     * The relevance score of the recommendation.
     * </p>
     */
    private Double relevanceScore;

    /**
     * <p>
     * The recommended document.
     * </p>
     * 
     * @param document
     *        The recommended document.
     */

    public void setDocument(Document document) {
        this.document = document;
    }

    /**
     * <p>
     * The recommended document.
     * </p>
     * 
     * @return The recommended document.
     */

    public Document getDocument() {
        return this.document;
    }

    /**
     * <p>
     * The recommended document.
     * </p>
     * 
     * @param document
     *        The recommended document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationData withDocument(Document document) {
        setDocument(document);
        return this;
    }

    /**
     * <p>
     * The identifier of the recommendation.
     * </p>
     * 
     * @param recommendationId
     *        The identifier of the recommendation.
     */

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * The identifier of the recommendation.
     * </p>
     * 
     * @return The identifier of the recommendation.
     */

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * <p>
     * The identifier of the recommendation.
     * </p>
     * 
     * @param recommendationId
     *        The identifier of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationData withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
        return this;
    }

    /**
     * <p>
     * The relevance level of the recommendation.
     * </p>
     * 
     * @param relevanceLevel
     *        The relevance level of the recommendation.
     * @see RelevanceLevel
     */

    public void setRelevanceLevel(String relevanceLevel) {
        this.relevanceLevel = relevanceLevel;
    }

    /**
     * <p>
     * The relevance level of the recommendation.
     * </p>
     * 
     * @return The relevance level of the recommendation.
     * @see RelevanceLevel
     */

    public String getRelevanceLevel() {
        return this.relevanceLevel;
    }

    /**
     * <p>
     * The relevance level of the recommendation.
     * </p>
     * 
     * @param relevanceLevel
     *        The relevance level of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelevanceLevel
     */

    public RecommendationData withRelevanceLevel(String relevanceLevel) {
        setRelevanceLevel(relevanceLevel);
        return this;
    }

    /**
     * <p>
     * The relevance level of the recommendation.
     * </p>
     * 
     * @param relevanceLevel
     *        The relevance level of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelevanceLevel
     */

    public RecommendationData withRelevanceLevel(RelevanceLevel relevanceLevel) {
        this.relevanceLevel = relevanceLevel.toString();
        return this;
    }

    /**
     * <p>
     * The relevance score of the recommendation.
     * </p>
     * 
     * @param relevanceScore
     *        The relevance score of the recommendation.
     */

    public void setRelevanceScore(Double relevanceScore) {
        this.relevanceScore = relevanceScore;
    }

    /**
     * <p>
     * The relevance score of the recommendation.
     * </p>
     * 
     * @return The relevance score of the recommendation.
     */

    public Double getRelevanceScore() {
        return this.relevanceScore;
    }

    /**
     * <p>
     * The relevance score of the recommendation.
     * </p>
     * 
     * @param relevanceScore
     *        The relevance score of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationData withRelevanceScore(Double relevanceScore) {
        setRelevanceScore(relevanceScore);
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
        if (getDocument() != null)
            sb.append("Document: ").append(getDocument()).append(",");
        if (getRecommendationId() != null)
            sb.append("RecommendationId: ").append(getRecommendationId()).append(",");
        if (getRelevanceLevel() != null)
            sb.append("RelevanceLevel: ").append(getRelevanceLevel()).append(",");
        if (getRelevanceScore() != null)
            sb.append("RelevanceScore: ").append(getRelevanceScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationData == false)
            return false;
        RecommendationData other = (RecommendationData) obj;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null)
            return false;
        if (other.getRecommendationId() != null && other.getRecommendationId().equals(this.getRecommendationId()) == false)
            return false;
        if (other.getRelevanceLevel() == null ^ this.getRelevanceLevel() == null)
            return false;
        if (other.getRelevanceLevel() != null && other.getRelevanceLevel().equals(this.getRelevanceLevel()) == false)
            return false;
        if (other.getRelevanceScore() == null ^ this.getRelevanceScore() == null)
            return false;
        if (other.getRelevanceScore() != null && other.getRelevanceScore().equals(this.getRelevanceScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getRelevanceLevel() == null) ? 0 : getRelevanceLevel().hashCode());
        hashCode = prime * hashCode + ((getRelevanceScore() == null) ? 0 : getRelevanceScore().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationData clone() {
        try {
            return (RecommendationData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.RecommendationDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

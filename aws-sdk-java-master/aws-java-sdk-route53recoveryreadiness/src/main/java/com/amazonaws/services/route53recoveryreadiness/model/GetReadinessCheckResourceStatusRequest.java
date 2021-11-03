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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheckResourceStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReadinessCheckResourceStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Upper bound on number of records to return. */
    private Integer maxResults;
    /** A token used to resume pagination from the end of a previous request. */
    private String nextToken;
    /** The ReadinessCheck to get */
    private String readinessCheckName;
    /** The resource ARN or component Id to get */
    private String resourceIdentifier;

    /**
     * Upper bound on number of records to return.
     * 
     * @param maxResults
     *        Upper bound on number of records to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * Upper bound on number of records to return.
     * 
     * @return Upper bound on number of records to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * Upper bound on number of records to return.
     * 
     * @param maxResults
     *        Upper bound on number of records to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadinessCheckResourceStatusRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * A token used to resume pagination from the end of a previous request.
     * 
     * @param nextToken
     *        A token used to resume pagination from the end of a previous request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A token used to resume pagination from the end of a previous request.
     * 
     * @return A token used to resume pagination from the end of a previous request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A token used to resume pagination from the end of a previous request.
     * 
     * @param nextToken
     *        A token used to resume pagination from the end of a previous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadinessCheckResourceStatusRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * The ReadinessCheck to get
     * 
     * @param readinessCheckName
     *        The ReadinessCheck to get
     */

    public void setReadinessCheckName(String readinessCheckName) {
        this.readinessCheckName = readinessCheckName;
    }

    /**
     * The ReadinessCheck to get
     * 
     * @return The ReadinessCheck to get
     */

    public String getReadinessCheckName() {
        return this.readinessCheckName;
    }

    /**
     * The ReadinessCheck to get
     * 
     * @param readinessCheckName
     *        The ReadinessCheck to get
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadinessCheckResourceStatusRequest withReadinessCheckName(String readinessCheckName) {
        setReadinessCheckName(readinessCheckName);
        return this;
    }

    /**
     * The resource ARN or component Id to get
     * 
     * @param resourceIdentifier
     *        The resource ARN or component Id to get
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * The resource ARN or component Id to get
     * 
     * @return The resource ARN or component Id to get
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * The resource ARN or component Id to get
     * 
     * @param resourceIdentifier
     *        The resource ARN or component Id to get
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadinessCheckResourceStatusRequest withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getReadinessCheckName() != null)
            sb.append("ReadinessCheckName: ").append(getReadinessCheckName()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReadinessCheckResourceStatusRequest == false)
            return false;
        GetReadinessCheckResourceStatusRequest other = (GetReadinessCheckResourceStatusRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReadinessCheckName() == null ^ this.getReadinessCheckName() == null)
            return false;
        if (other.getReadinessCheckName() != null && other.getReadinessCheckName().equals(this.getReadinessCheckName()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReadinessCheckName() == null) ? 0 : getReadinessCheckName().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetReadinessCheckResourceStatusRequest clone() {
        return (GetReadinessCheckResourceStatusRequest) super.clone();
    }

}

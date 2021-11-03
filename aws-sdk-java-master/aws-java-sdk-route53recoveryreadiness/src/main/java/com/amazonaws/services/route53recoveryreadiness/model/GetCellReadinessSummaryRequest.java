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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetCellReadinessSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCellReadinessSummaryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The name of the Cell */
    private String cellName;
    /** Upper bound on number of records to return. */
    private Integer maxResults;
    /** A token used to resume pagination from the end of a previous request. */
    private String nextToken;

    /**
     * The name of the Cell
     * 
     * @param cellName
     *        The name of the Cell
     */

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    /**
     * The name of the Cell
     * 
     * @return The name of the Cell
     */

    public String getCellName() {
        return this.cellName;
    }

    /**
     * The name of the Cell
     * 
     * @param cellName
     *        The name of the Cell
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCellReadinessSummaryRequest withCellName(String cellName) {
        setCellName(cellName);
        return this;
    }

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

    public GetCellReadinessSummaryRequest withMaxResults(Integer maxResults) {
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

    public GetCellReadinessSummaryRequest withNextToken(String nextToken) {
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
        if (getCellName() != null)
            sb.append("CellName: ").append(getCellName()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof GetCellReadinessSummaryRequest == false)
            return false;
        GetCellReadinessSummaryRequest other = (GetCellReadinessSummaryRequest) obj;
        if (other.getCellName() == null ^ this.getCellName() == null)
            return false;
        if (other.getCellName() != null && other.getCellName().equals(this.getCellName()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getCellName() == null) ? 0 : getCellName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetCellReadinessSummaryRequest clone() {
        return (GetCellReadinessSummaryRequest) super.clone();
    }

}

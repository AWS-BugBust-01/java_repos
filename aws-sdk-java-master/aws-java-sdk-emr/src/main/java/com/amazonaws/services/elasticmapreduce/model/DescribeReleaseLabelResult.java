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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DescribeReleaseLabel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReleaseLabelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The target release label described in the response.
     * </p>
     */
    private String releaseLabel;
    /**
     * <p>
     * The list of applications available for the target release label. <code>Name</code> is the name of the
     * application. <code>Version</code> is the concise version of the application.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SimplifiedApplication> applications;
    /**
     * <p>
     * The pagination token. Reserved for future use. Currently set to null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The target release label described in the response.
     * </p>
     * 
     * @param releaseLabel
     *        The target release label described in the response.
     */

    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }

    /**
     * <p>
     * The target release label described in the response.
     * </p>
     * 
     * @return The target release label described in the response.
     */

    public String getReleaseLabel() {
        return this.releaseLabel;
    }

    /**
     * <p>
     * The target release label described in the response.
     * </p>
     * 
     * @param releaseLabel
     *        The target release label described in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReleaseLabelResult withReleaseLabel(String releaseLabel) {
        setReleaseLabel(releaseLabel);
        return this;
    }

    /**
     * <p>
     * The list of applications available for the target release label. <code>Name</code> is the name of the
     * application. <code>Version</code> is the concise version of the application.
     * </p>
     * 
     * @return The list of applications available for the target release label. <code>Name</code> is the name of the
     *         application. <code>Version</code> is the concise version of the application.
     */

    public java.util.List<SimplifiedApplication> getApplications() {
        if (applications == null) {
            applications = new com.amazonaws.internal.SdkInternalList<SimplifiedApplication>();
        }
        return applications;
    }

    /**
     * <p>
     * The list of applications available for the target release label. <code>Name</code> is the name of the
     * application. <code>Version</code> is the concise version of the application.
     * </p>
     * 
     * @param applications
     *        The list of applications available for the target release label. <code>Name</code> is the name of the
     *        application. <code>Version</code> is the concise version of the application.
     */

    public void setApplications(java.util.Collection<SimplifiedApplication> applications) {
        if (applications == null) {
            this.applications = null;
            return;
        }

        this.applications = new com.amazonaws.internal.SdkInternalList<SimplifiedApplication>(applications);
    }

    /**
     * <p>
     * The list of applications available for the target release label. <code>Name</code> is the name of the
     * application. <code>Version</code> is the concise version of the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplications(java.util.Collection)} or {@link #withApplications(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param applications
     *        The list of applications available for the target release label. <code>Name</code> is the name of the
     *        application. <code>Version</code> is the concise version of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReleaseLabelResult withApplications(SimplifiedApplication... applications) {
        if (this.applications == null) {
            setApplications(new com.amazonaws.internal.SdkInternalList<SimplifiedApplication>(applications.length));
        }
        for (SimplifiedApplication ele : applications) {
            this.applications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of applications available for the target release label. <code>Name</code> is the name of the
     * application. <code>Version</code> is the concise version of the application.
     * </p>
     * 
     * @param applications
     *        The list of applications available for the target release label. <code>Name</code> is the name of the
     *        application. <code>Version</code> is the concise version of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReleaseLabelResult withApplications(java.util.Collection<SimplifiedApplication> applications) {
        setApplications(applications);
        return this;
    }

    /**
     * <p>
     * The pagination token. Reserved for future use. Currently set to null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token. Reserved for future use. Currently set to null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token. Reserved for future use. Currently set to null.
     * </p>
     * 
     * @return The pagination token. Reserved for future use. Currently set to null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token. Reserved for future use. Currently set to null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token. Reserved for future use. Currently set to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReleaseLabelResult withNextToken(String nextToken) {
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
        if (getReleaseLabel() != null)
            sb.append("ReleaseLabel: ").append(getReleaseLabel()).append(",");
        if (getApplications() != null)
            sb.append("Applications: ").append(getApplications()).append(",");
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

        if (obj instanceof DescribeReleaseLabelResult == false)
            return false;
        DescribeReleaseLabelResult other = (DescribeReleaseLabelResult) obj;
        if (other.getReleaseLabel() == null ^ this.getReleaseLabel() == null)
            return false;
        if (other.getReleaseLabel() != null && other.getReleaseLabel().equals(this.getReleaseLabel()) == false)
            return false;
        if (other.getApplications() == null ^ this.getApplications() == null)
            return false;
        if (other.getApplications() != null && other.getApplications().equals(this.getApplications()) == false)
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

        hashCode = prime * hashCode + ((getReleaseLabel() == null) ? 0 : getReleaseLabel().hashCode());
        hashCode = prime * hashCode + ((getApplications() == null) ? 0 : getApplications().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReleaseLabelResult clone() {
        try {
            return (DescribeReleaseLabelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

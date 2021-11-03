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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The type of experience you want to embed. For anonymous users, you can embed an Amazon QuickSight dashboard.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AnonymousUserEmbeddingExperienceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnonymousUserEmbeddingExperienceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of embedding experience. In this case, an Amazon QuickSight dashboard.
     * </p>
     */
    private AnonymousUserDashboardEmbeddingConfiguration dashboard;

    /**
     * <p>
     * The type of embedding experience. In this case, an Amazon QuickSight dashboard.
     * </p>
     * 
     * @param dashboard
     *        The type of embedding experience. In this case, an Amazon QuickSight dashboard.
     */

    public void setDashboard(AnonymousUserDashboardEmbeddingConfiguration dashboard) {
        this.dashboard = dashboard;
    }

    /**
     * <p>
     * The type of embedding experience. In this case, an Amazon QuickSight dashboard.
     * </p>
     * 
     * @return The type of embedding experience. In this case, an Amazon QuickSight dashboard.
     */

    public AnonymousUserDashboardEmbeddingConfiguration getDashboard() {
        return this.dashboard;
    }

    /**
     * <p>
     * The type of embedding experience. In this case, an Amazon QuickSight dashboard.
     * </p>
     * 
     * @param dashboard
     *        The type of embedding experience. In this case, an Amazon QuickSight dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnonymousUserEmbeddingExperienceConfiguration withDashboard(AnonymousUserDashboardEmbeddingConfiguration dashboard) {
        setDashboard(dashboard);
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
        if (getDashboard() != null)
            sb.append("Dashboard: ").append(getDashboard());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnonymousUserEmbeddingExperienceConfiguration == false)
            return false;
        AnonymousUserEmbeddingExperienceConfiguration other = (AnonymousUserEmbeddingExperienceConfiguration) obj;
        if (other.getDashboard() == null ^ this.getDashboard() == null)
            return false;
        if (other.getDashboard() != null && other.getDashboard().equals(this.getDashboard()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDashboard() == null) ? 0 : getDashboard().hashCode());
        return hashCode;
    }

    @Override
    public AnonymousUserEmbeddingExperienceConfiguration clone() {
        try {
            return (AnonymousUserEmbeddingExperienceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AnonymousUserEmbeddingExperienceConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}

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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an OpenSearch data source configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/OpenSearchServiceDataSourceConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenSearchServiceDataSourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The endpoint.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The Amazon Web Services Region.
     * </p>
     */
    private String awsRegion;

    /**
     * <p>
     * The endpoint.
     * </p>
     * 
     * @param endpoint
     *        The endpoint.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint.
     * </p>
     * 
     * @return The endpoint.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint.
     * </p>
     * 
     * @param endpoint
     *        The endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenSearchServiceDataSourceConfig withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region.
     * </p>
     * 
     * @param awsRegion
     *        The Amazon Web Services Region.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region.
     * </p>
     * 
     * @return The Amazon Web Services Region.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region.
     * </p>
     * 
     * @param awsRegion
     *        The Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenSearchServiceDataSourceConfig withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
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
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpenSearchServiceDataSourceConfig == false)
            return false;
        OpenSearchServiceDataSourceConfig other = (OpenSearchServiceDataSourceConfig) obj;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        return hashCode;
    }

    @Override
    public OpenSearchServiceDataSourceConfig clone() {
        try {
            return (OpenSearchServiceDataSourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.OpenSearchServiceDataSourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

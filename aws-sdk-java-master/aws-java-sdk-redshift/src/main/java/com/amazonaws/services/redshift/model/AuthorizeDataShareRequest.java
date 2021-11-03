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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AuthorizeDataShare" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizeDataShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the datashare that producers are to authorize sharing for.
     * </p>
     */
    private String dataShareArn;
    /**
     * <p>
     * The identifier of the data consumer that is authorized to access the datashare. This identifier is an AWS account
     * ID.
     * </p>
     */
    private String consumerIdentifier;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the datashare that producers are to authorize sharing for.
     * </p>
     * 
     * @param dataShareArn
     *        The Amazon Resource Name (ARN) of the datashare that producers are to authorize sharing for.
     */

    public void setDataShareArn(String dataShareArn) {
        this.dataShareArn = dataShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the datashare that producers are to authorize sharing for.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the datashare that producers are to authorize sharing for.
     */

    public String getDataShareArn() {
        return this.dataShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the datashare that producers are to authorize sharing for.
     * </p>
     * 
     * @param dataShareArn
     *        The Amazon Resource Name (ARN) of the datashare that producers are to authorize sharing for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeDataShareRequest withDataShareArn(String dataShareArn) {
        setDataShareArn(dataShareArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the data consumer that is authorized to access the datashare. This identifier is an AWS account
     * ID.
     * </p>
     * 
     * @param consumerIdentifier
     *        The identifier of the data consumer that is authorized to access the datashare. This identifier is an AWS
     *        account ID.
     */

    public void setConsumerIdentifier(String consumerIdentifier) {
        this.consumerIdentifier = consumerIdentifier;
    }

    /**
     * <p>
     * The identifier of the data consumer that is authorized to access the datashare. This identifier is an AWS account
     * ID.
     * </p>
     * 
     * @return The identifier of the data consumer that is authorized to access the datashare. This identifier is an AWS
     *         account ID.
     */

    public String getConsumerIdentifier() {
        return this.consumerIdentifier;
    }

    /**
     * <p>
     * The identifier of the data consumer that is authorized to access the datashare. This identifier is an AWS account
     * ID.
     * </p>
     * 
     * @param consumerIdentifier
     *        The identifier of the data consumer that is authorized to access the datashare. This identifier is an AWS
     *        account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeDataShareRequest withConsumerIdentifier(String consumerIdentifier) {
        setConsumerIdentifier(consumerIdentifier);
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
        if (getDataShareArn() != null)
            sb.append("DataShareArn: ").append(getDataShareArn()).append(",");
        if (getConsumerIdentifier() != null)
            sb.append("ConsumerIdentifier: ").append(getConsumerIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizeDataShareRequest == false)
            return false;
        AuthorizeDataShareRequest other = (AuthorizeDataShareRequest) obj;
        if (other.getDataShareArn() == null ^ this.getDataShareArn() == null)
            return false;
        if (other.getDataShareArn() != null && other.getDataShareArn().equals(this.getDataShareArn()) == false)
            return false;
        if (other.getConsumerIdentifier() == null ^ this.getConsumerIdentifier() == null)
            return false;
        if (other.getConsumerIdentifier() != null && other.getConsumerIdentifier().equals(this.getConsumerIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataShareArn() == null) ? 0 : getDataShareArn().hashCode());
        hashCode = prime * hashCode + ((getConsumerIdentifier() == null) ? 0 : getConsumerIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizeDataShareRequest clone() {
        return (AuthorizeDataShareRequest) super.clone();
    }

}

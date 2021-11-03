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
package com.amazonaws.services.route53recoverycluster.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/GetRoutingControlState"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRoutingControlStateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Number (ARN) for the routing control that you want to get the state for.
     * </p>
     */
    private String routingControlArn;

    /**
     * <p>
     * The Amazon Resource Number (ARN) for the routing control that you want to get the state for.
     * </p>
     * 
     * @param routingControlArn
     *        The Amazon Resource Number (ARN) for the routing control that you want to get the state for.
     */

    public void setRoutingControlArn(String routingControlArn) {
        this.routingControlArn = routingControlArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) for the routing control that you want to get the state for.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) for the routing control that you want to get the state for.
     */

    public String getRoutingControlArn() {
        return this.routingControlArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) for the routing control that you want to get the state for.
     * </p>
     * 
     * @param routingControlArn
     *        The Amazon Resource Number (ARN) for the routing control that you want to get the state for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRoutingControlStateRequest withRoutingControlArn(String routingControlArn) {
        setRoutingControlArn(routingControlArn);
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
        if (getRoutingControlArn() != null)
            sb.append("RoutingControlArn: ").append(getRoutingControlArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRoutingControlStateRequest == false)
            return false;
        GetRoutingControlStateRequest other = (GetRoutingControlStateRequest) obj;
        if (other.getRoutingControlArn() == null ^ this.getRoutingControlArn() == null)
            return false;
        if (other.getRoutingControlArn() != null && other.getRoutingControlArn().equals(this.getRoutingControlArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoutingControlArn() == null) ? 0 : getRoutingControlArn().hashCode());
        return hashCode;
    }

    @Override
    public GetRoutingControlStateRequest clone() {
        return (GetRoutingControlStateRequest) super.clone();
    }

}

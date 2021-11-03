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
package com.amazonaws.services.route53recoverycontrolconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The details of the routing control that you're updating.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/UpdateRoutingControl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRoutingControlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the routing control.
     * </p>
     */
    private String routingControlArn;
    /**
     * <p>
     * The name of the routing control.
     * </p>
     */
    private String routingControlName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the routing control.
     * </p>
     * 
     * @param routingControlArn
     *        The Amazon Resource Name (ARN) of the routing control.
     */

    public void setRoutingControlArn(String routingControlArn) {
        this.routingControlArn = routingControlArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the routing control.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the routing control.
     */

    public String getRoutingControlArn() {
        return this.routingControlArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the routing control.
     * </p>
     * 
     * @param routingControlArn
     *        The Amazon Resource Name (ARN) of the routing control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoutingControlRequest withRoutingControlArn(String routingControlArn) {
        setRoutingControlArn(routingControlArn);
        return this;
    }

    /**
     * <p>
     * The name of the routing control.
     * </p>
     * 
     * @param routingControlName
     *        The name of the routing control.
     */

    public void setRoutingControlName(String routingControlName) {
        this.routingControlName = routingControlName;
    }

    /**
     * <p>
     * The name of the routing control.
     * </p>
     * 
     * @return The name of the routing control.
     */

    public String getRoutingControlName() {
        return this.routingControlName;
    }

    /**
     * <p>
     * The name of the routing control.
     * </p>
     * 
     * @param routingControlName
     *        The name of the routing control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoutingControlRequest withRoutingControlName(String routingControlName) {
        setRoutingControlName(routingControlName);
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
            sb.append("RoutingControlArn: ").append(getRoutingControlArn()).append(",");
        if (getRoutingControlName() != null)
            sb.append("RoutingControlName: ").append(getRoutingControlName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRoutingControlRequest == false)
            return false;
        UpdateRoutingControlRequest other = (UpdateRoutingControlRequest) obj;
        if (other.getRoutingControlArn() == null ^ this.getRoutingControlArn() == null)
            return false;
        if (other.getRoutingControlArn() != null && other.getRoutingControlArn().equals(this.getRoutingControlArn()) == false)
            return false;
        if (other.getRoutingControlName() == null ^ this.getRoutingControlName() == null)
            return false;
        if (other.getRoutingControlName() != null && other.getRoutingControlName().equals(this.getRoutingControlName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoutingControlArn() == null) ? 0 : getRoutingControlArn().hashCode());
        hashCode = prime * hashCode + ((getRoutingControlName() == null) ? 0 : getRoutingControlName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRoutingControlRequest clone() {
        return (UpdateRoutingControlRequest) super.clone();
    }

}

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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DeleteSubnetCidrReservationRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSubnetCidrReservationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteSubnetCidrReservationRequest> {

    /**
     * <p>
     * The ID of the subnet CIDR reservation.
     * </p>
     */
    private String subnetCidrReservationId;

    /**
     * <p>
     * The ID of the subnet CIDR reservation.
     * </p>
     * 
     * @param subnetCidrReservationId
     *        The ID of the subnet CIDR reservation.
     */

    public void setSubnetCidrReservationId(String subnetCidrReservationId) {
        this.subnetCidrReservationId = subnetCidrReservationId;
    }

    /**
     * <p>
     * The ID of the subnet CIDR reservation.
     * </p>
     * 
     * @return The ID of the subnet CIDR reservation.
     */

    public String getSubnetCidrReservationId() {
        return this.subnetCidrReservationId;
    }

    /**
     * <p>
     * The ID of the subnet CIDR reservation.
     * </p>
     * 
     * @param subnetCidrReservationId
     *        The ID of the subnet CIDR reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSubnetCidrReservationRequest withSubnetCidrReservationId(String subnetCidrReservationId) {
        setSubnetCidrReservationId(subnetCidrReservationId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteSubnetCidrReservationRequest> getDryRunRequest() {
        Request<DeleteSubnetCidrReservationRequest> request = new DeleteSubnetCidrReservationRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getSubnetCidrReservationId() != null)
            sb.append("SubnetCidrReservationId: ").append(getSubnetCidrReservationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSubnetCidrReservationRequest == false)
            return false;
        DeleteSubnetCidrReservationRequest other = (DeleteSubnetCidrReservationRequest) obj;
        if (other.getSubnetCidrReservationId() == null ^ this.getSubnetCidrReservationId() == null)
            return false;
        if (other.getSubnetCidrReservationId() != null && other.getSubnetCidrReservationId().equals(this.getSubnetCidrReservationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetCidrReservationId() == null) ? 0 : getSubnetCidrReservationId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSubnetCidrReservationRequest clone() {
        return (DeleteSubnetCidrReservationRequest) super.clone();
    }
}

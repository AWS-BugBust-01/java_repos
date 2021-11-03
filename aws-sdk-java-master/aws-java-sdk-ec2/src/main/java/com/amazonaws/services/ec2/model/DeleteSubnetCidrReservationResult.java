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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSubnetCidrReservationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the deleted subnet CIDR reservation.
     * </p>
     */
    private SubnetCidrReservation deletedSubnetCidrReservation;

    /**
     * <p>
     * Information about the deleted subnet CIDR reservation.
     * </p>
     * 
     * @param deletedSubnetCidrReservation
     *        Information about the deleted subnet CIDR reservation.
     */

    public void setDeletedSubnetCidrReservation(SubnetCidrReservation deletedSubnetCidrReservation) {
        this.deletedSubnetCidrReservation = deletedSubnetCidrReservation;
    }

    /**
     * <p>
     * Information about the deleted subnet CIDR reservation.
     * </p>
     * 
     * @return Information about the deleted subnet CIDR reservation.
     */

    public SubnetCidrReservation getDeletedSubnetCidrReservation() {
        return this.deletedSubnetCidrReservation;
    }

    /**
     * <p>
     * Information about the deleted subnet CIDR reservation.
     * </p>
     * 
     * @param deletedSubnetCidrReservation
     *        Information about the deleted subnet CIDR reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSubnetCidrReservationResult withDeletedSubnetCidrReservation(SubnetCidrReservation deletedSubnetCidrReservation) {
        setDeletedSubnetCidrReservation(deletedSubnetCidrReservation);
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
        if (getDeletedSubnetCidrReservation() != null)
            sb.append("DeletedSubnetCidrReservation: ").append(getDeletedSubnetCidrReservation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSubnetCidrReservationResult == false)
            return false;
        DeleteSubnetCidrReservationResult other = (DeleteSubnetCidrReservationResult) obj;
        if (other.getDeletedSubnetCidrReservation() == null ^ this.getDeletedSubnetCidrReservation() == null)
            return false;
        if (other.getDeletedSubnetCidrReservation() != null && other.getDeletedSubnetCidrReservation().equals(this.getDeletedSubnetCidrReservation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeletedSubnetCidrReservation() == null) ? 0 : getDeletedSubnetCidrReservation().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSubnetCidrReservationResult clone() {
        try {
            return (DeleteSubnetCidrReservationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}

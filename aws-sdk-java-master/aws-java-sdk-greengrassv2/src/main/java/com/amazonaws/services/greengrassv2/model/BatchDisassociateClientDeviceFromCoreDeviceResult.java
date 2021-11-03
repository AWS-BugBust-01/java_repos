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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/BatchDisassociateClientDeviceFromCoreDevice"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDisassociateClientDeviceFromCoreDeviceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The list of errors (if any) for the entries in the request. Each error entry contains the name of the IoT thing
     * that failed to disassociate.
     * </p>
     */
    private java.util.List<DisassociateClientDeviceFromCoreDeviceErrorEntry> errorEntries;

    /**
     * <p>
     * The list of errors (if any) for the entries in the request. Each error entry contains the name of the IoT thing
     * that failed to disassociate.
     * </p>
     * 
     * @return The list of errors (if any) for the entries in the request. Each error entry contains the name of the IoT
     *         thing that failed to disassociate.
     */

    public java.util.List<DisassociateClientDeviceFromCoreDeviceErrorEntry> getErrorEntries() {
        return errorEntries;
    }

    /**
     * <p>
     * The list of errors (if any) for the entries in the request. Each error entry contains the name of the IoT thing
     * that failed to disassociate.
     * </p>
     * 
     * @param errorEntries
     *        The list of errors (if any) for the entries in the request. Each error entry contains the name of the IoT
     *        thing that failed to disassociate.
     */

    public void setErrorEntries(java.util.Collection<DisassociateClientDeviceFromCoreDeviceErrorEntry> errorEntries) {
        if (errorEntries == null) {
            this.errorEntries = null;
            return;
        }

        this.errorEntries = new java.util.ArrayList<DisassociateClientDeviceFromCoreDeviceErrorEntry>(errorEntries);
    }

    /**
     * <p>
     * The list of errors (if any) for the entries in the request. Each error entry contains the name of the IoT thing
     * that failed to disassociate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrorEntries(java.util.Collection)} or {@link #withErrorEntries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param errorEntries
     *        The list of errors (if any) for the entries in the request. Each error entry contains the name of the IoT
     *        thing that failed to disassociate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateClientDeviceFromCoreDeviceResult withErrorEntries(DisassociateClientDeviceFromCoreDeviceErrorEntry... errorEntries) {
        if (this.errorEntries == null) {
            setErrorEntries(new java.util.ArrayList<DisassociateClientDeviceFromCoreDeviceErrorEntry>(errorEntries.length));
        }
        for (DisassociateClientDeviceFromCoreDeviceErrorEntry ele : errorEntries) {
            this.errorEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of errors (if any) for the entries in the request. Each error entry contains the name of the IoT thing
     * that failed to disassociate.
     * </p>
     * 
     * @param errorEntries
     *        The list of errors (if any) for the entries in the request. Each error entry contains the name of the IoT
     *        thing that failed to disassociate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateClientDeviceFromCoreDeviceResult withErrorEntries(
            java.util.Collection<DisassociateClientDeviceFromCoreDeviceErrorEntry> errorEntries) {
        setErrorEntries(errorEntries);
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
        if (getErrorEntries() != null)
            sb.append("ErrorEntries: ").append(getErrorEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDisassociateClientDeviceFromCoreDeviceResult == false)
            return false;
        BatchDisassociateClientDeviceFromCoreDeviceResult other = (BatchDisassociateClientDeviceFromCoreDeviceResult) obj;
        if (other.getErrorEntries() == null ^ this.getErrorEntries() == null)
            return false;
        if (other.getErrorEntries() != null && other.getErrorEntries().equals(this.getErrorEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorEntries() == null) ? 0 : getErrorEntries().hashCode());
        return hashCode;
    }

    @Override
    public BatchDisassociateClientDeviceFromCoreDeviceResult clone() {
        try {
            return (BatchDisassociateClientDeviceFromCoreDeviceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

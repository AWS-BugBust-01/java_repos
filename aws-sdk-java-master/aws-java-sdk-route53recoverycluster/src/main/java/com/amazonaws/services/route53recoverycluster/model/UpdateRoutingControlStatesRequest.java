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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/UpdateRoutingControlStates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRoutingControlStatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A set of routing control entries that you want to update.
     * </p>
     */
    private java.util.List<UpdateRoutingControlStateEntry> updateRoutingControlStateEntries;

    /**
     * <p>
     * A set of routing control entries that you want to update.
     * </p>
     * 
     * @return A set of routing control entries that you want to update.
     */

    public java.util.List<UpdateRoutingControlStateEntry> getUpdateRoutingControlStateEntries() {
        return updateRoutingControlStateEntries;
    }

    /**
     * <p>
     * A set of routing control entries that you want to update.
     * </p>
     * 
     * @param updateRoutingControlStateEntries
     *        A set of routing control entries that you want to update.
     */

    public void setUpdateRoutingControlStateEntries(java.util.Collection<UpdateRoutingControlStateEntry> updateRoutingControlStateEntries) {
        if (updateRoutingControlStateEntries == null) {
            this.updateRoutingControlStateEntries = null;
            return;
        }

        this.updateRoutingControlStateEntries = new java.util.ArrayList<UpdateRoutingControlStateEntry>(updateRoutingControlStateEntries);
    }

    /**
     * <p>
     * A set of routing control entries that you want to update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdateRoutingControlStateEntries(java.util.Collection)} or
     * {@link #withUpdateRoutingControlStateEntries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param updateRoutingControlStateEntries
     *        A set of routing control entries that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoutingControlStatesRequest withUpdateRoutingControlStateEntries(UpdateRoutingControlStateEntry... updateRoutingControlStateEntries) {
        if (this.updateRoutingControlStateEntries == null) {
            setUpdateRoutingControlStateEntries(new java.util.ArrayList<UpdateRoutingControlStateEntry>(updateRoutingControlStateEntries.length));
        }
        for (UpdateRoutingControlStateEntry ele : updateRoutingControlStateEntries) {
            this.updateRoutingControlStateEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of routing control entries that you want to update.
     * </p>
     * 
     * @param updateRoutingControlStateEntries
     *        A set of routing control entries that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoutingControlStatesRequest withUpdateRoutingControlStateEntries(
            java.util.Collection<UpdateRoutingControlStateEntry> updateRoutingControlStateEntries) {
        setUpdateRoutingControlStateEntries(updateRoutingControlStateEntries);
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
        if (getUpdateRoutingControlStateEntries() != null)
            sb.append("UpdateRoutingControlStateEntries: ").append(getUpdateRoutingControlStateEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRoutingControlStatesRequest == false)
            return false;
        UpdateRoutingControlStatesRequest other = (UpdateRoutingControlStatesRequest) obj;
        if (other.getUpdateRoutingControlStateEntries() == null ^ this.getUpdateRoutingControlStateEntries() == null)
            return false;
        if (other.getUpdateRoutingControlStateEntries() != null
                && other.getUpdateRoutingControlStateEntries().equals(this.getUpdateRoutingControlStateEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdateRoutingControlStateEntries() == null) ? 0 : getUpdateRoutingControlStateEntries().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRoutingControlStatesRequest clone() {
        return (UpdateRoutingControlStatesRequest) super.clone();
    }

}

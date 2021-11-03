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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Container for the <code>WorkflowDetail</code> data type. It is used by actions that trigger a workflow to begin
 * execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/WorkflowDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A trigger that starts a workflow: the workflow begins to execute after a file is uploaded.
     * </p>
     */
    private java.util.List<WorkflowDetail> onUpload;

    /**
     * <p>
     * A trigger that starts a workflow: the workflow begins to execute after a file is uploaded.
     * </p>
     * 
     * @return A trigger that starts a workflow: the workflow begins to execute after a file is uploaded.
     */

    public java.util.List<WorkflowDetail> getOnUpload() {
        return onUpload;
    }

    /**
     * <p>
     * A trigger that starts a workflow: the workflow begins to execute after a file is uploaded.
     * </p>
     * 
     * @param onUpload
     *        A trigger that starts a workflow: the workflow begins to execute after a file is uploaded.
     */

    public void setOnUpload(java.util.Collection<WorkflowDetail> onUpload) {
        if (onUpload == null) {
            this.onUpload = null;
            return;
        }

        this.onUpload = new java.util.ArrayList<WorkflowDetail>(onUpload);
    }

    /**
     * <p>
     * A trigger that starts a workflow: the workflow begins to execute after a file is uploaded.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOnUpload(java.util.Collection)} or {@link #withOnUpload(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param onUpload
     *        A trigger that starts a workflow: the workflow begins to execute after a file is uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowDetails withOnUpload(WorkflowDetail... onUpload) {
        if (this.onUpload == null) {
            setOnUpload(new java.util.ArrayList<WorkflowDetail>(onUpload.length));
        }
        for (WorkflowDetail ele : onUpload) {
            this.onUpload.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A trigger that starts a workflow: the workflow begins to execute after a file is uploaded.
     * </p>
     * 
     * @param onUpload
     *        A trigger that starts a workflow: the workflow begins to execute after a file is uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowDetails withOnUpload(java.util.Collection<WorkflowDetail> onUpload) {
        setOnUpload(onUpload);
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
        if (getOnUpload() != null)
            sb.append("OnUpload: ").append(getOnUpload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowDetails == false)
            return false;
        WorkflowDetails other = (WorkflowDetails) obj;
        if (other.getOnUpload() == null ^ this.getOnUpload() == null)
            return false;
        if (other.getOnUpload() != null && other.getOnUpload().equals(this.getOnUpload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOnUpload() == null) ? 0 : getOnUpload().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowDetails clone() {
        try {
            return (WorkflowDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.WorkflowDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

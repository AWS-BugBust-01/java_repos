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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The instance ID.
     * </p>
     * <note>
     * <p>
     * <code>InstanceId</code> has been deprecated. To specify an instance ID for an association, use the
     * <code>Targets</code> parameter. Requests that include the parameter <code>InstanceID</code> with Systems Manager
     * documents (SSM documents) that use schema version 2.0 or later will fail. In addition, if you use the parameter
     * <code>InstanceId</code>, you can't use the parameters <code>AssociationName</code>, <code>DocumentVersion</code>,
     * <code>MaxErrors</code>, <code>MaxConcurrency</code>, <code>OutputLocation</code>, or
     * <code>ScheduleExpression</code>. To use these parameters, you must use the <code>Targets</code> parameter.
     * </p>
     * </note>
     */
    private String instanceId;
    /**
     * <p>
     * The association ID that you want to delete.
     * </p>
     */
    private String associationId;

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     * 
     * @param name
     *        The name of the SSM document.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     * 
     * @return The name of the SSM document.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the SSM document.
     * </p>
     * 
     * @param name
     *        The name of the SSM document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAssociationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * <note>
     * <p>
     * <code>InstanceId</code> has been deprecated. To specify an instance ID for an association, use the
     * <code>Targets</code> parameter. Requests that include the parameter <code>InstanceID</code> with Systems Manager
     * documents (SSM documents) that use schema version 2.0 or later will fail. In addition, if you use the parameter
     * <code>InstanceId</code>, you can't use the parameters <code>AssociationName</code>, <code>DocumentVersion</code>,
     * <code>MaxErrors</code>, <code>MaxConcurrency</code>, <code>OutputLocation</code>, or
     * <code>ScheduleExpression</code>. To use these parameters, you must use the <code>Targets</code> parameter.
     * </p>
     * </note>
     * 
     * @param instanceId
     *        The instance ID.</p> <note>
     *        <p>
     *        <code>InstanceId</code> has been deprecated. To specify an instance ID for an association, use the
     *        <code>Targets</code> parameter. Requests that include the parameter <code>InstanceID</code> with Systems
     *        Manager documents (SSM documents) that use schema version 2.0 or later will fail. In addition, if you use
     *        the parameter <code>InstanceId</code>, you can't use the parameters <code>AssociationName</code>,
     *        <code>DocumentVersion</code>, <code>MaxErrors</code>, <code>MaxConcurrency</code>,
     *        <code>OutputLocation</code>, or <code>ScheduleExpression</code>. To use these parameters, you must use the
     *        <code>Targets</code> parameter.
     *        </p>
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * <note>
     * <p>
     * <code>InstanceId</code> has been deprecated. To specify an instance ID for an association, use the
     * <code>Targets</code> parameter. Requests that include the parameter <code>InstanceID</code> with Systems Manager
     * documents (SSM documents) that use schema version 2.0 or later will fail. In addition, if you use the parameter
     * <code>InstanceId</code>, you can't use the parameters <code>AssociationName</code>, <code>DocumentVersion</code>,
     * <code>MaxErrors</code>, <code>MaxConcurrency</code>, <code>OutputLocation</code>, or
     * <code>ScheduleExpression</code>. To use these parameters, you must use the <code>Targets</code> parameter.
     * </p>
     * </note>
     * 
     * @return The instance ID.</p> <note>
     *         <p>
     *         <code>InstanceId</code> has been deprecated. To specify an instance ID for an association, use the
     *         <code>Targets</code> parameter. Requests that include the parameter <code>InstanceID</code> with Systems
     *         Manager documents (SSM documents) that use schema version 2.0 or later will fail. In addition, if you use
     *         the parameter <code>InstanceId</code>, you can't use the parameters <code>AssociationName</code>,
     *         <code>DocumentVersion</code>, <code>MaxErrors</code>, <code>MaxConcurrency</code>,
     *         <code>OutputLocation</code>, or <code>ScheduleExpression</code>. To use these parameters, you must use
     *         the <code>Targets</code> parameter.
     *         </p>
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * <note>
     * <p>
     * <code>InstanceId</code> has been deprecated. To specify an instance ID for an association, use the
     * <code>Targets</code> parameter. Requests that include the parameter <code>InstanceID</code> with Systems Manager
     * documents (SSM documents) that use schema version 2.0 or later will fail. In addition, if you use the parameter
     * <code>InstanceId</code>, you can't use the parameters <code>AssociationName</code>, <code>DocumentVersion</code>,
     * <code>MaxErrors</code>, <code>MaxConcurrency</code>, <code>OutputLocation</code>, or
     * <code>ScheduleExpression</code>. To use these parameters, you must use the <code>Targets</code> parameter.
     * </p>
     * </note>
     * 
     * @param instanceId
     *        The instance ID.</p> <note>
     *        <p>
     *        <code>InstanceId</code> has been deprecated. To specify an instance ID for an association, use the
     *        <code>Targets</code> parameter. Requests that include the parameter <code>InstanceID</code> with Systems
     *        Manager documents (SSM documents) that use schema version 2.0 or later will fail. In addition, if you use
     *        the parameter <code>InstanceId</code>, you can't use the parameters <code>AssociationName</code>,
     *        <code>DocumentVersion</code>, <code>MaxErrors</code>, <code>MaxConcurrency</code>,
     *        <code>OutputLocation</code>, or <code>ScheduleExpression</code>. To use these parameters, you must use the
     *        <code>Targets</code> parameter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAssociationRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The association ID that you want to delete.
     * </p>
     * 
     * @param associationId
     *        The association ID that you want to delete.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The association ID that you want to delete.
     * </p>
     * 
     * @return The association ID that you want to delete.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The association ID that you want to delete.
     * </p>
     * 
     * @param associationId
     *        The association ID that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAssociationRequest withAssociationId(String associationId) {
        setAssociationId(associationId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAssociationRequest == false)
            return false;
        DeleteAssociationRequest other = (DeleteAssociationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAssociationRequest clone() {
        return (DeleteAssociationRequest) super.clone();
    }

}

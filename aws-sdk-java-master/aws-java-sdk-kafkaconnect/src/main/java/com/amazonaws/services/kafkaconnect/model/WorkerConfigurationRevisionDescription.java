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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The description of the worker configuration revision.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/WorkerConfigurationRevisionDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkerConfigurationRevisionDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time that the worker configuration was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The description of the worker configuration revision.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Base64 encoded contents of the connect-distributed.properties file.
     * </p>
     */
    private String propertiesFileContent;
    /**
     * <p>
     * The description of a revision of the worker configuration.
     * </p>
     */
    private Long revision;

    /**
     * <p>
     * The time that the worker configuration was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the worker configuration was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the worker configuration was created.
     * </p>
     * 
     * @return The time that the worker configuration was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the worker configuration was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the worker configuration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerConfigurationRevisionDescription withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The description of the worker configuration revision.
     * </p>
     * 
     * @param description
     *        The description of the worker configuration revision.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the worker configuration revision.
     * </p>
     * 
     * @return The description of the worker configuration revision.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the worker configuration revision.
     * </p>
     * 
     * @param description
     *        The description of the worker configuration revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerConfigurationRevisionDescription withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Base64 encoded contents of the connect-distributed.properties file.
     * </p>
     * 
     * @param propertiesFileContent
     *        Base64 encoded contents of the connect-distributed.properties file.
     */

    public void setPropertiesFileContent(String propertiesFileContent) {
        this.propertiesFileContent = propertiesFileContent;
    }

    /**
     * <p>
     * Base64 encoded contents of the connect-distributed.properties file.
     * </p>
     * 
     * @return Base64 encoded contents of the connect-distributed.properties file.
     */

    public String getPropertiesFileContent() {
        return this.propertiesFileContent;
    }

    /**
     * <p>
     * Base64 encoded contents of the connect-distributed.properties file.
     * </p>
     * 
     * @param propertiesFileContent
     *        Base64 encoded contents of the connect-distributed.properties file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerConfigurationRevisionDescription withPropertiesFileContent(String propertiesFileContent) {
        setPropertiesFileContent(propertiesFileContent);
        return this;
    }

    /**
     * <p>
     * The description of a revision of the worker configuration.
     * </p>
     * 
     * @param revision
     *        The description of a revision of the worker configuration.
     */

    public void setRevision(Long revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The description of a revision of the worker configuration.
     * </p>
     * 
     * @return The description of a revision of the worker configuration.
     */

    public Long getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The description of a revision of the worker configuration.
     * </p>
     * 
     * @param revision
     *        The description of a revision of the worker configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerConfigurationRevisionDescription withRevision(Long revision) {
        setRevision(revision);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPropertiesFileContent() != null)
            sb.append("PropertiesFileContent: ").append(getPropertiesFileContent()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkerConfigurationRevisionDescription == false)
            return false;
        WorkerConfigurationRevisionDescription other = (WorkerConfigurationRevisionDescription) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPropertiesFileContent() == null ^ this.getPropertiesFileContent() == null)
            return false;
        if (other.getPropertiesFileContent() != null && other.getPropertiesFileContent().equals(this.getPropertiesFileContent()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPropertiesFileContent() == null) ? 0 : getPropertiesFileContent().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public WorkerConfigurationRevisionDescription clone() {
        try {
            return (WorkerConfigurationRevisionDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafkaconnect.model.transform.WorkerConfigurationRevisionDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

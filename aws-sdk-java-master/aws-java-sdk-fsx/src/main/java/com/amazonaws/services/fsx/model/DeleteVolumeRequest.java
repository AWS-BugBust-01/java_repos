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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteVolume" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVolumeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String clientRequestToken;
    /**
     * <p>
     * The ID of the volume you are deleting.
     * </p>
     */
    private String volumeId;
    /**
     * <p>
     * For Amazon FSx for ONTAP volumes, specify whether to take a final backup of the volume, and apply tags to the
     * backup.
     * </p>
     */
    private DeleteVolumeOntapConfiguration ontapConfiguration;

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVolumeRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The ID of the volume you are deleting.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume you are deleting.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume you are deleting.
     * </p>
     * 
     * @return The ID of the volume you are deleting.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the volume you are deleting.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume you are deleting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVolumeRequest withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * <p>
     * For Amazon FSx for ONTAP volumes, specify whether to take a final backup of the volume, and apply tags to the
     * backup.
     * </p>
     * 
     * @param ontapConfiguration
     *        For Amazon FSx for ONTAP volumes, specify whether to take a final backup of the volume, and apply tags to
     *        the backup.
     */

    public void setOntapConfiguration(DeleteVolumeOntapConfiguration ontapConfiguration) {
        this.ontapConfiguration = ontapConfiguration;
    }

    /**
     * <p>
     * For Amazon FSx for ONTAP volumes, specify whether to take a final backup of the volume, and apply tags to the
     * backup.
     * </p>
     * 
     * @return For Amazon FSx for ONTAP volumes, specify whether to take a final backup of the volume, and apply tags to
     *         the backup.
     */

    public DeleteVolumeOntapConfiguration getOntapConfiguration() {
        return this.ontapConfiguration;
    }

    /**
     * <p>
     * For Amazon FSx for ONTAP volumes, specify whether to take a final backup of the volume, and apply tags to the
     * backup.
     * </p>
     * 
     * @param ontapConfiguration
     *        For Amazon FSx for ONTAP volumes, specify whether to take a final backup of the volume, and apply tags to
     *        the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVolumeRequest withOntapConfiguration(DeleteVolumeOntapConfiguration ontapConfiguration) {
        setOntapConfiguration(ontapConfiguration);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId()).append(",");
        if (getOntapConfiguration() != null)
            sb.append("OntapConfiguration: ").append(getOntapConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVolumeRequest == false)
            return false;
        DeleteVolumeRequest other = (DeleteVolumeRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getOntapConfiguration() == null ^ this.getOntapConfiguration() == null)
            return false;
        if (other.getOntapConfiguration() != null && other.getOntapConfiguration().equals(this.getOntapConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getOntapConfiguration() == null) ? 0 : getOntapConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVolumeRequest clone() {
        return (DeleteVolumeRequest) super.clone();
    }

}

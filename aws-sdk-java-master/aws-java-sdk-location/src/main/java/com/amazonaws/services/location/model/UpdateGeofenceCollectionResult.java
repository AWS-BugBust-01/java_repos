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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdateGeofenceCollection" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGeofenceCollectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated geofence collection. Used to specify a resource across AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     * </p>
     * </li>
     * </ul>
     */
    private String collectionArn;
    /**
     * <p>
     * The name of the updated geofence collection.
     * </p>
     */
    private String collectionName;
    /**
     * <p>
     * The time when the geofence collection was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated geofence collection. Used to specify a resource across AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param collectionArn
     *        The Amazon Resource Name (ARN) of the updated geofence collection. Used to specify a resource across
     *        AWS.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     *        </p>
     *        </li>
     */

    public void setCollectionArn(String collectionArn) {
        this.collectionArn = collectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated geofence collection. Used to specify a resource across AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of the updated geofence collection. Used to specify a resource across
     *         AWS.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     *         </p>
     *         </li>
     */

    public String getCollectionArn() {
        return this.collectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the updated geofence collection. Used to specify a resource across AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param collectionArn
     *        The Amazon Resource Name (ARN) of the updated geofence collection. Used to specify a resource across
     *        AWS.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGeofenceCollectionResult withCollectionArn(String collectionArn) {
        setCollectionArn(collectionArn);
        return this;
    }

    /**
     * <p>
     * The name of the updated geofence collection.
     * </p>
     * 
     * @param collectionName
     *        The name of the updated geofence collection.
     */

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * The name of the updated geofence collection.
     * </p>
     * 
     * @return The name of the updated geofence collection.
     */

    public String getCollectionName() {
        return this.collectionName;
    }

    /**
     * <p>
     * The name of the updated geofence collection.
     * </p>
     * 
     * @param collectionName
     *        The name of the updated geofence collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGeofenceCollectionResult withCollectionName(String collectionName) {
        setCollectionName(collectionName);
        return this;
    }

    /**
     * <p>
     * The time when the geofence collection was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * 
     * @param updateTime
     *        The time when the geofence collection was last updated in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The time when the geofence collection was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * 
     * @return The time when the geofence collection was last updated in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The time when the geofence collection was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * 
     * @param updateTime
     *        The time when the geofence collection was last updated in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGeofenceCollectionResult withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getCollectionArn() != null)
            sb.append("CollectionArn: ").append(getCollectionArn()).append(",");
        if (getCollectionName() != null)
            sb.append("CollectionName: ").append(getCollectionName()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGeofenceCollectionResult == false)
            return false;
        UpdateGeofenceCollectionResult other = (UpdateGeofenceCollectionResult) obj;
        if (other.getCollectionArn() == null ^ this.getCollectionArn() == null)
            return false;
        if (other.getCollectionArn() != null && other.getCollectionArn().equals(this.getCollectionArn()) == false)
            return false;
        if (other.getCollectionName() == null ^ this.getCollectionName() == null)
            return false;
        if (other.getCollectionName() != null && other.getCollectionName().equals(this.getCollectionName()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionArn() == null) ? 0 : getCollectionArn().hashCode());
        hashCode = prime * hashCode + ((getCollectionName() == null) ? 0 : getCollectionName().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGeofenceCollectionResult clone() {
        try {
            return (UpdateGeofenceCollectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}

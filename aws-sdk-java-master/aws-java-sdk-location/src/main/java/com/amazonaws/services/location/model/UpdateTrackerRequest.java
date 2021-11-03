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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdateTracker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTrackerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Updates the description for the tracker resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Updates the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked geofence collections, but not every
     * location update is stored. If your update frequency is more often than 30 seconds, only one update per 30 seconds
     * is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4 ft), location updates are ignored.
     * Location updates within this distance are neither evaluated against linked geofence collections, nor stored. This
     * helps control costs by reducing the number of geofence evaluations and device positions to retrieve.
     * Distance-based filtering can also reduce the jitter effect when displaying device trajectory on a map.
     * </p>
     * </li>
     * </ul>
     */
    private String positionFiltering;
    /**
     * <p>
     * Updates the pricing plan for the tracker resource.
     * </p>
     * <p>
     * For more information about each pricing plan option restrictions, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * </p>
     */
    private String pricingPlan;
    /**
     * <p>
     * Updates the data provider for the tracker resource.
     * </p>
     * <p>
     * A required value for the following pricing plans: <code>MobileAssetTracking</code>|
     * <code>MobileAssetManagement</code>
     * </p>
     * <p>
     * For more information about <a href="https://aws.amazon.com/location/data-providers/">data providers</a> and <a
     * href="https://aws.amazon.com/location/pricing/">pricing plans</a>, see the Amazon Location Service product page
     * </p>
     * <note>
     * <p>
     * This can only be updated when updating the <code>PricingPlan</code> in the same request.
     * </p>
     * <p>
     * Amazon Location Service uses <code>PricingPlanDataSource</code> to calculate billing for your tracker resource.
     * Your data won't be shared with the data provider, and will remain in your AWS account and Region unless you move
     * it.
     * </p>
     * </note>
     */
    private String pricingPlanDataSource;
    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     */
    private String trackerName;

    /**
     * <p>
     * Updates the description for the tracker resource.
     * </p>
     * 
     * @param description
     *        Updates the description for the tracker resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Updates the description for the tracker resource.
     * </p>
     * 
     * @return Updates the description for the tracker resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Updates the description for the tracker resource.
     * </p>
     * 
     * @param description
     *        Updates the description for the tracker resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrackerRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Updates the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked geofence collections, but not every
     * location update is stored. If your update frequency is more often than 30 seconds, only one update per 30 seconds
     * is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4 ft), location updates are ignored.
     * Location updates within this distance are neither evaluated against linked geofence collections, nor stored. This
     * helps control costs by reducing the number of geofence evaluations and device positions to retrieve.
     * Distance-based filtering can also reduce the jitter effect when displaying device trajectory on a map.
     * </p>
     * </li>
     * </ul>
     * 
     * @param positionFiltering
     *        Updates the position filtering for the tracker resource.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TimeBased</code> - Location updates are evaluated against linked geofence collections, but not every
     *        location update is stored. If your update frequency is more often than 30 seconds, only one update per 30
     *        seconds is stored for each unique device ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DistanceBased</code> - If the device has moved less than 30 m (98.4 ft), location updates are
     *        ignored. Location updates within this distance are neither evaluated against linked geofence collections,
     *        nor stored. This helps control costs by reducing the number of geofence evaluations and device positions
     *        to retrieve. Distance-based filtering can also reduce the jitter effect when displaying device trajectory
     *        on a map.
     *        </p>
     *        </li>
     * @see PositionFiltering
     */

    public void setPositionFiltering(String positionFiltering) {
        this.positionFiltering = positionFiltering;
    }

    /**
     * <p>
     * Updates the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked geofence collections, but not every
     * location update is stored. If your update frequency is more often than 30 seconds, only one update per 30 seconds
     * is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4 ft), location updates are ignored.
     * Location updates within this distance are neither evaluated against linked geofence collections, nor stored. This
     * helps control costs by reducing the number of geofence evaluations and device positions to retrieve.
     * Distance-based filtering can also reduce the jitter effect when displaying device trajectory on a map.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Updates the position filtering for the tracker resource.</p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TimeBased</code> - Location updates are evaluated against linked geofence collections, but not
     *         every location update is stored. If your update frequency is more often than 30 seconds, only one update
     *         per 30 seconds is stored for each unique device ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DistanceBased</code> - If the device has moved less than 30 m (98.4 ft), location updates are
     *         ignored. Location updates within this distance are neither evaluated against linked geofence collections,
     *         nor stored. This helps control costs by reducing the number of geofence evaluations and device positions
     *         to retrieve. Distance-based filtering can also reduce the jitter effect when displaying device trajectory
     *         on a map.
     *         </p>
     *         </li>
     * @see PositionFiltering
     */

    public String getPositionFiltering() {
        return this.positionFiltering;
    }

    /**
     * <p>
     * Updates the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked geofence collections, but not every
     * location update is stored. If your update frequency is more often than 30 seconds, only one update per 30 seconds
     * is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4 ft), location updates are ignored.
     * Location updates within this distance are neither evaluated against linked geofence collections, nor stored. This
     * helps control costs by reducing the number of geofence evaluations and device positions to retrieve.
     * Distance-based filtering can also reduce the jitter effect when displaying device trajectory on a map.
     * </p>
     * </li>
     * </ul>
     * 
     * @param positionFiltering
     *        Updates the position filtering for the tracker resource.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TimeBased</code> - Location updates are evaluated against linked geofence collections, but not every
     *        location update is stored. If your update frequency is more often than 30 seconds, only one update per 30
     *        seconds is stored for each unique device ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DistanceBased</code> - If the device has moved less than 30 m (98.4 ft), location updates are
     *        ignored. Location updates within this distance are neither evaluated against linked geofence collections,
     *        nor stored. This helps control costs by reducing the number of geofence evaluations and device positions
     *        to retrieve. Distance-based filtering can also reduce the jitter effect when displaying device trajectory
     *        on a map.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionFiltering
     */

    public UpdateTrackerRequest withPositionFiltering(String positionFiltering) {
        setPositionFiltering(positionFiltering);
        return this;
    }

    /**
     * <p>
     * Updates the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked geofence collections, but not every
     * location update is stored. If your update frequency is more often than 30 seconds, only one update per 30 seconds
     * is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4 ft), location updates are ignored.
     * Location updates within this distance are neither evaluated against linked geofence collections, nor stored. This
     * helps control costs by reducing the number of geofence evaluations and device positions to retrieve.
     * Distance-based filtering can also reduce the jitter effect when displaying device trajectory on a map.
     * </p>
     * </li>
     * </ul>
     * 
     * @param positionFiltering
     *        Updates the position filtering for the tracker resource.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TimeBased</code> - Location updates are evaluated against linked geofence collections, but not every
     *        location update is stored. If your update frequency is more often than 30 seconds, only one update per 30
     *        seconds is stored for each unique device ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DistanceBased</code> - If the device has moved less than 30 m (98.4 ft), location updates are
     *        ignored. Location updates within this distance are neither evaluated against linked geofence collections,
     *        nor stored. This helps control costs by reducing the number of geofence evaluations and device positions
     *        to retrieve. Distance-based filtering can also reduce the jitter effect when displaying device trajectory
     *        on a map.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionFiltering
     */

    public UpdateTrackerRequest withPositionFiltering(PositionFiltering positionFiltering) {
        this.positionFiltering = positionFiltering.toString();
        return this;
    }

    /**
     * <p>
     * Updates the pricing plan for the tracker resource.
     * </p>
     * <p>
     * For more information about each pricing plan option restrictions, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * </p>
     * 
     * @param pricingPlan
     *        Updates the pricing plan for the tracker resource.</p>
     *        <p>
     *        For more information about each pricing plan option restrictions, see <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * @see PricingPlan
     */

    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    /**
     * <p>
     * Updates the pricing plan for the tracker resource.
     * </p>
     * <p>
     * For more information about each pricing plan option restrictions, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * </p>
     * 
     * @return Updates the pricing plan for the tracker resource.</p>
     *         <p>
     *         For more information about each pricing plan option restrictions, see <a
     *         href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * @see PricingPlan
     */

    public String getPricingPlan() {
        return this.pricingPlan;
    }

    /**
     * <p>
     * Updates the pricing plan for the tracker resource.
     * </p>
     * <p>
     * For more information about each pricing plan option restrictions, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * </p>
     * 
     * @param pricingPlan
     *        Updates the pricing plan for the tracker resource.</p>
     *        <p>
     *        For more information about each pricing plan option restrictions, see <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public UpdateTrackerRequest withPricingPlan(String pricingPlan) {
        setPricingPlan(pricingPlan);
        return this;
    }

    /**
     * <p>
     * Updates the pricing plan for the tracker resource.
     * </p>
     * <p>
     * For more information about each pricing plan option restrictions, see <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * </p>
     * 
     * @param pricingPlan
     *        Updates the pricing plan for the tracker resource.</p>
     *        <p>
     *        For more information about each pricing plan option restrictions, see <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public UpdateTrackerRequest withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * <p>
     * Updates the data provider for the tracker resource.
     * </p>
     * <p>
     * A required value for the following pricing plans: <code>MobileAssetTracking</code>|
     * <code>MobileAssetManagement</code>
     * </p>
     * <p>
     * For more information about <a href="https://aws.amazon.com/location/data-providers/">data providers</a> and <a
     * href="https://aws.amazon.com/location/pricing/">pricing plans</a>, see the Amazon Location Service product page
     * </p>
     * <note>
     * <p>
     * This can only be updated when updating the <code>PricingPlan</code> in the same request.
     * </p>
     * <p>
     * Amazon Location Service uses <code>PricingPlanDataSource</code> to calculate billing for your tracker resource.
     * Your data won't be shared with the data provider, and will remain in your AWS account and Region unless you move
     * it.
     * </p>
     * </note>
     * 
     * @param pricingPlanDataSource
     *        Updates the data provider for the tracker resource. </p>
     *        <p>
     *        A required value for the following pricing plans: <code>MobileAssetTracking</code>|
     *        <code>MobileAssetManagement</code>
     *        </p>
     *        <p>
     *        For more information about <a href="https://aws.amazon.com/location/data-providers/">data providers</a>
     *        and <a href="https://aws.amazon.com/location/pricing/">pricing plans</a>, see the Amazon Location Service
     *        product page
     *        </p>
     *        <note>
     *        <p>
     *        This can only be updated when updating the <code>PricingPlan</code> in the same request.
     *        </p>
     *        <p>
     *        Amazon Location Service uses <code>PricingPlanDataSource</code> to calculate billing for your tracker
     *        resource. Your data won't be shared with the data provider, and will remain in your AWS account and Region
     *        unless you move it.
     *        </p>
     */

    public void setPricingPlanDataSource(String pricingPlanDataSource) {
        this.pricingPlanDataSource = pricingPlanDataSource;
    }

    /**
     * <p>
     * Updates the data provider for the tracker resource.
     * </p>
     * <p>
     * A required value for the following pricing plans: <code>MobileAssetTracking</code>|
     * <code>MobileAssetManagement</code>
     * </p>
     * <p>
     * For more information about <a href="https://aws.amazon.com/location/data-providers/">data providers</a> and <a
     * href="https://aws.amazon.com/location/pricing/">pricing plans</a>, see the Amazon Location Service product page
     * </p>
     * <note>
     * <p>
     * This can only be updated when updating the <code>PricingPlan</code> in the same request.
     * </p>
     * <p>
     * Amazon Location Service uses <code>PricingPlanDataSource</code> to calculate billing for your tracker resource.
     * Your data won't be shared with the data provider, and will remain in your AWS account and Region unless you move
     * it.
     * </p>
     * </note>
     * 
     * @return Updates the data provider for the tracker resource. </p>
     *         <p>
     *         A required value for the following pricing plans: <code>MobileAssetTracking</code>|
     *         <code>MobileAssetManagement</code>
     *         </p>
     *         <p>
     *         For more information about <a href="https://aws.amazon.com/location/data-providers/">data providers</a>
     *         and <a href="https://aws.amazon.com/location/pricing/">pricing plans</a>, see the Amazon Location Service
     *         product page
     *         </p>
     *         <note>
     *         <p>
     *         This can only be updated when updating the <code>PricingPlan</code> in the same request.
     *         </p>
     *         <p>
     *         Amazon Location Service uses <code>PricingPlanDataSource</code> to calculate billing for your tracker
     *         resource. Your data won't be shared with the data provider, and will remain in your AWS account and
     *         Region unless you move it.
     *         </p>
     */

    public String getPricingPlanDataSource() {
        return this.pricingPlanDataSource;
    }

    /**
     * <p>
     * Updates the data provider for the tracker resource.
     * </p>
     * <p>
     * A required value for the following pricing plans: <code>MobileAssetTracking</code>|
     * <code>MobileAssetManagement</code>
     * </p>
     * <p>
     * For more information about <a href="https://aws.amazon.com/location/data-providers/">data providers</a> and <a
     * href="https://aws.amazon.com/location/pricing/">pricing plans</a>, see the Amazon Location Service product page
     * </p>
     * <note>
     * <p>
     * This can only be updated when updating the <code>PricingPlan</code> in the same request.
     * </p>
     * <p>
     * Amazon Location Service uses <code>PricingPlanDataSource</code> to calculate billing for your tracker resource.
     * Your data won't be shared with the data provider, and will remain in your AWS account and Region unless you move
     * it.
     * </p>
     * </note>
     * 
     * @param pricingPlanDataSource
     *        Updates the data provider for the tracker resource. </p>
     *        <p>
     *        A required value for the following pricing plans: <code>MobileAssetTracking</code>|
     *        <code>MobileAssetManagement</code>
     *        </p>
     *        <p>
     *        For more information about <a href="https://aws.amazon.com/location/data-providers/">data providers</a>
     *        and <a href="https://aws.amazon.com/location/pricing/">pricing plans</a>, see the Amazon Location Service
     *        product page
     *        </p>
     *        <note>
     *        <p>
     *        This can only be updated when updating the <code>PricingPlan</code> in the same request.
     *        </p>
     *        <p>
     *        Amazon Location Service uses <code>PricingPlanDataSource</code> to calculate billing for your tracker
     *        resource. Your data won't be shared with the data provider, and will remain in your AWS account and Region
     *        unless you move it.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrackerRequest withPricingPlanDataSource(String pricingPlanDataSource) {
        setPricingPlanDataSource(pricingPlanDataSource);
        return this;
    }

    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * 
     * @param trackerName
     *        The name of the tracker resource to update.
     */

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * 
     * @return The name of the tracker resource to update.
     */

    public String getTrackerName() {
        return this.trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * 
     * @param trackerName
     *        The name of the tracker resource to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrackerRequest withTrackerName(String trackerName) {
        setTrackerName(trackerName);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPositionFiltering() != null)
            sb.append("PositionFiltering: ").append(getPositionFiltering()).append(",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: ").append(getPricingPlan()).append(",");
        if (getPricingPlanDataSource() != null)
            sb.append("PricingPlanDataSource: ").append(getPricingPlanDataSource()).append(",");
        if (getTrackerName() != null)
            sb.append("TrackerName: ").append(getTrackerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTrackerRequest == false)
            return false;
        UpdateTrackerRequest other = (UpdateTrackerRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPositionFiltering() == null ^ this.getPositionFiltering() == null)
            return false;
        if (other.getPositionFiltering() != null && other.getPositionFiltering().equals(this.getPositionFiltering()) == false)
            return false;
        if (other.getPricingPlan() == null ^ this.getPricingPlan() == null)
            return false;
        if (other.getPricingPlan() != null && other.getPricingPlan().equals(this.getPricingPlan()) == false)
            return false;
        if (other.getPricingPlanDataSource() == null ^ this.getPricingPlanDataSource() == null)
            return false;
        if (other.getPricingPlanDataSource() != null && other.getPricingPlanDataSource().equals(this.getPricingPlanDataSource()) == false)
            return false;
        if (other.getTrackerName() == null ^ this.getTrackerName() == null)
            return false;
        if (other.getTrackerName() != null && other.getTrackerName().equals(this.getTrackerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPositionFiltering() == null) ? 0 : getPositionFiltering().hashCode());
        hashCode = prime * hashCode + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime * hashCode + ((getPricingPlanDataSource() == null) ? 0 : getPricingPlanDataSource().hashCode());
        hashCode = prime * hashCode + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTrackerRequest clone() {
        return (UpdateTrackerRequest) super.clone();
    }

}

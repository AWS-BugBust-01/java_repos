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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/SearchAvailablePhoneNumbers" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchAvailablePhoneNumbersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The area code used to filter results. Only applies to the US.
     * </p>
     */
    private String areaCode;
    /**
     * <p>
     * The city used to filter results. Only applies to the US.
     * </p>
     */
    private String city;
    /**
     * <p>
     * The country used to filter results. Defaults to the US Format: ISO 3166-1 alpha-2.
     * </p>
     */
    private String country;
    /**
     * <p>
     * The state used to filter results. Required only if you provide <code>City</code>. Only applies to the US.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The toll-free prefix that you use to filter results. Only applies to the US.
     * </p>
     */
    private String tollFreePrefix;
    /**
     * <p>
     * The phone number type used to filter results. Required for non-US numbers.
     * </p>
     */
    private String phoneNumberType;
    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token used to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The area code used to filter results. Only applies to the US.
     * </p>
     * 
     * @param areaCode
     *        The area code used to filter results. Only applies to the US.
     */

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * <p>
     * The area code used to filter results. Only applies to the US.
     * </p>
     * 
     * @return The area code used to filter results. Only applies to the US.
     */

    public String getAreaCode() {
        return this.areaCode;
    }

    /**
     * <p>
     * The area code used to filter results. Only applies to the US.
     * </p>
     * 
     * @param areaCode
     *        The area code used to filter results. Only applies to the US.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAvailablePhoneNumbersRequest withAreaCode(String areaCode) {
        setAreaCode(areaCode);
        return this;
    }

    /**
     * <p>
     * The city used to filter results. Only applies to the US.
     * </p>
     * 
     * @param city
     *        The city used to filter results. Only applies to the US.
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The city used to filter results. Only applies to the US.
     * </p>
     * 
     * @return The city used to filter results. Only applies to the US.
     */

    public String getCity() {
        return this.city;
    }

    /**
     * <p>
     * The city used to filter results. Only applies to the US.
     * </p>
     * 
     * @param city
     *        The city used to filter results. Only applies to the US.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAvailablePhoneNumbersRequest withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * <p>
     * The country used to filter results. Defaults to the US Format: ISO 3166-1 alpha-2.
     * </p>
     * 
     * @param country
     *        The country used to filter results. Defaults to the US Format: ISO 3166-1 alpha-2.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The country used to filter results. Defaults to the US Format: ISO 3166-1 alpha-2.
     * </p>
     * 
     * @return The country used to filter results. Defaults to the US Format: ISO 3166-1 alpha-2.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * The country used to filter results. Defaults to the US Format: ISO 3166-1 alpha-2.
     * </p>
     * 
     * @param country
     *        The country used to filter results. Defaults to the US Format: ISO 3166-1 alpha-2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAvailablePhoneNumbersRequest withCountry(String country) {
        setCountry(country);
        return this;
    }

    /**
     * <p>
     * The state used to filter results. Required only if you provide <code>City</code>. Only applies to the US.
     * </p>
     * 
     * @param state
     *        The state used to filter results. Required only if you provide <code>City</code>. Only applies to the US.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state used to filter results. Required only if you provide <code>City</code>. Only applies to the US.
     * </p>
     * 
     * @return The state used to filter results. Required only if you provide <code>City</code>. Only applies to the US.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state used to filter results. Required only if you provide <code>City</code>. Only applies to the US.
     * </p>
     * 
     * @param state
     *        The state used to filter results. Required only if you provide <code>City</code>. Only applies to the US.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAvailablePhoneNumbersRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The toll-free prefix that you use to filter results. Only applies to the US.
     * </p>
     * 
     * @param tollFreePrefix
     *        The toll-free prefix that you use to filter results. Only applies to the US.
     */

    public void setTollFreePrefix(String tollFreePrefix) {
        this.tollFreePrefix = tollFreePrefix;
    }

    /**
     * <p>
     * The toll-free prefix that you use to filter results. Only applies to the US.
     * </p>
     * 
     * @return The toll-free prefix that you use to filter results. Only applies to the US.
     */

    public String getTollFreePrefix() {
        return this.tollFreePrefix;
    }

    /**
     * <p>
     * The toll-free prefix that you use to filter results. Only applies to the US.
     * </p>
     * 
     * @param tollFreePrefix
     *        The toll-free prefix that you use to filter results. Only applies to the US.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAvailablePhoneNumbersRequest withTollFreePrefix(String tollFreePrefix) {
        setTollFreePrefix(tollFreePrefix);
        return this;
    }

    /**
     * <p>
     * The phone number type used to filter results. Required for non-US numbers.
     * </p>
     * 
     * @param phoneNumberType
     *        The phone number type used to filter results. Required for non-US numbers.
     * @see PhoneNumberType
     */

    public void setPhoneNumberType(String phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }

    /**
     * <p>
     * The phone number type used to filter results. Required for non-US numbers.
     * </p>
     * 
     * @return The phone number type used to filter results. Required for non-US numbers.
     * @see PhoneNumberType
     */

    public String getPhoneNumberType() {
        return this.phoneNumberType;
    }

    /**
     * <p>
     * The phone number type used to filter results. Required for non-US numbers.
     * </p>
     * 
     * @param phoneNumberType
     *        The phone number type used to filter results. Required for non-US numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberType
     */

    public SearchAvailablePhoneNumbersRequest withPhoneNumberType(String phoneNumberType) {
        setPhoneNumberType(phoneNumberType);
        return this;
    }

    /**
     * <p>
     * The phone number type used to filter results. Required for non-US numbers.
     * </p>
     * 
     * @param phoneNumberType
     *        The phone number type used to filter results. Required for non-US numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberType
     */

    public SearchAvailablePhoneNumbersRequest withPhoneNumberType(PhoneNumberType phoneNumberType) {
        this.phoneNumberType = phoneNumberType.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * 
     * @return The maximum number of results to return in a single call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAvailablePhoneNumbersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token used to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token used to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to retrieve the next page of results.
     * </p>
     * 
     * @return The token used to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token used to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAvailablePhoneNumbersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getAreaCode() != null)
            sb.append("AreaCode: ").append(getAreaCode()).append(",");
        if (getCity() != null)
            sb.append("City: ").append(getCity()).append(",");
        if (getCountry() != null)
            sb.append("Country: ").append(getCountry()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTollFreePrefix() != null)
            sb.append("TollFreePrefix: ").append(getTollFreePrefix()).append(",");
        if (getPhoneNumberType() != null)
            sb.append("PhoneNumberType: ").append(getPhoneNumberType()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchAvailablePhoneNumbersRequest == false)
            return false;
        SearchAvailablePhoneNumbersRequest other = (SearchAvailablePhoneNumbersRequest) obj;
        if (other.getAreaCode() == null ^ this.getAreaCode() == null)
            return false;
        if (other.getAreaCode() != null && other.getAreaCode().equals(this.getAreaCode()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTollFreePrefix() == null ^ this.getTollFreePrefix() == null)
            return false;
        if (other.getTollFreePrefix() != null && other.getTollFreePrefix().equals(this.getTollFreePrefix()) == false)
            return false;
        if (other.getPhoneNumberType() == null ^ this.getPhoneNumberType() == null)
            return false;
        if (other.getPhoneNumberType() != null && other.getPhoneNumberType().equals(this.getPhoneNumberType()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAreaCode() == null) ? 0 : getAreaCode().hashCode());
        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTollFreePrefix() == null) ? 0 : getTollFreePrefix().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberType() == null) ? 0 : getPhoneNumberType().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchAvailablePhoneNumbersRequest clone() {
        return (SearchAvailablePhoneNumbersRequest) super.clone();
    }

}

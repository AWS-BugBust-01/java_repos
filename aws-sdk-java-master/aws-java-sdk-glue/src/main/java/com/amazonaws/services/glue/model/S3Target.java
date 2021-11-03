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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a data store in Amazon Simple Storage Service (Amazon S3).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/S3Target" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Target implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path to the Amazon S3 target.
     * </p>
     */
    private String path;
    /**
     * <p>
     * A list of glob patterns used to exclude from the crawl. For more information, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * </p>
     */
    private java.util.List<String> exclusions;
    /**
     * <p>
     * The name of a connection which allows a job or crawler to access data in Amazon S3 within an Amazon Virtual
     * Private Cloud environment (Amazon VPC).
     * </p>
     */
    private String connectionName;
    /**
     * <p>
     * Sets the number of files in each leaf folder to be crawled when crawling sample files in a dataset. If not set,
     * all the files are crawled. A valid value is an integer between 1 and 249.
     * </p>
     */
    private Integer sampleSize;
    /**
     * <p>
     * A valid Amazon SQS ARN. For example, <code>arn:aws:sqs:region:account:sqs</code>.
     * </p>
     */
    private String eventQueueArn;
    /**
     * <p>
     * A valid Amazon dead-letter SQS ARN. For example, <code>arn:aws:sqs:region:account:deadLetterQueue</code>.
     * </p>
     */
    private String dlqEventQueueArn;

    /**
     * <p>
     * The path to the Amazon S3 target.
     * </p>
     * 
     * @param path
     *        The path to the Amazon S3 target.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the Amazon S3 target.
     * </p>
     * 
     * @return The path to the Amazon S3 target.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the Amazon S3 target.
     * </p>
     * 
     * @param path
     *        The path to the Amazon S3 target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Target withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * A list of glob patterns used to exclude from the crawl. For more information, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * </p>
     * 
     * @return A list of glob patterns used to exclude from the crawl. For more information, see <a
     *         href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     */

    public java.util.List<String> getExclusions() {
        return exclusions;
    }

    /**
     * <p>
     * A list of glob patterns used to exclude from the crawl. For more information, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * </p>
     * 
     * @param exclusions
     *        A list of glob patterns used to exclude from the crawl. For more information, see <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     */

    public void setExclusions(java.util.Collection<String> exclusions) {
        if (exclusions == null) {
            this.exclusions = null;
            return;
        }

        this.exclusions = new java.util.ArrayList<String>(exclusions);
    }

    /**
     * <p>
     * A list of glob patterns used to exclude from the crawl. For more information, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusions(java.util.Collection)} or {@link #withExclusions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param exclusions
     *        A list of glob patterns used to exclude from the crawl. For more information, see <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Target withExclusions(String... exclusions) {
        if (this.exclusions == null) {
            setExclusions(new java.util.ArrayList<String>(exclusions.length));
        }
        for (String ele : exclusions) {
            this.exclusions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of glob patterns used to exclude from the crawl. For more information, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * </p>
     * 
     * @param exclusions
     *        A list of glob patterns used to exclude from the crawl. For more information, see <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html">Catalog Tables with a Crawler</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Target withExclusions(java.util.Collection<String> exclusions) {
        setExclusions(exclusions);
        return this;
    }

    /**
     * <p>
     * The name of a connection which allows a job or crawler to access data in Amazon S3 within an Amazon Virtual
     * Private Cloud environment (Amazon VPC).
     * </p>
     * 
     * @param connectionName
     *        The name of a connection which allows a job or crawler to access data in Amazon S3 within an Amazon
     *        Virtual Private Cloud environment (Amazon VPC).
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of a connection which allows a job or crawler to access data in Amazon S3 within an Amazon Virtual
     * Private Cloud environment (Amazon VPC).
     * </p>
     * 
     * @return The name of a connection which allows a job or crawler to access data in Amazon S3 within an Amazon
     *         Virtual Private Cloud environment (Amazon VPC).
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * The name of a connection which allows a job or crawler to access data in Amazon S3 within an Amazon Virtual
     * Private Cloud environment (Amazon VPC).
     * </p>
     * 
     * @param connectionName
     *        The name of a connection which allows a job or crawler to access data in Amazon S3 within an Amazon
     *        Virtual Private Cloud environment (Amazon VPC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Target withConnectionName(String connectionName) {
        setConnectionName(connectionName);
        return this;
    }

    /**
     * <p>
     * Sets the number of files in each leaf folder to be crawled when crawling sample files in a dataset. If not set,
     * all the files are crawled. A valid value is an integer between 1 and 249.
     * </p>
     * 
     * @param sampleSize
     *        Sets the number of files in each leaf folder to be crawled when crawling sample files in a dataset. If not
     *        set, all the files are crawled. A valid value is an integer between 1 and 249.
     */

    public void setSampleSize(Integer sampleSize) {
        this.sampleSize = sampleSize;
    }

    /**
     * <p>
     * Sets the number of files in each leaf folder to be crawled when crawling sample files in a dataset. If not set,
     * all the files are crawled. A valid value is an integer between 1 and 249.
     * </p>
     * 
     * @return Sets the number of files in each leaf folder to be crawled when crawling sample files in a dataset. If
     *         not set, all the files are crawled. A valid value is an integer between 1 and 249.
     */

    public Integer getSampleSize() {
        return this.sampleSize;
    }

    /**
     * <p>
     * Sets the number of files in each leaf folder to be crawled when crawling sample files in a dataset. If not set,
     * all the files are crawled. A valid value is an integer between 1 and 249.
     * </p>
     * 
     * @param sampleSize
     *        Sets the number of files in each leaf folder to be crawled when crawling sample files in a dataset. If not
     *        set, all the files are crawled. A valid value is an integer between 1 and 249.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Target withSampleSize(Integer sampleSize) {
        setSampleSize(sampleSize);
        return this;
    }

    /**
     * <p>
     * A valid Amazon SQS ARN. For example, <code>arn:aws:sqs:region:account:sqs</code>.
     * </p>
     * 
     * @param eventQueueArn
     *        A valid Amazon SQS ARN. For example, <code>arn:aws:sqs:region:account:sqs</code>.
     */

    public void setEventQueueArn(String eventQueueArn) {
        this.eventQueueArn = eventQueueArn;
    }

    /**
     * <p>
     * A valid Amazon SQS ARN. For example, <code>arn:aws:sqs:region:account:sqs</code>.
     * </p>
     * 
     * @return A valid Amazon SQS ARN. For example, <code>arn:aws:sqs:region:account:sqs</code>.
     */

    public String getEventQueueArn() {
        return this.eventQueueArn;
    }

    /**
     * <p>
     * A valid Amazon SQS ARN. For example, <code>arn:aws:sqs:region:account:sqs</code>.
     * </p>
     * 
     * @param eventQueueArn
     *        A valid Amazon SQS ARN. For example, <code>arn:aws:sqs:region:account:sqs</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Target withEventQueueArn(String eventQueueArn) {
        setEventQueueArn(eventQueueArn);
        return this;
    }

    /**
     * <p>
     * A valid Amazon dead-letter SQS ARN. For example, <code>arn:aws:sqs:region:account:deadLetterQueue</code>.
     * </p>
     * 
     * @param dlqEventQueueArn
     *        A valid Amazon dead-letter SQS ARN. For example, <code>arn:aws:sqs:region:account:deadLetterQueue</code>.
     */

    public void setDlqEventQueueArn(String dlqEventQueueArn) {
        this.dlqEventQueueArn = dlqEventQueueArn;
    }

    /**
     * <p>
     * A valid Amazon dead-letter SQS ARN. For example, <code>arn:aws:sqs:region:account:deadLetterQueue</code>.
     * </p>
     * 
     * @return A valid Amazon dead-letter SQS ARN. For example, <code>arn:aws:sqs:region:account:deadLetterQueue</code>.
     */

    public String getDlqEventQueueArn() {
        return this.dlqEventQueueArn;
    }

    /**
     * <p>
     * A valid Amazon dead-letter SQS ARN. For example, <code>arn:aws:sqs:region:account:deadLetterQueue</code>.
     * </p>
     * 
     * @param dlqEventQueueArn
     *        A valid Amazon dead-letter SQS ARN. For example, <code>arn:aws:sqs:region:account:deadLetterQueue</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Target withDlqEventQueueArn(String dlqEventQueueArn) {
        setDlqEventQueueArn(dlqEventQueueArn);
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getExclusions() != null)
            sb.append("Exclusions: ").append(getExclusions()).append(",");
        if (getConnectionName() != null)
            sb.append("ConnectionName: ").append(getConnectionName()).append(",");
        if (getSampleSize() != null)
            sb.append("SampleSize: ").append(getSampleSize()).append(",");
        if (getEventQueueArn() != null)
            sb.append("EventQueueArn: ").append(getEventQueueArn()).append(",");
        if (getDlqEventQueueArn() != null)
            sb.append("DlqEventQueueArn: ").append(getDlqEventQueueArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Target == false)
            return false;
        S3Target other = (S3Target) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getExclusions() == null ^ this.getExclusions() == null)
            return false;
        if (other.getExclusions() != null && other.getExclusions().equals(this.getExclusions()) == false)
            return false;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getSampleSize() == null ^ this.getSampleSize() == null)
            return false;
        if (other.getSampleSize() != null && other.getSampleSize().equals(this.getSampleSize()) == false)
            return false;
        if (other.getEventQueueArn() == null ^ this.getEventQueueArn() == null)
            return false;
        if (other.getEventQueueArn() != null && other.getEventQueueArn().equals(this.getEventQueueArn()) == false)
            return false;
        if (other.getDlqEventQueueArn() == null ^ this.getDlqEventQueueArn() == null)
            return false;
        if (other.getDlqEventQueueArn() != null && other.getDlqEventQueueArn().equals(this.getDlqEventQueueArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getExclusions() == null) ? 0 : getExclusions().hashCode());
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getSampleSize() == null) ? 0 : getSampleSize().hashCode());
        hashCode = prime * hashCode + ((getEventQueueArn() == null) ? 0 : getEventQueueArn().hashCode());
        hashCode = prime * hashCode + ((getDlqEventQueueArn() == null) ? 0 : getDlqEventQueueArn().hashCode());
        return hashCode;
    }

    @Override
    public S3Target clone() {
        try {
            return (S3Target) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.S3TargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

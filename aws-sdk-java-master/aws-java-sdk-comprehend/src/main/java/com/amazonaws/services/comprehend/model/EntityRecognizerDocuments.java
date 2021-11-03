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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the training documents submitted with an entity recognizer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/EntityRecognizerDocuments"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityRecognizerDocuments implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the Amazon S3 location where the training documents for an entity recognizer are located. The URI must
     * be in the same region as the API endpoint that you are calling.
     * </p>
     */
    private String s3Uri;
    /**
     * <p>
     * Specifies the Amazon S3 location where the test documents for an entity recognizer are located. The URI must be
     * in the same AWS Region as the API endpoint that you are calling.
     * </p>
     */
    private String testS3Uri;
    /**
     * <p>
     * Specifies how the text in an input file should be processed. This is optional, and the default is
     * ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each file is considered a separate document. Use this option when you are
     * processing large documents, such as newspaper articles or scientific papers. ONE_DOC_PER_LINE - Each line in a
     * file is considered a separate document. Use this option when you are processing many short documents, such as
     * text messages.
     * </p>
     */
    private String inputFormat;

    /**
     * <p>
     * Specifies the Amazon S3 location where the training documents for an entity recognizer are located. The URI must
     * be in the same region as the API endpoint that you are calling.
     * </p>
     * 
     * @param s3Uri
     *        Specifies the Amazon S3 location where the training documents for an entity recognizer are located. The
     *        URI must be in the same region as the API endpoint that you are calling.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * Specifies the Amazon S3 location where the training documents for an entity recognizer are located. The URI must
     * be in the same region as the API endpoint that you are calling.
     * </p>
     * 
     * @return Specifies the Amazon S3 location where the training documents for an entity recognizer are located. The
     *         URI must be in the same region as the API endpoint that you are calling.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * Specifies the Amazon S3 location where the training documents for an entity recognizer are located. The URI must
     * be in the same region as the API endpoint that you are calling.
     * </p>
     * 
     * @param s3Uri
     *        Specifies the Amazon S3 location where the training documents for an entity recognizer are located. The
     *        URI must be in the same region as the API endpoint that you are calling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerDocuments withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon S3 location where the test documents for an entity recognizer are located. The URI must be
     * in the same AWS Region as the API endpoint that you are calling.
     * </p>
     * 
     * @param testS3Uri
     *        Specifies the Amazon S3 location where the test documents for an entity recognizer are located. The URI
     *        must be in the same AWS Region as the API endpoint that you are calling.
     */

    public void setTestS3Uri(String testS3Uri) {
        this.testS3Uri = testS3Uri;
    }

    /**
     * <p>
     * Specifies the Amazon S3 location where the test documents for an entity recognizer are located. The URI must be
     * in the same AWS Region as the API endpoint that you are calling.
     * </p>
     * 
     * @return Specifies the Amazon S3 location where the test documents for an entity recognizer are located. The URI
     *         must be in the same AWS Region as the API endpoint that you are calling.
     */

    public String getTestS3Uri() {
        return this.testS3Uri;
    }

    /**
     * <p>
     * Specifies the Amazon S3 location where the test documents for an entity recognizer are located. The URI must be
     * in the same AWS Region as the API endpoint that you are calling.
     * </p>
     * 
     * @param testS3Uri
     *        Specifies the Amazon S3 location where the test documents for an entity recognizer are located. The URI
     *        must be in the same AWS Region as the API endpoint that you are calling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerDocuments withTestS3Uri(String testS3Uri) {
        setTestS3Uri(testS3Uri);
        return this;
    }

    /**
     * <p>
     * Specifies how the text in an input file should be processed. This is optional, and the default is
     * ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each file is considered a separate document. Use this option when you are
     * processing large documents, such as newspaper articles or scientific papers. ONE_DOC_PER_LINE - Each line in a
     * file is considered a separate document. Use this option when you are processing many short documents, such as
     * text messages.
     * </p>
     * 
     * @param inputFormat
     *        Specifies how the text in an input file should be processed. This is optional, and the default is
     *        ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each file is considered a separate document. Use this option when you
     *        are processing large documents, such as newspaper articles or scientific papers. ONE_DOC_PER_LINE - Each
     *        line in a file is considered a separate document. Use this option when you are processing many short
     *        documents, such as text messages.
     * @see InputFormat
     */

    public void setInputFormat(String inputFormat) {
        this.inputFormat = inputFormat;
    }

    /**
     * <p>
     * Specifies how the text in an input file should be processed. This is optional, and the default is
     * ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each file is considered a separate document. Use this option when you are
     * processing large documents, such as newspaper articles or scientific papers. ONE_DOC_PER_LINE - Each line in a
     * file is considered a separate document. Use this option when you are processing many short documents, such as
     * text messages.
     * </p>
     * 
     * @return Specifies how the text in an input file should be processed. This is optional, and the default is
     *         ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each file is considered a separate document. Use this option when
     *         you are processing large documents, such as newspaper articles or scientific papers. ONE_DOC_PER_LINE -
     *         Each line in a file is considered a separate document. Use this option when you are processing many short
     *         documents, such as text messages.
     * @see InputFormat
     */

    public String getInputFormat() {
        return this.inputFormat;
    }

    /**
     * <p>
     * Specifies how the text in an input file should be processed. This is optional, and the default is
     * ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each file is considered a separate document. Use this option when you are
     * processing large documents, such as newspaper articles or scientific papers. ONE_DOC_PER_LINE - Each line in a
     * file is considered a separate document. Use this option when you are processing many short documents, such as
     * text messages.
     * </p>
     * 
     * @param inputFormat
     *        Specifies how the text in an input file should be processed. This is optional, and the default is
     *        ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each file is considered a separate document. Use this option when you
     *        are processing large documents, such as newspaper articles or scientific papers. ONE_DOC_PER_LINE - Each
     *        line in a file is considered a separate document. Use this option when you are processing many short
     *        documents, such as text messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputFormat
     */

    public EntityRecognizerDocuments withInputFormat(String inputFormat) {
        setInputFormat(inputFormat);
        return this;
    }

    /**
     * <p>
     * Specifies how the text in an input file should be processed. This is optional, and the default is
     * ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each file is considered a separate document. Use this option when you are
     * processing large documents, such as newspaper articles or scientific papers. ONE_DOC_PER_LINE - Each line in a
     * file is considered a separate document. Use this option when you are processing many short documents, such as
     * text messages.
     * </p>
     * 
     * @param inputFormat
     *        Specifies how the text in an input file should be processed. This is optional, and the default is
     *        ONE_DOC_PER_LINE. ONE_DOC_PER_FILE - Each file is considered a separate document. Use this option when you
     *        are processing large documents, such as newspaper articles or scientific papers. ONE_DOC_PER_LINE - Each
     *        line in a file is considered a separate document. Use this option when you are processing many short
     *        documents, such as text messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputFormat
     */

    public EntityRecognizerDocuments withInputFormat(InputFormat inputFormat) {
        this.inputFormat = inputFormat.toString();
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
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri()).append(",");
        if (getTestS3Uri() != null)
            sb.append("TestS3Uri: ").append(getTestS3Uri()).append(",");
        if (getInputFormat() != null)
            sb.append("InputFormat: ").append(getInputFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognizerDocuments == false)
            return false;
        EntityRecognizerDocuments other = (EntityRecognizerDocuments) obj;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getTestS3Uri() == null ^ this.getTestS3Uri() == null)
            return false;
        if (other.getTestS3Uri() != null && other.getTestS3Uri().equals(this.getTestS3Uri()) == false)
            return false;
        if (other.getInputFormat() == null ^ this.getInputFormat() == null)
            return false;
        if (other.getInputFormat() != null && other.getInputFormat().equals(this.getInputFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getTestS3Uri() == null) ? 0 : getTestS3Uri().hashCode());
        hashCode = prime * hashCode + ((getInputFormat() == null) ? 0 : getInputFormat().hashCode());
        return hashCode;
    }

    @Override
    public EntityRecognizerDocuments clone() {
        try {
            return (EntityRecognizerDocuments) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.EntityRecognizerDocumentsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

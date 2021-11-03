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
 * The input properties for a topic detection job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DocumentReaderConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentReaderConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This enum field will start with two values which will apply to PDFs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The service calls DetectDocumentText for PDF documents per page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The service calls AnalyzeDocument for PDF documents per page.
     * </p>
     * </li>
     * </ul>
     */
    private String documentReadAction;
    /**
     * <p>
     * This enum field provides two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERVICE_DEFAULT</code> - use service defaults for Document reading. For Digital PDF it would mean using an
     * internal parser instead of Textract APIs
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DOCUMENT_READ_ACTION</code> - Always use specified action for DocumentReadAction, including Digital
     * PDF.
     * </p>
     * </li>
     * </ul>
     */
    private String documentReadMode;
    /**
     * <p>
     * Specifies how the text in an input file should be processed:
     * </p>
     */
    private java.util.List<String> featureTypes;

    /**
     * <p>
     * This enum field will start with two values which will apply to PDFs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The service calls DetectDocumentText for PDF documents per page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The service calls AnalyzeDocument for PDF documents per page.
     * </p>
     * </li>
     * </ul>
     * 
     * @param documentReadAction
     *        This enum field will start with two values which will apply to PDFs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The service calls DetectDocumentText for PDF documents per
     *        page.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The service calls AnalyzeDocument for PDF documents per page.
     *        </p>
     *        </li>
     * @see DocumentReadAction
     */

    public void setDocumentReadAction(String documentReadAction) {
        this.documentReadAction = documentReadAction;
    }

    /**
     * <p>
     * This enum field will start with two values which will apply to PDFs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The service calls DetectDocumentText for PDF documents per page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The service calls AnalyzeDocument for PDF documents per page.
     * </p>
     * </li>
     * </ul>
     * 
     * @return This enum field will start with two values which will apply to PDFs:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The service calls DetectDocumentText for PDF documents per
     *         page.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The service calls AnalyzeDocument for PDF documents per page.
     *         </p>
     *         </li>
     * @see DocumentReadAction
     */

    public String getDocumentReadAction() {
        return this.documentReadAction;
    }

    /**
     * <p>
     * This enum field will start with two values which will apply to PDFs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The service calls DetectDocumentText for PDF documents per page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The service calls AnalyzeDocument for PDF documents per page.
     * </p>
     * </li>
     * </ul>
     * 
     * @param documentReadAction
     *        This enum field will start with two values which will apply to PDFs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The service calls DetectDocumentText for PDF documents per
     *        page.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The service calls AnalyzeDocument for PDF documents per page.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentReadAction
     */

    public DocumentReaderConfig withDocumentReadAction(String documentReadAction) {
        setDocumentReadAction(documentReadAction);
        return this;
    }

    /**
     * <p>
     * This enum field will start with two values which will apply to PDFs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The service calls DetectDocumentText for PDF documents per page.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The service calls AnalyzeDocument for PDF documents per page.
     * </p>
     * </li>
     * </ul>
     * 
     * @param documentReadAction
     *        This enum field will start with two values which will apply to PDFs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The service calls DetectDocumentText for PDF documents per
     *        page.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The service calls AnalyzeDocument for PDF documents per page.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentReadAction
     */

    public DocumentReaderConfig withDocumentReadAction(DocumentReadAction documentReadAction) {
        this.documentReadAction = documentReadAction.toString();
        return this;
    }

    /**
     * <p>
     * This enum field provides two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERVICE_DEFAULT</code> - use service defaults for Document reading. For Digital PDF it would mean using an
     * internal parser instead of Textract APIs
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DOCUMENT_READ_ACTION</code> - Always use specified action for DocumentReadAction, including Digital
     * PDF.
     * </p>
     * </li>
     * </ul>
     * 
     * @param documentReadMode
     *        This enum field provides two values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SERVICE_DEFAULT</code> - use service defaults for Document reading. For Digital PDF it would mean
     *        using an internal parser instead of Textract APIs
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FORCE_DOCUMENT_READ_ACTION</code> - Always use specified action for DocumentReadAction, including
     *        Digital PDF.
     *        </p>
     *        </li>
     * @see DocumentReadMode
     */

    public void setDocumentReadMode(String documentReadMode) {
        this.documentReadMode = documentReadMode;
    }

    /**
     * <p>
     * This enum field provides two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERVICE_DEFAULT</code> - use service defaults for Document reading. For Digital PDF it would mean using an
     * internal parser instead of Textract APIs
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DOCUMENT_READ_ACTION</code> - Always use specified action for DocumentReadAction, including Digital
     * PDF.
     * </p>
     * </li>
     * </ul>
     * 
     * @return This enum field provides two values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SERVICE_DEFAULT</code> - use service defaults for Document reading. For Digital PDF it would mean
     *         using an internal parser instead of Textract APIs
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FORCE_DOCUMENT_READ_ACTION</code> - Always use specified action for DocumentReadAction, including
     *         Digital PDF.
     *         </p>
     *         </li>
     * @see DocumentReadMode
     */

    public String getDocumentReadMode() {
        return this.documentReadMode;
    }

    /**
     * <p>
     * This enum field provides two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERVICE_DEFAULT</code> - use service defaults for Document reading. For Digital PDF it would mean using an
     * internal parser instead of Textract APIs
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DOCUMENT_READ_ACTION</code> - Always use specified action for DocumentReadAction, including Digital
     * PDF.
     * </p>
     * </li>
     * </ul>
     * 
     * @param documentReadMode
     *        This enum field provides two values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SERVICE_DEFAULT</code> - use service defaults for Document reading. For Digital PDF it would mean
     *        using an internal parser instead of Textract APIs
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FORCE_DOCUMENT_READ_ACTION</code> - Always use specified action for DocumentReadAction, including
     *        Digital PDF.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentReadMode
     */

    public DocumentReaderConfig withDocumentReadMode(String documentReadMode) {
        setDocumentReadMode(documentReadMode);
        return this;
    }

    /**
     * <p>
     * This enum field provides two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERVICE_DEFAULT</code> - use service defaults for Document reading. For Digital PDF it would mean using an
     * internal parser instead of Textract APIs
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DOCUMENT_READ_ACTION</code> - Always use specified action for DocumentReadAction, including Digital
     * PDF.
     * </p>
     * </li>
     * </ul>
     * 
     * @param documentReadMode
     *        This enum field provides two values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SERVICE_DEFAULT</code> - use service defaults for Document reading. For Digital PDF it would mean
     *        using an internal parser instead of Textract APIs
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FORCE_DOCUMENT_READ_ACTION</code> - Always use specified action for DocumentReadAction, including
     *        Digital PDF.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentReadMode
     */

    public DocumentReaderConfig withDocumentReadMode(DocumentReadMode documentReadMode) {
        this.documentReadMode = documentReadMode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies how the text in an input file should be processed:
     * </p>
     * 
     * @return Specifies how the text in an input file should be processed:
     * @see DocumentReadFeatureTypes
     */

    public java.util.List<String> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * <p>
     * Specifies how the text in an input file should be processed:
     * </p>
     * 
     * @param featureTypes
     *        Specifies how the text in an input file should be processed:
     * @see DocumentReadFeatureTypes
     */

    public void setFeatureTypes(java.util.Collection<String> featureTypes) {
        if (featureTypes == null) {
            this.featureTypes = null;
            return;
        }

        this.featureTypes = new java.util.ArrayList<String>(featureTypes);
    }

    /**
     * <p>
     * Specifies how the text in an input file should be processed:
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatureTypes(java.util.Collection)} or {@link #withFeatureTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param featureTypes
     *        Specifies how the text in an input file should be processed:
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentReadFeatureTypes
     */

    public DocumentReaderConfig withFeatureTypes(String... featureTypes) {
        if (this.featureTypes == null) {
            setFeatureTypes(new java.util.ArrayList<String>(featureTypes.length));
        }
        for (String ele : featureTypes) {
            this.featureTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies how the text in an input file should be processed:
     * </p>
     * 
     * @param featureTypes
     *        Specifies how the text in an input file should be processed:
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentReadFeatureTypes
     */

    public DocumentReaderConfig withFeatureTypes(java.util.Collection<String> featureTypes) {
        setFeatureTypes(featureTypes);
        return this;
    }

    /**
     * <p>
     * Specifies how the text in an input file should be processed:
     * </p>
     * 
     * @param featureTypes
     *        Specifies how the text in an input file should be processed:
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentReadFeatureTypes
     */

    public DocumentReaderConfig withFeatureTypes(DocumentReadFeatureTypes... featureTypes) {
        java.util.ArrayList<String> featureTypesCopy = new java.util.ArrayList<String>(featureTypes.length);
        for (DocumentReadFeatureTypes value : featureTypes) {
            featureTypesCopy.add(value.toString());
        }
        if (getFeatureTypes() == null) {
            setFeatureTypes(featureTypesCopy);
        } else {
            getFeatureTypes().addAll(featureTypesCopy);
        }
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
        if (getDocumentReadAction() != null)
            sb.append("DocumentReadAction: ").append(getDocumentReadAction()).append(",");
        if (getDocumentReadMode() != null)
            sb.append("DocumentReadMode: ").append(getDocumentReadMode()).append(",");
        if (getFeatureTypes() != null)
            sb.append("FeatureTypes: ").append(getFeatureTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentReaderConfig == false)
            return false;
        DocumentReaderConfig other = (DocumentReaderConfig) obj;
        if (other.getDocumentReadAction() == null ^ this.getDocumentReadAction() == null)
            return false;
        if (other.getDocumentReadAction() != null && other.getDocumentReadAction().equals(this.getDocumentReadAction()) == false)
            return false;
        if (other.getDocumentReadMode() == null ^ this.getDocumentReadMode() == null)
            return false;
        if (other.getDocumentReadMode() != null && other.getDocumentReadMode().equals(this.getDocumentReadMode()) == false)
            return false;
        if (other.getFeatureTypes() == null ^ this.getFeatureTypes() == null)
            return false;
        if (other.getFeatureTypes() != null && other.getFeatureTypes().equals(this.getFeatureTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentReadAction() == null) ? 0 : getDocumentReadAction().hashCode());
        hashCode = prime * hashCode + ((getDocumentReadMode() == null) ? 0 : getDocumentReadMode().hashCode());
        hashCode = prime * hashCode + ((getFeatureTypes() == null) ? 0 : getFeatureTypes().hashCode());
        return hashCode;
    }

    @Override
    public DocumentReaderConfig clone() {
        try {
            return (DocumentReaderConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.DocumentReaderConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

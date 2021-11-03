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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The JupyterServer app settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/JupyterServerAppSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JupyterServerAppSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     * JupyterServer app.
     * </p>
     */
    private ResourceSpec defaultResourceSpec;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the JupyterServerApp.
     * </p>
     */
    private java.util.List<String> lifecycleConfigArns;

    /**
     * <p>
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     * JupyterServer app.
     * </p>
     * 
     * @param defaultResourceSpec
     *        The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     *        JupyterServer app.
     */

    public void setDefaultResourceSpec(ResourceSpec defaultResourceSpec) {
        this.defaultResourceSpec = defaultResourceSpec;
    }

    /**
     * <p>
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     * JupyterServer app.
     * </p>
     * 
     * @return The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     *         JupyterServer app.
     */

    public ResourceSpec getDefaultResourceSpec() {
        return this.defaultResourceSpec;
    }

    /**
     * <p>
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     * JupyterServer app.
     * </p>
     * 
     * @param defaultResourceSpec
     *        The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     *        JupyterServer app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JupyterServerAppSettings withDefaultResourceSpec(ResourceSpec defaultResourceSpec) {
        setDefaultResourceSpec(defaultResourceSpec);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the JupyterServerApp.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the JupyterServerApp.
     */

    public java.util.List<String> getLifecycleConfigArns() {
        return lifecycleConfigArns;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the JupyterServerApp.
     * </p>
     * 
     * @param lifecycleConfigArns
     *        The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the JupyterServerApp.
     */

    public void setLifecycleConfigArns(java.util.Collection<String> lifecycleConfigArns) {
        if (lifecycleConfigArns == null) {
            this.lifecycleConfigArns = null;
            return;
        }

        this.lifecycleConfigArns = new java.util.ArrayList<String>(lifecycleConfigArns);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the JupyterServerApp.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLifecycleConfigArns(java.util.Collection)} or {@link #withLifecycleConfigArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param lifecycleConfigArns
     *        The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the JupyterServerApp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JupyterServerAppSettings withLifecycleConfigArns(String... lifecycleConfigArns) {
        if (this.lifecycleConfigArns == null) {
            setLifecycleConfigArns(new java.util.ArrayList<String>(lifecycleConfigArns.length));
        }
        for (String ele : lifecycleConfigArns) {
            this.lifecycleConfigArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the JupyterServerApp.
     * </p>
     * 
     * @param lifecycleConfigArns
     *        The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the JupyterServerApp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JupyterServerAppSettings withLifecycleConfigArns(java.util.Collection<String> lifecycleConfigArns) {
        setLifecycleConfigArns(lifecycleConfigArns);
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
        if (getDefaultResourceSpec() != null)
            sb.append("DefaultResourceSpec: ").append(getDefaultResourceSpec()).append(",");
        if (getLifecycleConfigArns() != null)
            sb.append("LifecycleConfigArns: ").append(getLifecycleConfigArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JupyterServerAppSettings == false)
            return false;
        JupyterServerAppSettings other = (JupyterServerAppSettings) obj;
        if (other.getDefaultResourceSpec() == null ^ this.getDefaultResourceSpec() == null)
            return false;
        if (other.getDefaultResourceSpec() != null && other.getDefaultResourceSpec().equals(this.getDefaultResourceSpec()) == false)
            return false;
        if (other.getLifecycleConfigArns() == null ^ this.getLifecycleConfigArns() == null)
            return false;
        if (other.getLifecycleConfigArns() != null && other.getLifecycleConfigArns().equals(this.getLifecycleConfigArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultResourceSpec() == null) ? 0 : getDefaultResourceSpec().hashCode());
        hashCode = prime * hashCode + ((getLifecycleConfigArns() == null) ? 0 : getLifecycleConfigArns().hashCode());
        return hashCode;
    }

    @Override
    public JupyterServerAppSettings clone() {
        try {
            return (JupyterServerAppSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.JupyterServerAppSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

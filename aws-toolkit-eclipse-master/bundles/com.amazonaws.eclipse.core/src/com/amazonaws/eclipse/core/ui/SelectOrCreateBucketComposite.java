/*
 * Copyright 2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.eclipse.core.ui;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import com.amazonaws.eclipse.core.model.AbstractAwsResourceScopeParam.AwsResourceScopeParamBase;
import com.amazonaws.eclipse.core.model.SelectOrCreateBucketDataModel;
import com.amazonaws.eclipse.core.ui.dialogs.AbstractInputDialog;
import com.amazonaws.eclipse.core.ui.dialogs.CreateS3BucketDialog;
import com.amazonaws.services.s3.model.Bucket;

/**
 * A basic composite that includes a combo box and a button which could be used to select
 * a bucket from the combo box, or create a new one by the button.
 */
public class SelectOrCreateBucketComposite extends SelectOrCreateComposite<Bucket, SelectOrCreateBucketDataModel, AwsResourceScopeParamBase> {

    public SelectOrCreateBucketComposite(
            Composite parent,
            DataBindingContext bindingContext,
            SelectOrCreateBucketDataModel dataModel) {
        super(parent, bindingContext, dataModel, "S3 Bucket:");
    }

    @Override
    protected AbstractInputDialog<Bucket> createResourceDialog(AwsResourceScopeParamBase param) {
        return new CreateS3BucketDialog(Display.getCurrent().getActiveShell(), param);
    }
}
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

/**
 * <p>
 * Welcome to the Amazon Route 53 Application Recovery Controller API Reference Guide for Recovery Control Data Plane .
 * </p>
 * <p>
 * Recovery control in Route 53 Application Recovery Controller includes extremely reliable routing controls that enable
 * you to recover applications by rerouting traffic, for example, across Availability Zones or AWS Regions. Routing
 * controls are simple on/off switches hosted on a cluster. A cluster is a set of five redundant regional endpoints
 * against which you can execute API calls to update or get the state of routing controls. You use routing controls to
 * failover traffic to recover your application across Availability Zones or Regions.
 * </p>
 * <p>
 * This API guide includes information about how to get and update routing control states in Route 53 Application
 * Recovery Controller.
 * </p>
 * <p>
 * For more information about Route 53 Application Recovery Controller, see the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You can create clusters, routing controls, and control panels by using the control plane API for Recovery Control.
 * For more information, see <a href="https://docs.aws.amazon.com/recovery-cluster/latest/api/">Amazon Route 53
 * Application Recovery Controller Recovery Control API Reference</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Route 53 Application Recovery Controller also provides continuous readiness checks to ensure that your applications
 * are scaled to handle failover traffic. For more information about the related API actions, see <a
 * href="https://docs.aws.amazon.com/recovery-readiness/latest/api/">Amazon Route 53 Application Recovery Controller
 * Recovery Readiness API Reference</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For more information about creating resilient applications and preparing for recovery readiness with Route 53
 * Application Recovery Controller, see the <a href="r53recovery/latest/dg/">Amazon Route 53 Application Recovery
 * Controller Developer Guide</a>.
 * </p>
 * </li>
 * </ul>
 */
package com.amazonaws.services.route53recoverycluster;


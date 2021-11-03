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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Additional details about a resource related to a finding.
 * </p>
 * <p>
 * To provide the details, use the object that corresponds to the resource type. For example, if the resource type is
 * <code>AwsEc2Instance</code>, then you use the <code>AwsEc2Instance</code> object to provide the details.
 * </p>
 * <p>
 * If the type-specific object does not contain all of the fields you want to populate, then you use the
 * <code>Other</code> object to populate those additional fields.
 * </p>
 * <p>
 * You also use the <code>Other</code> object to populate the details when the selected type does not have a
 * corresponding object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ResourceDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details for an autoscaling group.
     * </p>
     */
    private AwsAutoScalingAutoScalingGroupDetails awsAutoScalingAutoScalingGroup;
    /**
     * <p>
     * Details for an CodeBuild project.
     * </p>
     */
    private AwsCodeBuildProjectDetails awsCodeBuildProject;
    /**
     * <p>
     * Details about a CloudFront distribution.
     * </p>
     */
    private AwsCloudFrontDistributionDetails awsCloudFrontDistribution;
    /**
     * <p>
     * Details about an EC2 instance related to a finding.
     * </p>
     */
    private AwsEc2InstanceDetails awsEc2Instance;
    /**
     * <p>
     * Details for an EC2 network interface.
     * </p>
     */
    private AwsEc2NetworkInterfaceDetails awsEc2NetworkInterface;
    /**
     * <p>
     * Details for an EC2 security group.
     * </p>
     */
    private AwsEc2SecurityGroupDetails awsEc2SecurityGroup;
    /**
     * <p>
     * Details for an EC2 volume.
     * </p>
     */
    private AwsEc2VolumeDetails awsEc2Volume;
    /**
     * <p>
     * Details for an EC2 VPC.
     * </p>
     */
    private AwsEc2VpcDetails awsEc2Vpc;
    /**
     * <p>
     * Details about an Elastic IP address.
     * </p>
     */
    private AwsEc2EipDetails awsEc2Eip;
    /**
     * <p>
     * Details about a subnet in Amazon EC2.
     * </p>
     */
    private AwsEc2SubnetDetails awsEc2Subnet;
    /**
     * <p>
     * Details about an EC2 network access control list (ACL).
     * </p>
     */
    private AwsEc2NetworkAclDetails awsEc2NetworkAcl;
    /**
     * <p>
     * Details about a load balancer.
     * </p>
     */
    private AwsElbv2LoadBalancerDetails awsElbv2LoadBalancer;
    /**
     * <p>
     * Details about an Elastic Beanstalk environment.
     * </p>
     */
    private AwsElasticBeanstalkEnvironmentDetails awsElasticBeanstalkEnvironment;
    /**
     * <p>
     * Details for an Elasticsearch domain.
     * </p>
     */
    private AwsElasticsearchDomainDetails awsElasticsearchDomain;
    /**
     * <p>
     * Details about an S3 bucket related to a finding.
     * </p>
     */
    private AwsS3BucketDetails awsS3Bucket;
    /**
     * <p>
     * Details about the Amazon S3 Public Access Block configuration for an account.
     * </p>
     */
    private AwsS3AccountPublicAccessBlockDetails awsS3AccountPublicAccessBlock;
    /**
     * <p>
     * Details about an S3 object related to a finding.
     * </p>
     */
    private AwsS3ObjectDetails awsS3Object;
    /**
     * <p>
     * Details about a Secrets Manager secret.
     * </p>
     */
    private AwsSecretsManagerSecretDetails awsSecretsManagerSecret;
    /**
     * <p>
     * Details about an IAM access key related to a finding.
     * </p>
     */
    private AwsIamAccessKeyDetails awsIamAccessKey;
    /**
     * <p>
     * Details about an IAM user.
     * </p>
     */
    private AwsIamUserDetails awsIamUser;
    /**
     * <p>
     * Details about an IAM permissions policy.
     * </p>
     */
    private AwsIamPolicyDetails awsIamPolicy;
    /**
     * <p>
     * Provides information about a version 2 stage for Amazon API Gateway.
     * </p>
     */
    private AwsApiGatewayV2StageDetails awsApiGatewayV2Stage;
    /**
     * <p>
     * Provides information about a version 2 API in Amazon API Gateway.
     * </p>
     */
    private AwsApiGatewayV2ApiDetails awsApiGatewayV2Api;
    /**
     * <p>
     * Details about a DynamoDB table.
     * </p>
     */
    private AwsDynamoDbTableDetails awsDynamoDbTable;
    /**
     * <p>
     * Provides information about a version 1 Amazon API Gateway stage.
     * </p>
     */
    private AwsApiGatewayStageDetails awsApiGatewayStage;
    /**
     * <p>
     * Provides information about a REST API in version 1 of Amazon API Gateway.
     * </p>
     */
    private AwsApiGatewayRestApiDetails awsApiGatewayRestApi;
    /**
     * <p>
     * Provides details about a CloudTrail trail.
     * </p>
     */
    private AwsCloudTrailTrailDetails awsCloudTrailTrail;
    /**
     * <p>
     * Provides information about the state of a patch on an instance based on the patch baseline that was used to patch
     * the instance.
     * </p>
     */
    private AwsSsmPatchComplianceDetails awsSsmPatchCompliance;
    /**
     * <p>
     * Provides details about an Certificate Manager certificate.
     * </p>
     */
    private AwsCertificateManagerCertificateDetails awsCertificateManagerCertificate;
    /**
     * <p>
     * Contains details about an Amazon Redshift cluster.
     * </p>
     */
    private AwsRedshiftClusterDetails awsRedshiftCluster;
    /**
     * <p>
     * Contains details about a Classic Load Balancer.
     * </p>
     */
    private AwsElbLoadBalancerDetails awsElbLoadBalancer;
    /**
     * <p>
     * Contains details about an IAM group.
     * </p>
     */
    private AwsIamGroupDetails awsIamGroup;
    /**
     * <p>
     * Details about an IAM role.
     * </p>
     */
    private AwsIamRoleDetails awsIamRole;
    /**
     * <p>
     * Details about an KMS key.
     * </p>
     */
    private AwsKmsKeyDetails awsKmsKey;
    /**
     * <p>
     * Details about a Lambda function.
     * </p>
     */
    private AwsLambdaFunctionDetails awsLambdaFunction;
    /**
     * <p>
     * Details for a Lambda layer version.
     * </p>
     */
    private AwsLambdaLayerVersionDetails awsLambdaLayerVersion;
    /**
     * <p>
     * Details about an Amazon RDS database instance.
     * </p>
     */
    private AwsRdsDbInstanceDetails awsRdsDbInstance;
    /**
     * <p>
     * Details about an SNS topic.
     * </p>
     */
    private AwsSnsTopicDetails awsSnsTopic;
    /**
     * <p>
     * Details about an SQS queue.
     * </p>
     */
    private AwsSqsQueueDetails awsSqsQueue;
    /**
     * <p>
     * Details for an WAF WebACL.
     * </p>
     */
    private AwsWafWebAclDetails awsWafWebAcl;
    /**
     * <p>
     * Details about an Amazon RDS database snapshot.
     * </p>
     */
    private AwsRdsDbSnapshotDetails awsRdsDbSnapshot;
    /**
     * <p>
     * Details about an Amazon RDS database cluster snapshot.
     * </p>
     */
    private AwsRdsDbClusterSnapshotDetails awsRdsDbClusterSnapshot;
    /**
     * <p>
     * Details about an Amazon RDS database cluster.
     * </p>
     */
    private AwsRdsDbClusterDetails awsRdsDbCluster;
    /**
     * <p>
     * Details about an ECS cluster.
     * </p>
     */
    private AwsEcsClusterDetails awsEcsCluster;
    /**
     * <p>
     * Details about a task definition. A task definition describes the container and volume definitions of an Amazon
     * Elastic Container Service task.
     * </p>
     */
    private AwsEcsTaskDefinitionDetails awsEcsTaskDefinition;
    /**
     * <p>
     * Details about a container resource related to a finding.
     * </p>
     */
    private ContainerDetails container;
    /**
     * <p>
     * Details about a resource that are not available in a type-specific details object. Use the <code>Other</code>
     * object in the following cases.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type-specific object does not contain all of the fields that you want to populate. In this case, first use
     * the type-specific object to populate those fields. Use the <code>Other</code> object to populate the fields that
     * are missing from the type-specific object.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type does not have a corresponding object. This includes resources for which the type is
     * <code>Other</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> other;
    /**
     * <p>
     * Details about an RDS event notification subscription.
     * </p>
     */
    private AwsRdsEventSubscriptionDetails awsRdsEventSubscription;
    /**
     * <p>
     * Details about a service within an ECS cluster.
     * </p>
     */
    private AwsEcsServiceDetails awsEcsService;
    /**
     * <p>
     * Provides details about a launch configuration.
     * </p>
     */
    private AwsAutoScalingLaunchConfigurationDetails awsAutoScalingLaunchConfiguration;
    /**
     * <p>
     * Details about an EC2 VPN connection.
     * </p>
     */
    private AwsEc2VpnConnectionDetails awsEc2VpnConnection;
    /**
     * <p>
     * Information about an Amazon ECR image.
     * </p>
     */
    private AwsEcrContainerImageDetails awsEcrContainerImage;
    /**
     * <p>
     * Details about an Amazon OpenSearch Service domain.
     * </p>
     */
    private AwsOpenSearchServiceDomainDetails awsOpenSearchServiceDomain;
    /**
     * <p>
     * Details about the service configuration for a VPC endpoint service.
     * </p>
     */
    private AwsEc2VpcEndpointServiceDetails awsEc2VpcEndpointService;
    /**
     * <p>
     * Information about the encryption configuration for X-Ray.
     * </p>
     */
    private AwsXrayEncryptionConfigDetails awsXrayEncryptionConfig;
    /**
     * <p>
     * Details about a rate-based rule for global resources.
     * </p>
     */
    private AwsWafRateBasedRuleDetails awsWafRateBasedRule;
    /**
     * <p>
     * Details about a rate-based rule for Regional resources.
     * </p>
     */
    private AwsWafRegionalRateBasedRuleDetails awsWafRegionalRateBasedRule;
    /**
     * <p>
     * Information about an Amazon Elastic Container Registry repository.
     * </p>
     */
    private AwsEcrRepositoryDetails awsEcrRepository;
    /**
     * <p>
     * Details about an Amazon EKS cluster.
     * </p>
     */
    private AwsEksClusterDetails awsEksCluster;

    /**
     * <p>
     * Details for an autoscaling group.
     * </p>
     * 
     * @param awsAutoScalingAutoScalingGroup
     *        Details for an autoscaling group.
     */

    public void setAwsAutoScalingAutoScalingGroup(AwsAutoScalingAutoScalingGroupDetails awsAutoScalingAutoScalingGroup) {
        this.awsAutoScalingAutoScalingGroup = awsAutoScalingAutoScalingGroup;
    }

    /**
     * <p>
     * Details for an autoscaling group.
     * </p>
     * 
     * @return Details for an autoscaling group.
     */

    public AwsAutoScalingAutoScalingGroupDetails getAwsAutoScalingAutoScalingGroup() {
        return this.awsAutoScalingAutoScalingGroup;
    }

    /**
     * <p>
     * Details for an autoscaling group.
     * </p>
     * 
     * @param awsAutoScalingAutoScalingGroup
     *        Details for an autoscaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsAutoScalingAutoScalingGroup(AwsAutoScalingAutoScalingGroupDetails awsAutoScalingAutoScalingGroup) {
        setAwsAutoScalingAutoScalingGroup(awsAutoScalingAutoScalingGroup);
        return this;
    }

    /**
     * <p>
     * Details for an CodeBuild project.
     * </p>
     * 
     * @param awsCodeBuildProject
     *        Details for an CodeBuild project.
     */

    public void setAwsCodeBuildProject(AwsCodeBuildProjectDetails awsCodeBuildProject) {
        this.awsCodeBuildProject = awsCodeBuildProject;
    }

    /**
     * <p>
     * Details for an CodeBuild project.
     * </p>
     * 
     * @return Details for an CodeBuild project.
     */

    public AwsCodeBuildProjectDetails getAwsCodeBuildProject() {
        return this.awsCodeBuildProject;
    }

    /**
     * <p>
     * Details for an CodeBuild project.
     * </p>
     * 
     * @param awsCodeBuildProject
     *        Details for an CodeBuild project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsCodeBuildProject(AwsCodeBuildProjectDetails awsCodeBuildProject) {
        setAwsCodeBuildProject(awsCodeBuildProject);
        return this;
    }

    /**
     * <p>
     * Details about a CloudFront distribution.
     * </p>
     * 
     * @param awsCloudFrontDistribution
     *        Details about a CloudFront distribution.
     */

    public void setAwsCloudFrontDistribution(AwsCloudFrontDistributionDetails awsCloudFrontDistribution) {
        this.awsCloudFrontDistribution = awsCloudFrontDistribution;
    }

    /**
     * <p>
     * Details about a CloudFront distribution.
     * </p>
     * 
     * @return Details about a CloudFront distribution.
     */

    public AwsCloudFrontDistributionDetails getAwsCloudFrontDistribution() {
        return this.awsCloudFrontDistribution;
    }

    /**
     * <p>
     * Details about a CloudFront distribution.
     * </p>
     * 
     * @param awsCloudFrontDistribution
     *        Details about a CloudFront distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsCloudFrontDistribution(AwsCloudFrontDistributionDetails awsCloudFrontDistribution) {
        setAwsCloudFrontDistribution(awsCloudFrontDistribution);
        return this;
    }

    /**
     * <p>
     * Details about an EC2 instance related to a finding.
     * </p>
     * 
     * @param awsEc2Instance
     *        Details about an EC2 instance related to a finding.
     */

    public void setAwsEc2Instance(AwsEc2InstanceDetails awsEc2Instance) {
        this.awsEc2Instance = awsEc2Instance;
    }

    /**
     * <p>
     * Details about an EC2 instance related to a finding.
     * </p>
     * 
     * @return Details about an EC2 instance related to a finding.
     */

    public AwsEc2InstanceDetails getAwsEc2Instance() {
        return this.awsEc2Instance;
    }

    /**
     * <p>
     * Details about an EC2 instance related to a finding.
     * </p>
     * 
     * @param awsEc2Instance
     *        Details about an EC2 instance related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEc2Instance(AwsEc2InstanceDetails awsEc2Instance) {
        setAwsEc2Instance(awsEc2Instance);
        return this;
    }

    /**
     * <p>
     * Details for an EC2 network interface.
     * </p>
     * 
     * @param awsEc2NetworkInterface
     *        Details for an EC2 network interface.
     */

    public void setAwsEc2NetworkInterface(AwsEc2NetworkInterfaceDetails awsEc2NetworkInterface) {
        this.awsEc2NetworkInterface = awsEc2NetworkInterface;
    }

    /**
     * <p>
     * Details for an EC2 network interface.
     * </p>
     * 
     * @return Details for an EC2 network interface.
     */

    public AwsEc2NetworkInterfaceDetails getAwsEc2NetworkInterface() {
        return this.awsEc2NetworkInterface;
    }

    /**
     * <p>
     * Details for an EC2 network interface.
     * </p>
     * 
     * @param awsEc2NetworkInterface
     *        Details for an EC2 network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEc2NetworkInterface(AwsEc2NetworkInterfaceDetails awsEc2NetworkInterface) {
        setAwsEc2NetworkInterface(awsEc2NetworkInterface);
        return this;
    }

    /**
     * <p>
     * Details for an EC2 security group.
     * </p>
     * 
     * @param awsEc2SecurityGroup
     *        Details for an EC2 security group.
     */

    public void setAwsEc2SecurityGroup(AwsEc2SecurityGroupDetails awsEc2SecurityGroup) {
        this.awsEc2SecurityGroup = awsEc2SecurityGroup;
    }

    /**
     * <p>
     * Details for an EC2 security group.
     * </p>
     * 
     * @return Details for an EC2 security group.
     */

    public AwsEc2SecurityGroupDetails getAwsEc2SecurityGroup() {
        return this.awsEc2SecurityGroup;
    }

    /**
     * <p>
     * Details for an EC2 security group.
     * </p>
     * 
     * @param awsEc2SecurityGroup
     *        Details for an EC2 security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEc2SecurityGroup(AwsEc2SecurityGroupDetails awsEc2SecurityGroup) {
        setAwsEc2SecurityGroup(awsEc2SecurityGroup);
        return this;
    }

    /**
     * <p>
     * Details for an EC2 volume.
     * </p>
     * 
     * @param awsEc2Volume
     *        Details for an EC2 volume.
     */

    public void setAwsEc2Volume(AwsEc2VolumeDetails awsEc2Volume) {
        this.awsEc2Volume = awsEc2Volume;
    }

    /**
     * <p>
     * Details for an EC2 volume.
     * </p>
     * 
     * @return Details for an EC2 volume.
     */

    public AwsEc2VolumeDetails getAwsEc2Volume() {
        return this.awsEc2Volume;
    }

    /**
     * <p>
     * Details for an EC2 volume.
     * </p>
     * 
     * @param awsEc2Volume
     *        Details for an EC2 volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEc2Volume(AwsEc2VolumeDetails awsEc2Volume) {
        setAwsEc2Volume(awsEc2Volume);
        return this;
    }

    /**
     * <p>
     * Details for an EC2 VPC.
     * </p>
     * 
     * @param awsEc2Vpc
     *        Details for an EC2 VPC.
     */

    public void setAwsEc2Vpc(AwsEc2VpcDetails awsEc2Vpc) {
        this.awsEc2Vpc = awsEc2Vpc;
    }

    /**
     * <p>
     * Details for an EC2 VPC.
     * </p>
     * 
     * @return Details for an EC2 VPC.
     */

    public AwsEc2VpcDetails getAwsEc2Vpc() {
        return this.awsEc2Vpc;
    }

    /**
     * <p>
     * Details for an EC2 VPC.
     * </p>
     * 
     * @param awsEc2Vpc
     *        Details for an EC2 VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEc2Vpc(AwsEc2VpcDetails awsEc2Vpc) {
        setAwsEc2Vpc(awsEc2Vpc);
        return this;
    }

    /**
     * <p>
     * Details about an Elastic IP address.
     * </p>
     * 
     * @param awsEc2Eip
     *        Details about an Elastic IP address.
     */

    public void setAwsEc2Eip(AwsEc2EipDetails awsEc2Eip) {
        this.awsEc2Eip = awsEc2Eip;
    }

    /**
     * <p>
     * Details about an Elastic IP address.
     * </p>
     * 
     * @return Details about an Elastic IP address.
     */

    public AwsEc2EipDetails getAwsEc2Eip() {
        return this.awsEc2Eip;
    }

    /**
     * <p>
     * Details about an Elastic IP address.
     * </p>
     * 
     * @param awsEc2Eip
     *        Details about an Elastic IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEc2Eip(AwsEc2EipDetails awsEc2Eip) {
        setAwsEc2Eip(awsEc2Eip);
        return this;
    }

    /**
     * <p>
     * Details about a subnet in Amazon EC2.
     * </p>
     * 
     * @param awsEc2Subnet
     *        Details about a subnet in Amazon EC2.
     */

    public void setAwsEc2Subnet(AwsEc2SubnetDetails awsEc2Subnet) {
        this.awsEc2Subnet = awsEc2Subnet;
    }

    /**
     * <p>
     * Details about a subnet in Amazon EC2.
     * </p>
     * 
     * @return Details about a subnet in Amazon EC2.
     */

    public AwsEc2SubnetDetails getAwsEc2Subnet() {
        return this.awsEc2Subnet;
    }

    /**
     * <p>
     * Details about a subnet in Amazon EC2.
     * </p>
     * 
     * @param awsEc2Subnet
     *        Details about a subnet in Amazon EC2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEc2Subnet(AwsEc2SubnetDetails awsEc2Subnet) {
        setAwsEc2Subnet(awsEc2Subnet);
        return this;
    }

    /**
     * <p>
     * Details about an EC2 network access control list (ACL).
     * </p>
     * 
     * @param awsEc2NetworkAcl
     *        Details about an EC2 network access control list (ACL).
     */

    public void setAwsEc2NetworkAcl(AwsEc2NetworkAclDetails awsEc2NetworkAcl) {
        this.awsEc2NetworkAcl = awsEc2NetworkAcl;
    }

    /**
     * <p>
     * Details about an EC2 network access control list (ACL).
     * </p>
     * 
     * @return Details about an EC2 network access control list (ACL).
     */

    public AwsEc2NetworkAclDetails getAwsEc2NetworkAcl() {
        return this.awsEc2NetworkAcl;
    }

    /**
     * <p>
     * Details about an EC2 network access control list (ACL).
     * </p>
     * 
     * @param awsEc2NetworkAcl
     *        Details about an EC2 network access control list (ACL).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEc2NetworkAcl(AwsEc2NetworkAclDetails awsEc2NetworkAcl) {
        setAwsEc2NetworkAcl(awsEc2NetworkAcl);
        return this;
    }

    /**
     * <p>
     * Details about a load balancer.
     * </p>
     * 
     * @param awsElbv2LoadBalancer
     *        Details about a load balancer.
     */

    public void setAwsElbv2LoadBalancer(AwsElbv2LoadBalancerDetails awsElbv2LoadBalancer) {
        this.awsElbv2LoadBalancer = awsElbv2LoadBalancer;
    }

    /**
     * <p>
     * Details about a load balancer.
     * </p>
     * 
     * @return Details about a load balancer.
     */

    public AwsElbv2LoadBalancerDetails getAwsElbv2LoadBalancer() {
        return this.awsElbv2LoadBalancer;
    }

    /**
     * <p>
     * Details about a load balancer.
     * </p>
     * 
     * @param awsElbv2LoadBalancer
     *        Details about a load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsElbv2LoadBalancer(AwsElbv2LoadBalancerDetails awsElbv2LoadBalancer) {
        setAwsElbv2LoadBalancer(awsElbv2LoadBalancer);
        return this;
    }

    /**
     * <p>
     * Details about an Elastic Beanstalk environment.
     * </p>
     * 
     * @param awsElasticBeanstalkEnvironment
     *        Details about an Elastic Beanstalk environment.
     */

    public void setAwsElasticBeanstalkEnvironment(AwsElasticBeanstalkEnvironmentDetails awsElasticBeanstalkEnvironment) {
        this.awsElasticBeanstalkEnvironment = awsElasticBeanstalkEnvironment;
    }

    /**
     * <p>
     * Details about an Elastic Beanstalk environment.
     * </p>
     * 
     * @return Details about an Elastic Beanstalk environment.
     */

    public AwsElasticBeanstalkEnvironmentDetails getAwsElasticBeanstalkEnvironment() {
        return this.awsElasticBeanstalkEnvironment;
    }

    /**
     * <p>
     * Details about an Elastic Beanstalk environment.
     * </p>
     * 
     * @param awsElasticBeanstalkEnvironment
     *        Details about an Elastic Beanstalk environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsElasticBeanstalkEnvironment(AwsElasticBeanstalkEnvironmentDetails awsElasticBeanstalkEnvironment) {
        setAwsElasticBeanstalkEnvironment(awsElasticBeanstalkEnvironment);
        return this;
    }

    /**
     * <p>
     * Details for an Elasticsearch domain.
     * </p>
     * 
     * @param awsElasticsearchDomain
     *        Details for an Elasticsearch domain.
     */

    public void setAwsElasticsearchDomain(AwsElasticsearchDomainDetails awsElasticsearchDomain) {
        this.awsElasticsearchDomain = awsElasticsearchDomain;
    }

    /**
     * <p>
     * Details for an Elasticsearch domain.
     * </p>
     * 
     * @return Details for an Elasticsearch domain.
     */

    public AwsElasticsearchDomainDetails getAwsElasticsearchDomain() {
        return this.awsElasticsearchDomain;
    }

    /**
     * <p>
     * Details for an Elasticsearch domain.
     * </p>
     * 
     * @param awsElasticsearchDomain
     *        Details for an Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsElasticsearchDomain(AwsElasticsearchDomainDetails awsElasticsearchDomain) {
        setAwsElasticsearchDomain(awsElasticsearchDomain);
        return this;
    }

    /**
     * <p>
     * Details about an S3 bucket related to a finding.
     * </p>
     * 
     * @param awsS3Bucket
     *        Details about an S3 bucket related to a finding.
     */

    public void setAwsS3Bucket(AwsS3BucketDetails awsS3Bucket) {
        this.awsS3Bucket = awsS3Bucket;
    }

    /**
     * <p>
     * Details about an S3 bucket related to a finding.
     * </p>
     * 
     * @return Details about an S3 bucket related to a finding.
     */

    public AwsS3BucketDetails getAwsS3Bucket() {
        return this.awsS3Bucket;
    }

    /**
     * <p>
     * Details about an S3 bucket related to a finding.
     * </p>
     * 
     * @param awsS3Bucket
     *        Details about an S3 bucket related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsS3Bucket(AwsS3BucketDetails awsS3Bucket) {
        setAwsS3Bucket(awsS3Bucket);
        return this;
    }

    /**
     * <p>
     * Details about the Amazon S3 Public Access Block configuration for an account.
     * </p>
     * 
     * @param awsS3AccountPublicAccessBlock
     *        Details about the Amazon S3 Public Access Block configuration for an account.
     */

    public void setAwsS3AccountPublicAccessBlock(AwsS3AccountPublicAccessBlockDetails awsS3AccountPublicAccessBlock) {
        this.awsS3AccountPublicAccessBlock = awsS3AccountPublicAccessBlock;
    }

    /**
     * <p>
     * Details about the Amazon S3 Public Access Block configuration for an account.
     * </p>
     * 
     * @return Details about the Amazon S3 Public Access Block configuration for an account.
     */

    public AwsS3AccountPublicAccessBlockDetails getAwsS3AccountPublicAccessBlock() {
        return this.awsS3AccountPublicAccessBlock;
    }

    /**
     * <p>
     * Details about the Amazon S3 Public Access Block configuration for an account.
     * </p>
     * 
     * @param awsS3AccountPublicAccessBlock
     *        Details about the Amazon S3 Public Access Block configuration for an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsS3AccountPublicAccessBlock(AwsS3AccountPublicAccessBlockDetails awsS3AccountPublicAccessBlock) {
        setAwsS3AccountPublicAccessBlock(awsS3AccountPublicAccessBlock);
        return this;
    }

    /**
     * <p>
     * Details about an S3 object related to a finding.
     * </p>
     * 
     * @param awsS3Object
     *        Details about an S3 object related to a finding.
     */

    public void setAwsS3Object(AwsS3ObjectDetails awsS3Object) {
        this.awsS3Object = awsS3Object;
    }

    /**
     * <p>
     * Details about an S3 object related to a finding.
     * </p>
     * 
     * @return Details about an S3 object related to a finding.
     */

    public AwsS3ObjectDetails getAwsS3Object() {
        return this.awsS3Object;
    }

    /**
     * <p>
     * Details about an S3 object related to a finding.
     * </p>
     * 
     * @param awsS3Object
     *        Details about an S3 object related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsS3Object(AwsS3ObjectDetails awsS3Object) {
        setAwsS3Object(awsS3Object);
        return this;
    }

    /**
     * <p>
     * Details about a Secrets Manager secret.
     * </p>
     * 
     * @param awsSecretsManagerSecret
     *        Details about a Secrets Manager secret.
     */

    public void setAwsSecretsManagerSecret(AwsSecretsManagerSecretDetails awsSecretsManagerSecret) {
        this.awsSecretsManagerSecret = awsSecretsManagerSecret;
    }

    /**
     * <p>
     * Details about a Secrets Manager secret.
     * </p>
     * 
     * @return Details about a Secrets Manager secret.
     */

    public AwsSecretsManagerSecretDetails getAwsSecretsManagerSecret() {
        return this.awsSecretsManagerSecret;
    }

    /**
     * <p>
     * Details about a Secrets Manager secret.
     * </p>
     * 
     * @param awsSecretsManagerSecret
     *        Details about a Secrets Manager secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsSecretsManagerSecret(AwsSecretsManagerSecretDetails awsSecretsManagerSecret) {
        setAwsSecretsManagerSecret(awsSecretsManagerSecret);
        return this;
    }

    /**
     * <p>
     * Details about an IAM access key related to a finding.
     * </p>
     * 
     * @param awsIamAccessKey
     *        Details about an IAM access key related to a finding.
     */

    public void setAwsIamAccessKey(AwsIamAccessKeyDetails awsIamAccessKey) {
        this.awsIamAccessKey = awsIamAccessKey;
    }

    /**
     * <p>
     * Details about an IAM access key related to a finding.
     * </p>
     * 
     * @return Details about an IAM access key related to a finding.
     */

    public AwsIamAccessKeyDetails getAwsIamAccessKey() {
        return this.awsIamAccessKey;
    }

    /**
     * <p>
     * Details about an IAM access key related to a finding.
     * </p>
     * 
     * @param awsIamAccessKey
     *        Details about an IAM access key related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsIamAccessKey(AwsIamAccessKeyDetails awsIamAccessKey) {
        setAwsIamAccessKey(awsIamAccessKey);
        return this;
    }

    /**
     * <p>
     * Details about an IAM user.
     * </p>
     * 
     * @param awsIamUser
     *        Details about an IAM user.
     */

    public void setAwsIamUser(AwsIamUserDetails awsIamUser) {
        this.awsIamUser = awsIamUser;
    }

    /**
     * <p>
     * Details about an IAM user.
     * </p>
     * 
     * @return Details about an IAM user.
     */

    public AwsIamUserDetails getAwsIamUser() {
        return this.awsIamUser;
    }

    /**
     * <p>
     * Details about an IAM user.
     * </p>
     * 
     * @param awsIamUser
     *        Details about an IAM user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsIamUser(AwsIamUserDetails awsIamUser) {
        setAwsIamUser(awsIamUser);
        return this;
    }

    /**
     * <p>
     * Details about an IAM permissions policy.
     * </p>
     * 
     * @param awsIamPolicy
     *        Details about an IAM permissions policy.
     */

    public void setAwsIamPolicy(AwsIamPolicyDetails awsIamPolicy) {
        this.awsIamPolicy = awsIamPolicy;
    }

    /**
     * <p>
     * Details about an IAM permissions policy.
     * </p>
     * 
     * @return Details about an IAM permissions policy.
     */

    public AwsIamPolicyDetails getAwsIamPolicy() {
        return this.awsIamPolicy;
    }

    /**
     * <p>
     * Details about an IAM permissions policy.
     * </p>
     * 
     * @param awsIamPolicy
     *        Details about an IAM permissions policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsIamPolicy(AwsIamPolicyDetails awsIamPolicy) {
        setAwsIamPolicy(awsIamPolicy);
        return this;
    }

    /**
     * <p>
     * Provides information about a version 2 stage for Amazon API Gateway.
     * </p>
     * 
     * @param awsApiGatewayV2Stage
     *        Provides information about a version 2 stage for Amazon API Gateway.
     */

    public void setAwsApiGatewayV2Stage(AwsApiGatewayV2StageDetails awsApiGatewayV2Stage) {
        this.awsApiGatewayV2Stage = awsApiGatewayV2Stage;
    }

    /**
     * <p>
     * Provides information about a version 2 stage for Amazon API Gateway.
     * </p>
     * 
     * @return Provides information about a version 2 stage for Amazon API Gateway.
     */

    public AwsApiGatewayV2StageDetails getAwsApiGatewayV2Stage() {
        return this.awsApiGatewayV2Stage;
    }

    /**
     * <p>
     * Provides information about a version 2 stage for Amazon API Gateway.
     * </p>
     * 
     * @param awsApiGatewayV2Stage
     *        Provides information about a version 2 stage for Amazon API Gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsApiGatewayV2Stage(AwsApiGatewayV2StageDetails awsApiGatewayV2Stage) {
        setAwsApiGatewayV2Stage(awsApiGatewayV2Stage);
        return this;
    }

    /**
     * <p>
     * Provides information about a version 2 API in Amazon API Gateway.
     * </p>
     * 
     * @param awsApiGatewayV2Api
     *        Provides information about a version 2 API in Amazon API Gateway.
     */

    public void setAwsApiGatewayV2Api(AwsApiGatewayV2ApiDetails awsApiGatewayV2Api) {
        this.awsApiGatewayV2Api = awsApiGatewayV2Api;
    }

    /**
     * <p>
     * Provides information about a version 2 API in Amazon API Gateway.
     * </p>
     * 
     * @return Provides information about a version 2 API in Amazon API Gateway.
     */

    public AwsApiGatewayV2ApiDetails getAwsApiGatewayV2Api() {
        return this.awsApiGatewayV2Api;
    }

    /**
     * <p>
     * Provides information about a version 2 API in Amazon API Gateway.
     * </p>
     * 
     * @param awsApiGatewayV2Api
     *        Provides information about a version 2 API in Amazon API Gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsApiGatewayV2Api(AwsApiGatewayV2ApiDetails awsApiGatewayV2Api) {
        setAwsApiGatewayV2Api(awsApiGatewayV2Api);
        return this;
    }

    /**
     * <p>
     * Details about a DynamoDB table.
     * </p>
     * 
     * @param awsDynamoDbTable
     *        Details about a DynamoDB table.
     */

    public void setAwsDynamoDbTable(AwsDynamoDbTableDetails awsDynamoDbTable) {
        this.awsDynamoDbTable = awsDynamoDbTable;
    }

    /**
     * <p>
     * Details about a DynamoDB table.
     * </p>
     * 
     * @return Details about a DynamoDB table.
     */

    public AwsDynamoDbTableDetails getAwsDynamoDbTable() {
        return this.awsDynamoDbTable;
    }

    /**
     * <p>
     * Details about a DynamoDB table.
     * </p>
     * 
     * @param awsDynamoDbTable
     *        Details about a DynamoDB table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsDynamoDbTable(AwsDynamoDbTableDetails awsDynamoDbTable) {
        setAwsDynamoDbTable(awsDynamoDbTable);
        return this;
    }

    /**
     * <p>
     * Provides information about a version 1 Amazon API Gateway stage.
     * </p>
     * 
     * @param awsApiGatewayStage
     *        Provides information about a version 1 Amazon API Gateway stage.
     */

    public void setAwsApiGatewayStage(AwsApiGatewayStageDetails awsApiGatewayStage) {
        this.awsApiGatewayStage = awsApiGatewayStage;
    }

    /**
     * <p>
     * Provides information about a version 1 Amazon API Gateway stage.
     * </p>
     * 
     * @return Provides information about a version 1 Amazon API Gateway stage.
     */

    public AwsApiGatewayStageDetails getAwsApiGatewayStage() {
        return this.awsApiGatewayStage;
    }

    /**
     * <p>
     * Provides information about a version 1 Amazon API Gateway stage.
     * </p>
     * 
     * @param awsApiGatewayStage
     *        Provides information about a version 1 Amazon API Gateway stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsApiGatewayStage(AwsApiGatewayStageDetails awsApiGatewayStage) {
        setAwsApiGatewayStage(awsApiGatewayStage);
        return this;
    }

    /**
     * <p>
     * Provides information about a REST API in version 1 of Amazon API Gateway.
     * </p>
     * 
     * @param awsApiGatewayRestApi
     *        Provides information about a REST API in version 1 of Amazon API Gateway.
     */

    public void setAwsApiGatewayRestApi(AwsApiGatewayRestApiDetails awsApiGatewayRestApi) {
        this.awsApiGatewayRestApi = awsApiGatewayRestApi;
    }

    /**
     * <p>
     * Provides information about a REST API in version 1 of Amazon API Gateway.
     * </p>
     * 
     * @return Provides information about a REST API in version 1 of Amazon API Gateway.
     */

    public AwsApiGatewayRestApiDetails getAwsApiGatewayRestApi() {
        return this.awsApiGatewayRestApi;
    }

    /**
     * <p>
     * Provides information about a REST API in version 1 of Amazon API Gateway.
     * </p>
     * 
     * @param awsApiGatewayRestApi
     *        Provides information about a REST API in version 1 of Amazon API Gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsApiGatewayRestApi(AwsApiGatewayRestApiDetails awsApiGatewayRestApi) {
        setAwsApiGatewayRestApi(awsApiGatewayRestApi);
        return this;
    }

    /**
     * <p>
     * Provides details about a CloudTrail trail.
     * </p>
     * 
     * @param awsCloudTrailTrail
     *        Provides details about a CloudTrail trail.
     */

    public void setAwsCloudTrailTrail(AwsCloudTrailTrailDetails awsCloudTrailTrail) {
        this.awsCloudTrailTrail = awsCloudTrailTrail;
    }

    /**
     * <p>
     * Provides details about a CloudTrail trail.
     * </p>
     * 
     * @return Provides details about a CloudTrail trail.
     */

    public AwsCloudTrailTrailDetails getAwsCloudTrailTrail() {
        return this.awsCloudTrailTrail;
    }

    /**
     * <p>
     * Provides details about a CloudTrail trail.
     * </p>
     * 
     * @param awsCloudTrailTrail
     *        Provides details about a CloudTrail trail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsCloudTrailTrail(AwsCloudTrailTrailDetails awsCloudTrailTrail) {
        setAwsCloudTrailTrail(awsCloudTrailTrail);
        return this;
    }

    /**
     * <p>
     * Provides information about the state of a patch on an instance based on the patch baseline that was used to patch
     * the instance.
     * </p>
     * 
     * @param awsSsmPatchCompliance
     *        Provides information about the state of a patch on an instance based on the patch baseline that was used
     *        to patch the instance.
     */

    public void setAwsSsmPatchCompliance(AwsSsmPatchComplianceDetails awsSsmPatchCompliance) {
        this.awsSsmPatchCompliance = awsSsmPatchCompliance;
    }

    /**
     * <p>
     * Provides information about the state of a patch on an instance based on the patch baseline that was used to patch
     * the instance.
     * </p>
     * 
     * @return Provides information about the state of a patch on an instance based on the patch baseline that was used
     *         to patch the instance.
     */

    public AwsSsmPatchComplianceDetails getAwsSsmPatchCompliance() {
        return this.awsSsmPatchCompliance;
    }

    /**
     * <p>
     * Provides information about the state of a patch on an instance based on the patch baseline that was used to patch
     * the instance.
     * </p>
     * 
     * @param awsSsmPatchCompliance
     *        Provides information about the state of a patch on an instance based on the patch baseline that was used
     *        to patch the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsSsmPatchCompliance(AwsSsmPatchComplianceDetails awsSsmPatchCompliance) {
        setAwsSsmPatchCompliance(awsSsmPatchCompliance);
        return this;
    }

    /**
     * <p>
     * Provides details about an Certificate Manager certificate.
     * </p>
     * 
     * @param awsCertificateManagerCertificate
     *        Provides details about an Certificate Manager certificate.
     */

    public void setAwsCertificateManagerCertificate(AwsCertificateManagerCertificateDetails awsCertificateManagerCertificate) {
        this.awsCertificateManagerCertificate = awsCertificateManagerCertificate;
    }

    /**
     * <p>
     * Provides details about an Certificate Manager certificate.
     * </p>
     * 
     * @return Provides details about an Certificate Manager certificate.
     */

    public AwsCertificateManagerCertificateDetails getAwsCertificateManagerCertificate() {
        return this.awsCertificateManagerCertificate;
    }

    /**
     * <p>
     * Provides details about an Certificate Manager certificate.
     * </p>
     * 
     * @param awsCertificateManagerCertificate
     *        Provides details about an Certificate Manager certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsCertificateManagerCertificate(AwsCertificateManagerCertificateDetails awsCertificateManagerCertificate) {
        setAwsCertificateManagerCertificate(awsCertificateManagerCertificate);
        return this;
    }

    /**
     * <p>
     * Contains details about an Amazon Redshift cluster.
     * </p>
     * 
     * @param awsRedshiftCluster
     *        Contains details about an Amazon Redshift cluster.
     */

    public void setAwsRedshiftCluster(AwsRedshiftClusterDetails awsRedshiftCluster) {
        this.awsRedshiftCluster = awsRedshiftCluster;
    }

    /**
     * <p>
     * Contains details about an Amazon Redshift cluster.
     * </p>
     * 
     * @return Contains details about an Amazon Redshift cluster.
     */

    public AwsRedshiftClusterDetails getAwsRedshiftCluster() {
        return this.awsRedshiftCluster;
    }

    /**
     * <p>
     * Contains details about an Amazon Redshift cluster.
     * </p>
     * 
     * @param awsRedshiftCluster
     *        Contains details about an Amazon Redshift cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsRedshiftCluster(AwsRedshiftClusterDetails awsRedshiftCluster) {
        setAwsRedshiftCluster(awsRedshiftCluster);
        return this;
    }

    /**
     * <p>
     * Contains details about a Classic Load Balancer.
     * </p>
     * 
     * @param awsElbLoadBalancer
     *        Contains details about a Classic Load Balancer.
     */

    public void setAwsElbLoadBalancer(AwsElbLoadBalancerDetails awsElbLoadBalancer) {
        this.awsElbLoadBalancer = awsElbLoadBalancer;
    }

    /**
     * <p>
     * Contains details about a Classic Load Balancer.
     * </p>
     * 
     * @return Contains details about a Classic Load Balancer.
     */

    public AwsElbLoadBalancerDetails getAwsElbLoadBalancer() {
        return this.awsElbLoadBalancer;
    }

    /**
     * <p>
     * Contains details about a Classic Load Balancer.
     * </p>
     * 
     * @param awsElbLoadBalancer
     *        Contains details about a Classic Load Balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsElbLoadBalancer(AwsElbLoadBalancerDetails awsElbLoadBalancer) {
        setAwsElbLoadBalancer(awsElbLoadBalancer);
        return this;
    }

    /**
     * <p>
     * Contains details about an IAM group.
     * </p>
     * 
     * @param awsIamGroup
     *        Contains details about an IAM group.
     */

    public void setAwsIamGroup(AwsIamGroupDetails awsIamGroup) {
        this.awsIamGroup = awsIamGroup;
    }

    /**
     * <p>
     * Contains details about an IAM group.
     * </p>
     * 
     * @return Contains details about an IAM group.
     */

    public AwsIamGroupDetails getAwsIamGroup() {
        return this.awsIamGroup;
    }

    /**
     * <p>
     * Contains details about an IAM group.
     * </p>
     * 
     * @param awsIamGroup
     *        Contains details about an IAM group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsIamGroup(AwsIamGroupDetails awsIamGroup) {
        setAwsIamGroup(awsIamGroup);
        return this;
    }

    /**
     * <p>
     * Details about an IAM role.
     * </p>
     * 
     * @param awsIamRole
     *        Details about an IAM role.
     */

    public void setAwsIamRole(AwsIamRoleDetails awsIamRole) {
        this.awsIamRole = awsIamRole;
    }

    /**
     * <p>
     * Details about an IAM role.
     * </p>
     * 
     * @return Details about an IAM role.
     */

    public AwsIamRoleDetails getAwsIamRole() {
        return this.awsIamRole;
    }

    /**
     * <p>
     * Details about an IAM role.
     * </p>
     * 
     * @param awsIamRole
     *        Details about an IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsIamRole(AwsIamRoleDetails awsIamRole) {
        setAwsIamRole(awsIamRole);
        return this;
    }

    /**
     * <p>
     * Details about an KMS key.
     * </p>
     * 
     * @param awsKmsKey
     *        Details about an KMS key.
     */

    public void setAwsKmsKey(AwsKmsKeyDetails awsKmsKey) {
        this.awsKmsKey = awsKmsKey;
    }

    /**
     * <p>
     * Details about an KMS key.
     * </p>
     * 
     * @return Details about an KMS key.
     */

    public AwsKmsKeyDetails getAwsKmsKey() {
        return this.awsKmsKey;
    }

    /**
     * <p>
     * Details about an KMS key.
     * </p>
     * 
     * @param awsKmsKey
     *        Details about an KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsKmsKey(AwsKmsKeyDetails awsKmsKey) {
        setAwsKmsKey(awsKmsKey);
        return this;
    }

    /**
     * <p>
     * Details about a Lambda function.
     * </p>
     * 
     * @param awsLambdaFunction
     *        Details about a Lambda function.
     */

    public void setAwsLambdaFunction(AwsLambdaFunctionDetails awsLambdaFunction) {
        this.awsLambdaFunction = awsLambdaFunction;
    }

    /**
     * <p>
     * Details about a Lambda function.
     * </p>
     * 
     * @return Details about a Lambda function.
     */

    public AwsLambdaFunctionDetails getAwsLambdaFunction() {
        return this.awsLambdaFunction;
    }

    /**
     * <p>
     * Details about a Lambda function.
     * </p>
     * 
     * @param awsLambdaFunction
     *        Details about a Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsLambdaFunction(AwsLambdaFunctionDetails awsLambdaFunction) {
        setAwsLambdaFunction(awsLambdaFunction);
        return this;
    }

    /**
     * <p>
     * Details for a Lambda layer version.
     * </p>
     * 
     * @param awsLambdaLayerVersion
     *        Details for a Lambda layer version.
     */

    public void setAwsLambdaLayerVersion(AwsLambdaLayerVersionDetails awsLambdaLayerVersion) {
        this.awsLambdaLayerVersion = awsLambdaLayerVersion;
    }

    /**
     * <p>
     * Details for a Lambda layer version.
     * </p>
     * 
     * @return Details for a Lambda layer version.
     */

    public AwsLambdaLayerVersionDetails getAwsLambdaLayerVersion() {
        return this.awsLambdaLayerVersion;
    }

    /**
     * <p>
     * Details for a Lambda layer version.
     * </p>
     * 
     * @param awsLambdaLayerVersion
     *        Details for a Lambda layer version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsLambdaLayerVersion(AwsLambdaLayerVersionDetails awsLambdaLayerVersion) {
        setAwsLambdaLayerVersion(awsLambdaLayerVersion);
        return this;
    }

    /**
     * <p>
     * Details about an Amazon RDS database instance.
     * </p>
     * 
     * @param awsRdsDbInstance
     *        Details about an Amazon RDS database instance.
     */

    public void setAwsRdsDbInstance(AwsRdsDbInstanceDetails awsRdsDbInstance) {
        this.awsRdsDbInstance = awsRdsDbInstance;
    }

    /**
     * <p>
     * Details about an Amazon RDS database instance.
     * </p>
     * 
     * @return Details about an Amazon RDS database instance.
     */

    public AwsRdsDbInstanceDetails getAwsRdsDbInstance() {
        return this.awsRdsDbInstance;
    }

    /**
     * <p>
     * Details about an Amazon RDS database instance.
     * </p>
     * 
     * @param awsRdsDbInstance
     *        Details about an Amazon RDS database instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsRdsDbInstance(AwsRdsDbInstanceDetails awsRdsDbInstance) {
        setAwsRdsDbInstance(awsRdsDbInstance);
        return this;
    }

    /**
     * <p>
     * Details about an SNS topic.
     * </p>
     * 
     * @param awsSnsTopic
     *        Details about an SNS topic.
     */

    public void setAwsSnsTopic(AwsSnsTopicDetails awsSnsTopic) {
        this.awsSnsTopic = awsSnsTopic;
    }

    /**
     * <p>
     * Details about an SNS topic.
     * </p>
     * 
     * @return Details about an SNS topic.
     */

    public AwsSnsTopicDetails getAwsSnsTopic() {
        return this.awsSnsTopic;
    }

    /**
     * <p>
     * Details about an SNS topic.
     * </p>
     * 
     * @param awsSnsTopic
     *        Details about an SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsSnsTopic(AwsSnsTopicDetails awsSnsTopic) {
        setAwsSnsTopic(awsSnsTopic);
        return this;
    }

    /**
     * <p>
     * Details about an SQS queue.
     * </p>
     * 
     * @param awsSqsQueue
     *        Details about an SQS queue.
     */

    public void setAwsSqsQueue(AwsSqsQueueDetails awsSqsQueue) {
        this.awsSqsQueue = awsSqsQueue;
    }

    /**
     * <p>
     * Details about an SQS queue.
     * </p>
     * 
     * @return Details about an SQS queue.
     */

    public AwsSqsQueueDetails getAwsSqsQueue() {
        return this.awsSqsQueue;
    }

    /**
     * <p>
     * Details about an SQS queue.
     * </p>
     * 
     * @param awsSqsQueue
     *        Details about an SQS queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsSqsQueue(AwsSqsQueueDetails awsSqsQueue) {
        setAwsSqsQueue(awsSqsQueue);
        return this;
    }

    /**
     * <p>
     * Details for an WAF WebACL.
     * </p>
     * 
     * @param awsWafWebAcl
     *        Details for an WAF WebACL.
     */

    public void setAwsWafWebAcl(AwsWafWebAclDetails awsWafWebAcl) {
        this.awsWafWebAcl = awsWafWebAcl;
    }

    /**
     * <p>
     * Details for an WAF WebACL.
     * </p>
     * 
     * @return Details for an WAF WebACL.
     */

    public AwsWafWebAclDetails getAwsWafWebAcl() {
        return this.awsWafWebAcl;
    }

    /**
     * <p>
     * Details for an WAF WebACL.
     * </p>
     * 
     * @param awsWafWebAcl
     *        Details for an WAF WebACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsWafWebAcl(AwsWafWebAclDetails awsWafWebAcl) {
        setAwsWafWebAcl(awsWafWebAcl);
        return this;
    }

    /**
     * <p>
     * Details about an Amazon RDS database snapshot.
     * </p>
     * 
     * @param awsRdsDbSnapshot
     *        Details about an Amazon RDS database snapshot.
     */

    public void setAwsRdsDbSnapshot(AwsRdsDbSnapshotDetails awsRdsDbSnapshot) {
        this.awsRdsDbSnapshot = awsRdsDbSnapshot;
    }

    /**
     * <p>
     * Details about an Amazon RDS database snapshot.
     * </p>
     * 
     * @return Details about an Amazon RDS database snapshot.
     */

    public AwsRdsDbSnapshotDetails getAwsRdsDbSnapshot() {
        return this.awsRdsDbSnapshot;
    }

    /**
     * <p>
     * Details about an Amazon RDS database snapshot.
     * </p>
     * 
     * @param awsRdsDbSnapshot
     *        Details about an Amazon RDS database snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsRdsDbSnapshot(AwsRdsDbSnapshotDetails awsRdsDbSnapshot) {
        setAwsRdsDbSnapshot(awsRdsDbSnapshot);
        return this;
    }

    /**
     * <p>
     * Details about an Amazon RDS database cluster snapshot.
     * </p>
     * 
     * @param awsRdsDbClusterSnapshot
     *        Details about an Amazon RDS database cluster snapshot.
     */

    public void setAwsRdsDbClusterSnapshot(AwsRdsDbClusterSnapshotDetails awsRdsDbClusterSnapshot) {
        this.awsRdsDbClusterSnapshot = awsRdsDbClusterSnapshot;
    }

    /**
     * <p>
     * Details about an Amazon RDS database cluster snapshot.
     * </p>
     * 
     * @return Details about an Amazon RDS database cluster snapshot.
     */

    public AwsRdsDbClusterSnapshotDetails getAwsRdsDbClusterSnapshot() {
        return this.awsRdsDbClusterSnapshot;
    }

    /**
     * <p>
     * Details about an Amazon RDS database cluster snapshot.
     * </p>
     * 
     * @param awsRdsDbClusterSnapshot
     *        Details about an Amazon RDS database cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsRdsDbClusterSnapshot(AwsRdsDbClusterSnapshotDetails awsRdsDbClusterSnapshot) {
        setAwsRdsDbClusterSnapshot(awsRdsDbClusterSnapshot);
        return this;
    }

    /**
     * <p>
     * Details about an Amazon RDS database cluster.
     * </p>
     * 
     * @param awsRdsDbCluster
     *        Details about an Amazon RDS database cluster.
     */

    public void setAwsRdsDbCluster(AwsRdsDbClusterDetails awsRdsDbCluster) {
        this.awsRdsDbCluster = awsRdsDbCluster;
    }

    /**
     * <p>
     * Details about an Amazon RDS database cluster.
     * </p>
     * 
     * @return Details about an Amazon RDS database cluster.
     */

    public AwsRdsDbClusterDetails getAwsRdsDbCluster() {
        return this.awsRdsDbCluster;
    }

    /**
     * <p>
     * Details about an Amazon RDS database cluster.
     * </p>
     * 
     * @param awsRdsDbCluster
     *        Details about an Amazon RDS database cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsRdsDbCluster(AwsRdsDbClusterDetails awsRdsDbCluster) {
        setAwsRdsDbCluster(awsRdsDbCluster);
        return this;
    }

    /**
     * <p>
     * Details about an ECS cluster.
     * </p>
     * 
     * @param awsEcsCluster
     *        Details about an ECS cluster.
     */

    public void setAwsEcsCluster(AwsEcsClusterDetails awsEcsCluster) {
        this.awsEcsCluster = awsEcsCluster;
    }

    /**
     * <p>
     * Details about an ECS cluster.
     * </p>
     * 
     * @return Details about an ECS cluster.
     */

    public AwsEcsClusterDetails getAwsEcsCluster() {
        return this.awsEcsCluster;
    }

    /**
     * <p>
     * Details about an ECS cluster.
     * </p>
     * 
     * @param awsEcsCluster
     *        Details about an ECS cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEcsCluster(AwsEcsClusterDetails awsEcsCluster) {
        setAwsEcsCluster(awsEcsCluster);
        return this;
    }

    /**
     * <p>
     * Details about a task definition. A task definition describes the container and volume definitions of an Amazon
     * Elastic Container Service task.
     * </p>
     * 
     * @param awsEcsTaskDefinition
     *        Details about a task definition. A task definition describes the container and volume definitions of an
     *        Amazon Elastic Container Service task.
     */

    public void setAwsEcsTaskDefinition(AwsEcsTaskDefinitionDetails awsEcsTaskDefinition) {
        this.awsEcsTaskDefinition = awsEcsTaskDefinition;
    }

    /**
     * <p>
     * Details about a task definition. A task definition describes the container and volume definitions of an Amazon
     * Elastic Container Service task.
     * </p>
     * 
     * @return Details about a task definition. A task definition describes the container and volume definitions of an
     *         Amazon Elastic Container Service task.
     */

    public AwsEcsTaskDefinitionDetails getAwsEcsTaskDefinition() {
        return this.awsEcsTaskDefinition;
    }

    /**
     * <p>
     * Details about a task definition. A task definition describes the container and volume definitions of an Amazon
     * Elastic Container Service task.
     * </p>
     * 
     * @param awsEcsTaskDefinition
     *        Details about a task definition. A task definition describes the container and volume definitions of an
     *        Amazon Elastic Container Service task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEcsTaskDefinition(AwsEcsTaskDefinitionDetails awsEcsTaskDefinition) {
        setAwsEcsTaskDefinition(awsEcsTaskDefinition);
        return this;
    }

    /**
     * <p>
     * Details about a container resource related to a finding.
     * </p>
     * 
     * @param container
     *        Details about a container resource related to a finding.
     */

    public void setContainer(ContainerDetails container) {
        this.container = container;
    }

    /**
     * <p>
     * Details about a container resource related to a finding.
     * </p>
     * 
     * @return Details about a container resource related to a finding.
     */

    public ContainerDetails getContainer() {
        return this.container;
    }

    /**
     * <p>
     * Details about a container resource related to a finding.
     * </p>
     * 
     * @param container
     *        Details about a container resource related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withContainer(ContainerDetails container) {
        setContainer(container);
        return this;
    }

    /**
     * <p>
     * Details about a resource that are not available in a type-specific details object. Use the <code>Other</code>
     * object in the following cases.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type-specific object does not contain all of the fields that you want to populate. In this case, first use
     * the type-specific object to populate those fields. Use the <code>Other</code> object to populate the fields that
     * are missing from the type-specific object.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type does not have a corresponding object. This includes resources for which the type is
     * <code>Other</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Details about a resource that are not available in a type-specific details object. Use the
     *         <code>Other</code> object in the following cases.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The type-specific object does not contain all of the fields that you want to populate. In this case,
     *         first use the type-specific object to populate those fields. Use the <code>Other</code> object to
     *         populate the fields that are missing from the type-specific object.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The resource type does not have a corresponding object. This includes resources for which the type is
     *         <code>Other</code>.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getOther() {
        return other;
    }

    /**
     * <p>
     * Details about a resource that are not available in a type-specific details object. Use the <code>Other</code>
     * object in the following cases.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type-specific object does not contain all of the fields that you want to populate. In this case, first use
     * the type-specific object to populate those fields. Use the <code>Other</code> object to populate the fields that
     * are missing from the type-specific object.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type does not have a corresponding object. This includes resources for which the type is
     * <code>Other</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param other
     *        Details about a resource that are not available in a type-specific details object. Use the
     *        <code>Other</code> object in the following cases.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The type-specific object does not contain all of the fields that you want to populate. In this case, first
     *        use the type-specific object to populate those fields. Use the <code>Other</code> object to populate the
     *        fields that are missing from the type-specific object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The resource type does not have a corresponding object. This includes resources for which the type is
     *        <code>Other</code>.
     *        </p>
     *        </li>
     */

    public void setOther(java.util.Map<String, String> other) {
        this.other = other;
    }

    /**
     * <p>
     * Details about a resource that are not available in a type-specific details object. Use the <code>Other</code>
     * object in the following cases.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type-specific object does not contain all of the fields that you want to populate. In this case, first use
     * the type-specific object to populate those fields. Use the <code>Other</code> object to populate the fields that
     * are missing from the type-specific object.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type does not have a corresponding object. This includes resources for which the type is
     * <code>Other</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param other
     *        Details about a resource that are not available in a type-specific details object. Use the
     *        <code>Other</code> object in the following cases.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The type-specific object does not contain all of the fields that you want to populate. In this case, first
     *        use the type-specific object to populate those fields. Use the <code>Other</code> object to populate the
     *        fields that are missing from the type-specific object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The resource type does not have a corresponding object. This includes resources for which the type is
     *        <code>Other</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withOther(java.util.Map<String, String> other) {
        setOther(other);
        return this;
    }

    /**
     * Add a single Other entry
     *
     * @see ResourceDetails#withOther
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails addOtherEntry(String key, String value) {
        if (null == this.other) {
            this.other = new java.util.HashMap<String, String>();
        }
        if (this.other.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.other.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Other.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails clearOtherEntries() {
        this.other = null;
        return this;
    }

    /**
     * <p>
     * Details about an RDS event notification subscription.
     * </p>
     * 
     * @param awsRdsEventSubscription
     *        Details about an RDS event notification subscription.
     */

    public void setAwsRdsEventSubscription(AwsRdsEventSubscriptionDetails awsRdsEventSubscription) {
        this.awsRdsEventSubscription = awsRdsEventSubscription;
    }

    /**
     * <p>
     * Details about an RDS event notification subscription.
     * </p>
     * 
     * @return Details about an RDS event notification subscription.
     */

    public AwsRdsEventSubscriptionDetails getAwsRdsEventSubscription() {
        return this.awsRdsEventSubscription;
    }

    /**
     * <p>
     * Details about an RDS event notification subscription.
     * </p>
     * 
     * @param awsRdsEventSubscription
     *        Details about an RDS event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsRdsEventSubscription(AwsRdsEventSubscriptionDetails awsRdsEventSubscription) {
        setAwsRdsEventSubscription(awsRdsEventSubscription);
        return this;
    }

    /**
     * <p>
     * Details about a service within an ECS cluster.
     * </p>
     * 
     * @param awsEcsService
     *        Details about a service within an ECS cluster.
     */

    public void setAwsEcsService(AwsEcsServiceDetails awsEcsService) {
        this.awsEcsService = awsEcsService;
    }

    /**
     * <p>
     * Details about a service within an ECS cluster.
     * </p>
     * 
     * @return Details about a service within an ECS cluster.
     */

    public AwsEcsServiceDetails getAwsEcsService() {
        return this.awsEcsService;
    }

    /**
     * <p>
     * Details about a service within an ECS cluster.
     * </p>
     * 
     * @param awsEcsService
     *        Details about a service within an ECS cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEcsService(AwsEcsServiceDetails awsEcsService) {
        setAwsEcsService(awsEcsService);
        return this;
    }

    /**
     * <p>
     * Provides details about a launch configuration.
     * </p>
     * 
     * @param awsAutoScalingLaunchConfiguration
     *        Provides details about a launch configuration.
     */

    public void setAwsAutoScalingLaunchConfiguration(AwsAutoScalingLaunchConfigurationDetails awsAutoScalingLaunchConfiguration) {
        this.awsAutoScalingLaunchConfiguration = awsAutoScalingLaunchConfiguration;
    }

    /**
     * <p>
     * Provides details about a launch configuration.
     * </p>
     * 
     * @return Provides details about a launch configuration.
     */

    public AwsAutoScalingLaunchConfigurationDetails getAwsAutoScalingLaunchConfiguration() {
        return this.awsAutoScalingLaunchConfiguration;
    }

    /**
     * <p>
     * Provides details about a launch configuration.
     * </p>
     * 
     * @param awsAutoScalingLaunchConfiguration
     *        Provides details about a launch configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsAutoScalingLaunchConfiguration(AwsAutoScalingLaunchConfigurationDetails awsAutoScalingLaunchConfiguration) {
        setAwsAutoScalingLaunchConfiguration(awsAutoScalingLaunchConfiguration);
        return this;
    }

    /**
     * <p>
     * Details about an EC2 VPN connection.
     * </p>
     * 
     * @param awsEc2VpnConnection
     *        Details about an EC2 VPN connection.
     */

    public void setAwsEc2VpnConnection(AwsEc2VpnConnectionDetails awsEc2VpnConnection) {
        this.awsEc2VpnConnection = awsEc2VpnConnection;
    }

    /**
     * <p>
     * Details about an EC2 VPN connection.
     * </p>
     * 
     * @return Details about an EC2 VPN connection.
     */

    public AwsEc2VpnConnectionDetails getAwsEc2VpnConnection() {
        return this.awsEc2VpnConnection;
    }

    /**
     * <p>
     * Details about an EC2 VPN connection.
     * </p>
     * 
     * @param awsEc2VpnConnection
     *        Details about an EC2 VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEc2VpnConnection(AwsEc2VpnConnectionDetails awsEc2VpnConnection) {
        setAwsEc2VpnConnection(awsEc2VpnConnection);
        return this;
    }

    /**
     * <p>
     * Information about an Amazon ECR image.
     * </p>
     * 
     * @param awsEcrContainerImage
     *        Information about an Amazon ECR image.
     */

    public void setAwsEcrContainerImage(AwsEcrContainerImageDetails awsEcrContainerImage) {
        this.awsEcrContainerImage = awsEcrContainerImage;
    }

    /**
     * <p>
     * Information about an Amazon ECR image.
     * </p>
     * 
     * @return Information about an Amazon ECR image.
     */

    public AwsEcrContainerImageDetails getAwsEcrContainerImage() {
        return this.awsEcrContainerImage;
    }

    /**
     * <p>
     * Information about an Amazon ECR image.
     * </p>
     * 
     * @param awsEcrContainerImage
     *        Information about an Amazon ECR image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEcrContainerImage(AwsEcrContainerImageDetails awsEcrContainerImage) {
        setAwsEcrContainerImage(awsEcrContainerImage);
        return this;
    }

    /**
     * <p>
     * Details about an Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param awsOpenSearchServiceDomain
     *        Details about an Amazon OpenSearch Service domain.
     */

    public void setAwsOpenSearchServiceDomain(AwsOpenSearchServiceDomainDetails awsOpenSearchServiceDomain) {
        this.awsOpenSearchServiceDomain = awsOpenSearchServiceDomain;
    }

    /**
     * <p>
     * Details about an Amazon OpenSearch Service domain.
     * </p>
     * 
     * @return Details about an Amazon OpenSearch Service domain.
     */

    public AwsOpenSearchServiceDomainDetails getAwsOpenSearchServiceDomain() {
        return this.awsOpenSearchServiceDomain;
    }

    /**
     * <p>
     * Details about an Amazon OpenSearch Service domain.
     * </p>
     * 
     * @param awsOpenSearchServiceDomain
     *        Details about an Amazon OpenSearch Service domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsOpenSearchServiceDomain(AwsOpenSearchServiceDomainDetails awsOpenSearchServiceDomain) {
        setAwsOpenSearchServiceDomain(awsOpenSearchServiceDomain);
        return this;
    }

    /**
     * <p>
     * Details about the service configuration for a VPC endpoint service.
     * </p>
     * 
     * @param awsEc2VpcEndpointService
     *        Details about the service configuration for a VPC endpoint service.
     */

    public void setAwsEc2VpcEndpointService(AwsEc2VpcEndpointServiceDetails awsEc2VpcEndpointService) {
        this.awsEc2VpcEndpointService = awsEc2VpcEndpointService;
    }

    /**
     * <p>
     * Details about the service configuration for a VPC endpoint service.
     * </p>
     * 
     * @return Details about the service configuration for a VPC endpoint service.
     */

    public AwsEc2VpcEndpointServiceDetails getAwsEc2VpcEndpointService() {
        return this.awsEc2VpcEndpointService;
    }

    /**
     * <p>
     * Details about the service configuration for a VPC endpoint service.
     * </p>
     * 
     * @param awsEc2VpcEndpointService
     *        Details about the service configuration for a VPC endpoint service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEc2VpcEndpointService(AwsEc2VpcEndpointServiceDetails awsEc2VpcEndpointService) {
        setAwsEc2VpcEndpointService(awsEc2VpcEndpointService);
        return this;
    }

    /**
     * <p>
     * Information about the encryption configuration for X-Ray.
     * </p>
     * 
     * @param awsXrayEncryptionConfig
     *        Information about the encryption configuration for X-Ray.
     */

    public void setAwsXrayEncryptionConfig(AwsXrayEncryptionConfigDetails awsXrayEncryptionConfig) {
        this.awsXrayEncryptionConfig = awsXrayEncryptionConfig;
    }

    /**
     * <p>
     * Information about the encryption configuration for X-Ray.
     * </p>
     * 
     * @return Information about the encryption configuration for X-Ray.
     */

    public AwsXrayEncryptionConfigDetails getAwsXrayEncryptionConfig() {
        return this.awsXrayEncryptionConfig;
    }

    /**
     * <p>
     * Information about the encryption configuration for X-Ray.
     * </p>
     * 
     * @param awsXrayEncryptionConfig
     *        Information about the encryption configuration for X-Ray.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsXrayEncryptionConfig(AwsXrayEncryptionConfigDetails awsXrayEncryptionConfig) {
        setAwsXrayEncryptionConfig(awsXrayEncryptionConfig);
        return this;
    }

    /**
     * <p>
     * Details about a rate-based rule for global resources.
     * </p>
     * 
     * @param awsWafRateBasedRule
     *        Details about a rate-based rule for global resources.
     */

    public void setAwsWafRateBasedRule(AwsWafRateBasedRuleDetails awsWafRateBasedRule) {
        this.awsWafRateBasedRule = awsWafRateBasedRule;
    }

    /**
     * <p>
     * Details about a rate-based rule for global resources.
     * </p>
     * 
     * @return Details about a rate-based rule for global resources.
     */

    public AwsWafRateBasedRuleDetails getAwsWafRateBasedRule() {
        return this.awsWafRateBasedRule;
    }

    /**
     * <p>
     * Details about a rate-based rule for global resources.
     * </p>
     * 
     * @param awsWafRateBasedRule
     *        Details about a rate-based rule for global resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsWafRateBasedRule(AwsWafRateBasedRuleDetails awsWafRateBasedRule) {
        setAwsWafRateBasedRule(awsWafRateBasedRule);
        return this;
    }

    /**
     * <p>
     * Details about a rate-based rule for Regional resources.
     * </p>
     * 
     * @param awsWafRegionalRateBasedRule
     *        Details about a rate-based rule for Regional resources.
     */

    public void setAwsWafRegionalRateBasedRule(AwsWafRegionalRateBasedRuleDetails awsWafRegionalRateBasedRule) {
        this.awsWafRegionalRateBasedRule = awsWafRegionalRateBasedRule;
    }

    /**
     * <p>
     * Details about a rate-based rule for Regional resources.
     * </p>
     * 
     * @return Details about a rate-based rule for Regional resources.
     */

    public AwsWafRegionalRateBasedRuleDetails getAwsWafRegionalRateBasedRule() {
        return this.awsWafRegionalRateBasedRule;
    }

    /**
     * <p>
     * Details about a rate-based rule for Regional resources.
     * </p>
     * 
     * @param awsWafRegionalRateBasedRule
     *        Details about a rate-based rule for Regional resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsWafRegionalRateBasedRule(AwsWafRegionalRateBasedRuleDetails awsWafRegionalRateBasedRule) {
        setAwsWafRegionalRateBasedRule(awsWafRegionalRateBasedRule);
        return this;
    }

    /**
     * <p>
     * Information about an Amazon Elastic Container Registry repository.
     * </p>
     * 
     * @param awsEcrRepository
     *        Information about an Amazon Elastic Container Registry repository.
     */

    public void setAwsEcrRepository(AwsEcrRepositoryDetails awsEcrRepository) {
        this.awsEcrRepository = awsEcrRepository;
    }

    /**
     * <p>
     * Information about an Amazon Elastic Container Registry repository.
     * </p>
     * 
     * @return Information about an Amazon Elastic Container Registry repository.
     */

    public AwsEcrRepositoryDetails getAwsEcrRepository() {
        return this.awsEcrRepository;
    }

    /**
     * <p>
     * Information about an Amazon Elastic Container Registry repository.
     * </p>
     * 
     * @param awsEcrRepository
     *        Information about an Amazon Elastic Container Registry repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEcrRepository(AwsEcrRepositoryDetails awsEcrRepository) {
        setAwsEcrRepository(awsEcrRepository);
        return this;
    }

    /**
     * <p>
     * Details about an Amazon EKS cluster.
     * </p>
     * 
     * @param awsEksCluster
     *        Details about an Amazon EKS cluster.
     */

    public void setAwsEksCluster(AwsEksClusterDetails awsEksCluster) {
        this.awsEksCluster = awsEksCluster;
    }

    /**
     * <p>
     * Details about an Amazon EKS cluster.
     * </p>
     * 
     * @return Details about an Amazon EKS cluster.
     */

    public AwsEksClusterDetails getAwsEksCluster() {
        return this.awsEksCluster;
    }

    /**
     * <p>
     * Details about an Amazon EKS cluster.
     * </p>
     * 
     * @param awsEksCluster
     *        Details about an Amazon EKS cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEksCluster(AwsEksClusterDetails awsEksCluster) {
        setAwsEksCluster(awsEksCluster);
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
        if (getAwsAutoScalingAutoScalingGroup() != null)
            sb.append("AwsAutoScalingAutoScalingGroup: ").append(getAwsAutoScalingAutoScalingGroup()).append(",");
        if (getAwsCodeBuildProject() != null)
            sb.append("AwsCodeBuildProject: ").append(getAwsCodeBuildProject()).append(",");
        if (getAwsCloudFrontDistribution() != null)
            sb.append("AwsCloudFrontDistribution: ").append(getAwsCloudFrontDistribution()).append(",");
        if (getAwsEc2Instance() != null)
            sb.append("AwsEc2Instance: ").append(getAwsEc2Instance()).append(",");
        if (getAwsEc2NetworkInterface() != null)
            sb.append("AwsEc2NetworkInterface: ").append(getAwsEc2NetworkInterface()).append(",");
        if (getAwsEc2SecurityGroup() != null)
            sb.append("AwsEc2SecurityGroup: ").append(getAwsEc2SecurityGroup()).append(",");
        if (getAwsEc2Volume() != null)
            sb.append("AwsEc2Volume: ").append(getAwsEc2Volume()).append(",");
        if (getAwsEc2Vpc() != null)
            sb.append("AwsEc2Vpc: ").append(getAwsEc2Vpc()).append(",");
        if (getAwsEc2Eip() != null)
            sb.append("AwsEc2Eip: ").append(getAwsEc2Eip()).append(",");
        if (getAwsEc2Subnet() != null)
            sb.append("AwsEc2Subnet: ").append(getAwsEc2Subnet()).append(",");
        if (getAwsEc2NetworkAcl() != null)
            sb.append("AwsEc2NetworkAcl: ").append(getAwsEc2NetworkAcl()).append(",");
        if (getAwsElbv2LoadBalancer() != null)
            sb.append("AwsElbv2LoadBalancer: ").append(getAwsElbv2LoadBalancer()).append(",");
        if (getAwsElasticBeanstalkEnvironment() != null)
            sb.append("AwsElasticBeanstalkEnvironment: ").append(getAwsElasticBeanstalkEnvironment()).append(",");
        if (getAwsElasticsearchDomain() != null)
            sb.append("AwsElasticsearchDomain: ").append(getAwsElasticsearchDomain()).append(",");
        if (getAwsS3Bucket() != null)
            sb.append("AwsS3Bucket: ").append(getAwsS3Bucket()).append(",");
        if (getAwsS3AccountPublicAccessBlock() != null)
            sb.append("AwsS3AccountPublicAccessBlock: ").append(getAwsS3AccountPublicAccessBlock()).append(",");
        if (getAwsS3Object() != null)
            sb.append("AwsS3Object: ").append(getAwsS3Object()).append(",");
        if (getAwsSecretsManagerSecret() != null)
            sb.append("AwsSecretsManagerSecret: ").append(getAwsSecretsManagerSecret()).append(",");
        if (getAwsIamAccessKey() != null)
            sb.append("AwsIamAccessKey: ").append(getAwsIamAccessKey()).append(",");
        if (getAwsIamUser() != null)
            sb.append("AwsIamUser: ").append(getAwsIamUser()).append(",");
        if (getAwsIamPolicy() != null)
            sb.append("AwsIamPolicy: ").append(getAwsIamPolicy()).append(",");
        if (getAwsApiGatewayV2Stage() != null)
            sb.append("AwsApiGatewayV2Stage: ").append(getAwsApiGatewayV2Stage()).append(",");
        if (getAwsApiGatewayV2Api() != null)
            sb.append("AwsApiGatewayV2Api: ").append(getAwsApiGatewayV2Api()).append(",");
        if (getAwsDynamoDbTable() != null)
            sb.append("AwsDynamoDbTable: ").append(getAwsDynamoDbTable()).append(",");
        if (getAwsApiGatewayStage() != null)
            sb.append("AwsApiGatewayStage: ").append(getAwsApiGatewayStage()).append(",");
        if (getAwsApiGatewayRestApi() != null)
            sb.append("AwsApiGatewayRestApi: ").append(getAwsApiGatewayRestApi()).append(",");
        if (getAwsCloudTrailTrail() != null)
            sb.append("AwsCloudTrailTrail: ").append(getAwsCloudTrailTrail()).append(",");
        if (getAwsSsmPatchCompliance() != null)
            sb.append("AwsSsmPatchCompliance: ").append(getAwsSsmPatchCompliance()).append(",");
        if (getAwsCertificateManagerCertificate() != null)
            sb.append("AwsCertificateManagerCertificate: ").append(getAwsCertificateManagerCertificate()).append(",");
        if (getAwsRedshiftCluster() != null)
            sb.append("AwsRedshiftCluster: ").append(getAwsRedshiftCluster()).append(",");
        if (getAwsElbLoadBalancer() != null)
            sb.append("AwsElbLoadBalancer: ").append(getAwsElbLoadBalancer()).append(",");
        if (getAwsIamGroup() != null)
            sb.append("AwsIamGroup: ").append(getAwsIamGroup()).append(",");
        if (getAwsIamRole() != null)
            sb.append("AwsIamRole: ").append(getAwsIamRole()).append(",");
        if (getAwsKmsKey() != null)
            sb.append("AwsKmsKey: ").append(getAwsKmsKey()).append(",");
        if (getAwsLambdaFunction() != null)
            sb.append("AwsLambdaFunction: ").append(getAwsLambdaFunction()).append(",");
        if (getAwsLambdaLayerVersion() != null)
            sb.append("AwsLambdaLayerVersion: ").append(getAwsLambdaLayerVersion()).append(",");
        if (getAwsRdsDbInstance() != null)
            sb.append("AwsRdsDbInstance: ").append(getAwsRdsDbInstance()).append(",");
        if (getAwsSnsTopic() != null)
            sb.append("AwsSnsTopic: ").append(getAwsSnsTopic()).append(",");
        if (getAwsSqsQueue() != null)
            sb.append("AwsSqsQueue: ").append(getAwsSqsQueue()).append(",");
        if (getAwsWafWebAcl() != null)
            sb.append("AwsWafWebAcl: ").append(getAwsWafWebAcl()).append(",");
        if (getAwsRdsDbSnapshot() != null)
            sb.append("AwsRdsDbSnapshot: ").append(getAwsRdsDbSnapshot()).append(",");
        if (getAwsRdsDbClusterSnapshot() != null)
            sb.append("AwsRdsDbClusterSnapshot: ").append(getAwsRdsDbClusterSnapshot()).append(",");
        if (getAwsRdsDbCluster() != null)
            sb.append("AwsRdsDbCluster: ").append(getAwsRdsDbCluster()).append(",");
        if (getAwsEcsCluster() != null)
            sb.append("AwsEcsCluster: ").append(getAwsEcsCluster()).append(",");
        if (getAwsEcsTaskDefinition() != null)
            sb.append("AwsEcsTaskDefinition: ").append(getAwsEcsTaskDefinition()).append(",");
        if (getContainer() != null)
            sb.append("Container: ").append(getContainer()).append(",");
        if (getOther() != null)
            sb.append("Other: ").append(getOther()).append(",");
        if (getAwsRdsEventSubscription() != null)
            sb.append("AwsRdsEventSubscription: ").append(getAwsRdsEventSubscription()).append(",");
        if (getAwsEcsService() != null)
            sb.append("AwsEcsService: ").append(getAwsEcsService()).append(",");
        if (getAwsAutoScalingLaunchConfiguration() != null)
            sb.append("AwsAutoScalingLaunchConfiguration: ").append(getAwsAutoScalingLaunchConfiguration()).append(",");
        if (getAwsEc2VpnConnection() != null)
            sb.append("AwsEc2VpnConnection: ").append(getAwsEc2VpnConnection()).append(",");
        if (getAwsEcrContainerImage() != null)
            sb.append("AwsEcrContainerImage: ").append(getAwsEcrContainerImage()).append(",");
        if (getAwsOpenSearchServiceDomain() != null)
            sb.append("AwsOpenSearchServiceDomain: ").append(getAwsOpenSearchServiceDomain()).append(",");
        if (getAwsEc2VpcEndpointService() != null)
            sb.append("AwsEc2VpcEndpointService: ").append(getAwsEc2VpcEndpointService()).append(",");
        if (getAwsXrayEncryptionConfig() != null)
            sb.append("AwsXrayEncryptionConfig: ").append(getAwsXrayEncryptionConfig()).append(",");
        if (getAwsWafRateBasedRule() != null)
            sb.append("AwsWafRateBasedRule: ").append(getAwsWafRateBasedRule()).append(",");
        if (getAwsWafRegionalRateBasedRule() != null)
            sb.append("AwsWafRegionalRateBasedRule: ").append(getAwsWafRegionalRateBasedRule()).append(",");
        if (getAwsEcrRepository() != null)
            sb.append("AwsEcrRepository: ").append(getAwsEcrRepository()).append(",");
        if (getAwsEksCluster() != null)
            sb.append("AwsEksCluster: ").append(getAwsEksCluster());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDetails == false)
            return false;
        ResourceDetails other = (ResourceDetails) obj;
        if (other.getAwsAutoScalingAutoScalingGroup() == null ^ this.getAwsAutoScalingAutoScalingGroup() == null)
            return false;
        if (other.getAwsAutoScalingAutoScalingGroup() != null
                && other.getAwsAutoScalingAutoScalingGroup().equals(this.getAwsAutoScalingAutoScalingGroup()) == false)
            return false;
        if (other.getAwsCodeBuildProject() == null ^ this.getAwsCodeBuildProject() == null)
            return false;
        if (other.getAwsCodeBuildProject() != null && other.getAwsCodeBuildProject().equals(this.getAwsCodeBuildProject()) == false)
            return false;
        if (other.getAwsCloudFrontDistribution() == null ^ this.getAwsCloudFrontDistribution() == null)
            return false;
        if (other.getAwsCloudFrontDistribution() != null && other.getAwsCloudFrontDistribution().equals(this.getAwsCloudFrontDistribution()) == false)
            return false;
        if (other.getAwsEc2Instance() == null ^ this.getAwsEc2Instance() == null)
            return false;
        if (other.getAwsEc2Instance() != null && other.getAwsEc2Instance().equals(this.getAwsEc2Instance()) == false)
            return false;
        if (other.getAwsEc2NetworkInterface() == null ^ this.getAwsEc2NetworkInterface() == null)
            return false;
        if (other.getAwsEc2NetworkInterface() != null && other.getAwsEc2NetworkInterface().equals(this.getAwsEc2NetworkInterface()) == false)
            return false;
        if (other.getAwsEc2SecurityGroup() == null ^ this.getAwsEc2SecurityGroup() == null)
            return false;
        if (other.getAwsEc2SecurityGroup() != null && other.getAwsEc2SecurityGroup().equals(this.getAwsEc2SecurityGroup()) == false)
            return false;
        if (other.getAwsEc2Volume() == null ^ this.getAwsEc2Volume() == null)
            return false;
        if (other.getAwsEc2Volume() != null && other.getAwsEc2Volume().equals(this.getAwsEc2Volume()) == false)
            return false;
        if (other.getAwsEc2Vpc() == null ^ this.getAwsEc2Vpc() == null)
            return false;
        if (other.getAwsEc2Vpc() != null && other.getAwsEc2Vpc().equals(this.getAwsEc2Vpc()) == false)
            return false;
        if (other.getAwsEc2Eip() == null ^ this.getAwsEc2Eip() == null)
            return false;
        if (other.getAwsEc2Eip() != null && other.getAwsEc2Eip().equals(this.getAwsEc2Eip()) == false)
            return false;
        if (other.getAwsEc2Subnet() == null ^ this.getAwsEc2Subnet() == null)
            return false;
        if (other.getAwsEc2Subnet() != null && other.getAwsEc2Subnet().equals(this.getAwsEc2Subnet()) == false)
            return false;
        if (other.getAwsEc2NetworkAcl() == null ^ this.getAwsEc2NetworkAcl() == null)
            return false;
        if (other.getAwsEc2NetworkAcl() != null && other.getAwsEc2NetworkAcl().equals(this.getAwsEc2NetworkAcl()) == false)
            return false;
        if (other.getAwsElbv2LoadBalancer() == null ^ this.getAwsElbv2LoadBalancer() == null)
            return false;
        if (other.getAwsElbv2LoadBalancer() != null && other.getAwsElbv2LoadBalancer().equals(this.getAwsElbv2LoadBalancer()) == false)
            return false;
        if (other.getAwsElasticBeanstalkEnvironment() == null ^ this.getAwsElasticBeanstalkEnvironment() == null)
            return false;
        if (other.getAwsElasticBeanstalkEnvironment() != null
                && other.getAwsElasticBeanstalkEnvironment().equals(this.getAwsElasticBeanstalkEnvironment()) == false)
            return false;
        if (other.getAwsElasticsearchDomain() == null ^ this.getAwsElasticsearchDomain() == null)
            return false;
        if (other.getAwsElasticsearchDomain() != null && other.getAwsElasticsearchDomain().equals(this.getAwsElasticsearchDomain()) == false)
            return false;
        if (other.getAwsS3Bucket() == null ^ this.getAwsS3Bucket() == null)
            return false;
        if (other.getAwsS3Bucket() != null && other.getAwsS3Bucket().equals(this.getAwsS3Bucket()) == false)
            return false;
        if (other.getAwsS3AccountPublicAccessBlock() == null ^ this.getAwsS3AccountPublicAccessBlock() == null)
            return false;
        if (other.getAwsS3AccountPublicAccessBlock() != null
                && other.getAwsS3AccountPublicAccessBlock().equals(this.getAwsS3AccountPublicAccessBlock()) == false)
            return false;
        if (other.getAwsS3Object() == null ^ this.getAwsS3Object() == null)
            return false;
        if (other.getAwsS3Object() != null && other.getAwsS3Object().equals(this.getAwsS3Object()) == false)
            return false;
        if (other.getAwsSecretsManagerSecret() == null ^ this.getAwsSecretsManagerSecret() == null)
            return false;
        if (other.getAwsSecretsManagerSecret() != null && other.getAwsSecretsManagerSecret().equals(this.getAwsSecretsManagerSecret()) == false)
            return false;
        if (other.getAwsIamAccessKey() == null ^ this.getAwsIamAccessKey() == null)
            return false;
        if (other.getAwsIamAccessKey() != null && other.getAwsIamAccessKey().equals(this.getAwsIamAccessKey()) == false)
            return false;
        if (other.getAwsIamUser() == null ^ this.getAwsIamUser() == null)
            return false;
        if (other.getAwsIamUser() != null && other.getAwsIamUser().equals(this.getAwsIamUser()) == false)
            return false;
        if (other.getAwsIamPolicy() == null ^ this.getAwsIamPolicy() == null)
            return false;
        if (other.getAwsIamPolicy() != null && other.getAwsIamPolicy().equals(this.getAwsIamPolicy()) == false)
            return false;
        if (other.getAwsApiGatewayV2Stage() == null ^ this.getAwsApiGatewayV2Stage() == null)
            return false;
        if (other.getAwsApiGatewayV2Stage() != null && other.getAwsApiGatewayV2Stage().equals(this.getAwsApiGatewayV2Stage()) == false)
            return false;
        if (other.getAwsApiGatewayV2Api() == null ^ this.getAwsApiGatewayV2Api() == null)
            return false;
        if (other.getAwsApiGatewayV2Api() != null && other.getAwsApiGatewayV2Api().equals(this.getAwsApiGatewayV2Api()) == false)
            return false;
        if (other.getAwsDynamoDbTable() == null ^ this.getAwsDynamoDbTable() == null)
            return false;
        if (other.getAwsDynamoDbTable() != null && other.getAwsDynamoDbTable().equals(this.getAwsDynamoDbTable()) == false)
            return false;
        if (other.getAwsApiGatewayStage() == null ^ this.getAwsApiGatewayStage() == null)
            return false;
        if (other.getAwsApiGatewayStage() != null && other.getAwsApiGatewayStage().equals(this.getAwsApiGatewayStage()) == false)
            return false;
        if (other.getAwsApiGatewayRestApi() == null ^ this.getAwsApiGatewayRestApi() == null)
            return false;
        if (other.getAwsApiGatewayRestApi() != null && other.getAwsApiGatewayRestApi().equals(this.getAwsApiGatewayRestApi()) == false)
            return false;
        if (other.getAwsCloudTrailTrail() == null ^ this.getAwsCloudTrailTrail() == null)
            return false;
        if (other.getAwsCloudTrailTrail() != null && other.getAwsCloudTrailTrail().equals(this.getAwsCloudTrailTrail()) == false)
            return false;
        if (other.getAwsSsmPatchCompliance() == null ^ this.getAwsSsmPatchCompliance() == null)
            return false;
        if (other.getAwsSsmPatchCompliance() != null && other.getAwsSsmPatchCompliance().equals(this.getAwsSsmPatchCompliance()) == false)
            return false;
        if (other.getAwsCertificateManagerCertificate() == null ^ this.getAwsCertificateManagerCertificate() == null)
            return false;
        if (other.getAwsCertificateManagerCertificate() != null
                && other.getAwsCertificateManagerCertificate().equals(this.getAwsCertificateManagerCertificate()) == false)
            return false;
        if (other.getAwsRedshiftCluster() == null ^ this.getAwsRedshiftCluster() == null)
            return false;
        if (other.getAwsRedshiftCluster() != null && other.getAwsRedshiftCluster().equals(this.getAwsRedshiftCluster()) == false)
            return false;
        if (other.getAwsElbLoadBalancer() == null ^ this.getAwsElbLoadBalancer() == null)
            return false;
        if (other.getAwsElbLoadBalancer() != null && other.getAwsElbLoadBalancer().equals(this.getAwsElbLoadBalancer()) == false)
            return false;
        if (other.getAwsIamGroup() == null ^ this.getAwsIamGroup() == null)
            return false;
        if (other.getAwsIamGroup() != null && other.getAwsIamGroup().equals(this.getAwsIamGroup()) == false)
            return false;
        if (other.getAwsIamRole() == null ^ this.getAwsIamRole() == null)
            return false;
        if (other.getAwsIamRole() != null && other.getAwsIamRole().equals(this.getAwsIamRole()) == false)
            return false;
        if (other.getAwsKmsKey() == null ^ this.getAwsKmsKey() == null)
            return false;
        if (other.getAwsKmsKey() != null && other.getAwsKmsKey().equals(this.getAwsKmsKey()) == false)
            return false;
        if (other.getAwsLambdaFunction() == null ^ this.getAwsLambdaFunction() == null)
            return false;
        if (other.getAwsLambdaFunction() != null && other.getAwsLambdaFunction().equals(this.getAwsLambdaFunction()) == false)
            return false;
        if (other.getAwsLambdaLayerVersion() == null ^ this.getAwsLambdaLayerVersion() == null)
            return false;
        if (other.getAwsLambdaLayerVersion() != null && other.getAwsLambdaLayerVersion().equals(this.getAwsLambdaLayerVersion()) == false)
            return false;
        if (other.getAwsRdsDbInstance() == null ^ this.getAwsRdsDbInstance() == null)
            return false;
        if (other.getAwsRdsDbInstance() != null && other.getAwsRdsDbInstance().equals(this.getAwsRdsDbInstance()) == false)
            return false;
        if (other.getAwsSnsTopic() == null ^ this.getAwsSnsTopic() == null)
            return false;
        if (other.getAwsSnsTopic() != null && other.getAwsSnsTopic().equals(this.getAwsSnsTopic()) == false)
            return false;
        if (other.getAwsSqsQueue() == null ^ this.getAwsSqsQueue() == null)
            return false;
        if (other.getAwsSqsQueue() != null && other.getAwsSqsQueue().equals(this.getAwsSqsQueue()) == false)
            return false;
        if (other.getAwsWafWebAcl() == null ^ this.getAwsWafWebAcl() == null)
            return false;
        if (other.getAwsWafWebAcl() != null && other.getAwsWafWebAcl().equals(this.getAwsWafWebAcl()) == false)
            return false;
        if (other.getAwsRdsDbSnapshot() == null ^ this.getAwsRdsDbSnapshot() == null)
            return false;
        if (other.getAwsRdsDbSnapshot() != null && other.getAwsRdsDbSnapshot().equals(this.getAwsRdsDbSnapshot()) == false)
            return false;
        if (other.getAwsRdsDbClusterSnapshot() == null ^ this.getAwsRdsDbClusterSnapshot() == null)
            return false;
        if (other.getAwsRdsDbClusterSnapshot() != null && other.getAwsRdsDbClusterSnapshot().equals(this.getAwsRdsDbClusterSnapshot()) == false)
            return false;
        if (other.getAwsRdsDbCluster() == null ^ this.getAwsRdsDbCluster() == null)
            return false;
        if (other.getAwsRdsDbCluster() != null && other.getAwsRdsDbCluster().equals(this.getAwsRdsDbCluster()) == false)
            return false;
        if (other.getAwsEcsCluster() == null ^ this.getAwsEcsCluster() == null)
            return false;
        if (other.getAwsEcsCluster() != null && other.getAwsEcsCluster().equals(this.getAwsEcsCluster()) == false)
            return false;
        if (other.getAwsEcsTaskDefinition() == null ^ this.getAwsEcsTaskDefinition() == null)
            return false;
        if (other.getAwsEcsTaskDefinition() != null && other.getAwsEcsTaskDefinition().equals(this.getAwsEcsTaskDefinition()) == false)
            return false;
        if (other.getContainer() == null ^ this.getContainer() == null)
            return false;
        if (other.getContainer() != null && other.getContainer().equals(this.getContainer()) == false)
            return false;
        if (other.getOther() == null ^ this.getOther() == null)
            return false;
        if (other.getOther() != null && other.getOther().equals(this.getOther()) == false)
            return false;
        if (other.getAwsRdsEventSubscription() == null ^ this.getAwsRdsEventSubscription() == null)
            return false;
        if (other.getAwsRdsEventSubscription() != null && other.getAwsRdsEventSubscription().equals(this.getAwsRdsEventSubscription()) == false)
            return false;
        if (other.getAwsEcsService() == null ^ this.getAwsEcsService() == null)
            return false;
        if (other.getAwsEcsService() != null && other.getAwsEcsService().equals(this.getAwsEcsService()) == false)
            return false;
        if (other.getAwsAutoScalingLaunchConfiguration() == null ^ this.getAwsAutoScalingLaunchConfiguration() == null)
            return false;
        if (other.getAwsAutoScalingLaunchConfiguration() != null
                && other.getAwsAutoScalingLaunchConfiguration().equals(this.getAwsAutoScalingLaunchConfiguration()) == false)
            return false;
        if (other.getAwsEc2VpnConnection() == null ^ this.getAwsEc2VpnConnection() == null)
            return false;
        if (other.getAwsEc2VpnConnection() != null && other.getAwsEc2VpnConnection().equals(this.getAwsEc2VpnConnection()) == false)
            return false;
        if (other.getAwsEcrContainerImage() == null ^ this.getAwsEcrContainerImage() == null)
            return false;
        if (other.getAwsEcrContainerImage() != null && other.getAwsEcrContainerImage().equals(this.getAwsEcrContainerImage()) == false)
            return false;
        if (other.getAwsOpenSearchServiceDomain() == null ^ this.getAwsOpenSearchServiceDomain() == null)
            return false;
        if (other.getAwsOpenSearchServiceDomain() != null && other.getAwsOpenSearchServiceDomain().equals(this.getAwsOpenSearchServiceDomain()) == false)
            return false;
        if (other.getAwsEc2VpcEndpointService() == null ^ this.getAwsEc2VpcEndpointService() == null)
            return false;
        if (other.getAwsEc2VpcEndpointService() != null && other.getAwsEc2VpcEndpointService().equals(this.getAwsEc2VpcEndpointService()) == false)
            return false;
        if (other.getAwsXrayEncryptionConfig() == null ^ this.getAwsXrayEncryptionConfig() == null)
            return false;
        if (other.getAwsXrayEncryptionConfig() != null && other.getAwsXrayEncryptionConfig().equals(this.getAwsXrayEncryptionConfig()) == false)
            return false;
        if (other.getAwsWafRateBasedRule() == null ^ this.getAwsWafRateBasedRule() == null)
            return false;
        if (other.getAwsWafRateBasedRule() != null && other.getAwsWafRateBasedRule().equals(this.getAwsWafRateBasedRule()) == false)
            return false;
        if (other.getAwsWafRegionalRateBasedRule() == null ^ this.getAwsWafRegionalRateBasedRule() == null)
            return false;
        if (other.getAwsWafRegionalRateBasedRule() != null && other.getAwsWafRegionalRateBasedRule().equals(this.getAwsWafRegionalRateBasedRule()) == false)
            return false;
        if (other.getAwsEcrRepository() == null ^ this.getAwsEcrRepository() == null)
            return false;
        if (other.getAwsEcrRepository() != null && other.getAwsEcrRepository().equals(this.getAwsEcrRepository()) == false)
            return false;
        if (other.getAwsEksCluster() == null ^ this.getAwsEksCluster() == null)
            return false;
        if (other.getAwsEksCluster() != null && other.getAwsEksCluster().equals(this.getAwsEksCluster()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAutoScalingAutoScalingGroup() == null) ? 0 : getAwsAutoScalingAutoScalingGroup().hashCode());
        hashCode = prime * hashCode + ((getAwsCodeBuildProject() == null) ? 0 : getAwsCodeBuildProject().hashCode());
        hashCode = prime * hashCode + ((getAwsCloudFrontDistribution() == null) ? 0 : getAwsCloudFrontDistribution().hashCode());
        hashCode = prime * hashCode + ((getAwsEc2Instance() == null) ? 0 : getAwsEc2Instance().hashCode());
        hashCode = prime * hashCode + ((getAwsEc2NetworkInterface() == null) ? 0 : getAwsEc2NetworkInterface().hashCode());
        hashCode = prime * hashCode + ((getAwsEc2SecurityGroup() == null) ? 0 : getAwsEc2SecurityGroup().hashCode());
        hashCode = prime * hashCode + ((getAwsEc2Volume() == null) ? 0 : getAwsEc2Volume().hashCode());
        hashCode = prime * hashCode + ((getAwsEc2Vpc() == null) ? 0 : getAwsEc2Vpc().hashCode());
        hashCode = prime * hashCode + ((getAwsEc2Eip() == null) ? 0 : getAwsEc2Eip().hashCode());
        hashCode = prime * hashCode + ((getAwsEc2Subnet() == null) ? 0 : getAwsEc2Subnet().hashCode());
        hashCode = prime * hashCode + ((getAwsEc2NetworkAcl() == null) ? 0 : getAwsEc2NetworkAcl().hashCode());
        hashCode = prime * hashCode + ((getAwsElbv2LoadBalancer() == null) ? 0 : getAwsElbv2LoadBalancer().hashCode());
        hashCode = prime * hashCode + ((getAwsElasticBeanstalkEnvironment() == null) ? 0 : getAwsElasticBeanstalkEnvironment().hashCode());
        hashCode = prime * hashCode + ((getAwsElasticsearchDomain() == null) ? 0 : getAwsElasticsearchDomain().hashCode());
        hashCode = prime * hashCode + ((getAwsS3Bucket() == null) ? 0 : getAwsS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getAwsS3AccountPublicAccessBlock() == null) ? 0 : getAwsS3AccountPublicAccessBlock().hashCode());
        hashCode = prime * hashCode + ((getAwsS3Object() == null) ? 0 : getAwsS3Object().hashCode());
        hashCode = prime * hashCode + ((getAwsSecretsManagerSecret() == null) ? 0 : getAwsSecretsManagerSecret().hashCode());
        hashCode = prime * hashCode + ((getAwsIamAccessKey() == null) ? 0 : getAwsIamAccessKey().hashCode());
        hashCode = prime * hashCode + ((getAwsIamUser() == null) ? 0 : getAwsIamUser().hashCode());
        hashCode = prime * hashCode + ((getAwsIamPolicy() == null) ? 0 : getAwsIamPolicy().hashCode());
        hashCode = prime * hashCode + ((getAwsApiGatewayV2Stage() == null) ? 0 : getAwsApiGatewayV2Stage().hashCode());
        hashCode = prime * hashCode + ((getAwsApiGatewayV2Api() == null) ? 0 : getAwsApiGatewayV2Api().hashCode());
        hashCode = prime * hashCode + ((getAwsDynamoDbTable() == null) ? 0 : getAwsDynamoDbTable().hashCode());
        hashCode = prime * hashCode + ((getAwsApiGatewayStage() == null) ? 0 : getAwsApiGatewayStage().hashCode());
        hashCode = prime * hashCode + ((getAwsApiGatewayRestApi() == null) ? 0 : getAwsApiGatewayRestApi().hashCode());
        hashCode = prime * hashCode + ((getAwsCloudTrailTrail() == null) ? 0 : getAwsCloudTrailTrail().hashCode());
        hashCode = prime * hashCode + ((getAwsSsmPatchCompliance() == null) ? 0 : getAwsSsmPatchCompliance().hashCode());
        hashCode = prime * hashCode + ((getAwsCertificateManagerCertificate() == null) ? 0 : getAwsCertificateManagerCertificate().hashCode());
        hashCode = prime * hashCode + ((getAwsRedshiftCluster() == null) ? 0 : getAwsRedshiftCluster().hashCode());
        hashCode = prime * hashCode + ((getAwsElbLoadBalancer() == null) ? 0 : getAwsElbLoadBalancer().hashCode());
        hashCode = prime * hashCode + ((getAwsIamGroup() == null) ? 0 : getAwsIamGroup().hashCode());
        hashCode = prime * hashCode + ((getAwsIamRole() == null) ? 0 : getAwsIamRole().hashCode());
        hashCode = prime * hashCode + ((getAwsKmsKey() == null) ? 0 : getAwsKmsKey().hashCode());
        hashCode = prime * hashCode + ((getAwsLambdaFunction() == null) ? 0 : getAwsLambdaFunction().hashCode());
        hashCode = prime * hashCode + ((getAwsLambdaLayerVersion() == null) ? 0 : getAwsLambdaLayerVersion().hashCode());
        hashCode = prime * hashCode + ((getAwsRdsDbInstance() == null) ? 0 : getAwsRdsDbInstance().hashCode());
        hashCode = prime * hashCode + ((getAwsSnsTopic() == null) ? 0 : getAwsSnsTopic().hashCode());
        hashCode = prime * hashCode + ((getAwsSqsQueue() == null) ? 0 : getAwsSqsQueue().hashCode());
        hashCode = prime * hashCode + ((getAwsWafWebAcl() == null) ? 0 : getAwsWafWebAcl().hashCode());
        hashCode = prime * hashCode + ((getAwsRdsDbSnapshot() == null) ? 0 : getAwsRdsDbSnapshot().hashCode());
        hashCode = prime * hashCode + ((getAwsRdsDbClusterSnapshot() == null) ? 0 : getAwsRdsDbClusterSnapshot().hashCode());
        hashCode = prime * hashCode + ((getAwsRdsDbCluster() == null) ? 0 : getAwsRdsDbCluster().hashCode());
        hashCode = prime * hashCode + ((getAwsEcsCluster() == null) ? 0 : getAwsEcsCluster().hashCode());
        hashCode = prime * hashCode + ((getAwsEcsTaskDefinition() == null) ? 0 : getAwsEcsTaskDefinition().hashCode());
        hashCode = prime * hashCode + ((getContainer() == null) ? 0 : getContainer().hashCode());
        hashCode = prime * hashCode + ((getOther() == null) ? 0 : getOther().hashCode());
        hashCode = prime * hashCode + ((getAwsRdsEventSubscription() == null) ? 0 : getAwsRdsEventSubscription().hashCode());
        hashCode = prime * hashCode + ((getAwsEcsService() == null) ? 0 : getAwsEcsService().hashCode());
        hashCode = prime * hashCode + ((getAwsAutoScalingLaunchConfiguration() == null) ? 0 : getAwsAutoScalingLaunchConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAwsEc2VpnConnection() == null) ? 0 : getAwsEc2VpnConnection().hashCode());
        hashCode = prime * hashCode + ((getAwsEcrContainerImage() == null) ? 0 : getAwsEcrContainerImage().hashCode());
        hashCode = prime * hashCode + ((getAwsOpenSearchServiceDomain() == null) ? 0 : getAwsOpenSearchServiceDomain().hashCode());
        hashCode = prime * hashCode + ((getAwsEc2VpcEndpointService() == null) ? 0 : getAwsEc2VpcEndpointService().hashCode());
        hashCode = prime * hashCode + ((getAwsXrayEncryptionConfig() == null) ? 0 : getAwsXrayEncryptionConfig().hashCode());
        hashCode = prime * hashCode + ((getAwsWafRateBasedRule() == null) ? 0 : getAwsWafRateBasedRule().hashCode());
        hashCode = prime * hashCode + ((getAwsWafRegionalRateBasedRule() == null) ? 0 : getAwsWafRegionalRateBasedRule().hashCode());
        hashCode = prime * hashCode + ((getAwsEcrRepository() == null) ? 0 : getAwsEcrRepository().hashCode());
        hashCode = prime * hashCode + ((getAwsEksCluster() == null) ? 0 : getAwsEksCluster().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDetails clone() {
        try {
            return (ResourceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ResourceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

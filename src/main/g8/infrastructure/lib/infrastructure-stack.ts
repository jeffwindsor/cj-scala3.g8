import * as cdk from '@aws-cdk/core';
import * as logs from '@aws-cdk/aws-logs';

export class InfrastructureStack extends cdk.Stack {
  constructor(scope: cdk.Construct, id: string, props?: cdk.StackProps) {
    super(scope, id, props);


    const logGroup = new logs.LogGroup(this, 'logs', {retention: logs.RetentionDays.ONE_YEAR});

  }
}

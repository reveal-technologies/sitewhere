package com.sitewhere.tenant.grpc;

import com.sitewhere.microservice.grpc.ManagedGrpcServer;
import com.sitewhere.microservice.spi.IMicroservice;
import com.sitewhere.spi.tenant.ITenantManagement;
import com.sitewhere.tenant.spi.grpc.ITenantManagementGrpcServer;

/**
 * Hosts a GRPC server that handles tenant management requests.
 * 
 * @author Derek
 */
public class TenantManagementGrpcServer extends ManagedGrpcServer implements ITenantManagementGrpcServer {

    public TenantManagementGrpcServer(IMicroservice microservice, ITenantManagement tenantManagement) {
	super(microservice, new TenantManagementImpl(tenantManagement));
    }
}
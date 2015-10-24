/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.web.rest.documentation;

import java.util.ArrayList;
import java.util.List;

import com.sitewhere.rest.model.user.request.GrantedAuthorityCreateRequest;
import com.sitewhere.spi.SiteWhereException;
import com.sitewhere.spi.user.IGrantedAuthority;

/**
 * Example of REST request for interacting with user authorities.
 * 
 * @author Derek
 */
public class Authorities {

	public static class CreateAuthorityRequest extends GrantedAuthorityCreateRequest {

		public CreateAuthorityRequest() throws SiteWhereException {
			setAuthority(ExampleData.AUTH_ADMIN_SITES.getAuthority());
			setDescription(ExampleData.AUTH_ADMIN_SITES.getDescription());
		}
	}

	public static class CreateAuthorityResponse {

		public Object generate() throws SiteWhereException {
			return ExampleData.AUTH_ADMIN_SITES;
		}
	}

	public static class ListAuthoritiesResponse {

		public Object generate() throws SiteWhereException {
			List<IGrantedAuthority> auths = new ArrayList<IGrantedAuthority>();
			auths.add(ExampleData.AUTH_ADMIN_SITES);
			auths.add(ExampleData.AUTH_ADMIN_USERS);
			return auths;
		}
	}
}
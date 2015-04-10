package com.lighting.service.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.stereotype.Service;

import com.lighting.service.service.IAuthService;

/***
 * 权限service
 * @author changhao
 *
 */
@Service("authService")
public class AuthService implements IAuthService
{

	/***
	 * 通过权限id获取spring security权限配置
	 * 
	 * @param id 权限id
	 */
	public Collection<GrantedAuthority> getGrantedAuthorityById(String id)
	{
		Collection<GrantedAuthority> grantedAuthoritys = new ArrayList<GrantedAuthority>();
		
		grantedAuthoritys.add(new GrantedAuthorityImpl("ROLE_ADMIN"));
		
		return grantedAuthoritys;
	}

}

package com.lighting.service.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;


public interface IAuthService
{
	Collection<GrantedAuthority> getGrantedAuthorityById(String id);
}

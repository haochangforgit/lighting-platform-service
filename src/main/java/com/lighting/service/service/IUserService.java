package com.lighting.service.service;

import com.lighting.platform.base.entity.User;


/**
 * 用户业务接口
 * @author changhao
 *
 */
public interface IUserService
{
	
	/***
	 * 通过用户名及密码查找用户
	 * @param loginName
	 * @param password
	 * @return 如未找到直接返回null
	 */
	User getByLoginNameAndPwd(String loginName,String password);

}

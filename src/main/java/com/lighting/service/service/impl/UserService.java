package com.lighting.service.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lighting.platform.base.entity.User;
import com.lighting.service.dao.UserDao;
import com.lighting.service.service.IUserService;

/**
 * 用户业务类
 * @author changhao
 *
 */
@Service("userService")
public class UserService implements IUserService
{
	
	@Autowired
	private UserDao userDao;

	/***
	 * 通过用户名及密码查找用户
	 * @param loginName
	 * @param password
	 * @return 如未找到直接返回null
	 */
	public User getByLoginNameAndPwd(String loginName, String password)
	{
		return userDao.getByLoginNameAndPwd(loginName, password);
	}
}

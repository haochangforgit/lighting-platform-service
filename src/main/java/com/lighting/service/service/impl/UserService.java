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
	 * 通过 id 获取实体bean
	 * @param id
	 * @return
	 */
	public User getById(String id)
	{
		return userDao.get(id);
	}
}

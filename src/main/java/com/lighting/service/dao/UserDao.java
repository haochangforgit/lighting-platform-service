package com.lighting.service.dao;


import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lighting.platform.base.dao.HibernateDao;
import com.lighting.platform.base.entity.User;

/**
 * 用户数据库访问类
 * 
 * @author changhao
 *
 */
@Repository
@Transactional(rollbackFor = RuntimeException.class)
public class UserDao extends HibernateDao<User, String>
{
	/***
	 * 通过用户名及密码查找用户
	 * @param loginName
	 * @param password
	 * @return 如未找到直接返回null
	 */
	public User getByLoginNameAndPwd(String loginName,String password)
	{
		return findUnique("from User where loginName = ? and password = ? ", loginName,DigestUtils.md5Hex(password));
	}
}

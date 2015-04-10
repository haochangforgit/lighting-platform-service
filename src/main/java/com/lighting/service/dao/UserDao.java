package com.lighting.service.dao;


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
	public User getUserById(String id)
	{
		return get(id);
	}
}

package com.lighting.service.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lighting.platform.base.dao.HibernateDao;
import com.lighting.platform.base.entity.User;

@Repository
@Transactional(rollbackFor = RuntimeException.class)
public class RoleDao  extends HibernateDao<User, String>
{

}

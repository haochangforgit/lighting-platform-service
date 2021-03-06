package com.lighting.service.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lighting.platform.base.dao.HibernateDao;
import com.lighting.platform.base.entity.Auth;

@Repository
@Transactional(rollbackFor = RuntimeException.class)
public class AuthDao extends HibernateDao<Auth, String>
{

}

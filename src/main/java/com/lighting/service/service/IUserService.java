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
	 * 通过 id 获取实体bean
	 * @param id
	 * @return
	 */
	User getById(String id);
}

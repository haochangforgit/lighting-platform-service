package com.lighting.service.service;

import java.util.List;

import com.lighting.platform.base.entity.Menu;


/**
 * 用户业务接口
 * @author changhao
 *
 */
public interface IMenuService
{
	/***
	 * 分页查询菜单
	 * @param menu
	 * @return
	 */
	List<Menu> queryMenus(Menu menu);
}

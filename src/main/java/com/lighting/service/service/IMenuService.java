package com.lighting.service.service;

import com.lighting.platform.base.dao.Page;
import com.lighting.platform.base.dao.PageConfig;
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
	Page<Menu> pageQueryMenus(Menu menu,PageConfig pageConfig);
}

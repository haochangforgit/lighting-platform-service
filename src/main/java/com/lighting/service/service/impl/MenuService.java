package com.lighting.service.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lighting.platform.base.entity.Menu;
import com.lighting.service.dao.MenuDao;
import com.lighting.service.service.IMenuService;

/***
 * 权限service
 * @author changhao
 *
 */
@Service("menuService")
@Transactional(rollbackFor = Exception.class)
public class MenuService implements IMenuService
{
	
	@Autowired
	private MenuDao menuDao;
	
	
	/***
	 * 分页查询菜单
	 * @param menu
	 * @return
	 */
	public List<Menu> queryMenus(Menu menu)
	{
		return menuDao.queryMenus(menu);
	}
}

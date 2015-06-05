package com.lighting.service.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lighting.platform.base.dao.HibernateDao;
import com.lighting.platform.base.entity.Menu;

@Repository
@Transactional(rollbackFor = RuntimeException.class)
public class MenuDao extends HibernateDao<Menu, String>
{
	
	/***
	 * 分页查询菜单
	 * @param menu
	 * @return
	 */
	public List<Menu> queryMenus(Menu menu)
	{
		StringBuilder hql = new StringBuilder("from Menu m where 1 = 1");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		//菜单名称
		if(StringUtils.isNoneBlank(menu.getMenuName()))
		{
			hql.append(" m.menuName = :menuName");
			paramMap.put("menuName", menu.getMenuName());
		}
		
		//父级菜单Id
		if(StringUtils.isNoneBlank(menu.getSupMenuId()))
		{
			hql.append(" m.supMenuId = :supMenuId");
			paramMap.put("supMenuId", menu.getSupMenuId());
		}
		
		//父级菜单名
		if(StringUtils.isNoneBlank(menu.getSupMenuName()))
		{
			hql.append(" m.supMenuName = :supMenuName");
			paramMap.put("supMenuName", menu.getSupMenuName());
		}
		
		//url
		if(StringUtils.isNoneBlank(menu.getMenuUrl()))
		{
			hql.append(" m.menuUrl = :menuUrl");
			paramMap.put("menuUrl", menu.getMenuUrl());
		}
		
		//是否可用
		if(StringUtils.isNoneBlank(menu.getMenuFlag()))
		{
			hql.append(" m.menuFlag = :menuFlag");
			paramMap.put("menuFlag", menu.getMenuFlag());
		}
		
		//排序
		if(StringUtils.isNoneBlank(menu.getOrderNo()))
		{
			hql.append(" m.orderNo = :orderNo");
			paramMap.put("orderNo", menu.getOrderNo());
		}
		
		//是否叶子节点
		if(StringUtils.isNoneBlank(menu.getIsLeaf()))
		{
			hql.append(" m.isLeaf = :isLeaf");
			paramMap.put("isLeaf", menu.getIsLeaf());
		}
		
		return super.find(hql.toString(), paramMap);
	}
}

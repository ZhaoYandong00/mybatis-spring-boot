package com.zyd.springboot.service;

import java.util.List;

import com.zyd.simple.model.SysUser;

public interface UserService {
	/**
	 * 通过Id查询
	 * 
	 * @param id
	 * @return
	 */
	SysUser findById(Long id);

	/**
	 * 查询全部用户
	 * 
	 * @return
	 */
	List<SysUser> findAll();
}

package com.zyd.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyd.simple.mapper.UserMapper;
import com.zyd.simple.model.SysUser;
import com.zyd.springboot.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public SysUser findById(Long id) {
		return userMapper.selectById(id);
	}

	@Override
	public List<SysUser> findAll() {
		return userMapper.selectAll();
	}

}

package com.zyd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zyd.simple.model.SysUser;
import com.zyd.springboot.service.UserService;
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("users/{id}")
	SysUser user(@PathVariable("id")Long id){
		return userService.findById(id);
	}
	@RequestMapping("users")
	List<SysUser> users(){
		return userService.findAll();
	}
}

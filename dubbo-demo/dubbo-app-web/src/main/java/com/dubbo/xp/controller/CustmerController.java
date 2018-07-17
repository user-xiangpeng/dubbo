package com.dubbo.xp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dubbo.xp.IDubboRemoteService;

@RequestMapping("dubbo/service")
@RestController
public class CustmerController {
	
	@Autowired
	private IDubboRemoteService demoService;
	
	@RequestMapping("test")
	public String test(String name) {
		return "test";
	}
	
	@RequestMapping("hi")
	public String sayHi(String name) {
		demoService.sayHi(name);
		return "success";
	}

		
}

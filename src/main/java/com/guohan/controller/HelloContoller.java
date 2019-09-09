package com.guohan.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guohan.pojo.IMoocJSONResult;
import com.guohan.pojo.User;

@RestController
public class HelloContoller {

//	@Autowired
//	private Resource resource;
//	
	@RequestMapping("/hello")
	public Object hello() {
		return "hello springboot~~";
	}
	
	@RequestMapping("/getResource")
	public IMoocJSONResult getResource() {
		
//		Resource bean = new Resource();
//		BeanUtils.copyProperties(resource, bean);
//		
		User u = new User();
		u.setAge(18);
		u.setBirthday(new Date());
		u.setDesc(null);
		u.setName("Alex");
		u.setPassword("123456");
		
		return IMoocJSONResult.ok(u);
	}
	
}

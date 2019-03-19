package com.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户
 * 
 * @author aisino
 *
 */
@RestController
@RequestMapping("user")
public class UserController {

	@Value("${server.port}")
	private Integer port;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@PostMapping("getUser")
	public String getUser(String name) {
		logger.info("请求端口{}的用户{}", port, name);
		try {
			//暂停10秒
			Thread.sleep(1000 * 10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "请求端口" + port + "的用户" + name;
	}

}

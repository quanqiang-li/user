package com.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.UserDTO;
import vo.UserVO;

/**
 * 注册
 * 
 * @author aisino
 *
 */
@RestController
public class RegisterController {

	@Value("${server.port}")
	private Integer port;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@PostMapping("register")
	public UserVO register(UserDTO userDTO) {
		logger.info("请求端口{}的注册{}", port, userDTO.toString());
		// 1.验证短信验证码
		// 2.验证手机号是否存在
		// 3.用户表添加记录,注册成功
		UserVO vo = new UserVO();
		vo.setCode(UserVO.CODE_SUCCESS);
		return vo;
	}
}

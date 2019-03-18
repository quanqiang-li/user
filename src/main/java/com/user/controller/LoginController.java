package com.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.UserDTO;
import vo.UserVO;

/**
 * 登录
 * 
 * @author aisino
 *
 */
@RestController
public class LoginController {

	@Value("${server.port}")
	private Integer port;
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@PostMapping("login")
	public UserVO login(UserDTO userDTO) {
		logger.info("请求端口{}的登录{}", port, userDTO.toString());
		// 1.验证短信验证码
		// 2.验证手机号是否登录过
		// 3.登录成功,记录登录历史,生成token,token对应的用户信息缓存到redis,返给前端token
		UserVO vo = new UserVO();
		vo.setCode(UserVO.CODE_SUCCESS);
		vo.setToken("1qaz2wsx3edc4rfc5tgb");
		return vo;
	}

	/**
	 * 根据token获取用户信息
	 * 
	 * @param token
	 * @return
	 */
	@GetMapping("getUserInfo")
	public UserDTO getUserInfo(String token) {
		logger.info("请求端口{}的用户信息{}", port, token);
		// 1. 从redis获取用户信息
		UserDTO dto = new UserDTO();
		dto.setMobile("15910756898");
		dto.setNickname("carl");
		return dto;
	}
}

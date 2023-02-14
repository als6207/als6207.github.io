package com.mcnc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mcnc.domain.UserInfo;
import com.mcnc.service.UserInfoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/userinfo")
@RequiredArgsConstructor
public class AuthController {
	
	private final UserInfoService userinfoService;
	
	@RequestMapping(value = "/regist", method= {RequestMethod.POST})
	public int insertUserInfo(@RequestBody UserInfo userinfo , HttpSession session)throws Exception{	
			int result = userinfoService.insertUser(userinfo);
			return result;
		
	}
	

}

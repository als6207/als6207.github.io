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
@RequiredArgsConstructor
@RequestMapping("api/userinfo")
public class AuthController {
	
	private final UserInfoService userinfoService;
	
	@RequestMapping(value = "/api/regist", method= {RequestMethod.POST})
	public String insertUserInfo(@RequestBody UserInfo userinfo )throws Exception{
		try {
			
		}catch(Exception ex){
			
		}
		return null;
	}
	

}

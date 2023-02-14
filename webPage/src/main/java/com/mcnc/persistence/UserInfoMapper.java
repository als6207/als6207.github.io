package com.mcnc.persistence;

import org.springframework.stereotype.Repository;

import com.mcnc.domain.UserInfo;

@Repository
public interface UserInfoMapper {
	
	UserInfo getUserInfo(String id) ;

	int insertUserInfo(UserInfo userinfo);
	
	int updateUserInfo(UserInfo userinfo);
	int deleteUserInfo(UserInfo userinfo);
}

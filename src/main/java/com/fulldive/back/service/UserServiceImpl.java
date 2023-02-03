package com.fulldive.back.service;

import com.fulldive.back.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserServiceImpl {
	List<UserEntity> userLogin(Map<String, String> params);
	
	int userJoin(Map<String, Object> params);
	
	List<UserEntity> userJoinIdChk(Map<String, Object> params);
	
	int userUpdate(Map<String, Object> params);
	int userDelete(Map<String, Object> params);
	List<UserEntity> userInfo(Map<String, Object> params);
	List<UserEntity> findExistUser(Map<String, Object> params);
}

package com.fulldive.back.service;

import com.fulldive.back.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface LandingServiceImpl {
	int userLanding (Map<String, Object> params);
	List<Object> chkLandingUser(Map<String, Object> params);
}

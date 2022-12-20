package com.fulldive.back.service;

import java.util.Map;

public interface FollowServiceImpl {

	int followInsert(Map<String, Object> params);
	int followUpdate(Map<String, Object> params);
	int followDelete(Map<String, Object> params);
}

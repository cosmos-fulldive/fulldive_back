package com.fulldive.back.store;

import java.util.Map;

public interface FollowStoreImpl {
	
	int followInsert(Map<String, Object> params);
	int followUpdate(Map<String, Object> params);
	int followDelete(Map<String, Object> params);
	
}

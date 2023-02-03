package com.fulldive.back.store;

import com.fulldive.back.entity.FollowEntity;

import java.util.List;
import java.util.Map;

public interface FollowStoreImpl {
	
	int followInsert(Map<String, Object> params);
	int followUpdate(Map<String, Object> params);
	int followDelete(Map<String, Object> params);
	List<FollowEntity> findFollowArtistUser(Map<String, Object> params);
	
}

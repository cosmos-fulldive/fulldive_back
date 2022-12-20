package com.fulldive.back.service;


import com.fulldive.back.store.FollowStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class FollowService implements FollowServiceImpl {

	@Autowired
    private FollowStore followStore;


	@Override
	public int followInsert(Map<String, Object> params) {
		return followStore.followInsert(params);
	}


	@Override
	public int followUpdate(Map<String, Object> params) {
		return followStore.followUpdate(params);
	}


	@Override
	public int followDelete(Map<String, Object> params) {
		return followStore.followDelete(params);
	}

	

}

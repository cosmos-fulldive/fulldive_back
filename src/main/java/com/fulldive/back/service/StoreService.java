package com.fulldive.back.service;

import com.fulldive.back.store.StoreStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class StoreService implements StoreServiceImpl {
	
	@Autowired
    private StoreStore storeStore;


	@Override
	public int storeInsert(Map<String, Object> params) {
		return storeStore.storeInsert(params);
	}


	@Override
	public int storeUpdate(Map<String, Object> params) {
		return storeStore.storeUpdate(params);
	}


	@Override
	public int storeDelete(Map<String, Object> params) {
		return storeStore.storeDelete(params);
	}

	

}

package com.fulldive.back.service;

import java.util.Map;

public interface StoreServiceImpl {

	int storeInsert(Map<String, Object> params);
	int storeUpdate(Map<String, Object> params);
	int storeDelete(Map<String, Object> params);
}

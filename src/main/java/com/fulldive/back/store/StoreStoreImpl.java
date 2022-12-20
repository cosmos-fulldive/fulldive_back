package com.fulldive.back.store;

import java.util.Map;

public interface StoreStoreImpl {
	
	int storeInsert(Map<String, Object> params);
	int storeUpdate(Map<String, Object> params);
	int storeDelete(Map<String, Object> params);
	
}

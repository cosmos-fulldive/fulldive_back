package com.fulldive.back.store;

import java.util.Map;

public interface StoreStoreImpl {
	
	int artistInsert(Map<String, Object> params);
	int artistUpdate(Map<String, Object> params);
	int artistDelete(Map<String, Object> params);
	
}

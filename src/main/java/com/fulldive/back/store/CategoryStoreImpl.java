package com.fulldive.back.store;

import java.util.Map;

public interface CategoryStoreImpl {
	
	int categoryInsert(Map<String, Object> params);
	int categoryUpdate(Map<String, Object> params);
	int categoryDelete(Map<String, Object> params);
	
}

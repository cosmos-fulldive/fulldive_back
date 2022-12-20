package com.fulldive.back.service;

import java.util.Map;

public interface CategoryServiceImpl {

	int categoryInsert(Map<String, Object> params);
	int categoryUpdate(Map<String, Object> params);
	int categoryDelete(Map<String, Object> params);
}

package com.fulldive.back.store;

import com.fulldive.back.entity.CategoryEntity;
import com.fulldive.back.entity.CompanyEntity;

import java.util.List;
import java.util.Map;

public interface CompanyStoreImpl {
	
//	int categoryInsert(Map<String, Object> params);
//	int categoryUpdate(Map<String, Object> params);
//	int categoryDelete(Map<String, Object> params);

	List<CompanyEntity> findByCompany();
	
}

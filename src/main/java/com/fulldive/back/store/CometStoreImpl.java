package com.fulldive.back.store;

import com.fulldive.back.entity.CompanyEntity;

import java.util.List;
import java.util.Map;

public interface CometStoreImpl {
	
	int cometInsert(Map<String, Object> params);
	int cometUpdate(Map<String, Object> params);
//	int categoryDelete(Map<String, Object> params);

//	List<CompanyEntity> findByCompany();
	
}

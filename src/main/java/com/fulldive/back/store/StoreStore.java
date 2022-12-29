package com.fulldive.back.store;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.Map;

@Repository
public class StoreStore implements StoreStoreImpl{
	
	private final String ReadOnlyMapper = "StoreReadOnlyMapper.";
	private final String DMLMapper = "StoreDMLMapper.";
	
	@Inject
    SqlSession sqlSession;

	@Override
	public int storeInsert(Map<String, Object> params) {
		return sqlSession.insert(DMLMapper+"storeInsert", params);
	}

	@Override
	public int storeUpdate(Map<String, Object> params) {
		return sqlSession.update(DMLMapper+"storeUpdate", params);
	}

	@Override
	public int storeDelete(Map<String, Object> params) {
		return sqlSession.delete(DMLMapper+"storeDelete", params);
	}
}

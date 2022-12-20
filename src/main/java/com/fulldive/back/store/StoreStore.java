package com.fulldive.back.store;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.Map;

@Repository
public class StoreStore implements StoreStoreImpl{
	
	private final String ReadOnlyMapper = "StoreReadOnlyMapper.";
	private final String DMLMapper = "ArtistDMLMapper.";
	
	@Inject
    SqlSession sqlSession;

	@Override
	public int artistInsert(Map<String, Object> params) {
		return sqlSession.insert(DMLMapper+"artistInsert", params);
	}

	@Override
	public int artistUpdate(Map<String, Object> params) {
		return sqlSession.update(DMLMapper+"artistUpdate", params);
	}

	@Override
	public int artistDelete(Map<String, Object> params) {
		return sqlSession.delete(DMLMapper+"artistDelete", params);
	}

}

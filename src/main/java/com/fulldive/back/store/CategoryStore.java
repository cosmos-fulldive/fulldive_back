package com.fulldive.back.store;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.Map;

@Repository
public class CategoryStore implements CategoryStoreImpl{
	
	private final String ReadOnlyMapper = "CategoryReadOnlyMapper.";
	private final String DMLMapper = "CategoryDMLMapper.";
	
	@Inject
    SqlSession sqlSession;

	@Override
	public int categoryInsert(Map<String, Object> params) {
		return sqlSession.insert(DMLMapper+"categoryInsert", params);
	}

	@Override
	public int categoryUpdate(Map<String, Object> params) {
		return sqlSession.update(DMLMapper+"categoryUpdate", params);
	}

	@Override
	public int categoryDelete(Map<String, Object> params) {
		return sqlSession.delete(DMLMapper+"categoryDelete", params);
	}

}

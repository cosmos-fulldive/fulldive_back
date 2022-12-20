package com.fulldive.back.store;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.Map;

@Repository
public class FollowStore implements FollowStoreImpl{
	
	private final String ReadOnlyMapper = "FollowReadOnlyMapper.";
	private final String DMLMapper = "FollowDMLMapper.";
	
	@Inject
    SqlSession sqlSession;

	@Override
	public int followInsert(Map<String, Object> params) {
		return sqlSession.insert(DMLMapper+"followInsert", params);
	}

	@Override
	public int followUpdate(Map<String, Object> params) {
		return sqlSession.update(DMLMapper+"followUpdate", params);
	}

	@Override
	public int followDelete(Map<String, Object> params) {
		return sqlSession.delete(DMLMapper+"followDelete", params);
	}

}

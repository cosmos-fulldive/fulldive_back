package com.fulldive.back.store;

import com.fulldive.back.entity.StageEntity;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

@Repository
public class StageStore implements StageStoreImpl{
	
	private final String ReadOnlyMapper = "StageReadOnlyMapper.";
	private final String DMLMapper = "StageDMLMapper.";
	
	@Inject
    SqlSession sqlSession;

	@Override
	public List<StageEntity> stageLiveList(Map<String, Object> params) {
		return sqlSession.selectList(ReadOnlyMapper+"stageLiveList", params);
	}

	@Override
	public int stageInsert(Map<String, Object> params) {
		return sqlSession.insert(DMLMapper+"stageInsert", params);
	}

	@Override
	public int stageUpdate(Map<String, Object> params) {
		return sqlSession.update(DMLMapper+"stageUpdate", params);
	}

	@Override
	public int stageDelete(Map<String, Object> params) {
		return sqlSession.delete(DMLMapper+"stageDelete", params);
	}

	@Override
	public List<StageEntity> stageFindById(Map<String, Object> params) {
		return sqlSession.selectList(ReadOnlyMapper+"stageFindById", params);
	}

	@Override
	public List<StageEntity> stageBeforeDayList() {
		return sqlSession.selectList(ReadOnlyMapper+"stageBeforeDayList");
	}
	


	
}

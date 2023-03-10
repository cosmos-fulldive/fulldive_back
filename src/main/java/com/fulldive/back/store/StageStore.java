package com.fulldive.back.store;

import com.fulldive.back.entity.StageArtistListEntity;
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
	public Map<String, Object> stageInsert(Map<String, Object> params) {
		return sqlSession.selectOne(DMLMapper+"stageInsert", params);
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
	public List<StageEntity> stageStartList(Map<String, Object> params) {
		return sqlSession.selectList(ReadOnlyMapper+"stageStartList", params);
	}

	@Override
	public List<StageEntity> stageReadyList(Map<String, Object> params) {
		return sqlSession.selectList(ReadOnlyMapper+"stageReadyList", params);
	}

	@Override
	public List<StageEntity> stageExitList(Map<String, Object> params) {
		return sqlSession.selectList(ReadOnlyMapper+"stageExitList", params);
	}

	@Override
	public int changeStageStage(Map<String, Object> params) {
		return sqlSession.update(DMLMapper+"changeStageStage", params);
	}

	@Override
	public int stageArtistListInsert(Map<String, Object> params) {
		return sqlSession.insert(DMLMapper + "stageArtistListInsert", params);
	}

	@Override
	public List<StageArtistListEntity> stageArtistList(Map<String, Object> params) {
		return sqlSession.selectList(ReadOnlyMapper+"stageArtistList", params);
	}


}

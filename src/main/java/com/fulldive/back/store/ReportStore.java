package com.fulldive.back.store;

import com.fulldive.back.entity.ArtistEntity;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

@Repository
public class ReportStore implements ReportStoreImpl{
	
	private final String ReadOnlyMapper = "ReportReadOnlyMapper.";
	private final String DMLMapper = "ReportDMLMapper.";
	
	@Inject
    SqlSession sqlSession;

	@Override
	public int reportInsert(Map<String, Object> params) {
		return sqlSession.insert(DMLMapper+"reportInsert", params);
	}
}

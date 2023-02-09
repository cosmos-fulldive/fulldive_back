package com.fulldive.back.store;

import com.fulldive.back.entity.CompanyEntity;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

@Repository
public class CometStore implements CometStoreImpl{
	
	private final String ReadOnlyMapper = "CometReadOnlyMapper.";
	private final String DMLMapper = "CometDMLMapper.";
	
	@Inject
    SqlSession sqlSession;

	@Override
	public int cometInsert(Map<String, Object> params) {
		return sqlSession.insert(DMLMapper+"cometInsert", params);
	}
//
//	@Override
//	public int categoryUpdate(Map<String, Object> params) {
//		return sqlSession.update(DMLMapper+"categoryUpdate", params);
//	}
//
//	@Override
//	public int categoryDelete(Map<String, Object> params) {
//		return sqlSession.delete(DMLMapper+"categoryDelete", params);
//	}

//	@Override
//	public List<CompanyEntity> findByCompany() {return sqlSession.selectList(ReadOnlyMapper + "findByCompany");}


}

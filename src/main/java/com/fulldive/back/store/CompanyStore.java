package com.fulldive.back.store;

import com.fulldive.back.entity.CompanyEntity;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

@Repository
public class CompanyStore implements CompanyStoreImpl{
	
	private final String ReadOnlyMapper = "CompanyReadOnlyMapper.";
	private final String DMLMapper = "CompanyDMLMapper.";
	
	@Inject
    SqlSession sqlSession;

//	@Override
//	public int categoryInsert(Map<String, Object> params) {
//		return sqlSession.insert(DMLMapper+"categoryInsert", params);
//	}
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

	@Override
	public List<CompanyEntity> findByCompany() {return sqlSession.selectList(ReadOnlyMapper + "findByCompany");}


}

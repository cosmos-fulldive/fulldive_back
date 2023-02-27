package com.fulldive.back.store;

import com.fulldive.back.entity.UserEntity;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

@Repository
public class LandingStore implements LandingStoreImpl{
	
	private final String ReadOnlyMapper = "UserReadOnlyMapper.";
	private final String DMLMapper = "UserDMLMapper.";
	
	@Inject
    SqlSession sqlSession;

	@Override
	public int userLanding(Map<String, Object> params) {
		return sqlSession.insert(DMLMapper+"userLanding",params);
	}

	@Override
	public List<Object> chkLandingUser(Map<String, Object> params) {
		return sqlSession.selectList(ReadOnlyMapper + "chkLandingUser", params);
	}
}

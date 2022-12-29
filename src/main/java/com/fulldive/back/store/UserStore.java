package com.fulldive.back.store;

import com.fulldive.back.entity.UserEntity;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

@Repository
public class UserStore implements UserStoreImpl{
	
	private final String ReadOnlyMapper = "UserReadOnlyMapper.";
	private final String DMLMapper = "UserDMLMapper.";
	
	@Inject
    SqlSession sqlSession;
	

	@Override
	public List<UserEntity> userLogin(Map<String, String> params) {
		return sqlSession.selectList("UserReadOnlyMapper.userlogin", params);
	}

	@Override
	public int userJoin(Map<String, Object> params) {
		System.out.println("Store params"+params);
		return sqlSession.insert(DMLMapper+"userJoin",params);
	}

	@Override
	public List<UserEntity> userJoinIdChk(Map<String, Object> params) {
		return sqlSession.selectList(ReadOnlyMapper+"userJoinIdChk", params);
	}

	@Override
	public int userUpdate(Map<String, Object> params) {
		return sqlSession.update(DMLMapper+"userUpdate",params);
	}

	@Override
	public int userDelete(Map<String, Object> params) {
		return sqlSession.update(DMLMapper+"userDelete",params);
	}
	
}

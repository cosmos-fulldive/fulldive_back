package com.fulldive.back.store;

import com.fulldive.back.entity.ArtistEntity;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

@Repository
public class ArtistStore implements ArtistStoreImpl{
	
	private final String ReadOnlyMapper = "ArtistReadOnlyMapper.";
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

	@Override
	public List<ArtistEntity> newArtistList() {return sqlSession.selectList(ReadOnlyMapper+"findArtist");}

}

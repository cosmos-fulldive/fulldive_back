package com.fulldive.back.service;

import com.fulldive.back.entity.ArtistEntity;

import java.util.List;
import java.util.Map;

public interface ArtistServiceImpl {

	int artistInsert(Map<String, Object> params);
	int artistUpdate(Map<String, Object> params);
	int artistDelete(Map<String, Object> params);

	List<ArtistEntity> newFindArtist();
	List<ArtistEntity> findAllPopularityArtistList();
	List<ArtistEntity> findAllCreateArtistList();
	List<ArtistEntity> findAllNameArtistList();

    Map<String, Object> chkArtistEmail(Map<String, Object> params);
}

package com.fulldive.back.service;

import com.fulldive.back.entity.ArtistEntity;
import com.fulldive.back.store.ArtistStore;
import com.fulldive.back.store.StageStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class ArtistService implements ArtistServiceImpl {
	
	@Autowired
    private ArtistStore artistStore;


	@Override
	public int artistInsert(Map<String, Object> params) {
		return artistStore.artistInsert(params);
	}


	@Override
	public int artistUpdate(Map<String, Object> params) {
		return artistStore.artistUpdate(params);
	}


	@Override
	public int artistDelete(Map<String, Object> params) {
		return artistStore.artistDelete(params);
	}

	@Override
	public List<ArtistEntity> newFindArtist() {return artistStore.newArtistList();}


}

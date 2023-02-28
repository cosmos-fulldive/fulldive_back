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

	@Override
	public List<ArtistEntity> findAllPopularityArtistList() {
		return artistStore.findAllPopularityArtistList();
	}

	@Override
	public List<ArtistEntity> findAllCreateArtistList() {
		return artistStore.findAllCreateArtistList();
	}

	@Override
	public List<ArtistEntity> findAllNameArtistList() {
		return artistStore.findAllNameArtistList();
	}

	@Override
	public Map<String, Object> chkArtistEmail(Map<String, Object> params) {
		return artistStore.chkArtistEmail(params);
	}

	@Override
	public List<ArtistEntity> artistList(Map<String, String> params) {
		return artistStore.artistList(params);
	}


}

package com.fulldive.back.service;

import com.fulldive.back.store.StageStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class ArtistService implements ArtistServiceImpl {
	
	@Autowired
    private StageStore stageStore;


	@Override
	public int artistInsert(Map<String, Object> params) {
		return stageStore.stageInsert(params);
	}


	@Override
	public int artistUpdate(Map<String, Object> params) {
		return stageStore.stageUpdate(params);
	}


	@Override
	public int artistDelete(Map<String, Object> params) {
		return stageStore.stageDelete(params);
	}

	

}

package com.fulldive.back.service;

import com.fulldive.back.entity.StageEntity;
import com.fulldive.back.store.StageStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class StageService implements StageServiceImpl {
	
	@Autowired
    private StageStore stageStore;

	@Override
	public int stageInsert(Map<String, Object> params) {
		return stageStore.stageInsert(params);
	}



	@Override
	public int stageUpdate(Map<String, Object> params) {
		return stageStore.stageUpdate(params);
	}



	@Override
	public int stageDelete(Map<String, Object> params) {
		return stageStore.stageDelete(params);
	}



	@Override
	public List<StageEntity> stageFindById(Map<String, Object> params) {
		return stageStore.stageFindById(params);
	}


	@Override
	public List<StageEntity> stageStartList(Map<String, Object> params) {
		return stageStore.stageStartList(params);
	}

	@Override
	public List<StageEntity> stageReadyList(Map<String, Object> params) {
		return stageStore.stageReadyList(params);
	}

	@Override
	public List<StageEntity> stageExitList(Map<String, Object> params) {
		return stageStore.stageExitList(params);
	}



	

}

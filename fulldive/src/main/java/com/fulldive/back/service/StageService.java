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
	public List<StageEntity> stageLiveList(Map<String, Object> params) {
		return stageStore.stageLiveList(params);
	}



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
	public List<StageEntity> stageBeforeDayList() {
		return stageStore.stageBeforeDayList();
	}

	

}

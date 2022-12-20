package com.fulldive.back.service;

import com.fulldive.back.entity.StageEntity;

import java.util.List;
import java.util.Map;

public interface StageServiceImpl {
	List<StageEntity> stageLiveList(Map<String, Object> params);
	
	int stageInsert(Map<String, Object> params);
	int stageUpdate(Map<String, Object> params);
	int stageDelete(Map<String, Object> params);
	
	List<StageEntity> stageFindById(Map<String, Object> params);
	
	List<StageEntity> stageBeforeDayList();
}

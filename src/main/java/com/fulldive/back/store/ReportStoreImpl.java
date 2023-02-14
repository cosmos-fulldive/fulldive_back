package com.fulldive.back.store;

import com.fulldive.back.entity.ArtistEntity;

import java.util.List;
import java.util.Map;

public interface ReportStoreImpl {
	
	int reportInsert(Map<String, Object> params);
}

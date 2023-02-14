package com.fulldive.back.service;

import com.fulldive.back.entity.CategoryEntity;
import com.fulldive.back.store.CometStore;
import com.fulldive.back.store.ReportStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class ReportService implements ReportServiceImpl {
	
	@Autowired
    private ReportStore reportStore;

	@Override
	public int reportInsert(Map<String, Object> params) {
		return reportStore.reportInsert(params);
	}

}

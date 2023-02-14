package com.fulldive.back.service;

import com.fulldive.back.entity.CategoryEntity;
import com.fulldive.back.entity.CometEntity;

import com.fulldive.back.store.CometStore;
import com.fulldive.back.store.CompanyStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public  class CometService implements CometServiceImpl {
	
	@Autowired
    private CometStore cometStore;


	@Override
	public int cometInsert(Map<String, Object> params) {
		return cometStore.cometInsert(params);
	}

	@Override
	public int cometUpdate(Map<String, Object> params) {
		return cometStore.cometUpdate(params);
	}

}

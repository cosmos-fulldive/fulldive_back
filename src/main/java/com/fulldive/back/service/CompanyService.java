package com.fulldive.back.service;

import com.fulldive.back.entity.CategoryEntity;
import com.fulldive.back.store.CategoryStore;
import com.fulldive.back.store.CompanyStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class CompanyService implements CategoryServiceImpl {
	
	@Autowired
    private CompanyStore companyStore;

	@Override
	public int categoryInsert(Map<String, Object> params) {
		return 0;
	}

	@Override
	public int categoryUpdate(Map<String, Object> params) {
		return 0;
	}

	@Override
	public int categoryDelete(Map<String, Object> params) {
		return 0;
	}

	@Override
	public List<CategoryEntity> findCategory() {
		return null;
	}
}

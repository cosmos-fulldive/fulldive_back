package com.fulldive.back.service;

import com.fulldive.back.store.CategoryStore;
import com.fulldive.back.store.StageStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class CategoryService implements CategoryServiceImpl {
	
	@Autowired
    private CategoryStore categoryStore;


	@Override
	public int categoryInsert(Map<String, Object> params) {
		return categoryStore.categoryInsert(params);
	}


	@Override
	public int categoryUpdate(Map<String, Object> params) {
		return categoryStore.categoryUpdate(params);
	}


	@Override
	public int categoryDelete(Map<String, Object> params) {
		return categoryStore.categoryDelete(params);
	}

	

}

package com.fulldive.back.resource;

import com.fulldive.back.entity.CategoryEntity;
import com.fulldive.back.service.CategoryService;
import com.fulldive.back.service.CategoryServiceImpl;
import com.fulldive.back.service.StageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class CategoryResource{
	
	@Autowired
	StageService stageService;
	@Autowired
	CategoryService categoryService;

	

	
	/*
	 * 카테고리 정보등록
	*/
	@PostMapping(value = "/category/categoryInsert")
	public int categoryInsert(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = stageService.stageInsert(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}
	
	/*
	 * 카테고리 정보수정 
	*/
	@PostMapping(value = "/category/categoryUpdate")
	public int categoryUpdate(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = stageService.stageUpdate(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}
	
	/*
	 * 카테고리 정보삭제
	*/
	@PostMapping(value = "/category/categoryDelete")
	public int categoryDelete(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = stageService.stageDelete(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}

	@RequestMapping(value = "/category/findCategory")
	public List<CategoryEntity> findCategory () {
		return categoryService.findCategory();
	}
	
	
}

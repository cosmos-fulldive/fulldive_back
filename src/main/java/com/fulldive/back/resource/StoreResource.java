package com.fulldive.back.resource;

import com.fulldive.back.service.StageService;
import com.fulldive.back.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class StoreResource{
	
	@Autowired
	StageService stageService;

	@Autowired
	StoreService storeService;
	

	
	/*
	 * 스토어 정보등록
	*/
	@PostMapping(value = "/store/storeInsert")
	public int storeInsert(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = storeService.storeInsert(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}
	
	/*
	 * 스토어 정보수정 
	*/
	@PostMapping(value = "/store/storeUpdate")
	public int storeUpdate(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = stageService.stageUpdate(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}
	
	/*
	 * 스토어 정보삭제
	*/
	@PostMapping(value = "/store/storeDelete")
	public int storeDelete(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = stageService.stageDelete(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}
	
	
}

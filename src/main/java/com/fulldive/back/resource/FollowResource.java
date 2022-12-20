package com.fulldive.back.resource;

import com.fulldive.back.service.StageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class FollowResource{
	
	@Autowired
	StageService stageService;
	

	
	/*
	 * 팔로우 정보등록
	*/
	@PostMapping(value = "/follow/followInsert")
	public int followInsert(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = stageService.stageInsert(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}
	
	/*
	 * 팔로우 정보수정 
	*/
	@PostMapping(value = "/follow/followUpdate")
	public int followUpdate(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = stageService.stageUpdate(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}
	
	/*
	 * 팔로우 정보삭제
	*/
	@PostMapping(value = "/follow/followDelete")
	public int followDelete(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = stageService.stageDelete(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}
	
	
}

package com.fulldive.back.resource;

import com.fulldive.back.service.StageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ArtistResource{
	
	@Autowired
	StageService stageService;
	

	
	/*
	 * 아티스트 정보등록
	*/
	@PostMapping(value = "/artist/artistInsert")
	public int artistInsert(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = stageService.stageInsert(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}
	
	/*
	 * 아티스트 정보수정 
	*/
	@PostMapping(value = "/artist/artistUpdate")
	public int artistUpdate(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = stageService.stageUpdate(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}
	
	/*
	 * 아티스트 정보삭제
	*/
	@PostMapping(value = "/artist/artistDelete")
	public int artistDelete(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = stageService.stageDelete(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}
	
	
}

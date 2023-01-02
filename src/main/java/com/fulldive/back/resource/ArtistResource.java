package com.fulldive.back.resource;

import com.fulldive.back.entity.ArtistEntity;
import com.fulldive.back.service.ArtistService;
import com.fulldive.back.service.StageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ArtistResource{
	
	@Autowired
	ArtistService artistService;
	

	
	/*
	 * 아티스트 정보등록
	*/
	@PostMapping(value = "/artist/artistInsert")
	public int artistInsert(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = artistService.artistInsert(params);
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
		int resultList = artistService.artistUpdate(params);
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
		int resultList = artistService.artistDelete(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}

	@RequestMapping(value = "/artist/findNewArtistList")
	public Map<String, Object> findNewArtistList(){
		Map<String, Object> result = new HashMap<>();
		List<ArtistEntity> newArtistList  = artistService.newFindArtist();
		for(ArtistEntity x : newArtistList){
			String categoryNameKr = "";
			String categoryNameEn = "";
			categoryNameKr = x.getCategoryNameKr1() + "," + x.getCategoryNameKr2() + "," + x.getCategoryNameKr3();
			categoryNameEn = x.getCategoryNameEn1() + "," + x.getCategoryNameEn2() + "," + x.getCategoryNameEn3();
//			System.out.println(categoryNameKr);
//			System.out.println(categoryNameEn);
			x.setCategoryNameKr(categoryNameKr);
			x.setCategoryNameEn(categoryNameEn);
		}
		result.put("newArtistList", newArtistList);
		return result;
	}
	
	
}

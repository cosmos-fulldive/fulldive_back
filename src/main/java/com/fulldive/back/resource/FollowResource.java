package com.fulldive.back.resource;

import com.fulldive.back.entity.FollowEntity;
import com.fulldive.back.service.ArtistService;
import com.fulldive.back.service.FollowService;
import com.fulldive.back.service.StageService;
import com.fulldive.back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class FollowResource{
	
	@Autowired
	ArtistService artistService;

	@Autowired
	UserService userService;

	@Autowired
	FollowService followService;

	@Autowired
//	UserResource userResource
	UserResource userResource = new UserResource();
	
	/*
	 * 팔로우 등록
	*/
	@PostMapping(value = "/follow/followInsert")
	public Map<String, Object> followInsert(@RequestBody Map<String, Object> params) {
		Map<String, Object> resultMap = new HashMap<>();
		int result = 200;
		System.out.println("params: " + params);
		Map<String, Object> userParams = new HashMap<>();
		userParams.put("userId", params.get("followUserId"));
		Map<String, Object> userExist = userResource.findExistUser(userParams);
		System.out.println(userExist);
		if((Integer) userExist.get("result") != 200) {
			resultMap.put("result", 400);
			resultMap.put("message", "사용자가 존재하지 않습니다.");
			return resultMap;
		}
		List<FollowEntity> findFollowArtistUser = followService.findFollowArtistUser(params);
		if(findFollowArtistUser.size() != 0) {
			resultMap.put("result", 400);
			resultMap.put("message", "이미 팔로우 되어있습니다.");
			return resultMap;
		}
		int resultList = followService.followInsert(params);
		System.out.println(resultList);
		if(resultList == 0) {
			resultMap.put("result",400);
			resultMap.put("message", "fail");
		}else {
			resultMap.put("result",200);
			resultMap.put("message", "success");
		}
		return resultMap;
	}

	
	/*
	 * 팔로우 취소
	*/
	@PostMapping(value = "/follow/followDelete")
	public Map<String, Object> followDelete(@RequestBody Map<String, Object> params) {
		Map<String, Object> resultMap = new HashMap<>();
		int result = 200;
		System.out.println("params: " + params);
		Map<String, Object> userParams = new HashMap<>();
		userParams.put("userId", params.get("followUserId"));
		Map<String, Object> userExist = userResource.findExistUser(userParams);
		if((Integer) userExist.get("result") != 200) {
			resultMap.put("result", 400);
			resultMap.put("message", "사용자가 존재하지 않습니다.");
			return resultMap;
		}
		List<FollowEntity> findFollowArtistUser = followService.findFollowArtistUser(params);
		if(findFollowArtistUser.size() == 0) {
			resultMap.put("result", 400);
			resultMap.put("message","팔로우 취소 실패 .");
			return resultMap;
		}
		System.out.println("params: " + params);
		int resultList = followService.followDelete(params);
		System.out.println(resultList);
		if(resultList == 0) {
			resultMap.put("result",400);
			resultMap.put("message","fail");
		}else {
			resultMap.put("result",200);
			resultMap.put("message","success");
		}
		return resultMap;
	}
	
	
}

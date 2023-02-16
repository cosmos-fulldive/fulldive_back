package com.fulldive.back.resource;

import com.fulldive.back.entity.CometEntity;
import com.fulldive.back.entity.UserEntity;
import com.fulldive.back.service.CometService;
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
public class DonationResource {
	
	@Autowired
	StageService stageService;
	@Autowired
	CometService cometService;
	@Autowired
	UserService userService;

	

	
	/*
	 * 도네이션 정보등록
	*/
	@PostMapping(value = "/donation/donationInsert")
	public Map<String, Object> donationInsert(@RequestBody Map<String, Object> params) throws Exception {
		Map<String, Object> result = new HashMap<>();
		boolean userId_B = !params.containsKey("cometPurchaseUserId");
		boolean cometCurrentStreamKey_B = !params.containsKey("cometCurrentStreamKey");
		boolean cometSalesStageId_B = !params.containsKey("cometSalesStageId");
		boolean cometCount_B = !params.containsKey("cometCount");

   		if(userId_B || cometCurrentStreamKey_B || cometSalesStageId_B || cometCount_B) {
			result.put("result", 400);
			result.put("message", "필수항목값 에러");
			return result;
		}
		params.put("userId", (String) params.get("cometPurchaseUserId"));
		List<UserEntity> findUserComet = userService.findUserComet(params);
		if(findUserComet.size() < 1){
			result.put("result", 400);
			result.put("message", "유저 값 에러");
			return result;
		}
		int userComet = findUserComet.get(0).getUserComet();

		String cometCurrentStreamKey = (String) params.get("cometCurrentStreamKey");
		String cometSalesStageId = (String) params.get("cometSalesStageId");
		int cometCount = (int) params.get("cometCount");

//		if(userComet < cometCount) {
//			result.put("result", 400);
//			result.put("message", "코멧부족에러");
//			return result;
//		}
		result.put("userComet",userComet);
		result.put("cometCount",cometCount);
//		return result;

//		if(cometCurrentStreamKey == null || cometCurrentStreamKey.equals("") || cometSalesStageId == null || cometSalesStageId.equals("") || cometCount < 1 ) {
//			result.put("result", 400);
//			result.put("message", "후원 필수 값 에러");
//			return result;
//		}
//
//		int resultList = cometService.cometInsert(params);
//
//		if(resultList == 0) {
//			result.put("result",400);
//		}
//		else {
//			result.put("result",200);
//		}
		return result;
	}




}

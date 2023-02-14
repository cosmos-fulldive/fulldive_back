package com.fulldive.back.resource;

import com.fulldive.back.entity.CometEntity;
import com.fulldive.back.service.CometService;
import com.fulldive.back.service.StageService;
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

	

	
	/*
	 * 도네이션 정보등록
	*/
	@PostMapping(value = "/donation/donationInsert")
	public Map<String, Object> donationInsert(@RequestBody Map<String, Object> params) throws Exception {
		Map<String, Object> result = new HashMap<>();

		String cometCurrentStreamKey = (String) params.get("cometCurrentStreamKey");
		String cometSalesStageId = (String) params.get("cometSalesStageId");
		int cometCount = (int) params.get("cometCount");

		if(cometCurrentStreamKey == null || cometCurrentStreamKey.equals("") || cometSalesStageId == null || cometSalesStageId.equals("") || cometCount < 1 ) {
			result.put("result", 400);
			result.put("message", "후원 필수 값 에러");
			return result;
		}

		int resultList = cometService.cometInsert(params);

		if(resultList == 0) {
			result.put("result",400);
		}
		else {
			result.put("result",200);
		}
		return result;
	}




}

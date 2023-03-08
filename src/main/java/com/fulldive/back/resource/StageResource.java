package com.fulldive.back.resource;

import com.fulldive.back.entity.StageEntity;
import com.fulldive.back.service.StageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class StageResource{
	
	@Autowired
	StageService stageService;
	
	
	
	/*
	 * 현재방송중인 방송리스트 조회
	*/
	@RequestMapping(value = "/stage/startList")
	public Map<String, Object> startList() throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();

		// 보내는 값 일단 보류 뭐가 들어갈지를 모르겠네,,
		Map<String, Object> params = new HashMap<>();
		List<StageEntity> stageStartList = stageService.stageStartList(params);
		List<Map<String, Object>> resultList = new ArrayList<>();
		result.put("startList", stageStartList);
		return result;
	}

	/*
	 * 다가오는 스테이지
	 */
	@RequestMapping(value = "/stage/readyList")
	public Map<String, Object> readyList() throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();

		// 보내는 값 일단 보류 뭐가 들어갈지를 모르겠네,,
		Map<String, Object> params = new HashMap<>();
		List<StageEntity> stageStartList = stageService.stageReadyList(params);
		List<Map<String, Object>> resultList = new ArrayList<>();
		result.put("readyList", stageStartList);
		return result;
	}

	/*
	 * 지난 스테이지
	 */
	@RequestMapping(value = "/stage/exitList")
	public Map<String, Object> exitList() throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();

		// 보내는 값 일단 보류 뭐가 들어갈지를 모르겠네,,
		Map<String, Object> params = new HashMap<>();
		List<StageEntity> stageStartList = stageService.stageExitList(params);
		List<Map<String, Object>> resultList = new ArrayList<>();
		result.put("exitList", stageStartList);
		return result;
	}
	
	
	/*
	 * 전체스테이지 정보
	*/
	@PostMapping(value = "/stage/findIdLiveList")
	public Map<String, Object> userLogin(@RequestBody Map<String, Object> params) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>(); 

		List<StageEntity> stageLiveList = stageService.stageFindById(params);
		List<Map<String, Object>> resultList = new ArrayList<>();

		for(StageEntity x : stageLiveList) {
			
			Map<String, Object> resultMap = new HashMap<>();
			resultMap.put("id", x.getStageId());
			resultMap.put("stageId", x.getStageId());
			resultMap.put("stageMakeUserId", x.getUserId());
			resultMap.put("stageTitle", x.getStageTitle());
			resultMap.put("stageImage", x.getStageImage());
			resultMap.put("stageLocation", x.getStageLocation());
			resultMap.put("stageTimestamp", x.getStageTimestamp());
			resultMap.put("stageArtistId", x.getStageArtistId());
			resultMap.put("stageDescription", x.getStageDescription());
			resultMap.put("stageThumbnailImage", x.getStageThumbnailImage());
			resultMap.put("stageTicketPrice", x.getStageTicketPrice());
			resultMap.put("createTimestamp", x.getCreateTimestamp());
			resultList.add(resultMap);
			result.put("streams", resultList);
			System.out.println("result" + result);
		}
		System.out.println("resultList" + resultList);
		return result;	
	}
	
	
	/*
	 * 스테이지 정보등록
	*/
	@PostMapping(value = "/stage/stageInsert")
	public int stageInsert(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = stageService.stageInsert(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}
	
	/*
	 * 스테이지 정보수정 
	*/
	@PostMapping(value = "/stage/stageUpdate")
	public int stageUpdate(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = stageService.stageUpdate(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}
	
	/*
	 * 스테이지 정보삭제
	*/
	@PostMapping(value = "/stage/stageDelete")
	public int stageDelete(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = stageService.stageDelete(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}
	
	/*
	 * 다가오는 스테이지
	*/
//	@GetMapping(value = "/stage/stageBeforeDayList")
//	public List<StageEntity> stageBeforeDayList () {
//		List<StageEntity> stageBeforeDayList = new ArrayList<>();
//		stageBeforeDayList = stageService.stageReadyList();
//		return stageBeforeDayList;
//	}

	/*
	 * 스테이지 상태변경
 	*/
	@PostMapping(value = "/stage/changeStageState")
	public Map<String, Object> changeStageStage(@RequestBody Map<String, Object> params) {

		Map<String, Object> result = new HashMap<>();

		String stageId = (String) params.get("stageId");
		if(stageId.isEmpty()) {
			result.put("result",400);
			result.put("message","fail");
			return result;
		}

		int changeStageStageResult = stageService.changeStageState(params);
		if(changeStageStageResult != 0) {
			result.put("result",200);
			result.put("message","success");

		}else {
			result.put("result",400);
			result.put("message","fail");
		}
		return result;
	}

	@PostMapping(value = "stage/stageImageInsert")
	public void stageImageInsert(MultipartHttpServletRequest request) {
		Map<String, Object> map = new HashMap<>();

		String path = System.getProperty("user.dir");

		path = path + "/target/cosimg/stage";
//		System.out.println("path: " + path + "/src/main/resources/templates/cosimg");

		System.out.println("Working Directory = " + path);

		File fileDir = new File(path);

		if (!fileDir.exists()) {
			fileDir.mkdirs();
		}

		List<MultipartFile> fileList = new ArrayList<MultipartFile>();


		if(request.getFiles("photo").get(0).getSize() != 0){
			System.out.println("get photo");
			fileList = request.getFiles("photo");
		}

		System.out.println("fileList: " + fileList.size());

		for (MultipartFile mf : fileList) {

			String originFileName = mf.getOriginalFilename(); // 원본 파일 명
			String saveFileName = String.format(originFileName);

			try {
				// 파일생성
				mf.transferTo(new File(path, saveFileName));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}

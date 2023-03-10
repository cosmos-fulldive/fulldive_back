package com.fulldive.back.resource;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fulldive.back.entity.CometEntity;

import com.fulldive.back.service.CometService;

import com.fulldive.back.service.StageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class CometResource {
	
	@Autowired
	StageService stageService;
	@Autowired
	CometService cometService;

	

	
	/*
	 * 카테고리 정보등록
	*/
	@PostMapping(value = "/comet/cometInsert")
	public int cometInsert(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = cometService.cometInsert(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}
	
	/*
	 * 카테고리 정보수정 
	*/
	@PostMapping(value = "/comet/cometUpdate")
	public int cometUpdate(@RequestBody Map<String, Object> params) {
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
	@PostMapping(value = "/comet/cometDelete")
	public int cometDelete(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = stageService.stageDelete(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}

	@RequestMapping(value = "/comet/findcomet")
	public List<CometEntity> findcomet () {
		return null;
//				cometService.findComet();
	}

	@RequestMapping(value = "/comet/Test")
	public Map<String, Object> cometTest() {
//		ObjectMapper objectMapper = new ObjectMapper();
//		String serverIp = "http://118.63.182.3:8884";
//		//header setting
//		HttpHeaders httpHeaders = new HttpHeaders();
//		httpHeaders.setContentType(new MediaType("html","text", Charset.forName("UTF-8")));
//
//
//		//Object Mapper Json Binding
//		Map<String, Object> map = new HashMap<>();
//		map.put("userId", 1);
////		Map<String, Object> map = new HashMap<>();
//		String params = null;
//		try {
//			params = objectMapper.writeValueAsString(map);
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}
//
//		HttpEntity entity = new HttpEntity(params, httpHeaders);
//
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<Map> userInfo = restTemplate.exchange(serverIp + "/TEST", HttpMethod.GET, entity, Map.class);
//		WebClient client = new WebClient();

		return null;
	}

//	public static void main(String[] args) {
//		// 파일을 관리할 폴더부터 만들기
//		final String path = "/Users/cjh/Documents";
//		File folder = new File(path);
//		File[] fileList = folder.listFiles();
//
//		for(int i=0; i<fileList.length; i++){
//			File f = fileList[i];
//
//			//if(f.isFile()){// 파일이 있다면 파일 이름 출력
////				System.out.printf("%-15s %.3f kb \n",f.getName(),((double)f.length())/(double)1000);
//				 System.out.println(f.getName() + "  " + ((double)f.length())/(double)1000 + "kb");
//			//}
//		}
//
//		System.out.println(fileList);
//	}
	
	
}

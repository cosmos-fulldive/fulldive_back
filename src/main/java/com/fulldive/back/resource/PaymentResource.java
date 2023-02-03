package com.fulldive.back.resource;

import com.fulldive.back.service.StageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class PaymentResource{
	
	@Autowired
	StageService stageService;
/*

*/

	
	/*
	 * 결제내역 정보등록
	*/
	@PostMapping(value = "/payment/paymentInsert")
	public int paymentInsert(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = stageService.stageInsert(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}
	
	/*
	 * 결제내역 정보수정 
	*/
	@PostMapping(value = "/payment/paymentUpdate")
	public int paymentUpdate(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = stageService.stageUpdate(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}
	
	/*
	 *  결제내역 정보삭제
	*/
	@PostMapping(value = "/payment/paymentDelete")
	public int paymentDelete(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = stageService.stageDelete(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}


	
	
}

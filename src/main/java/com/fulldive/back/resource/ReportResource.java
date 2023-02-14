package com.fulldive.back.resource;

import com.fulldive.back.entity.ArtistEntity;
import com.fulldive.back.service.ArtistService;
import com.fulldive.back.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ReportResource {
	
	@Autowired
	ReportService reportService;

	/*
	 * 유저신고
	*/
	@PostMapping(value = "/report/reportInsert")
	public int reportInsert(@RequestBody Map<String, Object> params) {
		int result = 200;
		System.out.println("params: " + params);
		int resultList = reportService.reportInsert(params);
		System.out.println(resultList);
		if(resultList == 0) {result = 400;}
		return result;
	}

}

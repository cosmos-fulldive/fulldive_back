package com.fulldive.back.resource;

import com.fulldive.back.config.RandomConfig;
import com.fulldive.back.config.SHA256;
import com.fulldive.back.entity.MailEntity;
import com.fulldive.back.entity.StageEntity;
import com.fulldive.back.entity.UserEntity;
import com.fulldive.back.service.ArtistService;
import com.fulldive.back.service.MailService;
import com.fulldive.back.service.StageService;
import com.fulldive.back.service.UserService;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class MainResource {
	
	//create random Id 
	RandomConfig randomConfig = new RandomConfig();
	UserResource userResource = new UserResource();
	StageResource stageResource = new StageResource();

	@Autowired
	UserService userService;
	@Autowired
	StageService stageService;
	@Autowired
	ArtistService artistService;
	@Autowired
	MailService mailService;

	/*
	 * 메인페이지정보
	 */
	@RequestMapping(value = "/main/mainInfo")
	public Map<String, Object> findUserInfo() throws Exception {
//		System.out.println("20230105:14:58");
		String profile = System.getProperty("spring.profiles.active");
		System.out.println("profile: " + profile);
		Map<String, Object> params = new HashMap<>();
		Map<String, Object> result = new HashMap<String, Object>();
//		List<UserEntity> userInfo = userService.userInfo(params);
		List<StageEntity> stageStartInfo = stageService.stageStartList(params);
		List<StageEntity> stageReadyInfo = stageService.stageReadyList(params);
		List<StageEntity> stageExitInfo = stageService.stageExitList(params);

//		result.put("userList", userInfo);
		result.put("stageStartInfo", stageStartInfo);
		result.put("stageReadyInfo", stageReadyInfo);
		result.put("stageExitInfo", stageExitInfo);
		return result;
	}

	@RequestMapping(value = "/main/mailService")
	public void sendMail(){
		MailEntity mailEntity = new MailEntity();
		mailService.sendMail(mailEntity);
	}
}

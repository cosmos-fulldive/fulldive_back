package com.fulldive.back.service;

import com.fulldive.back.repository.UserRepository;
import com.fulldive.back.store.LandingStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class LandingService implements LandingServiceImpl {
	
	@Autowired
    private LandingStore landingStore;
	@Autowired
    private UserRepository userRepository;

//    public List<UserEntity> findByUserEmail(String userEmail) {
//    	System.out.println("userRepository" + userRepository);
//        List<UserEntity> members = new ArrayList<>();
//        userRepository.findByUserEmail(userEmail).forEach(e -> members.add(e));
//        return members;
//    }
	public int userLanding(Map<String, Object> params) {
		return landingStore.userLanding(params);
	}

	@Override
	public List<Object> chkLandingUser(Map<String, Object> params) {
		return landingStore.chkLandingUser(params);
	}
}



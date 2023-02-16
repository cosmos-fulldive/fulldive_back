package com.fulldive.back.service;

import com.fulldive.back.entity.UserEntity;
import com.fulldive.back.repository.UserRepository;
import com.fulldive.back.store.UserStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service
public class UserService implements UserServiceImpl {
	
	@Autowired
    private UserStore userStore;
	@Autowired
    private UserRepository userRepository;

    public List<UserEntity> findByUserEmail(String userEmail) {
    	System.out.println("userRepository" + userRepository);
        List<UserEntity> members = new ArrayList<>();
        userRepository.findByUserEmail(userEmail).forEach(e -> members.add(e));
        return members;
    }

	@Override
	public List<UserEntity> userLogin(Map<String, String> params) {
		return userStore.userLogin(params);
	}

	@Override
	public int userJoin(Map<String, Object> params) {
		return userStore.userJoin(params);
	}

	@Override
	public List<UserEntity> userJoinIdChk(Map<String, Object> params) {
		return userStore.userJoinIdChk(params);
	}

	@Override
	public int userUpdate(Map<String, Object> params) {
		return userStore.userUpdate(params);
	}

	@Override
	public int userDelete(Map<String, Object> params) {
		return userStore.userDelete(params);
	}

	@Override
	public List<UserEntity> userInfo(Map<String, Object> params) {
		return userStore.userInfo(params);
	}

	@Override
	public List<UserEntity> findExistUser(Map<String, Object> params) {
		return userStore.findExistUser(params);
	}

	@Override
	public List<UserEntity> findUserComet(Map<String, Object> params) {
		return userStore.findUserComet(params);
	}


}

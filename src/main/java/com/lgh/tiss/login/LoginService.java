package com.lgh.tiss.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgh.tiss.user.UserVO;

@Service
public class LoginService {
	@Autowired
	LoginDAO loginDAO;
	UserVO login(UserVO vo) {
		return loginDAO.login(vo);
	}
}

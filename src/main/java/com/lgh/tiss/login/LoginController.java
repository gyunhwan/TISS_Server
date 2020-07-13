package com.lgh.tiss.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lgh.tiss.user.UserVO;

@RestController
@RequestMapping(value="/login")
public class LoginController {
	@Autowired
	LoginService loginService;
	
	@PostMapping(value="")
	UserVO login(@RequestBody UserVO vo) {
		System.out.println("123");
		return loginService.login(vo); 
	}
}

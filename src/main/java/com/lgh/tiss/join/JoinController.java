package com.lgh.tiss.join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lgh.tiss.user.UserVO;

@RestController
@RequestMapping(value="join")
public class JoinController {
	@Autowired
	JoinService joinService;
	
	
	@PostMapping(value="")
	int join(@RequestBody UserVO vo) {
		System.out.println(vo.toString());
		return joinService.join(vo);
	}
}

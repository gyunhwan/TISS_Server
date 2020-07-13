package com.lgh.tiss.join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgh.tiss.user.UserVO;

@Service
public class JoinService {
	@Autowired
	JoinDAO joinDAO;
	
	int join(UserVO vo) {
		return joinDAO.join(vo);
	}
}

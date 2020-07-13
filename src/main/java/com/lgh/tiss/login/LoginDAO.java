package com.lgh.tiss.login;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lgh.tiss.user.UserVO;
@Repository
public class LoginDAO {
	@Autowired
	SqlSession sqlSession;
	
	UserVO login(UserVO vo) {
		
		return sqlSession.selectOne("loginDAO.login",vo);
	}
}

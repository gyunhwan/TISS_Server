package com.lgh.tiss.join;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lgh.tiss.user.UserVO;
@Repository
public class JoinDAO {
	@Autowired
	SqlSession sqlSession;
	
	int join(UserVO vo) {
		return sqlSession.insert("joinDAO.join", vo);
	}
}

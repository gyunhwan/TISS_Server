package com.lgh.tiss.post;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PostDAO {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	int insertPost(PostVO vo) {
		return sqlSessionTemplate.insert("postDAO.insert",vo);
	}
	PostVO selectPost(String id) {
		return sqlSessionTemplate.selectOne("postDAO.select",id);
	}
	List<PostVO> selectPostList(StringDTO dto){
		
		return sqlSessionTemplate.selectList("postDAO.selectList",dto);
	}
}

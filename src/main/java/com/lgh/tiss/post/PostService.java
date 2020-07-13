package com.lgh.tiss.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
	@Autowired
	PostDAO postDAO;
	
	int insertPost(PostVO vo) {
		return postDAO.insertPost(vo);
	}
	PostVO selectPost(String id) {
		return postDAO.selectPost(id);
	}
	List<PostVO>selectPostList(StringDTO dto){
		return postDAO.selectPostList(dto);
	}
}

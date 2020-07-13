package com.lgh.tiss.post;

import java.util.List;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="post")
@RestController
@CrossOrigin(origins="*")
public class PostController {
	@Autowired
	PostService postService;
	
	@PostMapping
	int insert(@RequestBody PostVO vo) {
		return postService.insertPost(vo);
	}
	@GetMapping(value="/{userId}")
	PostVO select(@PathVariable(name="userId") String id){
		return postService.selectPost(id);
	}
	@GetMapping
	List<PostVO> selectList(@RequestParam(name="keyword",required=false)String keyword,@RequestParam(name="positionX")Double x,@RequestParam(name="positionY")Double y){
		StringDTO dto =new StringDTO();
		dto.setKeyword(keyword);
		dto.setX(x);
		dto.setY(y);
		System.out.println(dto.toString());
		return postService.selectPostList(dto);
	}
}


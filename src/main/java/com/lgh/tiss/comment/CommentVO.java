package com.lgh.tiss.comment;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
@ToString
public class CommentVO {
	int id;
	String userId;
	int postId;
	String content;
	
}

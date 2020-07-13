package com.lgh.tiss.post;

import java.awt.Image;
import java.io.File;
import java.sql.Date;
import java.sql.Time;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter@Setter
@ToString
public class PostVO {
	int id;
	String title;
	String content;
	File image;
	String userId;
	double positionX;
	double positionY;
	Date date;
	Time time;
}

package com.recipe.domain;

import java.sql.Date;

public class RecipeVO {
	/*
	create table recipe(
		rno int not null auto_increment,
		title varchar(50) not null,
		content text not null,
		writer varchar(30) not null,
		date timestamp not null default now(),
		viewCnt int default 0,
		primary key(rno)
	);
	*/
	
	private int rno;
	private String title;
	private String content;
	private String writer;
	private Date date;
	private int viewCnt;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	
	
	
}

package com.recipe.dao;

import java.util.List;

import com.recipe.domain.RecipeVO;

public interface RecipeDAO {
	// 게시물 목록 
	public List<RecipeVO> list() throws Exception; 
	// 게시물 작성
	public void write(RecipeVO vo) throws Exception;
	// 게시물 조회
	public RecipeVO view(int rno) throws Exception;
	// 게시물 수정
	public void modify(RecipeVO vo) throws Exception;
	// 게시물 삭제
	public void delete(int rno) throws Exception;
	// 게시물 총 개수
	public int count() throws Exception;
	// 게시물 목록 + 페이징
	public List<RecipeVO> listPage(int displayPost, int postNum) throws Exception;
}

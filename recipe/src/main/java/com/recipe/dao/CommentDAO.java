package com.recipe.dao;

import java.util.List;

import com.recipe.domain.CommentVO;

public interface CommentDAO {
	// 댓글 조회
	public List<CommentVO> list(int rno) throws Exception;

	// 댓글 조회
	public void write(CommentVO vo) throws Exception;

	// 댓글 수정
	public void modify(CommentVO vo) throws Exception;

	// 댓글 삭제
	public void delete(CommentVO vo) throws Exception;
}

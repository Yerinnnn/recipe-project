package com.recipe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.recipe.dao.CommentDAO;
import com.recipe.domain.CommentVO;

@Service
public class CommentServiceImpl implements CommentService {
	
	private CommentDAO dao;

	@Override
	public List<CommentVO> list(int rno) throws Exception {
		// TODO Auto-generated method stub
		return dao.list(rno);
	}

	@Override
	public void write(CommentVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.write(vo);
	}

	@Override
	public void modify(CommentVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.modify(vo);
	}

	@Override
	public void delete(CommentVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(vo);
	}

}

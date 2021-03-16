package com.recipe.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.recipe.domain.CommentVO;

@Repository
public class CommentDAOImpl implements CommentDAO {
	
	@Inject
	private SqlSession sql;
	private static String namespace = "com.recipe.mappers.commentMapper";

	@Override
	public List<CommentVO> list(int rno) throws Exception {
		// TODO Auto-generated method stub
		return sql.selectList(namespace + ".commentList");
	}

	@Override
	public void write(CommentVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.insert(namespace + ".commentWrite", vo);
	}

	@Override
	public void modify(CommentVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.update(namespace + ".commentModify", vo);
	}

	@Override
	public void delete(CommentVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.delete(namespace + ".commentDelete", vo);
	}
	
}

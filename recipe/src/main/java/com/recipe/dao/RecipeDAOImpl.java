package com.recipe.dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.recipe.domain.RecipeVO;

@Repository
public class RecipeDAOImpl implements RecipeDAO {
	@Inject
	private SqlSession sql;
	private static String namespace = "com.recipe.mappers.recipe";

	@Override
	public List<RecipeVO> list() throws Exception {
		// TODO Auto-generated method stub
		return sql.selectList(namespace + ".list");
	}

	@Override
	public void write(RecipeVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.insert(namespace + ".write", vo);

	}

	@Override
	public RecipeVO view(int rno) throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne(namespace + ".view", rno);
	}

	@Override
	public void modify(RecipeVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.update(namespace + ".modify", vo);

	}

	@Override
	public void delete(int rno) throws Exception {
		// TODO Auto-generated method stub
		sql.delete(namespace + ".delete", rno);

	}

	@Override
	public int count() throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne(namespace + ".count");
	}

	@Override
	public List<RecipeVO> listPage(int displayPost, int postNum) throws Exception {
		// TODO Auto-generated method stub
		HashMap<String, Integer> data = new HashMap<String, Integer>();

		data.put("displayPost", displayPost);
		data.put("postNum", postNum);

		return sql.selectList(namespace + ".listPage", data);
	}

}

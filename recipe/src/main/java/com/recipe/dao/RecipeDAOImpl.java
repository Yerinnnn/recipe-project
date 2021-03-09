package com.recipe.dao;

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

}

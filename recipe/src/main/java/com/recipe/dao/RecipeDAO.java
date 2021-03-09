package com.recipe.dao;

import java.util.List;

import com.recipe.domain.RecipeVO;

public interface RecipeDAO {
	public List<RecipeVO> list() throws Exception; 
}

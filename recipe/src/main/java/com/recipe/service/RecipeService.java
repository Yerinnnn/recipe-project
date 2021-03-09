package com.recipe.service;

import java.util.List;

import com.recipe.domain.RecipeVO;

public interface RecipeService {
	public List<RecipeVO> list() throws Exception;
}

package com.recipe.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.recipe.dao.RecipeDAO;
import com.recipe.domain.RecipeVO;


@Service
public class RecipeServiceImpl implements RecipeService {
	@Inject
	private RecipeDAO dao;

	@Override
	public List<RecipeVO> list() throws Exception {
		// TODO Auto-generated method stub
		return dao.list();
	}

}

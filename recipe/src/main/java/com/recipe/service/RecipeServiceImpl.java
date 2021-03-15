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

	@Override
	public void write(RecipeVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.write(vo);

	}

	@Override
	public RecipeVO view(int rno) throws Exception {
		// TODO Auto-generated method stub
		return dao.view(rno);
	}

	@Override
	public void modify(RecipeVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.modify(vo);

	}

	@Override
	public void delete(int rno) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(rno);

	}

	@Override
	public int count() throws Exception {
		// TODO Auto-generated method stub
		return dao.count();
	}

	@Override
	public List<RecipeVO> listPage(int displayPost, int postNum) throws Exception {
		// TODO Auto-generated method stub
		return dao.listPage(displayPost, postNum);
	}

	@Override
	public List<RecipeVO> listPageSearch(int displayPost, int postNum, String searchType, String keyword)
			throws Exception {
		// TODO Auto-generated method stub
		return dao.listPageSearch(displayPost, postNum, searchType, keyword);
	}

	@Override
	public int searchCount(String searchType, String keyword) throws Exception {
		// TODO Auto-generated method stub
		return dao.searchCount(searchType, keyword);
	}

}

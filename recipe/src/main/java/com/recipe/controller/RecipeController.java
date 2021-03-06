package com.recipe.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.recipe.domain.CommentVO;
import com.recipe.domain.Page;
import com.recipe.domain.RecipeVO;
import com.recipe.service.CommentService;
import com.recipe.service.RecipeService;

@Controller
@RequestMapping("/recipe/*")

public class RecipeController {

	@Inject
	private RecipeService service;
	
	@Inject
	private CommentService commentService;
	
	// 게시물 목록
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void getList(Model model) throws Exception {

		List<RecipeVO> list = null;
		list = service.list();

		model.addAttribute("list", list);
	}

	// 게시물 작성
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void getWirte() throws Exception {

	}

	// 게시물 작성
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String posttWrite(RecipeVO vo) throws Exception {
		service.write(vo);

		return "redirect:/recipe/list";
	}

	// 게시물 조회
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public void getView(@RequestParam("rno") int rno, Model model) throws Exception {

		RecipeVO vo = service.view(rno);
		model.addAttribute("view", vo);
		
		// 댓글 조회
		List<CommentVO> comment = null;
		comment = commentService.list(rno);
		model.addAttribute("comment", comment);
	}

	// 게시물 수정
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void getModify(@RequestParam("rno") int rno, Model model) throws Exception {
		RecipeVO vo = service.view(rno);
		model.addAttribute("view", vo);

	}

	// 게시물 수정
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String postModify(RecipeVO vo) throws Exception {

		service.modify(vo);

		return "redirect:/recipe/view?rno=" + vo.getRno();
	}

	// 게시물 삭제
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String getDelete(@RequestParam("rno") int rno) throws Exception {

		service.delete(rno);

		return "redirect:/recipe/list";
	}

	// 게시물 목록 + 페이징 추가
	@RequestMapping(value = "/listPage", method = RequestMethod.GET)
	public void getListPage(Model model, @RequestParam("num") int num) throws Exception {

		Page page = new Page();

		page.setNum(num);
		page.setCount(service.count());

		List<RecipeVO> list = null;
		list = service.listPage(page.getDisplayPost(), page.getPostNum());

		model.addAttribute("list", list);

		model.addAttribute("page", page);

		model.addAttribute("select", num);

	}

	// 게시물 목록 + 페이징 추가
	@RequestMapping(value = "/listPageSearch", method = RequestMethod.GET)
	public void getListPageSearch(Model model, @RequestParam("num") int num,
			@RequestParam(value = "searchType", required = false, defaultValue = "title") String searchType,
			@RequestParam(value = "keyword", required = false, defaultValue = "") String keyword) throws Exception {

		Page page = new Page();

		page.setNum(num);
		page.setCount(service.searchCount(searchType, keyword));
		
		// 검색 타입과 검색어
		page.setSearchType(searchType);
		page.setKeyword(keyword);

		List<RecipeVO> list = null;
		list = service.listPageSearch(page.getDisplayPost(), page.getPostNum(), searchType, keyword);

		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("select", num);
	}
}

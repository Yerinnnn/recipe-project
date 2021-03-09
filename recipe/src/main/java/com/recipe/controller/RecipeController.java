package com.recipe.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.recipe.domain.RecipeVO;
import com.recipe.service.RecipeService;

@Controller
@RequestMapping("/recipe/*")

public class RecipeController {

	@Inject
	RecipeService service;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void getList(Model model) throws Exception {

		List<RecipeVO> list = null;
		list = service.list();

		model.addAttribute("list", list);
	}

}

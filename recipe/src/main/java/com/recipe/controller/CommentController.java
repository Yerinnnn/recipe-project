package com.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.recipe.service.CommentService;

@Controller
@RequestMapping("/recipe/") 
public class CommentController {
	private CommentService commentService;
}

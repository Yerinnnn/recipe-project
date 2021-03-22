package com.recipe.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.recipe.domain.CommentVO;
import com.recipe.service.CommentService;

@Controller
@RequestMapping("comment/*") 
public class CommentController {
	@Inject
	private CommentService commentService;
	
	// 댓글 작성
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String posttWirte(CommentVO vo) throws Exception {
	    
	    commentService.write(vo);
	    
	    return "redirect:/recipe/view?rno=" + vo.getRno();
	}
	
	
}

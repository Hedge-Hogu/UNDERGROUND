package com.board.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.domain.ReplyVO;
import com.board.service.ReplyService;

@Controller
@RequestMapping("/reply/*")
public class ReplyController {
	
	@Inject
	private ReplyService service;
	
	// 댓글 조회
	/*
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void getList(
			@RequestParam int bno, Model model) throws Exception {
		
		List<ReplyVO> list = null;
		list = service.list(bno);
		
		model.addAttribute("list" ,list);
	}
	*/
	
	// 댓글 작성
	
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String getWrite(ReplyVO vo) throws Exception {
		
		service.write(vo);
		
		return "redirect:/board/view?bno="+vo.getBno();
	}
	
	// 댓글 수정

	// 댓글 삭제
	
}

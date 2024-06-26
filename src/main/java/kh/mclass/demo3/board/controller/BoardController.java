package kh.mclass.demo3.board.controller;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.mclass.demo3.board.model.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	
	@GetMapping("")	
	public String list(Model md) {
		md.addAttribute("boardlist",boardService.selectAll());
		return "aaa";
//		return "board/all";
	}
	
	@GetMapping("/{boardId}")	
	public String boardAll(@PathVariable String boardId) {
		
		return "aaa";
	}
	@Delete("/{boardId}")	
	public String delete(@PathVariable String boardId) {
		return "aaa";
//		return "board/all";
	}
}

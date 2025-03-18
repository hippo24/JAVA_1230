package kr.kh.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.kh.spring.model.vo.PostVO;
import kr.kh.spring.service.PostService;

@Controller
public class PostController {

	@Autowired
	private PostService boardService;
	
	@GetMapping("/board/list")
	public String boardList(Model model) {
		//게시글 목록 전체를 가져옴
		List<PostVO> list = boardService.getBoardList();	
		//화면에 게시글 목록을 전송
		//매퍼의 resultType=kr.kh.spring.model.vo.BoardVO
		model.addAttribute("list", list);
		return "/board/list";
	}
}
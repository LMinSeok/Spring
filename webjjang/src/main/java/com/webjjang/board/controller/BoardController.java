package com.webjjang.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webjjang.board.service.BoardService;
import com.webjjang.board.vo.BoardVO;
import com.webjjang.util.page.PageObject;

import lombok.Getter;
import lombok.Setter;

/*
 * 자동 생성 - @Controller, @Service, @Repository, @Component, @Advice, @RestController
 * servlet - context.xml, root-context.xml에 설정되어 있어야만 한다.
 */
@Controller
// URL 매핑 - 클래스 위에 붙인 것은 앞에 붙이는 URL
@Setter
@Getter
@RequestMapping("/board")
public class BoardController {

	// 자동 DI - @Autowire : spring, @Inject : javax
	@Autowired
	// 동일한 타입의 객체가 있는 경우 설정
	@Qualifier("boardServiceImpl")
	private BoardService service;

	@GetMapping("/list.do")
	// jsp에 데이터를 전달하려면 Model을 파라메터로 받는다. -> request에 데이터가 담기게 된다.
	public String list(Model model, PageObject pageObject) throws Exception {
		System.out.println("BoardController.list()");
		model.addAttribute("list", service.list(pageObject));
		System.out.println("BoardController.list().model - " + model);
		// jsp 정보 - servlet-context.xml 설정
		// /WEB-INF/views/ + board/list + .jsp
		return "board/list";
	}

	// 글보기
	@GetMapping("/view.do")
	// jsp에 데이터를 전달하려면 Model을 파라메터로 받는다. -> request에 데이터가 담기게 된다.
	public String view(Long no, int inc, Model model) throws Exception {
		System.out.println("BoardController.view().no / inc = " + no + "/" + inc);
		model.addAttribute("vo", service.view(no, inc));
		// jsp 정보 - servlet-context.xml 설정
		// /WEB-INF/views/ + board/view + .jsp
		return "board/view";
	}

	// 글 등록 폼
	@GetMapping("/write.do")
	public String writeForm() throws Exception {
		System.out.println("BoardController.writeForm()");
		// jsp 정보 - servlet-context.xml 설정
		// /WEB-INF/views/ + board/write + .jsp
		return "board/write";
	}

	// 글 등록 처리
	@PostMapping("/write.do")
	public String write(BoardVO vo) throws Exception {
		System.out.println("BoardController.write().vo" + vo);
		service.write(vo);
		// 이동 URL 정보 : 앞에 "redirect:"을 붙여야 합니다.
		return "redirect:list.do";
	}

	// 글 수정 폼
	@GetMapping("/update.do")
	public String updateForm(Long no, Model model) throws Exception {
		System.out.println("BoardController.updateForm()");
		model.addAttribute("vo", service.view(no, 0));
		// jsp 정보 - servlet-context.xml 설정
		// /WEB-INF/views/ + board/write + .jsp
		return "board/update";
	}

	// 글 수정 처리
	@PostMapping("/update.do")
	public String update(BoardVO vo) throws Exception {
		System.out.println("BoardController.update().vo" + vo);
		service.update(vo);
		// 이동 URL 정보 : 앞에 "redirect:"을 붙여야 합니다.
		return "redirect:view.do?no=" + vo.getNo() + "&inc=0";
	}

	// 글 삭제 처리
	@PostMapping("/delete.do")
	public String delete(BoardVO vo) throws Exception {
		System.out.println("BoardController.delete().vo" + vo);
		service.delete(vo);
		// 이동 URL 정보 : 앞에 "redirect:"을 붙여야 합니다.
		return "redirect:list.do";
	}

}

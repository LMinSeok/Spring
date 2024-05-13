package com.webjjang.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webjjang.board.service.BoardService;

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
	private BoardService Service;

	@GetMapping("/list.do")
	public String list() {
		System.out.println(("BoardController.list()"));
		return "board/list";
	}

}

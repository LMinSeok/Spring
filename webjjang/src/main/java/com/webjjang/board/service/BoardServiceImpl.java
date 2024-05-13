package com.webjjang.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.webjjang.board.vo.BoardVO;

/*
 * 자동 생성 - @Controller, @Service, @Repository, @Component, @Advice, @RestController
 * servlet - context.xml, root-context.xml에 설정되어 있어야만 한다.
 */
@Service
// 동일한 타입의 객체가 있는 경우 설정
@Qualifier("boardServiceImpl")
public class BoardServiceImpl implements BoardService {

	@Override
	public List<BoardVO> list() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("BoardService.list()");
		return null;
	}

}

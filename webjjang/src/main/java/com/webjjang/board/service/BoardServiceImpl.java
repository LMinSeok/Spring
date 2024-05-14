package com.webjjang.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.webjjang.board.mapper.BoardMapper;
import com.webjjang.board.vo.BoardVO;

import lombok.Data;

/*
 * 자동 생성 - @Controller, @Service, @Repository, @Component, @Advice, @RestController
 * servlet - context.xml, root-context.xml에 설정되어 있어야만 한다.
 */
@Service
// 동일한 타입의 객체가 있는 경우 설정
@Data
@Qualifier("boardServiceImpl")
public class BoardServiceImpl implements BoardService {

	// 자동DI - @Autowired, @Inject
	@Inject
	private BoardMapper mapper;

	@Override
	public List<BoardVO> list() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("BoardService.list()");
		return mapper.list();
	}

	@Override
	public Integer write(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.write(vo);
	}

}

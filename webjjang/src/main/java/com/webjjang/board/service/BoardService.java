package com.webjjang.board.service;

import java.util.List;

import com.webjjang.board.vo.BoardVO;

public interface BoardService {

	// list
	public List<BoardVO> list() throws Exception;

}

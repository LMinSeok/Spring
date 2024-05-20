package com.webjjang.board.service;

import java.util.List;

import com.webjjang.board.vo.BoardVO;
import com.webjjang.util.page.PageObject;

public interface BoardService {

	// list
	public List<BoardVO> list(PageObject pageObject) throws Exception;

	// view
	public BoardVO view(Long no, int inc) throws Exception;

	// write
	public Integer write(BoardVO vo) throws Exception;

	// update
	public Integer update(BoardVO vo) throws Exception;

	// delete
	public Integer delete(BoardVO vo) throws Exception;
}

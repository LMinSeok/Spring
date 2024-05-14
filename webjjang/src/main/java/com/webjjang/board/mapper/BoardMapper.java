package com.webjjang.board.mapper;

import java.util.List;

import com.webjjang.board.vo.BoardVO;

public interface BoardMapper {

	// list
	public List<BoardVO> list();

	// write
	public Integer write(BoardVO vo);
}

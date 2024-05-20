package com.webjjang.board.mapper;

import java.util.List;

import com.webjjang.board.vo.BoardVO;
import com.webjjang.util.page.PageObject;

public interface BoardMapper {

	// list
	public List<BoardVO> list(PageObject pageObject);

	// view(select)
	public BoardVO view(Long no);

	// increase(update)
	public Integer increase(Long no);

	// write
	public Integer write(BoardVO vo);

	// update
	public Integer update(BoardVO vo);

	// delete
	public Integer delete(BoardVO vo);
}

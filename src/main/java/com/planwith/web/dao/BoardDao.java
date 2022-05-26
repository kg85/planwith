package com.planwith.web.dao;

import com.planwith.web.domain.BoardDto;

import java.util.List;

public interface BoardDao {
    List<BoardDto> selectAll() throws Exception;
}

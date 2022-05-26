package com.planwith.web.dao;

import com.planwith.web.domain.BoardDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDaoimpl implements BoardDao {
    @Autowired
    private SqlSession session;

    private static String namespace = "com.planwith.web.dao.BoardMapper.";

    @Override
    public List<BoardDto> selectAll() throws Exception {
        return session.selectList(namespace + "selectAll");
    }
}

package com.planwith.web.dao;

import com.planwith.web.domain.BoardDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class BoardDaoimplTest {
    @Autowired
    private BoardDao boardDao;

    @Test
    public void selectAllTest() throws Exception {
        boardDao.selectAll();
        List<BoardDto> list = boardDao.selectAll();
        System.out.println("list = " + list);
        assertTrue(list.size()==1);
    }
}
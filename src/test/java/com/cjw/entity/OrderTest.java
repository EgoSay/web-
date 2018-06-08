package com.cjw.entity;

import com.cjw.mapper.OrderMapper;
import com.cjw.mapper.UserMapper;
import com.cjw.untils.mybatisUtils;
import com.cjw.vo.QueryVo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author codeAC
 * @date 2018/6/3 17:36
 */
public class OrderTest {
    private  static SqlSessionFactory sqlSessionFactory;
    public OrderTest() throws IOException {
        sqlSessionFactory = mybatisUtils.getSessionFactory("SqlConfig.xml");
    }
    @Test
    public void test1(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orders = orderMapper.selectOrdersList();
        for (Order order : orders) {
            System.out.println(order);
        }
        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession OneToOneSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = OneToOneSession.getMapper(OrderMapper.class);
        List<Order> orders = orderMapper.selectOrders();
        for (Order order : orders) {
            System.out.println(order);
        }
        OneToOneSession.close();
    }

    @Test
    public void test3(){
        SqlSession OneToOneSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = OneToOneSession.getMapper(OrderMapper.class);
        List<Integer> orderId = new ArrayList<Integer>();
        orderId.add(3);
        orderId.add(4);
        orderId.add(5);
        QueryVo vo = new QueryVo();
        vo.setIdsList(orderId);
        List<Order> orders = orderMapper.queryOrderByIds(vo);
        for (Order order : orders) {
            System.out.println(order);
        }
        OneToOneSession.close();
    }
    @Test
    public void test4() {
        SqlSession OneToMoreSession = sqlSessionFactory.openSession();
        try {

            OrderMapper orderMapper = OneToMoreSession.getMapper(OrderMapper.class);
            List<User> users = orderMapper.selectUserList();
            for (User user : users) {
                System.out.println(user);
            }
        }finally {
            OneToMoreSession.close();
        }

    }
}
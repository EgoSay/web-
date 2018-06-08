package com.cjw.entity;

import com.cjw.dao.UserDao;
import com.cjw.dao.UserDaoImpl;
import com.cjw.mapper.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author codeAC
 * @date 2018/6/7 17:06
 * Spring初步整合mybatis
 */
public class UserTest2 {
    private ApplicationContext context;

    @Before
    public void setUp() {
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    /**
     * 原始Dao开发
     */
    @Test
    public void test1(){
        UserDao userDao = this.context.getBean(UserDao.class);
        User user = userDao.queryById(10);
        System.out.println(user);
    }

    /**
     * mapper动态代理
     */
    @Test
    public void test2(){
        UserMapper userMapper = this.context.getBean(UserMapper.class);
        User user = userMapper.queryUserByUserId(10);
        System.out.println(user);
    }
}

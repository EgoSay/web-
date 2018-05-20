package com.cjw.bean;

import com.cjw.bean.DI.CollectionBean;
import com.cjw.bean.DI.UserDI;
import com.cjw.bean.constructor.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author codeAC
 * @date 2018/5/20 17:09
 */
public class UserTest {
    @Test
    public void test1() {
        ApplicationContext context  =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User user  = (User) context.getBean("user");
        System.out.println(user);
    }
    @Test
    public void test2() {
        ApplicationContext context  =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User user  = (User) context.getBean("user2");
        System.out.println(user);
    }
    @Test
    public void test3() {
        ApplicationContext context  =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User user  = (User) context.getBean("user3");
        System.out.println(user);
    }

    /**
     * 注入值测试方法
     */
    @Test
    public void test4() {
        ApplicationContext context  =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDI user  = (UserDI) context.getBean("userConstructor");
        System.out.println(user);
    }
    @Test
    public void test5() {
        ApplicationContext context  =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean Collections = (CollectionBean) context.getBean("Collections");
        System.out.println(Collections);
    }
}
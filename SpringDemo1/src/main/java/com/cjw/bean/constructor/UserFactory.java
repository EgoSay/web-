package com.cjw.bean.constructor;

/**
 * @author codeAC
 * @date 2018/5/20 19:52
 */
public class UserFactory {
    public static User createUser(){

        System.out.println("静态工厂创建User");

        return new User();

    }

    public  User createUser2(){

        System.out.println("实例工厂创建User");

        return new User();

    }
}

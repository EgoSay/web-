package com.cjw.untils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * @author codeAC
 * @date 2018/5/15 19:41
 */
public class HibernateUntils {

    private static SessionFactory sf;

    static{
        //1 创建,调用空参构造
        Configuration conf = new Configuration().configure();
        //2 根据配置信息,创建 SessionFactory对象
        sf = conf.buildSessionFactory();
    }

    //获得session => 获得全新session
    public static Session openSession(){
        //3 获得session

        return sf.openSession();

    }
    //获得session => 获得与线程绑定的session
    public static Session getCurrentSession(){
        //3 获得session
        return sf.getCurrentSession();
    }


}

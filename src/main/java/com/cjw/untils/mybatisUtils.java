package com.cjw.untils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author codeAC
 * @date 2018/5/30 15:27
 */
public class mybatisUtils {
    private static InputStream inputStream;
    private static SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
   public static SqlSessionFactory getSessionFactory(String path) throws IOException {
       inputStream = Resources.getResourceAsStream(path);
       return sqlSessionFactoryBuilder.build(inputStream);
   }
}

package com.cjw.entity;

import com.cjw.mapper.UserMapper;
import com.cjw.untils.mybatisUtils;
import com.cjw.vo.QueryVo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.List;


/**
 * @author codeAC
 * @date 2018/5/30 15:06
 */
public class UserTest {
    private  static SqlSessionFactory sqlSessionFactory;
    public UserTest() throws IOException {
        sqlSessionFactory = mybatisUtils.getSessionFactory("SqlConfig.xml");
    }
    /* 根据用户id查询 */
    @Test
    public void  test1() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("queryUserByUserId",1);
        System.out.println(user.toString());
        sqlSession.close();
   }
    /**
     * 添加用户
     */
    @Test
    public void test2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user  = new User();
        user.setUsername("insertTest1");
        user.setAddress("666");
        user.setSex("m");
        user.setBirthday(new Date());

        if(sqlSession.insert("insertUser",user)!=0){
            sqlSession.commit();
        }
        else {
            sqlSession.rollback();
        }
        System.out.println(user.getId());
        sqlSession.close();
    }

    /**
     * 根据用户名模糊查询
     */
    @Test
    public void test3(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList("findUserAsLike", "in");
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    /**
     * 更新用户
     */
    @Test
    public void test4() {
        SqlSession updateSession = sqlSessionFactory.openSession();
        updateSession.update("updateUser",2);
        updateSession.commit();
        updateSession.close();
    }
    /**
     * 删除用户
     */
    @Test
    public void test5(){
        SqlSession deleteSession = sqlSessionFactory.openSession();
        deleteSession.delete("deleteUser",3);
        deleteSession.commit();
        deleteSession.close();
    }
    /**
     * 包装类为输入参数
     */
    @Test
    public void test6(){
        // mybatis和spring整合，整合之后，交给spring管理
        SqlSession voSession = sqlSessionFactory.openSession();
        // 创建Mapper接口的动态代理对象，整合之后，交给spring管理
        UserMapper userMapper = voSession.getMapper(UserMapper.class);
        QueryVo queryVo = new QueryVo();
        User user = new User();
        user.setUsername("in");
        queryVo.setUser(user);
        List<User> users = userMapper.findUserByQueryVo(queryVo);
        for (User user1 : users) {
            System.out.println(user1);
        }
        voSession.close();
    }
    /**
     * 输出类型之resultMap
     */
    @Test
    public void test7(){

    }

    /**
     * if wherr 条件查询
     */
    @Test
    public void test8() {
        SqlSession criteriaSession = sqlSessionFactory.openSession();
        UserMapper userMapper = criteriaSession.getMapper(UserMapper.class);
        User user = new User();
        user.setSex("m");
        user.setUsername("in");
        List<User> users = userMapper.queryUserByWhere(user);
        for (User user1 : users) {
            System.out.println(user1);
        }
    }



}
package com.cjw.dao;

import com.cjw.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    public User queryById(int id) {
        SqlSession sqlSession = super.getSqlSession();
        return sqlSession.selectOne("queryUserByUserId", id);
    }
}

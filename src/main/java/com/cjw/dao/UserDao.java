package com.cjw.dao;

import com.cjw.entity.User;

/**
 * @author codeAC
 * @date 2018/5/30 14:17
 */
public interface UserDao {
    User queryById(int id);
}

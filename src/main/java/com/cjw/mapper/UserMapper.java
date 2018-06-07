package com.cjw.mapper;

import com.cjw.entity.Order;
import com.cjw.entity.User;
import com.cjw.vo.QueryVo;

import java.util.List;

/**
 * @author codeAC
 * @date 2018/5/30 14:25
 */
public interface UserMapper {
    User queryUserByUserId(int id);

    /**
     * 模糊查找
     */
    User findUserAsLike();

    /**
     * 添加
     */
    void insertUser();

    /**
     * 更新
     */
    void updateUser();

    /**
     * 删除
     */
    void deleteUser();

    List<User> findUserByQueryVo(QueryVo vo);

    List<User> queryUserByWhere(User user);
}

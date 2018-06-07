package com.cjw.mapper;

import com.cjw.entity.Order;
import com.cjw.entity.User;
import com.cjw.vo.QueryVo;

import java.util.List;

/**
 * @author codeAC
 * @date 2018/6/3 17:25
 */
public interface OrderMapper {

    List<Order> selectOrdersList();

    List<Order> queryOrderByIds(QueryVo vo);

    /**
     *  一对一关联 查询  以订单为中心 关联用户
     */
    List<Order> selectOrders();

    /**
     *一对多关联
     */
    List<User> selectUserList();
}

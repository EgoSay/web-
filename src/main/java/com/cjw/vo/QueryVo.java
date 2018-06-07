package com.cjw.vo;

import com.cjw.entity.User;

import java.util.List;

/**
 * @author codeAC
 * @date 2018/6/3 16:14
 */
public class QueryVo {

    private User user;
    private List<Integer> idsList;

    private Integer[] ids;


    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public List<Integer> getIdsList() {
        return idsList;
    }

    public void setIdsList(List<Integer> idsList) {
        this.idsList = idsList;
    }

    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }
}

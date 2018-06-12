package com.cjw.test.service;

import com.cjw.test.po.Items;

import java.util.List;

/**
 * @author codeAC
 * @date 2018/6/10
 */
public interface ItemServices {
    List<Items> queryItems();
    Items queryItemsById(int id);
    void updateItemById(Items items);

    void insertItem();
}

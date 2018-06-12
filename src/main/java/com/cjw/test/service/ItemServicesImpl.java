package com.cjw.test.service;

import com.cjw.test.mapper.ItemsMapper;
import com.cjw.test.po.Items;
import com.cjw.test.po.ItemsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author codeAC
 * @date 2018/6/10
 */
@Service
public class ItemServicesImpl  implements ItemServices {
    @Autowired
    private ItemsMapper itemsMapper;

    public List<Items> queryItems() {
        return itemsMapper.selectByExample(new ItemsExample());
    }

    public Items queryItemsById(int id) {
        return itemsMapper.selectByPrimaryKey(id);
    }

    public void updateItemById(Items items) {
        items.setCreatetime(new Date());

        itemsMapper.updateByPrimaryKeySelective(items);

        System.out.println(items);
    }

    public void insertItem() {
        Items items = new Items();
        items.setDetail("insert");
        //items.setCreatetime(new Date());
        items.setId(4);
        items.setName("rafs");
    }
}

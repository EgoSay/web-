package com.cjw.dao;

import java.util.List;

/**
 * @author codeAC
 * @date 2018/5/15 19:49
 */
public interface ProductDao {
    List<Object> findProductByWord(String word);
}

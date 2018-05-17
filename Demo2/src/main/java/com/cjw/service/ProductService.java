package com.cjw.service;

import com.cjw.dao.ProductDao;
import com.cjw.dao.ProductDaoImpl;
import com.cjw.entity.Product;
import com.google.gson.Gson;

import java.util.List;

/**
 * @author codeAC
 * @date 2018/5/15 18:12
 */
public class ProductService {
    public List<Object> findProductByWord(String word){
        ProductDao productDao = new ProductDaoImpl();
        return productDao.findProductByWord(word);
    }

   /* public static void main(String[] args) {
        ProductService test = new ProductService();
        List<Product> productList = test.findProductByWord("小米");
        Gson gson = new Gson();
        String json = gson.toJson(productList);
        System.out.println(json);

    }*/

}

package com.cjw.web;

import com.cjw.service.ProductService;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

/**
 * @author codeAC
 * @date 2018/5/15 17:28
 */
public class AjaxServlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws IOException {

        String word =  request.getParameter("word");
        ProductService productService = new ProductService();
        List<Object> productList = null;
        try {
            productList = productService.findProductByWord(word);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        Gson gson = new Gson();
        String json = gson.toJson(productList);
        System.out.println(json);
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write(json);
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException {
        doPost(request,response);
    }
}

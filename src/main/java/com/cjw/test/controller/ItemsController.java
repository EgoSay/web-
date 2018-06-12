package com.cjw.test.controller;

import com.cjw.test.po.Items;
import com.cjw.test.po.QueryVo;
import com.cjw.test.service.ItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author codeAC
 * @date 2018/6/10
 */
@Controller
public class ItemsController {

    @Autowired
    private ItemServices itemServices;

    @RequestMapping(value = "/itemList.action")
    public ModelAndView itemList() {
        List<Items> items = itemServices.queryItems();
        // 创建ModelAndView，用来存放数据和视图
        ModelAndView modelAndView = new ModelAndView();
        // 设置数据到模型中
        modelAndView.addObject("itemList",items);
        // 设置视图jsp，需要设置视图的物理地址
        modelAndView.setViewName("itemList");
        return modelAndView;

    }

    /*@RequestMapping("/itemEdit")
    public ModelAndView queryItemById(HttpServletRequest request){
        String strid = request.getParameter("id");
        Integer id = Integer.valueOf(strid);
        Items items = itemServices.queryItemsById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemList",items);
        modelAndView.setViewName("editItem");
        return modelAndView;
    }*/
   /* @RequestMapping("/itemEdit")
    public String queryItemById(HttpServletRequest request, Model model){

        String strid = request.getParameter("id");
        Integer id = Integer.valueOf(strid);
        Items items = itemServices.queryItemsById(id);
        model.addAttribute("itemList",items);
        return "editItem";
    }*/
    /**
     * ModelMap是Model接口的实现类，也可以通过ModelMap向页面传递数据
     * 使用@RequestParam常用于处理简单类型的绑定(不是必须，建议直接简单参数绑定即可)
     *
     * value：参数名字，即入参的请求参数名字，必须与jsp页面的属性值一致
     *
     * required：是否必须，默认是true，表示请求中一定要有相应的参数，不能为空，否则将报错
     * TTP Status 400 - Required Integer parameter 'XXXX' is not present
     *
     * defaultValue：默认值，表示如果请求中没有同名参数时的默认值
     */
    @RequestMapping("/itemEdit")
    public String toItemsEdit(Integer id, ModelMap model){
        Items items = itemServices.queryItemsById(id);
        model.addAttribute("item",items);
        return "editItem";
    }

    /**
     * 修改更新信息
     */
    @RequestMapping("/updateitem")
    /*public String updateItem(Items items){*/
    public String updateItem(QueryVo vo){

        itemServices.updateItemById(vo.getItems());

        return "redirect:/itemList.action";
    }
    /**
     * 删除信息
     */
    @RequestMapping(value = "/delete.action")
    public String deleteItemById(Integer[] ids){

        return "success";
    }
}


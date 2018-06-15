package com.cjw.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author codeAC
 * @Date: 2018/6/15
 * @Time: 16:23
 */
@RequestMapping("user")
@Controller
public class UserController {

    @RequestMapping("/tologin")
    public String tologin(){
        return "login";
    }
    @RequestMapping("/login")
    public String login(String username, String password,HttpSession httpSession) {

        httpSession.setAttribute("username",username);
        return "redirect:/itemList.action";
    }
}

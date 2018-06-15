package com.cjw.test.utils;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author codeAC
 * @Date: 2018/6/15
 * @Time: 15:36
 * 判断用户是否登陆  如果没有登陆  重定向到登陆页面   不放行   如果登陆了  就放行了
 */
public class LoginInterceptor implements HandlerInterceptor {

    private final String admin = "admin";
    private final String pwd = "123";

    /**
     *  Controller执行前调用此方法
     * 	返回true表示继续执行，返回false中止执行
     * 	这里可以加入登录校验、权限拦截等
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        if(!requestURI.contains("/login")){
            String username = (String) request.getSession().getAttribute("username");
            if(null == username){
                response.sendRedirect(request.getContextPath()+"/user/tologin.action");
                return false;
            }
        }
        else{
            System.out.println("666");

        }
        return true;
    }

    /**
     * controller执行后但未返回视图前调用此方法
     * 这里可在返回用户前对模型数据进行加工处理，比如这里加入公用信息以便页面显示
     */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
     * controller执行后且视图返回后调用此方法
     * 这里可得到执行controller时的异常信息
     * 这里可记录操作日志
     */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

    }
}

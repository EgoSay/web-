package com.cjw.test.utils;

import com.cjw.test.vo.MyException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/**
 * @author codeAC
 * @Date: 2018/6/14
 * @Time: 12:51
 */
public class ItemsHandlerException implements HandlerExceptionResolver {
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        String message;
        if (ex instanceof MyException){
            /*如果是自定义异常，读取异常信息*/
            message = ex.getMessage();
        }
        else {
            Writer out = new StringWriter();
            PrintWriter printWriter = new PrintWriter(out);
            ex.printStackTrace(printWriter);
            message = out.toString();
        }
        //返回错误页面，给用户友好页面显示错误
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message",message);
        modelAndView.setViewName("error");
        return modelAndView;
    }
}

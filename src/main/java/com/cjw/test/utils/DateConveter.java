package com.cjw.test.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author codeAC
 * @Date: 2018/6/11
 * @Time: 20:57
 */
public class DateConveter implements Converter<String,Date> {
    public Date convert(String source) {
        try {
            if(null != source){//2016:11-05 11_43-50
                DateFormat df = new SimpleDateFormat("yyyy:MM-dd HH_mm-ss");
                return df.parse(source);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }
}

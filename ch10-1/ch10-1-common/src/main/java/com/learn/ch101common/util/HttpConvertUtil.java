package com.learn.ch101common.util;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Ge Xiantao
 * @Date: 2019/6/4
 * @Time: 11:11
 */
public class HttpConvertUtil {

    public static Map<String, String> requestToMap(HttpServletRequest httpServletRequest) {
        Enumeration<String> headerNames = httpServletRequest.getHeaderNames();
        Map<String, String> map = new HashMap<>();
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            String header = httpServletRequest.getHeader(name);
            map.put(name, header);
        }
        return map;
    }

}

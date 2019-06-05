package com.learn.ch101zuulserver.filter;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpStatus;
import com.learn.ch101common.util.HttpConvertUtil;
import com.learn.ch101common.vo.User;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

import java.util.Map;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * @Author: Ge Xiantao
 * @Date: 2019/6/4
 * @Time: 11:39
 */
public class AuthFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        auth(currentContext);
        return null;
    }

    private static void auth(RequestContext requestContext) {
        HttpServletRequest request = requestContext.getRequest();
        Map<String, String> header = HttpConvertUtil.requestToMap(request);
        String userId = header.get(User.USER_ID.toLowerCase());
        if (StrUtil.isBlank(userId)) {
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(HttpStatus.HTTP_UNAUTHORIZED);
            requestContext.setResponseBody("userId is null");
        } else {
            header.forEach(requestContext::addZuulRequestHeader);
        }
    }

}

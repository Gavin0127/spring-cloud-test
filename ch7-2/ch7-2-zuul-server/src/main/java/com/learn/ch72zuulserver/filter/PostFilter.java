package com.learn.ch72zuulserver.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.POST_TYPE;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/15 16:22
 */
public class PostFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("这是" + this.getClass().getName());
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.getResponse().setCharacterEncoding("UTF-8");
        String responseBody = ctx.getResponseBody();
        if (null != responseBody) {
            ctx.setResponseStatusCode(500);
            ctx.setResponseBody(responseBody);
        }
        return null;
    }
}

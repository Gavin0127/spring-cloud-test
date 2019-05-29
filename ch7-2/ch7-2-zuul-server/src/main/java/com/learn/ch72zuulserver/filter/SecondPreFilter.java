package com.learn.ch72zuulserver.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/15 15:48
 */
public class SecondPreFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 2;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("这是" + this.getClass().getName());
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String a = request.getParameter("a");
        if (null == a) {
            ctx.setSendZuulResponse(false);
            ctx.setResponseBody("{\"status\":500, \"message\":\"a参数为空！\"}");
            ctx.set("logic-is-success", false);
            return null;
        }
        ctx.set("logic-is-success", true);
        return null;
    }
}

package com.example.demo;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by 刘亚斌 on 2018/7/3.
 */
@Component
public class TockenFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
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
        RequestContext requestCtx = RequestContext.getCurrentContext();
        HttpServletRequest request =  requestCtx.getRequest();
        String token = request.getParameter("tocken");
        if(token == null){
            try {
                requestCtx.setSendZuulResponse(false);
                requestCtx.setResponseStatusCode(401);
                requestCtx.getResponse().getWriter().write("tocken is empty");
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        return null;
    }
}

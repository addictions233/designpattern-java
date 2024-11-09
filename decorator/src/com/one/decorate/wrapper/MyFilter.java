package com.one.decorate.wrapper;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author one
 * @date 2024-11-9
 */
@WebFilter(urlPatterns = {"/**"})
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        MyHttpRequestServlet MyHttpServletRequest = new MyHttpRequestServlet((HttpServletRequest) request);
        // 对httpServletRequest中设置参数
        MyHttpServletRequest.setParameter("name", "zhangsan");
        chain.doFilter(MyHttpServletRequest, response);
    }
}

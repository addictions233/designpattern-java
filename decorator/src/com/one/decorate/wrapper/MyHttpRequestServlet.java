package com.one.decorate.wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.HashMap;
import java.util.Map;

/**
 * @author one
 * @description HttpServletRequestWrapper采用装饰者设计模式对HttpServletRequest进行包装，
 * 我们可以通过继承HttpServletRequestWrapper 类去重写getParameterValues，getParameter等方法，
 * 实际还是调用HttpServletRequest的相对应方法，但是可以对方法的结果进行改装。
 * @date 2024-11-9
 */
public class MyHttpRequestServlet extends HttpServletRequestWrapper {

    /**
     * 定义参数集合
     */
    private Map<String, String[]> parameterMaps;

    /**
     * Constructs a request object wrapping the given request.
     *
     * @param request the {@link HttpServletRequest} to be wrapped.
     * @throws IllegalArgumentException if the request is null
     */
    public MyHttpRequestServlet(HttpServletRequest request) {
        super(request);
        parameterMaps = new HashMap<>(request.getParameterMap());
    }

    @Override
    public String[] getParameterValues(String name) {
        String[] values = this.parameterMaps.get(name);
        if (values == null) {
            values = super.getParameterValues(name);
        }
        return values;
    }

    /**
     * 设置参数
     */
    public void setParameter(String name, String... value) {
        parameterMaps.put(name, value);
    }
}

package com.one.filter.union;

import com.one.handler.AbstractHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.servlet.http.*;
import java.util.List;

/**
 * @author one
 * 对责任链对象进行统一配置处理,将过滤器对象排列成链状
 */
@Component("ChainPatternDemo")
public class ChainPatternDemo {

    /**
     * 自动注入各个责任链的对象,利用springboot的将同种类型的bean对象注入到list集合中
     */
    @Autowired
    private List<AbstractHandler> abstractHandleList;

    private AbstractHandler abstractHandler;

    /**
     * spring注入后自动执行，责任链的对象连接起来
     */
    @PostConstruct
    public void initializeChainFilter() {
        for (int i = 0; i < abstractHandleList.size(); i++) {
            if (i == 0) {
                abstractHandler = abstractHandleList.get(0);
            } else {
                AbstractHandler currentHandler = abstractHandleList.get(i - 1);
                AbstractHandler nextHandler = abstractHandleList.get(i);
                currentHandler.setNextHandler(nextHandler);
            }
        }
    }

    /**
     * 通过这个方法,可以调用所有的责任链中绑定的filterObject
     *
     * @param request 请求对象
     * @param response 响应对象
     * @return HttpServletResponse
     */
    public HttpServletResponse execute(HttpServletRequest request, HttpServletResponse response) {
        abstractHandler.filter(request, response);
        return response;
    }

    public AbstractHandler getAbstractHandler() {
        return abstractHandler;
    }

    public void setAbstractHandler(AbstractHandler abstractHandler) {
        this.abstractHandler = abstractHandler;
    }
}
package com.one.filter;

import com.one.handler.AbstractHandler;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import javax.servlet.http.*;
/**
 *  安全校验对象
 */
@Component
@Order(2) //校验顺序排第2
public class CheckSecurityFilterObject extends AbstractHandler {

    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response) {
        //invoke Security check
        System.out.println("安全调用校验");
    }
}
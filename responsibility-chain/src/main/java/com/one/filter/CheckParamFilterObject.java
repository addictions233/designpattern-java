package com.one.filter;

import com.one.handler.AbstractHandler;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import javax.servlet.http.*;

/**
 * @author one
 * 参数校验对象
 **/
@Component
@Order(1) //顺序排第1，最先校验
public class CheckParamFilterObject extends AbstractHandler {

    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("非空参数检查");
    }
}
package com.one.filter;

import com.one.handler.AbstractHandler;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import javax.servlet.http.*;
/**
 *  黑名单校验对象
 */
@Component
@Order(3) //校验顺序排第3
public class CheckBlackFilterObject extends AbstractHandler {

    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response) {
        //invoke black list check
        System.out.println("校验黑名单");
    }
}
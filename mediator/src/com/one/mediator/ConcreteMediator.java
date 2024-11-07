package com.one.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: wanjunjie
 * @date: 2024/11/05
 */
public class ConcreteMediator extends Mediator {

    private List<Colleague> colleagueList = new ArrayList<>();

    /**
     * 注册
     *
     * @param colleague
     */
    @Override
    public void register(Colleague colleague) {
        if (!colleagueList.contains(colleague)) {
            colleagueList.add(colleague);
            colleague.setMediator(this);
        }
    }

    /**
     * 转发
     *
     * @param colleague
     */
    @Override
    public void relay(Colleague colleague) {
        for (Colleague col : colleagueList) {
            if (col.equals(colleague)) {
                col.receive();
            }
        }
    }
}

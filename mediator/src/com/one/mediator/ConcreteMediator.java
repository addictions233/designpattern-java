package com.one.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 具体中介者（Concrete Mediator）角色：实现中介者接口，定义一个 List 来管理同事对象，协调各个同事角色之间的交互关系，因此它依赖于同事角色。
 *
 * @author: wanjunjie
 * @date: 2024/11/05
 */
public class ConcreteMediator extends Mediator {

    /**
     * 具体的中介者持有所有的同事对象
     */
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

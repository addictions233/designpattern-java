package com.one.example01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("zhangsan");
        names.add("lisi");
        names.add("wangwu");

        Iterator<String> iterator = new ConcreteIterator<>(names);
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}

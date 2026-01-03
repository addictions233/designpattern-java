package com.one.example01;

import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    public void testAdapter() {
        Computer computer = new Computer();
        String data = computer.readData(new SDCardImpl());
        System.out.println(data);

        System.out.println("=========================");

        // 采用适配器模式, 让电脑支持读取TF卡
        String data2 = computer.readData(new SDAdapterTF());
        System.out.println(data2);

    }
}

package com.one.staticproxy;

/**
 * @author one
 */
public class FatherProxyTest {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}

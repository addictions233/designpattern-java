package com.one.adapter.interfaceadapter;


/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        DC adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}

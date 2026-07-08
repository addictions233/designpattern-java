package com.one.template.example02;

public class LoanOneMonth extends Account{
    @Override
    public String calculate() {
        System.out.println("借款周期为1个月, 利息为借款金额的10%");
        return "10000块";
    }
}

package com.one.template.example02;

public class LoanSevenDays extends Account{

    @Override
    public String calculate() {
        System.out.println("借款周期7天, 无利息! 仅收取货款金额的%1的服务费");
        return null;
    }

    @Override
    protected void dispaly(String loan) {
        System.out.println("7日借款无利息!");
    }
}

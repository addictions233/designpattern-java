package com.one.template.example02;

public class Main {

    public static void main(String[] args) {
        LoanSevenDays loan1 = new LoanSevenDays();
        loan1.handle("tom", "123456");

        System.out.println("===========================");

        LoanOneMonth loan2 = new LoanOneMonth();
        loan2.handle("tom", "123456");
    }
}

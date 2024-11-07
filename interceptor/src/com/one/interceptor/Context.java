package com.one.interceptor;

/**
 * @description: 文法规则:
 *                  <expression> ::= <city>的<person>
 *                  <city> ::= 韶关|广州
 *                  <person> ::= 老人|妇女|儿童
 * @author: wanjunjie
 * @date: 2024/11/04
 */
public class Context {

    private final String[] cities = {"韶关", "广州"};

    private final String[] persons = {"老人", "妇女", "儿童"};

    private AbstractExpression cityPerson;

    public Context() {
        AbstractExpression city = new TerminalExpression(cities);

        AbstractExpression person = new TerminalExpression(persons);

        cityPerson = new AndExpression(city, person);
    }

    public void freeRide(String info) {
        boolean free = cityPerson.intercept(info);
        if (free) {
            System.out.println("您是" + info + ",您本次乘车免费!");
        } else {
            System.out.println(info + ",您不是免费人员, 本次乘车扣费2元!");
        }
    }
}

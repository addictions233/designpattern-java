package com.one.staticproxy;

public class Father {
    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    /**
     * 父亲帮儿子找对象
     */
    public void findLove() {
        System.out.println("物色对象");
        this.person.findLove();
        System.out.println("双方父母见面");
    }
}

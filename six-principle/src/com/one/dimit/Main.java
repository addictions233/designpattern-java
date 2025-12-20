package com.one.dimit;

/**
 * @author one
 * @description TODO
 * @date 2024-9-16
 */
public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        Integer number = boss.commandCheckNumber(new TeamLeader());
        System.out.println("课程数量为" +number);

        System.out.println("------------------------------------------");
        Integer number2 = boss.commandCheckNumber2(new TeamLeader());
        System.out.println("课程数量为" +number2);
    }
}

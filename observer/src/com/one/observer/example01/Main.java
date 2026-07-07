package com.one.observer.example01;

public class Main {

    public static void main(String[] args) {
        DrawHouseService drawHouseService = new DrawHouseService();

        AbstractLotteryService lotteryService = new LotteryServiceImpl(drawHouseService);

        lotteryService.lotteryAndMsg("12312312313");
    }
}

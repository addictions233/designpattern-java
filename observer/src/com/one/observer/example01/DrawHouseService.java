package com.one.observer.example01;

/**
 * 买房摇号服务类
 */
public class DrawHouseService {

    /**
     * 模拟摇号算法
     *
     * @param userId 用户ID
     * @return 摇号结果
     */
    public String lots(String userId) {
        if (userId.hashCode() % 2 == 0) {
            return "恭喜ID为:" + userId + "的用户, 在本次摇号中中签!";
        } else {
            return "很遗憾, ID为" + userId + "的用户, 您本次未能中签!";
        }
    }
}

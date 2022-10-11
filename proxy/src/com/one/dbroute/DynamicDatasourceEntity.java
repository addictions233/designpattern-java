package com.one.dbroute;

/**
 * @author one
 * @description 模拟动态数据源切换, 真实的动态数据源切换需要实现abstractRoutingDataSource接口
 * @date 2022-8-6
 */
public class DynamicDatasourceEntity {
    private static final String DEFAULT_DATASOURCE= "db_default";

    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void set(String dataSource) {
        System.out.println("设置了数据源:" + dataSource);
        threadLocal.set(dataSource);
    }

    public static String get() {
        return threadLocal.get();
    }

    public static void restore() {
        System.out.println("重置了数据源:" + DEFAULT_DATASOURCE);
        threadLocal.set(DEFAULT_DATASOURCE);
    }
}

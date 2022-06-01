package com.one.util;

import java.util.concurrent.*;

/**
 * @author one
 */
public class ConcurrentExecutor {
    /**
     * @param runHandler 线程任务
     * @param executeCount 发起请求总数
     * @param concurrentCount 同时并发执行的线程数
     * @throws Exception 异常
     */
    public static void execute(final RunHandler runHandler,int executeCount,int concurrentCount) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();
        //控制信号量，此处用于控制并发的线程数
        final Semaphore semaphore = new Semaphore(concurrentCount);
        //闭锁，可实现计数量递减
        final CountDownLatch countDownLatch = new CountDownLatch(executeCount);
        for (int i = 0; i < executeCount; i ++){
            executorService.execute(() -> {
                try{
                    //执行此方法用于获取执行许可，当总计未释放的许可数不超过executeCount时,
                    //则允许同性，否则线程阻塞等待，知道获取到许可
                    semaphore.acquire();
                    runHandler.handler();
                    //释放许可
                    semaphore.release();
                }catch (Exception e){
                    e.printStackTrace();
                }
                countDownLatch.countDown();
            });
        }
        //线程阻塞，知道闭锁值为0时，阻塞才释放，继续往下执行
        countDownLatch.await();
        // 关闭线程资源
        executorService.shutdown();
    }

    /**
     * 内部接口用来执行任务
     */
    public interface RunHandler{
        void handler() throws Exception;
    }
}

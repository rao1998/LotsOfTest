package test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class TestThread {
    private final static Executor executor = Executors.newCachedThreadPool();// 启用多线程
    private static AtomicInteger BANNER_MAX_SCORE = new AtomicInteger(0);
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            final int j = i;
            executor.execute(new Runnable() {
                public void run() {
                    try {
                        int linkId = BANNER_MAX_SCORE.addAndGet(1);
                        System.out.println(linkId);
                    } catch (Exception e) {

                    }
                }
            });

        }
    }
}

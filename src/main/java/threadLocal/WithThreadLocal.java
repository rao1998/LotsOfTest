package threadLocal;

public class WithThreadLocal {
    static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

    public static void main(String[] args) throws InterruptedException {
        WithThreadLocal withThreadLocal = new WithThreadLocal();
        withThreadLocal.startThreadArray();
    }

    public void startThreadArray() throws InterruptedException {
        Thread[] threads = new Thread[3];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new TestThread(i));
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
            //不按顺序走也不会发生问题
//            threads[i].join();
        }
    }

    public static class TestThread implements Runnable {
        private int id;

        public TestThread(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            threadLocal.set(id);
            System.out.println(Thread.currentThread().getName() + ":" + threadLocal.get());
        }
    }
}

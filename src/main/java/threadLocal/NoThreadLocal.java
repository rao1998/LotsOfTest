package threadLocal;

public class NoThreadLocal {
    //不管是不是static  都会发生线程安全问题
    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        NoThreadLocal noThreadLocal = new NoThreadLocal();
        noThreadLocal.startThreadArray();
    }

    public void startThreadArray() throws InterruptedException {
        Thread[] threads = new Thread[3];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new TestTask(i));
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
            //等于按顺序走肯定不会有问题  当没有按顺序走  就发生了问题
//            threads[i].join();
        }
    }

    public static class TestTask implements Runnable {
        private int id;

        public TestTask(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            count=id;
            System.out.println(Thread.currentThread().getName() + ":" + count);
        }
    }
}

package threadLocal;

public class TestThreadLocalThread implements Runnable {
//    private static int id;
    private int id;

    public TestThreadLocalThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":" + id);
    }

    /*public void startThreadArray() throws InterruptedException {

    }*/

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[3];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new TestThreadLocalThread(i));
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
//            threads[i].join();
        }
    }
}

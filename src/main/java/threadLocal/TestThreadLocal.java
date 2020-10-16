package threadLocal;


public class TestThreadLocal {
    static ThreadLocal<Integer> localVariable = new ThreadLocal<Integer>();

    public static void main(String[] args) {
        localVariable.set(1);
        System.out.println(localVariable.get());

        //不用remove方法会内存泄露  线程关闭后threadlocalMap中的key--threadlocal变为null了  但是value值还存在  remove会把Entry从threadlocalMap中移除
        localVariable.remove();
        System.out.println(localVariable.get());
        int i = 1;

    }
}

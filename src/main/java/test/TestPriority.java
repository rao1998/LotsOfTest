package test;

public class TestPriority extends TestFatherPriority {
    public TestPriority() {
        System.out.println("子类构造方法");
    }

    static {
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类代码块");
    }

    public static void main(String[] args) {
        System.out.println("before子类main");
        new TestPriority();
        System.out.println("after子类main");
    }
}

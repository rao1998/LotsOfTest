package test;

public class TestFatherPriority {
    public TestFatherPriority() {
        System.out.println("父类构造方法");
    }

    static {
        System.out.println("父类静态代码块");
    }

    {
        System.out.println("父类代码块");
    }

    public static void main(String[] args) {
        System.out.println("before父类main");
        new TestFatherPriority();
        System.out.println("after父类main");
    }
}

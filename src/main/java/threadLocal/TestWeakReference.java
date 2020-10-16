package threadLocal;

import java.lang.ref.WeakReference;

public class TestWeakReference {
    public static class User {
        private int userId;
        private String name;

        public User(int userId, String name) {
            this.userId = userId;
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "userId=" + userId +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        User user = new User(1, "  rao  ");
        /*//user2是强引用
        //User user2 = user;

        //此时user2和user都指向new User(1,"rao");
        WeakReference<User> user2 = new WeakReference<>(user);
        //把user的引用置为null
        user = null;
        //此时只剩下一个user2的弱引用指向new User(1,"rao");
        System.out.println(user2.get());
        System.gc();
        System.out.println("AfterGC=============");
        System.out.println(user2.get());*/
        User user2 = user;
        user2.name="wen";
        System.out.println(user);
        /*String name = user.name;
        name = name.trim();
        System.out.println(user);*/
    }
}

package domain;

public class TestYinYong {
    public static void main(String[] args) {
        User user = new User("1234", "1234");
        User user1 = user;
        user = new User("1211","1211");
        System.out.println(user1);
        System.out.println(user);
    }
}

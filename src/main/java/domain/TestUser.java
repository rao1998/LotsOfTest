package domain;

import java.util.ArrayList;

public class TestUser {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("  rao  ","1234"));

        for (User user : users) {
            String username = user.getUsername();
            username = username.trim();
        }

        for (User user : users) {
            System.out.println(user.getUsername());
        }
        System.out.println("===========");
    }
}

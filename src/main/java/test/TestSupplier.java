package test;

import domain.SingService;
import domain.User;

import java.util.function.Supplier;

public class TestSupplier {
    private static String getString (Supplier<String> function){
        return function.get();
    }

    private static String useUser (SingService service){
        return service.sing();
    }
    static String s1 = "hello";

    private static void uuUser (User user){
        System.out.println(user);
    }
    public static void main(String[] args) {

        /*String s2 = "world";
        System.out.println(getString(new Supplier<String>() {
            @Override
            public String get() {
                return s1+s2;
            }
        }));

        System.out.println(useUser(new SingService() {
            @Override
            public String sing() {
                return s1+s2;
            }
        }));*/

        /*User user1 = new User("1234", "51235");
        yUU(user1);
        user1 = new User("1211","1111");
        System.out.println(user1);*/
        User user1 = new User("1234", "51235");
        User finalUser = user1;
        useUser(new SingService() {
            @Override
            public String sing() {
                return finalUser.getUsername();
            }
        });
        user1 = new User("1211","1111");

    }
    private static void yUU(User user){
        System.out.println(user);
    }


}

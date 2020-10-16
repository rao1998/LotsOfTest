package test;

import domain.Man;
import domain.Secret;

public class TestMan {
    public static void main(String[] args) {
        Man raoxing = new Man("raoxing", new Secret(" 173 ", " 120 "));
        Secret secret = raoxing.getSecret();
        aaaaa(raoxing,secret);

        bbbbb(raoxing);
    }

    private static void bbbbb(Man raoxing) {
        System.out.println(raoxing.getSecret());
    }

    private static void aaaaa(Man raoxing, Secret secret) {
        secret.setHeight("183");
    }
}

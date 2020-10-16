package test.testextend;

public class SonPig extends FatherPig {
    @Override
    public void eat() {
        super.eat();
        System.out.println("son pig eat...");
    }
}

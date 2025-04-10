package patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();

        System.out.println(singletonObject.getMessage());
    }
}

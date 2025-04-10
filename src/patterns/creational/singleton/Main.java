package patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();

        System.out.println(singletonObject.getMessage());



        SingletonObject s = SingletonObject.getInstance();

        System.out.println(singletonObject);
        System.out.println(s);

        System.out.println(s == singletonObject);
    }
}

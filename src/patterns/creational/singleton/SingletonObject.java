package patterns.creational.singleton;

public class SingletonObject {
    private static SingletonObject instance = new SingletonObject();

    private SingletonObject(){}


    public static SingletonObject getInstance(){
        return instance;
    }

    public String getMessage(){
        return "Hello From Singleton Object";
    }

}

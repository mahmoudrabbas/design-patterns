package patterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle());
        Shape blueCircle = new Circle(new BlueCircle());

        redCircle.draw();
        blueCircle.draw();
    }
}

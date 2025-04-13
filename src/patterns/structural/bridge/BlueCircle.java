package patterns.structural.bridge;

public class BlueCircle implements DrawAPI{
    @Override
    public void drawCircle() {
        System.out.println("This is Blue Circle");
    }
}

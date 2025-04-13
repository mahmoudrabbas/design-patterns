package patterns.structural.bridge;

public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle() {
        System.out.println("This is Red Circle");
    }
}

package patterns.structural.bridge;

public class Circle extends Shape{
    protected Circle(DrawAPI drawAPI) {
        super(drawAPI);
    }

    @Override
    public void draw() {
        drawAPI.drawCircle();
    }
}

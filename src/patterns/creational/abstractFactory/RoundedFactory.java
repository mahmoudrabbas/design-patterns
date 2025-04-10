package patterns.creational.abstractFactory;

public class RoundedFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if(shape.isBlank()) return null;
        if(shape.equalsIgnoreCase("circle")) return new RoundedCircle();
        else if (shape.equalsIgnoreCase("square")) return new RoundedSquare();
        else if (shape.equalsIgnoreCase("rectangle")) return new RoundedRectangle();
        else return null;
    }
}

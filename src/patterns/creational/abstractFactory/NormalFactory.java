package patterns.creational.abstractFactory;

public class NormalFactory implements AbstractFactory{
    @Override
    public Shape getShape(String shape) {
        if(shape.isBlank()) return null;

        if(shape.equalsIgnoreCase("circle")) return new Circle();
        else if (shape.equalsIgnoreCase("square")) return new Square();
        else if (shape.equalsIgnoreCase("rectangle")) return new Rectangle();
        else return null;
    }
}

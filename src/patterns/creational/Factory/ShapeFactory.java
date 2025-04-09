package patterns.creational.Factory;

public class ShapeFactory {

    public Shape getShape(String shape){

        if(shape.isBlank()) return null;

        if(shape.equalsIgnoreCase("circle")){
            return new Circle();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }else if (shape.equalsIgnoreCase("square")) {
            return new Square();
        } else {
            return null;
        }
    }
}

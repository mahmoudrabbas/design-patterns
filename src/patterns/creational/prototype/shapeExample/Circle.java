package patterns.creational.prototype.shapeExample;

public class Circle extends Shape{

    public Circle() {
        setType("Circle");
    }

    @Override
    void draw() {
        System.out.println("I am "+this.getType());
    }
}

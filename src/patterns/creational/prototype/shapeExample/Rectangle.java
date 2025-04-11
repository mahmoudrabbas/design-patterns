package patterns.creational.prototype.shapeExample;

public class Rectangle extends Shape{
    public Rectangle() {
        setType("Rectangle");
    }

    @Override
    void draw() {
        System.out.println("I am "+this.getType());
    }
}

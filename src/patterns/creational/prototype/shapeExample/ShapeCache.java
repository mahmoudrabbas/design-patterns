package patterns.creational.prototype.shapeExample;

import java.util.HashMap;
import java.util.Hashtable;

public class ShapeCache {
    public static Hashtable<String, Shape> cache = new Hashtable<>();

    public static Shape getShape(String id){
        return (Shape) cache.get(id).clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        cache.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        cache.put(rectangle.getId(), rectangle);

        System.out.println(ShapeCache.getShape("2").getType());

    }
}

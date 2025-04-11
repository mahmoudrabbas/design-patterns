package patterns.creational.prototype;

import patterns.creational.prototype.autherExample.Author;
import patterns.creational.prototype.shapeExample.Shape;
import patterns.creational.prototype.shapeExample.ShapeCache;

public class Main {
    public static void main(String[] args) {

//        Author originalAuthor = new Author("Mahmoud R Abbas", "Software Engineer");
//
//
//        Author clonedAuthor = originalAuthor.clone();
//
//
//        originalAuthor.printInfo();
//        clonedAuthor.printInfo();


//        // in this time it will call the database , will take time
//        Author original = new Author("Mahmoud Abbas", "Java Developer");
//
//        // here will get the saved copy from the original (saved not from the database) so it won't take time
//        Author clone1 = original.clone();
//        Author clone2 = original.clone();
//
//        original.printInfo();
//        clone1.printInfo();
//        clone2.printInfo();




        // shape example
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

    }
}

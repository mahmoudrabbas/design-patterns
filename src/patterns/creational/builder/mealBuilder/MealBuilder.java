package patterns.creational.builder.mealBuilder;

public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal veg = new Meal();
        veg.addItem(new VegBurger());
        veg.addItem(new MangoJuice());

        return veg;
    }

    public Meal prepareChickenMeal(){
        Meal chicken = new Meal();
        chicken.addItem(new ChickenBurger());
        chicken.addItem(new Tea());

        return chicken;
    }
}

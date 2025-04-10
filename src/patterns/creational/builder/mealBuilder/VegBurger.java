package patterns.creational.builder.mealBuilder;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public double price() {
        return 100.0d;
    }

}

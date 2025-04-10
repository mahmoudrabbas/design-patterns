package patterns.creational.builder.mealBuilder;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public double price() {
        return 105.0d;
    }
}

package patterns.creational.builder.mealBuilder;

public class Tea extends Drink{
    @Override
    public String name() {
        return "Tea";
    }

    @Override
    public double price() {
        return 5d;
    }
}

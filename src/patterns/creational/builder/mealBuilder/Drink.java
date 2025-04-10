package patterns.creational.builder.mealBuilder;

public abstract class Drink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract double price();
}

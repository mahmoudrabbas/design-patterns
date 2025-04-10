package patterns.creational.builder.mealBuilder;

public interface Item {
    public String name();
    public Packing packing();
    public double price();
}

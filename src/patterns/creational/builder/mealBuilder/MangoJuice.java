package patterns.creational.builder.mealBuilder;

public class MangoJuice extends Drink{
    @Override
    public String name() {
        return "Mango Juice";
    }

    @Override
    public double price() {
        return 20d;
    }
}

package patterns.creational.builder.mealBuilder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public double showPrice(){
        double price = 0d;
        for (Item item:items){
            price+=item.price();
        }

        return price;
    }

    public List<Item> getItems(){
        return this.items;
    }

    public void showItems(){
        for (Item item: items){
            System.out.println("Item "+item.name() + ", Packing "+ item.packing().pack() + " its price is "+item.price());
        }
    }
}

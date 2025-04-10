package patterns.creational.builder;

import patterns.creational.builder.userBuilder.GENDER;
import patterns.creational.builder.userBuilder.User;
import patterns.creational.builder.userBuilder.UserBuilder;

public class Main {
    public static void main(String[] args) {

//        MealBuilder chickenMealBuilder = new MealBuilder();
//        Meal meal = chickenMealBuilder.prepareChickenMeal();
//
//        meal.showItems();
//        System.out.println(meal.showPrice());

        User user = new UserBuilder("Mahmoud Ramadan")
                .age(35)
                .gender(GENDER.MALE)
                .job("Software developer")
                .salary(5000)
                .phone("01454545466")
                .build();


        System.out.println(user.toString());

    }
}

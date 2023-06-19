package HW1;

import java.util.ArrayList;
import java.util.List;

public class Vending {
    public static void main(String[] args) {
        Product hotDrink1 = new HotDrink(10, "Beverage", 50, "Latte", 90);
        Product hotDrink2 = new HotDrink(14, "Beverage", 60, "Tea", 100);
        Product hotDrink3 = new HotDrink(17, "Beverage", 55, "Cappucino", 75);
        List<Product> hotDrinks = new ArrayList<>();

        hotDrinks.add(hotDrink1);
        hotDrinks.add(hotDrink2);
        hotDrinks.add(hotDrink3);

        for (Product product : hotDrinks) {
            System.out.println(product.toString());
            System.out.println("--------------------");
        }
    }
}

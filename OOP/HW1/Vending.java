package OOP.HW1;

public class Vending {
    public static void main(String[] args) {
        Product p = new Product("yay", 0, "boobs");
        Product p2 = new Product("yoy", 2, "ahoy");
        HotDrink hot = new HotDrink("yaya", 228, "coff", 80);

        System.out.println(p.toString());

        System.out.println(hot.toString());
    }
}

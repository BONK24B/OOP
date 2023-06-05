package OOP.HW1;

public class Vending {
    public static void main(String[] args) {
        Product p = new Product(2, "yay", 0, "boobs");
        Product p2 = new Product(3, "yoy", 2, "ahoy");
        HotDrink hot = new HotDrink(4, "yaya", 228, "coff", 80);

        System.out.println(p.toString());
        System.out.println(hot.toString());
    }
}

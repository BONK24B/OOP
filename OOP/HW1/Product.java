package OOP.HW1;

public class Product{
    private String type;
    private int price;
    private String name;

    public Product(String type, int price, String name) {
        this.type = type;
        this.price = price;
        this.name = name;
    }

    public String getType(){
        return type;
    }

    public int getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Type: " + type + "\nPrice: " + price + "\nName: " + name;
    }
}
package OOP.HW1;

public class Product{
    private int id;
    private String category;
    private int price;
    private String name;

    public Product(int id, String category, int price, String name) {
        this.id = id;
        this.category = category;
        this.price = price;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getCategory(){
        return category;
    }

    public int getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\nCategory: " + category + "\nPrice: " + price + "\nName: " + name;
    }
}
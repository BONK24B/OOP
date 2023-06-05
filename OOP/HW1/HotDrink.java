package OOP.HW1;

public class HotDrink extends Product{
    private int temperature;
    
    public HotDrink(String type, int price, String name, int temperature) {
        super(type, price, name);
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTemperature: " + temperature;
    }
}

package HW6.Ex5;

public class EnginesTest {
    public static void main(String[] args) {
        Engine pet = new PetrolEngine();
        Engine dis = new DiselEngine();
        Car car = new Car(dis);
        Car car2 = new Car(pet);

        car.start();
        car2.start();
    }
}

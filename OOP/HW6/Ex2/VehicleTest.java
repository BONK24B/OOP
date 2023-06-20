package HW6.Ex2;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car(225);
        Bus bus = new Bus(225);

        System.out.println(car.calculateAllowedSpeed(car));
        System.out.println(bus.calculateAllowedSpeed(bus));
    }
}

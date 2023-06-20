package HW6.Ex2;

public class Car extends Vehicle implements SpeedCalculation{

    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed() * 0.8;
    }
    
}

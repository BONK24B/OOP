package HW6.Ex2;

public class Bus extends Vehicle implements SpeedCalculation {
    

    public Bus(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed() * 0.6;
    }
    
}

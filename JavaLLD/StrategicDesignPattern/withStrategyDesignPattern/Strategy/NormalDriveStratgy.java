package JavaLLD.StrategicDesignPattern.withStrategyDesignPattern.Strategy;

public class NormalDriveStratgy implements DriveStrategy
 {
    @Override
    public void drive() {
        // Some Code
        System.out.println("Normal Drive Capability");
    }
}

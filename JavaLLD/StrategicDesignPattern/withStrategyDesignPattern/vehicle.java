package JavaLLD.StrategicDesignPattern.withStrategyDesignPattern;
import JavaLLD.StrategicDesignPattern.withStrategyDesignPattern.Strategy.DriveStrategy;

public class vehicle {
    DriveStrategy driveobj;

    // Constructor injection
    vehicle(DriveStrategy driveobject){
        this.driveobj=driveobject;
    }
    public void drive() {
        driveobj.drive();
    }
}
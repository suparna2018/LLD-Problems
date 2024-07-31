package JavaLLD.StrategicDesignPattern.withStrategyDesignPattern;

import JavaLLD.StrategicDesignPattern.withStrategyDesignPattern.Strategy.SportsDriveStrategy;

public class sportsVehicle extends vehicle {
    sportsVehicle(){
        super(new SportsDriveStrategy());
    }

}
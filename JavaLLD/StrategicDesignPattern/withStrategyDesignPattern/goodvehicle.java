package JavaLLD.StrategicDesignPattern.withStrategyDesignPattern;

import JavaLLD.StrategicDesignPattern.withStrategyDesignPattern.Strategy.NormalDriveStratgy;

public class goodvehicle extends vehicle {
    goodvehicle(){
        super(new NormalDriveStratgy());
    }
}

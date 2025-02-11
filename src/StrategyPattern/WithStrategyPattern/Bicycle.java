package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.DriveStrategy.SlowSpeedDriveStrategy;

public class Bicycle extends Vehicle{
    public Bicycle(){
        super(new SlowSpeedDriveStrategy());
    }
}

package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.DriveStrategy.HighSpeedDriveStrategy;

public class Airplane extends Vehicle{
    public Airplane(){
        super(new HighSpeedDriveStrategy());
    }
}

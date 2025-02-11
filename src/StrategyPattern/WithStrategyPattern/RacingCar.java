package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.DriveStrategy.HighSpeedDriveStrategy;

public class RacingCar extends Vehicle{

    public RacingCar(){
        super(new HighSpeedDriveStrategy());
    }

}

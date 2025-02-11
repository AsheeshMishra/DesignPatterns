package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.DriveStrategy.SlowSpeedDriveStrategy;

public class BullockCart extends Vehicle {
    public BullockCart(){
        super(new SlowSpeedDriveStrategy());
    }
}

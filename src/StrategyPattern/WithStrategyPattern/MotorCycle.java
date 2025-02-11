package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.DriveStrategy.NormalDriveStrategy;

public class MotorCycle extends Vehicle{

    MotorCycle(){
        super(new NormalDriveStrategy());
    }
}

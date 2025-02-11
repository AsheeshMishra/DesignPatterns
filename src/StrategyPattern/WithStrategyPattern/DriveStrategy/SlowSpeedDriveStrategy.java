package StrategyPattern.WithStrategyPattern.DriveStrategy;

public class SlowSpeedDriveStrategy implements DriveStrategy{
    @Override
    public void speed() {
        System.out.println(" Slow Speed !!! ");
    }
}

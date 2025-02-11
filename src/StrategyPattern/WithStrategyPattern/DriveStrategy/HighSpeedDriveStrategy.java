package StrategyPattern.WithStrategyPattern.DriveStrategy;

public class HighSpeedDriveStrategy implements DriveStrategy{

    @Override
    public void speed() {
        System.out.println(" High Speed !!! ");
    }
}

package StrategyPattern.WithStrategyPattern.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void speed() {
        System.out.println(" Normal Speed !!! ");
    }
}

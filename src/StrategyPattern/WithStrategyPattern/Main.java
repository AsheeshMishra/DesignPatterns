package StrategyPattern.WithStrategyPattern;

public class Main {

    public static void main(String[] args) {
        Vehicle v1 = new Airplane();
        v1.speed();

        Vehicle v2 = new Bicycle();
        v2.speed();

        Vehicle v3 = new MotorCycle();
        v3.speed();
    }
}

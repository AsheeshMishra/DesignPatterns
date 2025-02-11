package StrategyPattern.WithoutStrategyPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                " Here the Problem is , Different Vehicle has Different type of speed and we dont have " +
                        "\n every type of speed in Parent class so when we are overriding the speed function" +
                        "\n there may be possibility that there are many vehicle with high speed then in every class" +
                        "\n we have to repeat the same code that this class needs high speed by overriding the speed function" +
                        "\n which is not a good practice this leads to repitition of code when our project become scalable " +
                        "\n this type of practice will not sustain, Strategy pattern helps in resolving this \n\n"
        );
        Vehicle v1 = new Airplane();
        v1.speed();
        Vehicle v2 = new Bicycle();
        v2.speed();
    }
}

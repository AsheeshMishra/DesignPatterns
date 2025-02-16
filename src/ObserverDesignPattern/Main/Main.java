package ObserverDesignPattern.Main;

import ObserverDesignPattern.Observable.Product;
import ObserverDesignPattern.Observable.Subject;
import ObserverDesignPattern.Observer.Observer;
import ObserverDesignPattern.Observer.User;

public class Main {
    public static void main(String[] args) {
        Subject  Iphone = new Product("Iphone 16 Pro","12445544",50);
        Subject  S25 = new Product("Samsung S25 Ultra","12334443232",100);

        Observer Anil = new User(" Anil","AZHN43433","anil@gmail.com","95332222132");
        Observer Manoj = new User(" Manoj","MZHN4323333","manoj@gmail.com","95222222232");
        Observer Nikhil = new User(" Nikhil","NKZHN4322433","nikhil@gmail.com","95444332232");
        Observer Neeraj = new User(" Neeraj","NR11232322","neeraj@gmail.com","95992233232");

        Anil.buy(Iphone,10);
        Manoj.buy(Iphone,20);
        Nikhil.buy(Iphone,20);

        Neeraj.buy(Iphone, 2);
        Nikhil.buy(Iphone,10);
        Manoj.buy(Iphone,1);

        Iphone.setStock(25);
        System.out.println(Iphone.getStock());
        System.out.println("\n\n\n");

        Nikhil.buy(Iphone,25);
        Neeraj.buy(Iphone,2);
        Manoj.buy(Iphone,10);

        Iphone.setStock(25);
        System.out.println(Iphone.getStock());
        System.out.println("\n\n\n");

    }
}

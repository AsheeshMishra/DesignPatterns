package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.Observer;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Product implements Subject{
     String name , pid;
     int stock ;
     List<Observer>observerList;
     Observer Obs;

     public Product(String name,String pid ,int stock){
         this.name = name;
         this.pid = pid;
         this.stock = stock;
         observerList =  new ArrayList<Observer>();
     }

     @Override
     public void buy(Observer Obs, int quantity) {
         if (stock == 0) {
             this.Obs = Obs;

             // Check if the observer is already subscribed
             if (!observerList.contains(Obs)) {
                 System.out.print("OOPS Stock is Over !!!");
                 System.out.println(" Hey " + Obs.getName() + " Kindly Press 1 to Notify when Product is in Stock");

                 Scanner sc = new Scanner(System.in);
                 int num = sc.nextInt();
                 if (num == 1) {
                     addObserver(); // Add user to the observer list
                 }
             }
         } else if (stock - quantity < 0) {
             System.out.print("Please Reduce your Quantity, Stock is limited!!!!");
         } else {
             System.out.println("Hey "+Obs.getName());
             System.out.println("Order is in Process");
             stock = stock - quantity;
             System.out.println("Thank you for Purchasing");
             System.out.println("============================================\n\n\n");

         }
     }

    @Override
    public void addObserver() {
         if(!observerList.contains(Obs)){
            observerList.add(Obs);
         }
    }

    @Override
    public void removeObserver() {
        observerList.remove(Obs);
    }

    @Override
    public void notifyObserver() {
        List<Observer> toRemove = new ArrayList<>();
        Iterator<Observer> iterator = observerList.iterator();

        while(iterator.hasNext()) {
            Observer obj = iterator.next();
            obj.update(this);

            System.out.println("Hey "+ obj.getName()+" Do you want to unsubscribe? Press 2 for Yes, any other key for No.");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num == 2) {
                toRemove.add(obj); // Collect to remove later
                System.out.println(obj.getName() + " has been unsubscribed from notifications.");
                System.out.println("============================================================\n\n");
            }
            else{
                System.out.println(obj.getName() + " still subscribed from notifications.");
            }
        }

        observerList.removeAll(toRemove); // Remove after iteration
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void setStock(int stock) {
        if(stock>0){
            System.out.println(" ============= NEW STOCK ADDED =======================");
            System.out.println("\n\n\n");
        }
         if(this.stock==0){
             notifyObserver();
         }
         this.stock=stock;
    }
}

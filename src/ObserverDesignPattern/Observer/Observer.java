package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.Subject;

public interface Observer {
    void update(Subject prod);
    void buy(Subject pr,int quantity);
    String getEmail();
    String getPhone();
    String getName();
}

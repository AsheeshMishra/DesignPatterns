package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Notification.EmailNotification;
import ObserverDesignPattern.Notification.MobileNotification;
import ObserverDesignPattern.Notification.NotificationImpl;
import ObserverDesignPattern.Observable.Subject;

public class User implements Observer {
    String name,accountId,emailId,phone;

    public User(String name, String accountId, String emailId, String phone){
        this.name=name;
        this.accountId = accountId;
        this.emailId=emailId;
        this.phone = phone;

        System.out.println(" Hey "+name+" Thankyou for creating your account !!!");
    }

    @Override
    public void update(Subject prod) {
        NotificationImpl email = new EmailNotification(this,prod);
        email.send();
        NotificationImpl mobile = new MobileNotification(this,prod);
        mobile.send();
    }

    @Override
    public String getEmail() {
        return emailId;
    }

    @Override
    public String getPhone() {
        return  phone;
    }

    @Override
    public void buy(Subject pr, int quantity) {
        pr.buy(this,quantity);
    }

    @Override
    public String getName(){
        return name;
    }

}

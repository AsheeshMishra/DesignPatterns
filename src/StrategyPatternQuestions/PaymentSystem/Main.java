package StrategyPatternQuestions.PaymentSystem;

public class Main {
    public static void main(String[] args) {
        PaymentMethod p1 = new CreditCardPayment("1245 5678 9093 1343");
        p1.pay("500");
        PaymentMethod p2 = new DebitCardPayment("7777 2223 3333 1323");
        p2.pay("40000");
        PaymentMethod p3 = new UpiPayment("9599488610@icici");
        p3.pay("20000");
        PaymentMethod p4 = new WalletPayment("FXAma7897393");
        p4.pay("4000");
    }
}


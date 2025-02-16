package StrategyPatternQuestions.PaymentSystem;

public class PaymentProcessor{
    private PaymentMethod paymentMethod;

    PaymentProcessor(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    void payAmount(String amount){
        paymentMethod.pay(amount);
    }
}

package StrategyPatternQuestions.PaymentSystem;

public class CreditCardPayment implements PaymentMethod{
    String creditCardNo;
    CreditCardPayment(String creditCardNo){
        this.creditCardNo = creditCardNo;
    }
    @Override
    public void pay(String amount) {
        System.out.println(" Payment of "+ amount + " done with Credit Card Number: "+creditCardNo);
    }
}

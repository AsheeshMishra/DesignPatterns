package StrategyPatternQuestions.PaymentSystem;

public class DebitCardPayment implements PaymentMethod{
    String debitCardNo;
    DebitCardPayment(String debitCardNo){
        this.debitCardNo = debitCardNo;
    }
    @Override
    public void pay(String amount) {
        System.out.println(" Payment of "+ amount + " done with Debit Card Number: "+debitCardNo);
    }
}

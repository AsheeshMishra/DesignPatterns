package StrategyPatternQuestions.PaymentSystem;

public class UpiPayment implements PaymentMethod{
    String upiId;
    UpiPayment(String upiId){
       this.upiId = upiId;
    }
    @Override
    public void pay(String amount) {
        System.out.println(" Payment of "+ amount + " done with UPI id: "+amount);
    }
}

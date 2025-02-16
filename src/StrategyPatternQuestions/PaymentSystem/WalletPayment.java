package StrategyPatternQuestions.PaymentSystem;

public class WalletPayment implements PaymentMethod {
    String walletId;
    WalletPayment(String walletId){
        this.walletId = walletId;
    }
    @Override
    public void pay(String amount) {
        System.out.println(" Payment of "+ amount + " done with wallet id: "+walletId);
    }
}

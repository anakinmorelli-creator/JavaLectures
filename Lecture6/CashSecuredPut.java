public class CashSecuredPut implements Tradeable{
    private int contractsSold;
    private double premiumCollectedPerContract;

    CashSecuredPut(int contractsSold, double premiumCollectedPerContract){
        this.contractsSold = contractsSold;
        this.premiumCollectedPerContract = premiumCollectedPerContract;
    }

    public double getEstimatedReturn(){
        return contractsSold * premiumCollectedPerContract;
    }

}

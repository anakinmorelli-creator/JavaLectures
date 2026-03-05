public class StockTrade implements Tradeable {
    private int shares;
    private double expectedProfitPerShare;

    StockTrade(int shares, double expectedProfitPerShare) {
        this.shares = shares;
        this.expectedProfitPerShare = expectedProfitPerShare;
    }

    public double getEstimatedReturn(){
        return shares * expectedProfitPerShare;
    }


}

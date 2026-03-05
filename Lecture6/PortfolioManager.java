public class PortfolioManager {
    public static void main(String[] args) {
        Tradeable[] trade = new Tradeable[2];

        trade[0] = new StockTrade(100, 0.30);
        trade[1] = new CashSecuredPut(3, 7.30);

        double totalReturn = 0.0;

        for (int i : trade){
            totalReturn = StockTrade.getEstimatedReturn() + CashSecuredPut.getEstimatedReturn();
        }

        System.out.println("The total return is $" + totalReturn);
    }
}

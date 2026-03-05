public class StockTrade {
    private String tickerSymbol;
    private double tradePrice;

    StockTrade(String symbol, Double price){
        tickerSymbol = symbol;
        tradePrice = price;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public double getTradePrice(){
        return tradePrice;
    }

    public String toString(){
        return "Trade executed for " + getTickerSymbol() + " at $" + getTradePrice();
    }

    public static void main(String[] args){
        StockTrade sofiStock = new StockTrade("SOFI", 18.70);
        StockTrade rivnStock = new StockTrade("RIVN", 14.92);

        System.out.println(sofiStock);
        System.out.println(rivnStock);
    }
}

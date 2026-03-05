public class MarketTracker {
    public static void main(String[] args){
        String[] stockTicker = {"SOFI", "RIVN", "COIN"};

        double[] stockPrice = {18.50, 14.20, 250.00};

        for (int i = 0; i < stockPrice.length; i++){
            System.out.println(stockTicker[i] + " is currently trading at $" + stockPrice[i]);
        }

        double totalValue = 0.0;

        for (double price : stockPrice){
            totalValue = totalValue + price;
        }

        System.out.println("The total price of the stocks is $" + totalValue);
    }
}

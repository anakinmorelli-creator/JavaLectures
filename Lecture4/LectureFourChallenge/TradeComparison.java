public class TradeComparison {
    public static void main(String[] args){
        int tradeCount1 = 5;
        int tradeCount2 = 5;

        if (tradeCount1 == tradeCount2){
            System.out.println("Primitives are equal!");
        }
        else{
            System.out.println("Primitives are not equal!");
        }

        String ticker1 = new String("RIVN");
        String ticker2 = new String("RIVN");

        if (ticker1 == ticker2){
            System.out.println("Memory addresses match!");
        }
        else{
            System.out.println("Different memory addresses!");
        }

        if (ticker1.equals(ticker2)){
            System.out.println("Contents match!");
        }
        else{
            System.out.println("Contents do not match!");
        }
    }
}

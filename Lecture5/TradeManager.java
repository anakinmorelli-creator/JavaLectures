public class TradeManager {
    private String accountName;
    private static int totalTradesExecuted = 0;

    TradeManager(String accountName){
        this.accountName = accountName;
        totalTradesExecuted++;
    }

    public String getAccountName(){
        return accountName;
    }

    public static int getTotalTradesExecuted(){
        return totalTradesExecuted;
    }

    public static void main(String[] args){
        TradeManager ikbr = new TradeManager("Interactive Brokers");
        TradeManager ws = new TradeManager("Wealthsimple");
        TradeManager pa = new TradeManager("Practice Account");

        System.out.println("Total trades executed between " + ikbr.accountName + ", " + ws.getAccountName() + " and " + pa.getAccountName() + " is " + TradeManager.getTotalTradesExecuted());
    }
}

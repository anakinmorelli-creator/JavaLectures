public class MarginAccount extends BankAccount{
    private double marginLimit;

    MarginAccount(double startingBalance, double marginLimit){
        super(startingBalance);
        this.marginLimit = marginLimit;
    }

    @Override
    public void withdraw(double amount){
        if (amount <= (balance + marginLimit)){
            balance = balance - amount;
            System.out.println("Margin withdrawal successful. New balance: $" + balance);
        }
        else{
            System.out.println("Transaction denied: Exceeds margin limit.");
        }
    }
}

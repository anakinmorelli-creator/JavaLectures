public class BankAccount {
    protected double balance;

    BankAccount(double startingBalance){
        balance = startingBalance;
    }

    public void withdraw(double amount){
        if (amount <= balance){
            balance = balance - amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
        }
        else{
            System.out.println("Transaction denied: Insufficient funds.");
        }
    }
}

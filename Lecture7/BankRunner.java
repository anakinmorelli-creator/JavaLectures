public class BankRunner {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount(1000.00);
        MarginAccount marginAccount = new MarginAccount(1000, 2000);

        bankAccount.withdraw(1500.00);
        marginAccount.withdraw(1500.00);
    }
}

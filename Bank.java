package prernaLabs;
public class Bank {
private double amount1;
    public Bank() {
        this.amount1 = 50000;
    }    
    public void withdraw(double withdrawalAmount) {
        String message = (amount1 >= withdrawalAmount) ? "Withdrawal is successful completed" +withdrawalAmount: "You have Insufficient balance";
        System.out.println(message);
        if (amount1>= withdrawalAmount) {
            amount1 -= withdrawalAmount;
        }
    }
    /* Method to deposit amount*/
    public void deposit(double depositAmount) {
        amount1 += depositAmount;
        System.out.println("Deposit of money is successful:"+depositAmount);
    }
/* Method to display total balance*/
public void displayBalance() {
    System.out.println("Total balance is remaining : " + amount1);
}
    public static void main(String[] args) {
    Bank myBank= new Bank();
    myBank.withdraw(5000);
    myBank.deposit(3000);
    myBank.displayBalance();
    }
}
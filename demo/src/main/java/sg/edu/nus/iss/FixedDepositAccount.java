package sg.edu.nus.iss;

public class FixedDepositAccount extends BankAccount {

    public static double interest = 3.0; 
    public static double duration = 6.0; 

    public FixedDepositAccount(String accountNo, double balance) {
        super(accountNo, balance);
        //TODO Auto-generated constructor stub
    }

    // so that parent class deposit and withdrawal is not carried over (not allowed in FD) 
    @Override
    public void deposit(double amount) {
        System.out.println("No deposit operation");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("No withdrawal operation");
    }

    @Override
    public void showAccount() {
        System.out.println("Account No: " + this.getAccountNo());
        System.out.println("Fullname: " + this.getFullName());
        System.out.println("Balance: " + this.getBalance() + (100 * interest)/100);
    }
}

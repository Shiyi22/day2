package Bankaccount;

public class Test {

    public static void main(String[] args) {

        //Bank account test 
        BankAccount account1 = new BankAccount("James");
        System.out.println(account1.getBalance());
        account1.deposit(100.0f); 
        System.out.println(account1.getBalance());

        BankAccount account2 = new BankAccount("Sarah", 300.0f); 
        System.out.println(account2.getBalance());

        BankAccount account3 = new BankAccount("Cass"); 
        System.out.println(account3.getNumber());
        account3.withdraw(2.0f); 

        BankAccount account4 = new BankAccount("A"); 
        account4.setClose(true); 

        System.out.println("=".repeat(80));
        
        // Fixed deposit test
            //test for interest and duration
        FixedDepositAccount fd1 = new FixedDepositAccount("A", 500, 2, 10);
        System.out.printf("Interest: %f, duration: %d\n", fd1.getInterest(), fd1.getDurationInMonths());
        fd1.setInterest(10);
        fd1.setDurationInMonths(20);
        System.out.printf("Interest: %f, duration: %d\n", fd1.getInterest(), fd1.getDurationInMonths());

            // test for NOP
        FixedDepositAccount fd2 = new FixedDepositAccount("B", 200); 
        fd2.withdraw(100);
        fd2.deposit(100);

            // test for correct balance
        FixedDepositAccount fd3 = new FixedDepositAccount("C", 100); 
        System.out.println(fd3.getBalance());   
        



    }
    
}

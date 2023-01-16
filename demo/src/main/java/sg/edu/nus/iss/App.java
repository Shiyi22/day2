package sg.edu.nus.iss;

import java.util.Random;
import java.util.UUID;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Banking");

        int n = 3;
        BankAccount BankAccount[] = new BankAccount[n]; // define a fixed array

        // for fixed deposit account
        for (int i = 0; i < BankAccount.length; i++) {
        String uuid = UUID.randomUUID().toString();

        // double max = 10000.00;
        double min = 1000.00;

        Random randomNum = new Random();    
        double initialBalance = min + randomNum.nextDouble(); 

        BankAccount[i] = new FixedDepositAccount(uuid, initialBalance); // more specific to a fixed deposit 
        }

        BankAccount[0].setFullName("Tan Meng Cheong");
        BankAccount[1].setFullName("Ng Swee Kiat");
        BankAccount[2].setFullName("Desmond Koh ");

        BankAccount[0].showAccount(); 
        BankAccount[1].showAccount(); 
        BankAccount[2].showAccount(); 

        // deposit money to first account 
        BankAccount[0].deposit(2000); 
        BankAccount[0].deposit(4000);
        BankAccount[0].deposit(5000);

        BankAccount[0].showAccount(); 
        BankAccount[1].showAccount(); 
        BankAccount[2].showAccount(); 

        BankAccount[0].withdraw(2000); 
        BankAccount[0].withdraw(4000); 
        BankAccount[0].withdraw(5000); 

        BankAccount[0].showAccount(); 
        BankAccount[1].showAccount(); 
        BankAccount[2].showAccount(); 

        // to test that user cannot withdraw > what it has 
        // BankAccount[1].withdraw(10000);
        // BankAccount[1].showAccount(); 
    }
}

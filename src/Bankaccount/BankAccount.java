package Bankaccount;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class BankAccount {

    // private members
    private String name; // no setter
    private final String number; // should be randomly generated + no setter 
    private float balance; 
    private ArrayList<String> transaction; 
    private boolean close = false; // default is false 
    private Date startDate; 
    private Date endDate;
    
    // constructors
        // constructor #1 
    public BankAccount(String name) {
        this.name = name;
        this.balance = 0.0f; 
        
        // call numbergenerator method 
        this.number = numberGenerator(); 

    }
        // constructor #2 
    public BankAccount(String name, float balance) {
        this.name = name; 
        if (balance >= 0.0) {
            this.balance = balance;
        } 
        this.number = numberGenerator();
    }

    // getters and setters 
    public String getName() {return name;}
    public String getNumber() {return number;}
    public float getBalance() {return balance;}
    public void setBalance(float balance) {this.balance = balance;}
    public ArrayList<String> getTransaction() {return transaction;}
    public void setTransaction(ArrayList<String> transaction) {this.transaction = transaction;}
    public boolean isClose() {return close;}
    public void setClose(boolean close) {this.close = close;}
    public Date getStartDate() {return startDate;}
    public void setStartDate(Date startDate) {this.startDate = startDate;}
    public Date getEndDate() {return endDate;}
    public void setEndDate(Date endDate) {this.endDate = endDate;}    


    // methods 
    public void deposit(float amount) {
        // only positive amount, check for account status (open) 
        if (amount > 0.0 && !close) {
            // update balance 
            balance += amount; 
            // add to transation list
            LocalDateTime currentTime = LocalDateTime.now(); 
            String d = "deposit $" + amount + " at " + currentTime; 
            this.transaction = new ArrayList<>(); 
            System.out.println(transaction);
            transaction.add(d); 
            System.out.println(transaction);
        } else {
        System.err.println("IllegalArgumentException"); 
        }
    }

    public void withdraw (float amount) {
        // add to t list, only positive amount, check for account status (open)
        if (amount > 0.0 && balance >= amount && !close) {
            // update balance 
            balance -= amount; 
            // add to transaction list 
            LocalDateTime currentTime = LocalDateTime.now(); 
            this.transaction = new ArrayList<>(); 
            String w = "withdarw $" + amount + " at " + currentTime; 
            transaction.add(w); 
            System.out.println(transaction);  
        } else {
        System.err.println("IllegalArgumentException"); 
        }
    }
    
    public static String numberGenerator() {
        // generate 9 digit card number 
        Random rand = new SecureRandom();
        StringBuilder sb = new StringBuilder(); 
        for (int i = 0; i < 9; i++) {
            sb.append(rand.nextInt(10)); 
        }
        return sb.toString(); 
    }
}

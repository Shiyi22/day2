package Bankaccount;

import java.security.SecureRandom;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Random;

public class FixedDepositAccount {

    // private members (same as bank account)
    private String name; // no setter
    private final String number; // should be randomly generated + no setter 
    private float balance; // no setter 
    private ArrayList<String> transaction; 
    private boolean close = false; // default is false 
    private Date startDate; 
    private Date endDate;

    // members on top of bankaccount
    private float interest; 
    private boolean interestChanged = false; 
    private int durationInMonths;
    private boolean durationChanged = false; 
    
    //constructors + default int and duration 
    public FixedDepositAccount(String name, float balance) {
        this.name = name;
        this.balance = balance;
        this.number = numberGenerator(); 
        this.interest = 3.0f; 
        this.durationInMonths = 6; 
    }
    public FixedDepositAccount(String name, float balance, float interest) {
        this.name = name;
        this.balance = balance;
        this.number = numberGenerator();
        this.interest = interest; 
        this.durationInMonths = 6; 
    }
    public FixedDepositAccount(String name, float balance, float interest, int durationInMonths) {
        this.name = name;
        this.balance = balance;
        this.number = numberGenerator();
        this.interest = interest; 
        this.durationInMonths = durationInMonths; 
    }
    //getters and setters 
    public String getName() {return name;}
    public String getNumber() {return number;}
    public float getBalance() {
        float interestBalance = (interest/100) * balance; 
        return balance + interestBalance;
    }
    public ArrayList<String> getTransaction() {return transaction;}
    public void setTransaction(ArrayList<String> transaction) {this.transaction = transaction;}
    public boolean isClose() {return close;}
    public void setClose(boolean close) {this.close = close;}
    public Date getStartDate() {return startDate;}
    public void setStartDate(Date startDate) {this.startDate = startDate;}
    public Date getEndDate() {return endDate;}
    public void setEndDate(Date endDate) {this.endDate = endDate;}    

    public float getInterest() {return interest;}
    public int getDurationInMonths() {return durationInMonths;}
    public final void setInterest(float interest) {
        if (interestChanged) {
            throw new IllegalArgumentException("interest has already been set"); 
        } else {
            this.interest = interest;
            interestChanged = true; 
        }
    }
    public final void setDurationInMonths(int durationInMonths) {
        if (durationChanged) {
            throw new IllegalArgumentException("balance has already been set"); 
        } else {
        this.durationInMonths = durationInMonths;
        durationChanged = true; 
        }
    }

    // same methods as bank account 
    public void deposit(float amount) {
        // only positive amount, check for account status (open) 
        System.out.println("No operation done");
    }

    public void withdraw (float amount) {
        // add to t list, only positive amount, check for account status (open)
        System.out.println("No operation done");
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

package com.lecture.review;

import java.util.Date;


public class Account {
    /*
  - A private int data field named id for the account (default 0).
  - A private double data field named balance for the account (default 0).
  - A private double data field named annualInterestRate that stores the
    current interest rate (default 0). Assume all accounts have the same
    interest rate.
  - A private Date data field named dateCreated that stores the date when the
    account was created.
  - A no-arg constructor that creates a default account.
  - A constructor that creates an account with the specified id and initial
    balance.
    */
    private int id; //Default value for int -> 0
    private double balance; // default value for double -> 0.0
    private double annualInterestRate;
    private Date dateCreated;   // default value for any object -> null
    
    // default or no-arg constructor
    public Account() {
        this(0, 0.0); // it points to the two-args constructor
    }
    
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }
    
    /*
       - The accessor (getter) and mutator (setter) methods for id, balance, and annualInterestRate.
    */
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    /*
       - The accessor method for dateCreated.
       it doesn't make sense to have setter for this field because it should be constant
       throughout the lifetime of an account
    */
    public Date getDateCreated() {
        return dateCreated;
    }
    
    /*
    - A method named getMonthlyInterestRate() that returns the monthly interest rate.
    */
    public double getMonthlyInterestRate() {
        return getAnnualInterestRate() / 12;
    }
    
    /*
     - A method named getMonthlyInterest() that returns the monthly interest.
    */
    public double getMonthlyInterest() {
        return getBalance()* getMonthlyInterestRate();
    }
    
    /*- A method named withdraw that withdraws a specified amount from the account.
     */
    public void withdraw(double amountToWithdraw) {
//        balance = getBalance() - amountToWithdraw;
        setBalance(getBalance() - amountToWithdraw);
    }
    
    /*
    - A method named deposit that deposits a specified amount to the account.
    */
    public void deposit(double amountToDeposit) {
        setBalance(getBalance() + amountToDeposit);
    }
    
    @Override
    public String toString() { // to provide a textual representatio of your object internals
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated=" + dateCreated +
                '}';
    }
}

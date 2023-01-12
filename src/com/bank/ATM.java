package com.bank;

public class ATM{
	 
    public static void main(String args[]) {
        Account acct = new Account();
        System.out.println("Current balance : " + acct.balance());
       acct.withdraw(200);
        System.out.println("After withdrwal balance : " + acct.balance());
        acct.deposit(3500);
       System.out.println("Final balance : " + acct.balance());
 
    }
 
}
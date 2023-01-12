package com.epay;

public class EPayWallet {
	public static void processPaymentByUser(User user, double billAmount)
	{
	  
	     boolean message=user.makePayment(billAmount);
	     if(message) {
	      System.out.println("Congratulations"+user.getUserName()+"Paymenet of"+billAmount+"success");
	       System.out.println("Your wallet balance is "+user.getWalletBalance());
	     }
	    else { 
	     System.out.println("Sorry Jill, not enough balance to make payment");
	     System.out.println("Congratulations"+user.getUserName()+"Paymenet of"+billAmount+"success");
	       System.out.println("Your wallet balance is "+user.getWalletBalance());
	}
	}
	public static void main(String args[]) {
	User  user= new User(101, "Jack123", "jack@infy.com",1000.0);
	EPayWallet.processPaymentByUser(user,700);
	User kycuser = new KYCUser(201, "Jill", "jill@infy.com",3000.0);
	EPayWallet.processPaymentByUser(kycuser,1500.0);
	System.out.println("The Reward Points for this user is: " + ((KYCUser) kycuser).getRewardPoints());
	}
	}



package com.epay;

class KYCUser extends User{
private int rewardPoints;
//constructor to initialize variables
public int getRewardPoints() {
	return rewardPoints;
}



public void setRewardPoints(int rewardPoints) {
	this.rewardPoints = rewardPoints;
}



public KYCUser(int id, String userName, String emailId, double walletBalance) {
	super(id,userName,emailId,walletBalance);
}



public boolean makePayment(double billAmount) {

	 boolean pay=super.makePayment(billAmount);
	if(pay){
		
	  this.setRewardPoints((int) (billAmount*0.10));
	  return true;
	}
	else {
	return false;
	}

	}
}

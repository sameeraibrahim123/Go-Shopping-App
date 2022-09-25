package com.tns.Application;

import com.tns.Framework.PrimeAcc;
import com.tns.Framework.ShopAcc;

public class GSPrimeAcc extends PrimeAcc {
	
	// Class variable
	private static float charges;

	//Constructor to initialize the values
	public GSPrimeAcc(int accNo, String accNm,float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		GSPrimeAcc.charges = charges;
	}

	// Implementing the abstract method
	@Override
	public void bookProduct(float charges) 
	{
		System.out.println("Account No: "+ ShopAcc.getAccNo()+"\n"+
	                       "UserName: "+ShopAcc.getAccNm()+"\n"+
	                       "Charges: "+charges+"\n"+
	                       "Delivery charges: "+PrimeAcc.getDeliveryCharges()
	                       );
	}

	
	// Defining the getter method to read the private class variable charges
	public static float getcharges()
	{
		return GSPrimeAcc.charges;
		
	}
	
	@Override
	public void items(float items_id) {
		
	}

	// Overriding the toString method 
	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getCharges()=" + getCharges() + "]";
	}

	
	

	
}

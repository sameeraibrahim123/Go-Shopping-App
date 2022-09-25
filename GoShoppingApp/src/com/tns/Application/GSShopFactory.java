package com.tns.Application;

import com.tns.Framework.NormalAcc;
import com.tns.Framework.PrimeAcc;
import com.tns.Framework.ShopFactory;

// Defining a class GSShopFactory to implement the Abstract class ShopFactory
public class GSShopFactory extends ShopFactory {
	
  
	// Overriding the getNewPrimeAcc abstract method to provide body
	public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		return null;
	}

	// Overriding the getNewNormalAcc abstract method to provide body
	public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

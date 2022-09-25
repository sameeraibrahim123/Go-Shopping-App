package com.tns.Framework;

public abstract class ShopFactory {
	
	// Declaring abstract methods
	public abstract PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isSalaried);
	
	// Declaring abstract methods
	public abstract  NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges);

}

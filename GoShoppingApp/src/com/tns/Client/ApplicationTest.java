package com.tns.Client;

import com.tns.Application.*;
import com.tns.Framework.*;


public class ApplicationTest {

	public static void main(String[] args) {
		
		// Defining the GSShopFactory to the reference of abstract class ShopFactory
		@SuppressWarnings("unused")
		ShopFactory shopObj = new GSShopFactory();
		
		// Instantiate GSPrimeAcc and refer it through reference PrimeAcc.
		PrimeAcc primeAccObj = new GSPrimeAcc(1234, "Sameera", 0.0f, true);
		
        // Instantiate GSNormalAcc and refer it through reference NormalAcc.
		NormalAcc normalAccObj = new GSNormalAcc(2345, "Sameera-khan", 0.0f, 100.0f);
		
		System.out.println("#-----------------Invoking the bookPorduct of class GSPrimeAcc ------------------#\n");

		primeAccObj.bookProduct(345.5f);
		
		System.out.println("\n");
		
		System.out.println("#-----------------Invoking the bookPorduct of class GSNormalAcc ------------------#\n");
		normalAccObj.bookProduct(456.0f);
		
		// Invoke toString method.
		System.out.println(primeAccObj+"\n");
		System.out.println(normalAccObj);
       
		
	}

}

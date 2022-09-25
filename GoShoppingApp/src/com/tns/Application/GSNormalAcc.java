package com.tns.Application;
import com.tns.Framework.NormalAcc;

// 
public class GSNormalAcc extends NormalAcc {
	
    
    //Constructor to initialize the values
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		
	}

	// Implementing the abstract method
	@Override
	public void bookProduct(float charges) 
	{
		float charges1 = charges + NormalAcc.getDeliveryCharges();
		
		System.out.println("Account No: "+NormalAcc.getAccNo()+"\n"
				            +"Account Holder Name: "+NormalAcc.getAccNm()+"\n"
				            +"Delivery changers: "+ NormalAcc.getDeliveryCharges()+"\n"
				            +"Total Charges: "+charges1+"\n"
				            );

	}  
	
	// Implementing the abstract method
	@Override
	public void items(float items_obj) {
		System.out.println();
	}
    
	// Overwriting  toString method to read object content
	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getCharges()=" + getCharges() + "]";
	}

	
}

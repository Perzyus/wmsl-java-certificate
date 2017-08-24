package com.wealth.certificate.dumps_1z0_808.question000;

public class ExDoCastClass {

	public static void main(String[] args) {

		int iValue = 10;
		float fValue = 100.000f;
		double dValue = 200;
		
		iValue = fValue;
		iValue = dValue;
		fValue = dValue;
		fValue = iValue;
		dValue = iValue;
		dValue = fValue;

	}

}

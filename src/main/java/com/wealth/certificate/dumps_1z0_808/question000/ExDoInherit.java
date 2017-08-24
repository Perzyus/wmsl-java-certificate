package com.wealth.certificate.dumps_1z0_808.question000;


class AA {}

interface I {}

class BB extends AA implements I {}

public class ExDoInherit {

	public static void main(String[] args) {

		AA a = new AA();
		AA ab = new BB();
		BB b = new BB();
		
		I ib = new BB();
		I ia = (I) new AA();		// ClassCastException
		
		AA aaa = (AA) ib;
		AA aab = (AA) ib;
		BB bb = (BB) a;			// ClassCastException
//		I ib = (I) new AA(); 	
		
		

	}

}

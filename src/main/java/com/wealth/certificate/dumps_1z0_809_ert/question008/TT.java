package com.wealth.certificate.dumps_1z0_809_ert.question008;

public class TT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (CE ce = new CE()) {

			System.out.println("Body");
			
		} catch (Exception e) {

			System.out.println("Catch");
		}
		finally {
			System.out.println("Finally");
		}
		

	}

}

class CE implements AutoCloseable {
	
	public CE() throws Exception{
		throw new Exception();
	}

	@Override
	public void close() throws Exception {
		throw new Exception();
		
	}
	
	
}

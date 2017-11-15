package com.wealth.certificate.dumps_1z0_809_ert.question062;

public class Tet {

	public static void main(String[] args) throws FuelNotAvailException2 {
		Vehicle2 v = new SolarVehicle2();
		v.ride();
	}

}


 class FuelNotAvailException2 extends Exception {} 

 class Vehicle2 {

//A) Replace line n1 with 
//	 public void ride() throws FuelNotAvailException2 {
//B) Replace line n1 with 
//	 protected void ride() throws Exception { 
//	void ride() throws FuelNotAvailException2 { // line n1
		System.out.println("Happy Journey!");
	}
}

 class SolarVehicle2 extends Vehicle2 {

//C) Replace line n2 with 
//	 void ride() throws Exception { 
//D) Replace line n2 with 
//	 private void ride() throws FuelNotAvailException2 {
	public void ride() throws Exception { // line n2
		super.ride();
	}
}

 
// ใกล้เคียงที่สุดคือเปลี่ยน visibility จาก private เป็น public


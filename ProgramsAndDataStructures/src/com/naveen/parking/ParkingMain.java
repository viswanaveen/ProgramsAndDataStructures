package com.naveen.parking;

public class ParkingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParkingLot P1 = new ParkingLot();

	       Car c1 = new Car();
	       Motorcycle c2 = new Motorcycle();
	       Car c3 = new Car();
	       Motorcycle c4 = new Motorcycle();
	       Car c5 = new Car();
	       P1.parkVehicle(c1);
	       P1.parkVehicle(c2);
	       P1.parkVehicle(c3);
	     
	       //Note that c2 is from Microsoft
	       P1.parkVehicle(c4);
	       P1.parkVehicle(c5);

	}

}

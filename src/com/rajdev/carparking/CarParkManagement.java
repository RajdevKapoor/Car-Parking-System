package com.rajdev.carparking;

import java.util.*;//UTIL PACKAGE
import com.rajdev.vehicles.*;

public class CarParkManagement extends CarPark {
	//MAIN METHOD
public static void main(String[] args) {

System.out.println("Enter Maximum Number of parking slots ");
Scanner sn = new Scanner(System.in); //SCANNER CLASS 
	int x=sn.nextInt();
	if(x<1) {
	      throw new ArithmeticException("Parking Slots can't be less then 1 "); } //EXCEPTION HANDLING
	else {
		CarPark.setMaxCapacity(x);  
	   }  
	
	CarPark myCarPark = new CarPark();	//OBJECT CREATION
Car BMW = new Car("Z4", "red",4, "Auto",false);
 
Bike Superfly = new Bike("XTR", "Black",2,true );
 
Truck Mercedes = new Truck("8X4", "Blue", 12,"Manual", 4 );
 
Car Hyundai = new Car("i30","Light Blue",4,"Auto",true);//PARAMETERIZED CONSTRUCTOR
//Parking Vehicles
myCarPark.addVehicles(BMW);//METHOD OVERLOADING
myCarPark.addVehicles(Hyundai);
myCarPark.addVehicles(Mercedes);
myCarPark.addVehicles(Superfly);
int y=1;

while(y!=0 && myCarPark.numOfAvailableSpots()!=0) 
{
	System.out.println("There are 4 Reserved Parking Slots. To park more vehicles press 1 else press 0 \n");
	y = sn.nextInt();
	if(y==0) 
		break;
	System.out.println("Enter car model");
	sn.nextLine();
	String carmodel=sn.nextLine();
	System.out.println("Enter car color");
	String carcolor=sn.nextLine();
	Car merc = new Car(carmodel, carcolor,4, "Auto",false);
	myCarPark.addVehicles(merc);
}

 
 
System.out.println("No. of Parked vehicles: " + myCarPark.numOfOccupiedSpots());
 
System.out.println("No. of Available Spots: "+ myCarPark.numOfAvailableSpots());
 
if (myCarPark.numOfAvailableSpots()==0) {
	System.out.println("Car Park is full");
}
// Printing details
System.out.println("====================\n");
System.out.println("List of All Parked Vehicles is as folows: ");
myCarPark.printParkedVehicleDetails();
 
 
}
 
}
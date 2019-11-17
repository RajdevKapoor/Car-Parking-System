package com.rajdev.carparking;

import java.util.*;

import com.rajdev.vehicles.*;

public class CarPark extends Vehicle {
 
private static int maxCapacity;
private ArrayList <Vehicle>carParkArray; // Every member of carParkArray will be of type Vehicle
 
//constructor
public CarPark(){
 
this.carParkArray = new ArrayList<Vehicle>(maxCapacity);
//This ensures car PArk has three vehicles max
 
}
public static void setMaxCapacity(int a){
maxCapacity=a;
} 

// Method to find maximum capacity of the car park
public static int getMaxCapacity(){
return maxCapacity;
}
 
// Method to find available spots in the carpark
public int numOfAvailableSpots(){
return CarPark.maxCapacity - this.carParkArray.size();
}
 
// Method to find number of occupied spaces in the carpark
public int numOfOccupiedSpots(){
return this.carParkArray.size();
}
 
//Method to add vehicles to the carpark
public void addVehicles(Vehicle vehicle){
 
if(this.numOfAvailableSpots() > 0){
this.carParkArray.add(vehicle);
vehicle.printDetails();
System.out.println("++++++++++++ \n");
}else {
System.out.println("Car Parking is full");
}
 
}
//Method to print parked vehicle details
public void printParkedVehicleDetails(){
 
// For every vehicle in array carParkArray, do blah blah
for(Vehicle vehicle: this.carParkArray){
vehicle.printDetails();
System.out.println("++++++++++++++++ \n");
}
}
}
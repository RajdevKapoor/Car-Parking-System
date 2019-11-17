package com.rajdev.vehicles;
//PACKAGE IMPORT

//INHERITANCE
public class Truck extends Vehicle{
	 
	
//ACCESS MODIFIER	
private int numOfContainers;
 
public Truck(){
super();//SUPER KEYWORD
}
 
public Truck(String model, String color, int numOfWheels, String transmission, int numOfContainers){
super ( model, color, numOfWheels, transmission) ;
this.numOfContainers = numOfContainers; //THIS KEYWORD
}
 
//getters
 
public int getnumOfContainers(){
return numOfContainers;
}
 
//setter
public void setnumOfContainers(int numOfContainers){
this.numOfContainers = numOfContainers;
}
 
//Method
public void printTruckdetails(){
super.printDetails();
System.out.println(" Number of Containers in this Truck are " + this.numOfContainers);
 
}
}
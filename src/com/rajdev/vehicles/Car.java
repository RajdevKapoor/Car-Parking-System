package com.rajdev.vehicles;
//inheritance
public class Car extends Vehicle{
	//ACCESS MODIFIER
private Boolean roof;
 
// Constructors
public Car(){
super();//SUPER KEYWORD
}
 
public Car(String model, String color, int numOfWheels, String transmission, Boolean roof){
 
super(model, color, numOfWheels, transmission);
this.roof = roof;//THIS KEYWORD
 
}
 
//getter
public boolean getRoof(){
return roof;
}
 
// setter
public void setRoof(boolean roof){
this.roof=roof;
}
 
// Methods
public void printdetailscar(){
super.printDetails(); // Calling superclass method
System.out.println(" does this car has a roof: " + this.roof);
}
}
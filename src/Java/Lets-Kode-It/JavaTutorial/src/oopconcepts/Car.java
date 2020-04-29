package oopconcepts;

public class Car {
	private String make;
	public int speed;
	public int gear;

	public Car() {
		this(10, 2);
		this.speed = 0;
		this.gear = 0;
		System.out.println("Executing constructor without arguments");
	}
	
	public Car(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
		System.out.println("Executing constructor with arguments");
	}

	
	// "this" refers to the instance of the class (object)
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getMake() {
		return make;
	}
}
	
	
	
	
	
//	// color
//	private String color;
//	// make
//	private String make;
//	// model
//	private String model;
//	// year
//	private int year;
//	
//	public void increaseSpeed() {
//		System.out.println("Increasing the speed");
//	}
//	
//	public String getMake() {
//		return this.make1;
//	}
//	
//	public void setMake(String make) {
//		this.make1 = make;
//	}
//
//	public String getColor() {
//		return color;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//
//	public String getModel() {
//		return model;
//	}
//
//	public void setModel(String model) {
//		this.model = model;
//	}
//
//	public int getYear() {
//		return year;
//	}
//
//	public void setYear(int year) {
//		if (year > 1900) {
//			this.year = year;
//		} else {
//			System.out.println("This year is not valid");
//		}
//	}
//
//	public void setSpeed(int i) {
//		// TODO Auto-generated method stub
//		this.speed = i;
//	}
//
//	public void setGear(int i) {
//		// TODO Auto-generated method stub
//		this.gear = i;
//	}
//}

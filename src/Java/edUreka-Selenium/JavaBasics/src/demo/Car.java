package demo;

public class Car {
	
	public static void main(String[] args) {
		Car Mercedes = new Car(); // Mercedes is an object of class
		Car Audi = new Car(); // Audi is an object of class Car
		
		int numberOfTyres = 4;
		String colorOfCar = "White";
		String favoriteColor = "My favorite color is White";
		double mileage = 10.5;
		float heightOfCar = 150.5f;
		boolean didIDoTheThing = false;
		char model = 'S';
		
		System.out.println("Today is sunday!");
		System.out.println(favoriteColor);
		System.out.println("Heigh of car =" + heightOfCar + "cms");
	}
}
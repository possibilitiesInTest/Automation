package oopconcepts;

public class ClassDemo {

	public static void main(String[] args) {
		Car bmw = new Car();
		bmw.setMake("BMW");
		System.out.println(bmw.getMake());
	
		Car benz = new Car();
		benz.setModel("C300");
		System.out.println(benz.getModel());
		
		benz.setYear(1880);
		System.out.println(benz.getYear());
	}
}

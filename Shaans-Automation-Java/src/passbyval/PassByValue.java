package passbyval;

/**
 * Q.Does Java support 'Pass by value' or 'Pass by reference'?
 * Java is always 'Pass by value', which means it copies the arguments(but not pass the original variables)
 * There are 2 types of variables you can pass to the methods, primitives and reference variables(both are pass by value)
 * 
 * Q.What are Stack and Heap memory?
 * Stack and the Heap are two primary memory areas used by JVM.
 * Stack - Methods and local variables(both primitive and reference variables) are stored in Stack
 * Heap - Objects and instance variables are stored in Heap
 *  
 */
public class PassByValue {
	public static void main(String[] args) {		
		long id = 111;//id is primitive variable
		Report rep = new Report();//rep is reference variable
		
		incrementId(id);//passing primitive variable	
		System.out.println("after calling incrementId: " + id);
		
		updateTitle1(rep);//passing reference variable
		System.out.println("after calling updateTitle1: " + rep.title);
		updateTitle2(rep);//passing reference variable
		System.out.println("after calling updateTitle2: " + rep.title);
	}
	
	static void incrementId(long id) {
		id = id + 1; //112
	}
	
	static void updateTitle1(Report rep) {
		rep = new Report();
		rep.title = "copy";
	}
	
	static void updateTitle2(Report rep) {
		rep.title = "updated";
	}
}
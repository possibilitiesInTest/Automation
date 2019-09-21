package introduction;


public class HelloWorld {
	
	static byte byteVariable;
	static short shortVariable;
	static int integerVariable;
	static long longVariable;
	static float floatVariable;
	static double doubleVariable;
	static boolean booleanVariable;
	static char charVariable;

	public static void main(String[] args) {
		// First Comment
		/*
		 * Multi 
		 * line 
		 * comment
		 */

		System.out.println("Hello worlddd!");
		
//		byte byteVariable = 126;
		System.out.println("Byte Value is " + byteVariable);
		
//		short shortVariable = 2000;
		System.out.println("short value is " + shortVariable);
		
//		int integerVariable = 20000;
		System.out.println("int varibale is " + integerVariable);
		
//		long longVariable = 10000000L;
		System.out.println("long variable is " + longVariable);
		
//		float floatVariable = 20.0f;
		System.out.println("float var is " + floatVariable);
		
//		double doubleVariable = 60.33;
		System.out.println("double val is " + doubleVariable);
		
//		boolean bool = true;
		System.out.println("Boolean var is " + booleanVariable);
		
//		char charVariable = 'a';
		System.out.println("Char val is " + charVariable);
	}
	
	public static void oneMoreMethod() {
		System.out.println("Int value: " + integerVariable);;
	}
}

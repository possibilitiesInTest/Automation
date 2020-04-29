package introduction;

public class Strings {

	
	public static void main(String[] args) {
		// String Literal - String constant pool
		String str1 = "hello";
		
		//Creates new ref to same obj,
		// NOT new obj
		String str3 = "hello";
		
		// String Object - heap
		String str2 = new String("Welcome");
				
		// Creates new obj, 
		// removes reference to new obj
		// old object gets garbage collected
		str1 = "more Hello";
	}
}

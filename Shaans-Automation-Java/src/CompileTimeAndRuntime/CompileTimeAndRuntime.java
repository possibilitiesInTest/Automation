package CompileTimeAndRuntime;

/**
 * Q.What are Compile-time and Runtime?
 * Compile time is when .java file is built into .class file by Java Compiler
 * Runtime is when the .class file is executed by JVM
 * 
 * Q.What are the common Compile-time and Runtime errors?
 * Compile time errors are Syntax and Semantic errors. Semantic errors examples-
 * 					using variable before initialization, updating method signature without updating references etc
 * At Runtime, NullPointerException, ArrayIndexOutofBoundsException, OutOfMemoryError etc can be thrown 
 */
public class CompileTimeAndRuntime {
	public static void main(String[] args) throws Exception{
		Email em = new Email();
		/*If you do not initialize the reference variable 'em', following throws NullPointerException*/
		em.generateAndSend();
		
		/*If you do not provide a Program argument following throws ArrayIndexOutofBoundsException*/
		System.out.println(args[0]);
		
		/*If you provide the VM argument 'Xmx1m' for max memory, following throws OutOfMemoryError*/
		int size = 10;
//		while(true) {
//			int i[] = new int[size];
//			System.out.println(i.length);
//			size = size * 10;
//		}
		
		int i[] = new int[size];
		System.out.println(i.length);
		size = size * 10;
		System.out.println(size);
	}	
}
package staticConcepts;

public class StaticExampleClass {
	private static int wheelsCount = 4;
	
	private String make;
	private static int instanceNum = 0;
	// static variable is attached to the class
	// not the instance
	
	public StaticExampleClass(String make) {
		this.make = make;
		instanceNum++;
	}
	
	public String getMake() {
		return make;
	}
	
	public static int getInstanceNum() {
		return instanceNum;
	}
}

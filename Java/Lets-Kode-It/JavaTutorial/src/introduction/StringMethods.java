package introduction;

public class StringMethods {

		public static void main(String[] args) {
			String str = "This is the test string";
			String str2 = "New words";
			
			String str3 = "Hello";
			String str4 = "Hello";
			String str5 = "Welcome";
			String str6 = "  spaces all around   ";
			String str7 = "Hello";
			
			System.out.println(str.length());
			System.out.println(str.charAt(2));
			System.out.println(str.concat(str2));
			System.out.println(str.contains("is"));
			System.out.println(str.contains("wewa"));
			System.out.println(str3.equals(str4));
			
			System.out.println(str.indexOf('h'));
			System.out.println(str.isEmpty());
			System.out.println(str4.isEmpty());
			System.out.println(str6.trim());
			System.out.println(str6);
			System.out.println(str7.replace("e", "a"));
			
			// starts at index toEnd
			System.out.println(str.substring(5));
			System.out.println(str.substring(5, 10));
			
			char[] charArray = str.toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				System.out.println("index " + i + " is: " + charArray[i]);
			}
			
			System.out.println("Lower case: " + str.toLowerCase());
			System.out.println("Upper case: " + str2.toUpperCase());
			
		}
}

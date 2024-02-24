package guru99project;

public class Guru99_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Guru_99_Project guru99 = new Guru_99_Project();
		
		guru99.invokeBrowser();
		guru99.login("mngr554909", "zavasYd");
		guru99.addCustomer();
		
		String customerId = guru99.getCustomerId();
		System.out.println(customerId);
	}

}

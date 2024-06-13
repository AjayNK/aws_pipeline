package scripts;

public class Test2 {

	public static void main(String[] args) {
		
		String name = Test2.fullName("Priya", "Racheal");
		System.out.println(name);

	}
	
	
	public static String fullName(String firtsName, String lastName) {
		String fn = firtsName+" "+lastName;
		return fn;
	}

}

package StringsClass;

public class StartsWith {

	public static void main(String[] args) {
		String Str = new String ("Welcome-to-Tutorialspoint.com");
		
		System.out.print("Returned value : ");
		System.out.println(Str.startsWith("Welcome"));
		
		System.out.print("Returned value : ");
		System.out.println(Str.startsWith("Tutorials"));
		
		System.out.print("Returned value : ");
		System.out.println(Str.startsWith("Welcome", 11));
		
	}

}

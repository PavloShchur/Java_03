package StringsClass;

public class Matches {

	public static void main(String[] args) {
		String Str = new String("Welcome to Tutorialspoint.com");
		System.out.print("Returned value :");
		System.out.println(Str.matches("(.*)Tutorials(.*)"));
		
		System.out.print("Returned value :");
		System.out.println(Str.matches("Totorials"));
		
		System.out.print("Returned value :");
		System.out.println(Str.matches("Welcome(.*)"));
		
	}

}

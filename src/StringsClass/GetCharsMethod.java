package StringsClass;

public class GetCharsMethod {

	public static void main(String[] args) {
		String Str1 = new String("Welcome to Tutorialspoint.com");
		char [] Str2 = new char [7];
		
		try {
			Str1.getChars(2, 9, Str2, 0);
			System.out.print("Copied value = ");
			System.out.println(Str2);
		} catch (Exception e) {
			System.out.println("raised exception...");
		}
	}

}

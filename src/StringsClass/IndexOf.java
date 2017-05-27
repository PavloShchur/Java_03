package StringsClass;

public class IndexOf {

	public static void main(String[] args) {
		String Str = new String("Welcome to Tutorialspoint.com");
		System.out.print("Found Index : ");
		System.out.println(Str.indexOf('o', 5));
		
		String SubStr1 = new String("Tutorial");
		System.out.println(Str.indexOf(SubStr1));
		
		System.out.println(Str.indexOf(SubStr1, 15));


	}

}

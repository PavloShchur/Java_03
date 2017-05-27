package StringsClass;

public class SunsequenceMethod {

	public static void main(String[] args) {
		String Str = new String ("Welcome to Tutorialspoint.com");
		
		System.out.print("Returned value : ");
		System.out.println(Str.subSequence(0,  10));

		System.out.print("Returned value : ");
		System.out.println(Str.subSequence(10, 15));
		
		System.out.print("Returned value : ");
		System.out.println(Str.substring(10));
		
		System.out.print("Returned value : ");
		System.out.println(Str.substring(10, 15));
	}

}

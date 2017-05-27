package StringsClass;

public class SplitMethod {

	public static void main(String[] args) {
		String Str = new String ("Welcome-to-Tutorialspoint.com");
		
		System.out.println("Returned value : ");
		for (String retval: Str.split("-", 2)) {
			System.out.println(retval);
		}
		
		System.out.println("Returned value : ");
		for (String retval: Str.split("-", 3)) {
			System.out.println(retval);
		}
		
		System.out.println("Returned value : ");
		for (String retval: Str.split("-", 0)) {
			System.out.println(retval);
		}
		
		System.out.println("Returned value : ");
		for (String retval: Str.split("-")) {
			System.out.println(retval);
		}
	}

}

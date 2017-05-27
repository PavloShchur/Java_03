package StringsClass;

public class RegionMAtches {

	public static void main(String[] args) {
		String Str = new String("Welcome to Tutorialspoint.com");
		String Str2 = new String("Tutorials");
		String Str3 = new String("TUTORIALS");
		
		
		
		System.out.print("Returned value :");
		System.out.println(Str.regionMatches(11, Str2, 0, 9));
		
		System.out.print("Returned value :");
		System.out.println(Str.regionMatches(11, Str3, 0, 9));
		
		
		System.out.print("Returned value :");
		System.out.println(Str.regionMatches(true, 11, Str2, 0, 9));
	}

}

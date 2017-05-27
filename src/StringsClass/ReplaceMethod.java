package StringsClass;

public class ReplaceMethod {

	public static void main(String[] args) {
		String Str = new String ("Welcome to Tutorialspoint.com");
		
		System.out.print("Returned value : ");
		System.out.println(Str.replace('o', 'T'));
		
		System.out.print("Returned value : ");
		System.out.println(Str.replace('l', 'D'));
		
		System.out.print("Returned value : ");
		System.out.println(Str.replaceAll("(.*)Tutorials(.*)", "AMROOD"));
		
		System.out.print("Returned value : ");
		System.out.println(Str.replaceAll("(.*)Tutorials(.*)", "AMROOD"));
		
		System.out.print("Returned value : ");
		System.out.println(Str.replaceAll("Tutorials", "AMROOD"));
	}

}

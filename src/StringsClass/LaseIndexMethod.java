package StringsClass;

public class LaseIndexMethod {

	public static void main(String[] args) {
		String Str1 = new String("Welcome to Tutorialspoint.com");
		String SubStr = new String ("Tutorials");
		System.out.print("Found Last Index : ");
		System.out.println(Str1.lastIndexOf('o'));
		System.out.println(Str1.lastIndexOf('o', 5));
		
		System.out.print("Found Last Index : ");
		System.out.println(Str1.lastIndexOf(SubStr));
		
		System.out.print("Found Last Index : ");
		System.out.println(Str1.lastIndexOf(SubStr, 15));

	}

}

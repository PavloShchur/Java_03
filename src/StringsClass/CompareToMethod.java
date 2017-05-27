package StringsClass;

public class CompareToMethod {

	public static void main(String[] args) {
		String str1 = "Strings are immutable";
		String str2 = new String("Strings are immutable");
		String str3 = new String("Integers are not immutable");
		
		int result = str1.compareToIgnoreCase(str2);
		System.out.println(result);
		
		result = str2.compareToIgnoreCase(str3);
		System.out.println(result);
		
		result = str3.compareToIgnoreCase(str1);
		System.out.println(result);
	}

}

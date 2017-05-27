package StringsClass;

public class EqualsMethod {

	public static void main(String[] args) {
		String Str1 = new String("This is really not immutable!!");
		String Str2 = Str1;
		String Str3 = new String("This is really not immutable!!");
		String Str4 = new String("This IS REALLY NOT IMMUTABLE!!");
		
		
		boolean retValue;
		
		retValue = Str1.equalsIgnoreCase(Str2);
		System.out.println("Returned value : " + retValue);
		
		retValue = Str1.equalsIgnoreCase(Str3);
		System.out.println("Returned value : " + retValue);
		
		retValue = Str1.equalsIgnoreCase(Str4);
		System.out.println("Returned value : " + retValue);
	}

}

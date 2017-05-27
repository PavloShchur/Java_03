package StringsClass;

public class StringEndsWithMethod {

	public static void main(String[] args) {
		String Str = new String("This is not really immutable!!");
		boolean retvalue;
		
		retvalue = Str.endsWith(" immutable!!");
		System.out.println("Returned value : " + retvalue);
		
		retvalue = Str.endsWith(" immu");
		System.out.println("Returned value : " + retvalue);
	}

}

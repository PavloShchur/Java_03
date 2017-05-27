package StringsClass;

public class StringInsertMethod {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("abcgefghijk");
		buffer.insert(3, "132");
		System.out.println(buffer);
	}

}

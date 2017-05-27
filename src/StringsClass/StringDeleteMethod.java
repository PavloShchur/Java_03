package StringsClass;

public class StringDeleteMethod {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("abcdefghijk");
		buffer.delete(3, 7);
		System.out.println(buffer);
	}
}

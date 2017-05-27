package StringsClass;

public class StringReplaceMethod {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("abcdefghijk");
		buffer.replace(3, 8, "ZARA");
		System.out.println(buffer);
	}

}

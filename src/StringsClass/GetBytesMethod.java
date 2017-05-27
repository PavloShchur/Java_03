package StringsClass;

import java.io.UnsupportedEncodingException;

public class GetBytesMethod {

	public static void main(String[] args) {
		String Str1 = new String("Welcome to Tutorialspoint.com");

		try {
			byte[] Str2 = Str1.getBytes("UTF-8");
			System.out.println("Returned value : " + Str2);
			Str2 = Str1.getBytes("ISP-8859-1");
			System.out.println("Returned value : " + Str2);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Unsupported character set");
		}

	}
}

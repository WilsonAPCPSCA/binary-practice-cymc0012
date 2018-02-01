import java.util.Scanner;
public class binaryConvert {
	public static void main(String[] args) {
	Scanner cvt = new Scanner(System.in);
	System.out.print("Enter the number you would like to convert into binary: ");
	int dec = cvt.nextInt();
	System.out.print("The converted binary is: "+binary(dec));
	}
	private static String binary(int decimal) {
		int dec = decimal;
		String converted = Integer.toBinaryString(dec);
		return converted;
	}
}

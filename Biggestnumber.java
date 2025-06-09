package ABC;
import java.util.*;
public class Biggestnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		String input=sc.nextLine();
		
		
		System.out.println("Digits:");
		for(int i=0;i<input.length();i++) {
			System.out.println(input.charAt(i));
		}
		
		
		sc.close(); }
	public static void maximum(String input)	{
		int max=0;
		for(int i=0;i<input.length();i++) {
			int digit=Character.getNumericValue(input.charAt(i));
			if(digit>max) {
				max=digit;
			}
			
		}
	}

}

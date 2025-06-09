package ABC;
import java.util.Scanner;
public class Calender {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a weekday:");
		String day=sc.nextLine().trim().toLowerCase();
		switch(day) {
		case"monday":
			System.out.println("lets learn python");
			break;
		case "tuesday":
			System.out.println("lets learn java");
			break;
		case "wednesday":
			System.out.println("lets learn c++");
			default:
				System.out.println("invalid day you entered");
			
		}
	// TODO Auto-generated method stub

	}

}

import java.util.Scanner;

public class Class2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your name:");
		String name = in.next();
		
		System.out.print("Please enter a number:");
		String radius = in.next();
		
		double number = Integer.parseInt(radius);			
		
		double newnumber=number/60;
		int result = (int)((newnumber - (int)newnumber) * 100);

		
		System.out.print("Your number is "+ newnumber + " minutes "+ result + " seconds ");
		
		
	}
}

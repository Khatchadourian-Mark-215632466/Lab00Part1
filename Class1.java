import java.util.Scanner;


public class Class1 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Please enter a radius:");
	String radius = in.next();
	
	int number = Integer.parseInt(radius);			
	System.out.println(number);
	
	System.out.print("Please enter your name:");
	String name = in.next();
	
	double radiusnumber = number*3.14*2;
	double area = number*number*3.14;
	
	System.out.print(name + ", your input circle has with raidus "+ number + 
			" has a perimeter of "+ radiusnumber + " and area of "+area );
}
}

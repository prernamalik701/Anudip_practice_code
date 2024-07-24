package prernaLabs;

import java.util.Scanner;

public class ConditionalOperator {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int First_number;
	int  Second_Number;
	
	First_number= sc.nextInt();
	
	Second_Number= sc.nextInt();
	
	int maximum_Number= (First_number > Second_Number)? First_number: Second_Number;
	System.out.println("The maximum between two number is:" + maximum_Number);
	
	
	

}
}

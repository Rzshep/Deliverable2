import java.util.Scanner;

public class D2 {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		int month1;
		int month2;
		int day1;
		int day2;
		int year1;
		int year2;
		
	System.out.println("Enter a month (in numbers): "); //user inputs int
	month1 = input.nextInt();
	System.out.println("Enter a day: ");
	day1 = input.nextInt();
	System.out.println("Enter a year (YYYY): ");
	year1 = input.nextInt();
	System.out.println("Enter another month (in numbers): ");
	month2 = input.nextInt();
	System.out.println("Enter another day: ");
	day2 = input.nextInt();
	System.out.println("Enter another year (YYYY): ");
	year2 = input.nextInt();
	
	int yearsDiff = Math.abs(year1 - year2); // Math.abs makes int positive
	int monthsDiff = Math.abs(month1 - month2);
	int daysDiff = Math.abs(day1 - day2);
	
	System.out.print("Your dates are " + yearsDiff + " year(s) apart, ");
	System.out.print(monthsDiff + " month(s) apart, ");
	System.out.println("and " + daysDiff + " day(s) apart."  );
		
		
 }
}

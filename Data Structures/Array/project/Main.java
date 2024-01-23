// How many days temperature input
// Take temperature of each number of days
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to the average temperature finder ");
		int number_of_days;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days");
		number_of_days = sc.nextInt();
		Double temperature;

		Temperature temp = new Temperature(number_of_days);
		for(int i=1;i<=number_of_days;i++){
			System.out.println("Enter day " + i + " temperature");
			temperature = sc.nextDouble();
			temp.insert(i-1,temperature);
		}

		
		System.out.println("The average temperature is : " + temp.find_average());
		System.out.println("The number of days above average : " + temp.number_of_days_above_average());
	}
}

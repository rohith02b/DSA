import java.util.Scanner;

public class inputOutput {
	
	public static void main(String[] args)
	{
		Scanner io = new Scanner(System.in);
		int firstNumber;
		System.out.println("Enter an integer value ");
		firstNumber = io.nextInt();
		System.out.println("The inputted variable is : " + firstNumber);
		io.close();
	}
}
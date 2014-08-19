//Seth Novosel
import java.util.*;
public class ScannerPractice
	{
	static int number;
	static double decimal;
	static String answer;
	public static void main(String[] args)
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your favorite number between 1 and 10?");
		number = userInput.nextInt();
		System.out.println("What 1/2 in decimal form?");
		decimal = userInput.nextDouble();
		if(decimal == .5)
			{
			System.out.println("That is correct.");
			}
		else
			{
			System.out.println("That is wrong the answer is .5");
			}
		System.out.println("What do you think is better a Ferrari or a Lamborghini?");
		answer = userInput.next();
		if(answer == "Ferrari")
			{
			System.out.println("Nice!");
			}
		else if(answer == "Lamborghini")
			{
			System.out.println("Cool!");
			}
		}
	}

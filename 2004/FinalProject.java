package FinalProject;
import java.io.*;
import java.util.*;
/**
 * Summary description for FinalProject.
 */

public class FinalProject
{
	public static void main(String[] args) throws IOException
	{
		Random myRand = new Random();
		Integer myInt;
		InputStreamReader stdin = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(stdin);
		int x= myRand.nextInt(100);
		System.out.println("You are playing Pat's Guessing game here, you can make a guess between 1-100, if you win you beat the game but, keep playing because the # alternates every time!");
		int turns=0;
		String even;
		boolean prime=true;
		int i=x-1;
		while (i>1){
			if(x%i==0)
			{
				prime=false;
			}
			i=i-1;
			}
		if (x%2 ==0)
			even = "HINT: It is even";
		else if(prime)
			even = "HINT: It is prime";
		else
			even = "HINT: It is odd";
		while (true)
		{
			System.out.println("Make a guess");
			String userInput;
			userInput = in.readLine();
			myInt = new Integer(userInput);
			if (myInt.intValue()==x)
			{
				System.out.println("YOU WIN!!!!!!!!!!!!!!!");
				break;
			}
			else if (myInt.intValue()<x)
			{
				System.out.println("Too Low!");
			}
			else
			{
				System.out.println("Too High!");
			}
			turns=turns+1;
			if(turns == 3)
				System.out.println(even);
		}
	System.out.println("It took you "+turns+" turns to guess the number");
	}
}

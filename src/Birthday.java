import java.util.*;

public class Birthday 
{
	public static void main(String [] args)
	{
		int people;
		int runs;
		Scanner reader = new Scanner(System.in);
		
		
		System.out.println("How many runs would you like to do: ");
		runs = reader.nextInt();
		System.out.println("How many people per run: ");
		people = reader.nextInt();
		
		Person runner = new Person();
		
		System.out.println("The probablitiy of two people having the same birthday in a group of " + people + " people after " + runs + " runs is : " + runner.run(runs, people) + "%");
	}
	
}

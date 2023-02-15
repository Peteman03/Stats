import java.util.*;

public class Person 
{
	private int birthday;
	
	/*
	 *The constructor for the person class, which initializes a birthday between 1 and 365 using a random number generator 
	 */
	public Person()
	{
		Random generator  = new Random();
		
		birthday = generator.nextInt(365)+1;
	}
	
	/**
	 * Method to return the birthday for a person object
	 * @return the value that birthday is set to
	 */
	public int getBirthday()
	{
		return birthday;
	}
	
	/**
	 * Method to run through the different groups and check if people share the same birthday. Then a counter is incremented if the condition is met.
	 * Finally the counter is divided by the number of runs that occurred to get the probability
	 * @param runs, the number of runs that are going to take place
	 * @param people, the number of people that are being compared
	 * @return the probability of two people in the group sharing a birthday after the number of runs have occurred
	 */
	public double run(int runs, int people)
	{
		ArrayList<ArrayList<Person>> sampleSize = new ArrayList<ArrayList<Person>>();
		
		for(int i = 0; i < runs; i ++)
		{
			ArrayList<Person> group = new ArrayList<Person>();
			for(int j = 0; j < people; j ++)
			{
				Person p = new Person(); 
				group.add(p);
			}
			sampleSize.add(group);
		}
		
		int counter = 0;
		boolean check = false;
		
		for(int i = 0; i < sampleSize.size(); i ++)
		{
			for(int j = 0; j < sampleSize.get(i).size(); j ++)
			{
				for(int k = j+1; k < sampleSize.get(i).size(); k ++)
				{
					if(sampleSize.get(i).get(j).getBirthday() == sampleSize.get(i).get(k).getBirthday())
					{
						counter++;
						check = true;
						break;
					}
					if(check)
					{
						break;
					}
				}
			}
		}
		
		/*for(int i = 0; i < sampleSize.size(); i ++)
		{
			for(int j = 0; j < sampleSize.get(i).size(); j++)
			{
				System.out.print(sampleSize.get(i).get(j).getBirthday() + " ");
			}
			System.out.println();
		}*/
		
		double results = (double)counter/runs * 100;
		
		return results;
	}
}

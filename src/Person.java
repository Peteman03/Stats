import java.util.*;

public class Person 
{
	private int birthday;
	
	public Person()
	{
		Random generator  = new Random();
		
		birthday = generator.nextInt(365)+1;
	}
	
	public int getBirthday()
	{
		return birthday;
	}
	
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
		
		for(int i = 0; i < sampleSize.size(); i ++)
		{
			for(int j = 0; j < sampleSize.get(i).size(); j++)
			{
				System.out.print(sampleSize.get(i).get(j).getBirthday() + " ");
			}
			System.out.println();
		}
		
		double results = (double)counter/runs * 100;
		
		return results;
	}
}

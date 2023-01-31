import java.util.*;

public class StatsLibrary
{	
	/**
	 * 
	 * @param list
	 * @return the mean of the arraylist
	 */
	public int mean(ArrayList<Integer> list)
	{
		int sum = 0;
		int average;
		
		for(int i = 0; i < list.size(); i ++)
		{
			sum += list.get(i);
		}

		average = sum/list.size();
		return average;
	}
	
	/**
	 * 
	 * @param list
	 * @return the median of the arraylist or null if none exists
	 */
	public Object median(ArrayList<Integer> list)
	{
		if(list.size() % 2 == 1)
		{
		int median = list.get(list.size()/2);
		return median;
		}
		
		else
		{
			return null;
		}
	}
	
	/**
	 * created using the help of stack overflow
	 * @param list
	 * @return the mode of the set or null if non exists
	 */
	public Object mode(ArrayList<Integer> list)
	{
		int counter1 = 0;
		int counter2 = 0;
		
		int mode = 0;
		
		for(int i = 0; i < list.size(); i ++)
		{
			int popular = list.get(i);
			counter1 = 0;
			
			for(int j = i+1; j <list.size(); j ++)
			{
				if(list.get(j) == popular)
				{
					counter1++;

				}
				if(counter1 > counter2)
				{
					mode = popular;
					counter2 = counter1;
				}
				else if(counter1 == counter2)
				{
					break;
				}
			}
		}
		
		if(counter1 == counter2)
		{
			return null;
		}
		else
		{
		return mode;
		}
	}
	
	/**
	 * 
	 * @param an arraylist of integers
	 * @return return the standard deviation of the arraylist
	 */
	public double standardDeviation(ArrayList<Integer> list)
	{
		int sum = 0;
		double standardDeviation;
		
		for(int i = 0; i < list.size(); i ++)
		{
			sum += Math.pow(mean(list) - list.get(i), 2);
		}
		
		standardDeviation = Math.sqrt(sum/list.size());
		
		return standardDeviation;
	}
}

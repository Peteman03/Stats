import java.util.*;

public class StatsLibrary
{	
	/**
	 * take in an arraylist of integers and determine what the mean of the list is
	 * @param arraylist of type integer
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
	 * take in an arraylist of integers and determine what the median is or return null if no median exists
	 * @param arraylist of type integer
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
	 * @param arraylist of type integer
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
	 * take in an arraylist of integers and determine the standard deviation of the list
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
	
	/**
	 * find the number of combinations in a set given the size of the set and how many numbers are being taken
	 * @param n, the size of the set
	 * @param r, the number taken from the set
	 * @return the total number of combinations of n and r
	 */
	public int combination(int n, int r)
	{		
		int permutation = 1;
		int factorialR = 1;
		
		for(int i = n; i > n-r; i --)
		{
			permutation *= i;
		}
		
		for(int i = r; i> 0; i --)
		{
			factorialR *= i;
		}
		
		int combination = permutation/factorialR;
		
		return combination;
	}
	
	/**
	 * find the number of permutations in a set given the size of the set and how many numbers are being taken
	 * @param n, the size of the set
	 * @param r, the number taken from the set, without replacing
	 * @return the number of permutations of n and r
	 */
	public int permutation(int n, int r)
	{
		int permutation= 1;
		
		for(int i = n; i > n-r; i --)
		{
			permutation *= i;
		}
		
		return permutation;
	}
}

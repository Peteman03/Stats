import java.math.BigInteger;
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
	 * take in an arraylist and see what item appears the most or null if multiple items appear the most 
	 * created using the help of stack overflow
	 * @param arraylist of type integer
	 * @return the mode of the set or null if none exists
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
			
			for(int j = i+1; j < list.size(); j ++)
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
	public BigInteger combination(int n, int r)
	{		

		BigInteger permutation = permutation(n,r);
		BigInteger factorialR = factorial(r);
		
		BigInteger combination = permutation.divide(factorialR);
		
		return combination;
	}
	
	/**
	 * find the number of permutations in a set given the size of the set and how many numbers are being taken
	 * Using the factorial method
	 * @param n, the size of the set
	 * @param r, the number taken from the set, without replacing
	 * @return the number of permutations of n and r
	 */
	public BigInteger permutation(int n, int r)
	{
		BigInteger permutation = factorial(n).divide(factorial(n-r));
		
		return permutation;
	}
	
	/**
	 * Method to find the factorial of a given number using BigIntegers
	 * Looked up on GeeksForGeeks on how to properly utilize BigInteger methods
	 * @param number
	 * @return the factorial of the given number as a BigInteger
	 */
	public BigInteger factorial(int number)
	{
		BigInteger factorial = new BigInteger("1");
		
		for(int i = 2; i <= number; i++)
		{
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
	
		return factorial;
	}
	
	/**
	 * Method to determine the binomial distribution of an exact y
	 * @param n, number of trials
	 * @param p, probability of success
	 * @param y, number of success
	 * @return the binomial distribution given n,p, and y
	 */
	public double binomialDistributionExact(int n, double p, int y)
	{
		double combination = combination(n,y).doubleValue();  
		double pxy = Math.pow(p, y); 
		double qxy = Math.pow(1-p, n-y);
		
		double answer = combination*pxy*qxy;
		return answer;
		
	}
	
	/**
	 * Method to determine the binomial distribution from y to max
	 * @param n, number of trials
	 * @param p, probability of success
	 * @param y, number of success
	 * @param max, max number of success
	 * @return the binomial distribution given n,p,y, and max
	 */
	public double binmoialDistribution(int n, double p, int y, int max)
	{
		double answer = 0;
		for(int i = y; i <= max; i ++)
		{
			answer += binomialDistributionExact(n,p,i);
		}
		return answer;
	}
	
	/**
	 * Method to determine the geometric distribution of an event occurring given the number of trials and probability of success
	 * @param y the number of trials
	 * @param p the probability of success
	 * @return the geometric distribution of the event occurring first on trial y with probability p
	 */
	public double geometricDistribution(int y, double p)
	{
		return Math.pow(1-p, y-1) * p;
	}
	
	/**
	 * Method to determine the geometric distribution of an event occurring on or before the given trial with probability p
	 * @param y the number of trials
	 * @param p the probability of success
	 * @return the geometric distribution of the event occurring on or before y with probability p
	 */
	public double geometricDistributionOnOrBefore(int y, double p)
	{
		return 1-Math.pow(1-p, y);
	}
	
	/**
	 * Method to determine the geometric distribution of an event occurring before the given trial with probability p
	 * @param y the number of trials
	 * @param p the probability of success
	 * @return the geometric distribution of the event occurring before trial y with probability p
	 */
	public double geometricDistributionBefore(int y, double p)
	{
		return 1-Math.pow(1-p, y-1);
	}
	
	/**
	 * Method to determine the geometric distribution of an event occurring on or after the given trial with probability p
	 * @param y the number of trials
	 * @param p the probability of success
	 * @return the geometric distribution of the event occurring on or after trial y with probability p
	 */
	public double geometricDistributionOnOrAfter(int y, double p)
	{
		return Math.pow(1-p, y-1);
	}
	
	/**
	 * Method to determine the geometric distribution of an event occurring after the given trial with the probability p
	 * @param y the number of trials
	 * @param p the probability of success
	 * @return the geometric distribution of the event occurring after trial y with probability p
	 */
	public double geometricDistributionAfter(int y, double p)
	{
		return Math.pow(1-p, y);
	}
}

import java.util.*;

public class Tester 
{
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		Random generator = new Random();
		Scanner reader = new Scanner(System.in);
		StatsLibrary tester = new StatsLibrary();
		
		//System.out.println(tester.geometricDistribution(11, 2));
		
		GameShow game = new GameShow();
		System.out.println("When the player doesn't change what door they pick they win " + game.noChange() + " precent of the time.");
		System.out.println("When the player changes what door they pick they win " + game.change() + " precent of the time.");
		
		/*System.out.println("The binomial difference of the problem is: " + tester.binomialDistributionExact(4, .33, 3));
		System.out.println("The binomial difference of the problem is: " + tester.binomialDistributionExact(4, .33, 4));
		System.out.println("The binomial difference of the problem is: " + tester.binmoialDistribution(4, .33, 3, 4));
		
		
		
		/*System.out.println("The number of permutations are: " + tester.permutation(30, 3));
		System.out.println("The number of combinations are: " + tester.combination(30, 3));
		
		System.out.println("Enter length of array");
		int length = reader.nextInt();
		
		for(int i = 0; i < length; i++)
		{
			nums.add(generator.nextInt(100));
		}
		
		Collections.sort(nums);
		
		System.out.println(nums);
		
		System.out.println("The mean of the set is: " + tester.mean(nums));
		
		System.out.println("The median of the set is: " + tester.median(nums));
		
		System.out.println("The mode of the set is: " + tester.mode(nums));
		
		System.out.println("The standard deviation of the set is: " + tester.standardDeviation(nums));
		
		
		/*ArrayList<Integer> s = new ArrayList<Integer>();
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i ++)
		{
			s.add(i);
		}
		
		a.add(2);
		a.add(4);
		a.add(6);
		
		b.add(1);
		b.add(2);
		b.add(5);
		b.add(7);
		b.add(9);
		
		Set setTester = new Set();
		
		System.out.println("The union of set A and set B is: " + setTester.union(a, b));
		
		System.out.println("The intersection of set A and set B is: " + setTester.intersection(a, b));
		
		System.out.println("The compliment of set B is: " + setTester.compliment(s, b));*/
	}
}
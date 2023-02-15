import java.util.*;

public class Set<E> 
{	
	/**
	 * take in two sets and return all elements in both sets without repeating
	 * @param set1
	 * @param set2
	 * @return the union of the two sets without repeating any elements
	 */
	public ArrayList<E> union(ArrayList<E> set1, ArrayList<E> set2)
	{
		ArrayList<E> unionAnswer = new ArrayList<E>(); 

		for(int i = 0; i < set1.size(); i ++)
		{
			unionAnswer.add(set1.get(i));
		}

		for(int j = 0; j < set2.size(); j ++)
		{
			unionAnswer.add(set2.get(j));
		}
		
		for(int i = 0; i < unionAnswer.size(); i++)
		{
			for(int j = i+1; j < unionAnswer.size(); j ++)
			{
				if(unionAnswer.get(i) == unionAnswer.get(j))
				{
					unionAnswer.remove(j);
				}
			}
		}
		
		return unionAnswer;
	}
	
	/**
	 * take in two sets and return all the elements in the first set that aren't in the second set
	 * @param set1, 
	 * @param set2, 
	 * @return the intersection of the two sets without repeating any elements
	 */
	public ArrayList<E> intersection(ArrayList<E> set1, ArrayList<E> set2)
	{		
		ArrayList<E> intersectionAnswer = new ArrayList<E>();
		
		for(int i = 0; i < set1.size(); i ++)
		{
			for(int j = 0; j < set2.size(); j ++)
			{
				if(set1.get(i).equals(set2.get(j)))
				{
					intersectionAnswer.add(set1.get(i));
				}
			}
		}
		
		return intersectionAnswer;
	}
	
	/**
	 * take in the universal set and take in a subset in the universal set and return the elements that aren't in the subset
	 * @param set, the universal set
	 * @param subset, the subset that is included in the universal set
	 * @return the elements that are in the universal set but not in the subset
	 */
	public ArrayList<E> compliment(ArrayList<E> set, ArrayList<E> subset)
	{
		ArrayList<E> complimentAnswer = new ArrayList<E>();
		
		for(int i = 0; i < set.size(); i ++)
		{
			complimentAnswer.add(set.get(i));
		}

		for(int i = 0; i < complimentAnswer.size(); i++)
		{
			for(int j = 0; j <  subset.size(); j ++)
			{
				if(subset.get(j) == complimentAnswer.get(i))
				{
					complimentAnswer.remove(i);
				}
			}
		}
		
		return complimentAnswer;
	}
}

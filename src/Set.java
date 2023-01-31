import java.util.*;

public class Set<E> 
{	
	public ArrayList<E> union(ArrayList<E> set1, ArrayList<E> set2)
	{
		ArrayList<E> unionAnswer = new ArrayList<E>(); 

		for(int i = 0; i < set1.size(); i ++)
		{
			unionAnswer.add(set1.get(i));
		}
		

		for(int j = 0; j < set2.size(); j ++)
		{
			for(int i = 0; i < unionAnswer.size(); i++)
			{
				if(unionAnswer.get(i) == set2.get(j))
				{
					unionAnswer.remove(i);
					unionAnswer.add(set2.get(j));
				}
			}
		}
		
		return unionAnswer;
	}
	
	public ArrayList<E> intersection(ArrayList<E> set1, ArrayList<E> set2)
	{		
		ArrayList<E> intersectionAnswer = new ArrayList<E>();
		
		for(int i = 0; i < set1.size(); i ++)
		{
			for(int j = 0; j < set2.size(); j ++)
			{
				if(set1.get(i) == set2.get(j))
				{
					intersectionAnswer.add(set1.get(i));
				}
			}
		}
		
		return intersectionAnswer;
	}
	
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

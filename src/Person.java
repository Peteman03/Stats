import java.util.*;

public class Person 
{
	private int birthday;
	
	public Person()
	{
		Random generator  = new Random();
		
		birthday = generator.nextInt(365);
	}
	
}

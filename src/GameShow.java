import java.util.*;

public class GameShow 
{
	/**
	 * Method to play the gameshow 10000 times while changing the curtain after being told the value of a curtain
	 * @return the percentage of wins when playing the game and changing the curtain
	 */
	public double change()
	{
		Random generator = new Random();
		int wins = 0;
		int prizeDoor, guess;

		for(int i = 0; i < 10000; i ++)
		{
			ArrayList<Curtain> doors = new ArrayList<>();
			for(int j = 0; j < 3; j++)
			{
				Curtain door = new Curtain();
				doors.add(door);
			}
			prizeDoor = generator.nextInt(3);
		
			doors.get(prizeDoor).setPrize();
			
			guess = generator.nextInt(3);
			
			for(int index = 0; index < doors.size(); index++)
			{
				if(doors.get(index).getPrize() == false && (guess != index))
				{
					doors.remove(index);
					if(guess > doors.size())
					{
						guess--;
					}
					if(prizeDoor >= doors.size())
					{
						prizeDoor--;
					}
					break;
				}
			}
			
			for(int j = 0; j < doors.size(); j++)
			{
				if(j != guess)
				{
					int temp = j;
					guess = temp;
					break;
				}
			}
			
			if(doors.get(guess).getPrize())
			{
				wins++;
			}
		}
		
		return (double)wins/10000 * 100;
		
	}
	
	/**
	 * Method to play the gameshow 10000 times without changing the curtain after being showed the value of one of the curtain
	 * @return the percentage of wins when the curtain isn't changed after the 
	 */
	public double noChange()
	{
		Random generator = new Random();
		int wins = 0;
		int prizeDoor, guess;
		
		for(int i = 0; i < 10000; i ++)
		{
			prizeDoor = generator.nextInt(3)+1;
			guess = generator.nextInt(3)+1;
			
			if(guess == prizeDoor)
			{
				wins++;
			}
		}
		
		return (double)wins/10000 * 100;
		
	}
}

public class Curtain 
{
	private boolean prize;
	
	/**
	 * Constructor to set the instance variable prize to false
	 */
	public Curtain()
	{
		prize = false;
	}

	/**
	 * Method to set the instance variable prize to true for a curtain
	 */
	public void setPrize()
	{
		prize = true;
	}
	
	/**
	 * Method to check if the curtain contains the prize or not
	 * @return the boolean value associated with the prize instance variable
	 */
	public boolean getPrize()
	{
		return prize;
	}
}

public class Baseball extends SportsTeam
{
	// instance variables
	private int numHomeRuns;
	private int numRBIs;
	private int numErrors;


	// default constructor
	public Baseball(String name)
	{
		super(name);
	}

	// second constructor
	public Baseball(String name, int gamesPlayed, int gamesWon, int gamesLost, int h, int r, int e)
	{
		super(name,gamesPlayed,gamesWon,gamesLost);
		numHomeRuns=h;
		numRBIs=r;
		numErrors=e;
	}

	// accessor method - getHomeRunsPerGame
	// calculates and returns the homeruns per game by
	// dividing number of homeruns by games played
	public double getHomeRunsPerGame()
	{
		return (numHomeRuns/20.0);
	}

	// accessor method - getRBIsPerGame
	// calculates and returns the RBIs per game by
	// dividing the number of RBIs by games played
	public double getRBIsPerGame()
	{
		return (numRBIs/20.0);
	}

	// accessor method - getErrorsPerGame
	// calculates and returns the errors per game by
	// dividing the number of errors by games played
	public double getErrorsPerGame()
	{
		return (numErrors/20.0);
	}

	// toString method
	public String toString()
	{
		return super.toString() +"\nNumber of Home Runs    =" + numHomeRuns + "\nNumber of RBIs   =" + numRBIs + "\nNumber of Errors   = " + numErrors+ "\nHome Runs per game    = " + getHomeRunsPerGame() + "\nRBIs per game=    " + getRBIsPerGame() + "\nErrors per game   = " + getErrorsPerGame() ;
	}
}
public class Football extends SportsTeam
{
    // instance variables
    private int numTouchDowns;
    private int numInterceptions;

    // first constructor
    public Football(String name)
    {
		super(name);
    }

    // second constructor
    public Football(String name, int gamesPlayed, int gamesWon, int gamesLost, int t, int f)
    {
		super(name,gamesPlayed,gamesWon,gamesLost);
		numTouchDowns=t;
		numInterceptions=f;

    }

    // accessor - getTouchDownsPerGame
    // calculates and returns the touchdowns per game by
    // dividing number of touchdowns by games played
    public double getTouchDownsPerGame()
    {
        return ((numTouchDowns/super.getGamesPlayed()));
    }

    // accessor - getInterceptionsPerGame
    // caculates and returns the interceptions per game by
    // dividing number of interceptions by games played
    public double getInterceptionsPerGame()
    {
		return (numInterceptions/10.0);
    }

    // toString method
    public String toString()
    {
		return super.toString() + "\nNumber of Touchdowns    = " + numTouchDowns +  "\nNumber of Interceptions   = " + numInterceptions + "\nTouchdowns per game       =" + getTouchDownsPerGame() + "\nInterceptions per game      =" + getInterceptionsPerGame();
    }
}
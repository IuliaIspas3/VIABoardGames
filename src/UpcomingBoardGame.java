/**
 * A class creating Game objects
 * @author Dominika Janczyszyn
 * @version 1.0
 */
public class UpcomingBoardGame extends Game
{
  private int numberOfVotes;

  /**
   *  Constructor creating UpcomingBoardGame object
   * @param name the name to be set to the Game object
   * @param numberOfPlayers number of players to be set to the Game object
   * @param description the description to be set to the Game object
   */
  public UpcomingBoardGame(String name, int numberOfPlayers, String description){ // add to the diagram
    super(name, numberOfPlayers,description);
    numberOfVotes = 0;
  }

  /**
   * Adds number 1 to number of votes
   */
  public void voteForAGame(){
    numberOfVotes ++;
  }

  /**
   * Gets number of votes of the UpcomingBoardGame Object
   * @return the numberOfVotes of UpcomigBoardGame Object
   */
  public int getNumberOfVotes(){
    return numberOfVotes;
  }

  /**
   * Returns boolean value when the given object has the same parameters as curren UpcomingBoardGame object
   * @param obj the object given to compare with the current UpcomingBoardGame object
   * @return boolean value of the comparison
   */
  public boolean equals(Object obj){
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }

    UpcomingBoardGamesList other = (UpcomingBoardGamesList) obj;
    return super.equals(other) && this.numberOfVotes == other.numberOfVotes;
  }
  /**
   * Returns information about the UpcomingBoardGame object
   * @return String that contains information about the UpcomingBoardGame object
   */
  public String toString(){
    return super.toString() + "\nnumber of votes: " + numberOfVotes;
  }
}

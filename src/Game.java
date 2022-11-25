/**
 * A class creating Game objects
 * @author Oliwier Wijas
 * @version 1.0
 */
public abstract class Game
{
  private String name;
  private int numberOfPlayers;
  private String description;

  /**
   * Constructor creating Game object
   * @param name the name to be set to the Game object
   * @param numberOfPlayers number of players to be set to the Game object
   * @param description the description to be set to the Game object
   */
  public Game(String name, int numberOfPlayers, String description)
  {
    this.name = name;
    this.numberOfPlayers = numberOfPlayers;
    this.description = description;
  }

  /**
   * Sets the name of the Game object
   * @param name name to be set to the Game object
   */
  public void setName(String name)
  {
    this.name = name;
  };

  /**
   * Sets number of players of the Game object
   * @param numberOfPlayers number of players to be set to the Game object
   */
  public void setNumberOfPlayers(int numberOfPlayers)
  {
      this.numberOfPlayers = numberOfPlayers;
  }

  /**
   * Sets the description of the Game object
   * @param description the description to be set to the Game object
   */
  public void setDescription(String description)
  {
    this.description = description;
  }

  /**
   * Gets the name of the Game object
   * @return the name of the Game object
   */
  public String getName()
  {
    return name;
  }

  /**
   * Gets number of players of the Game object
   * @return number of players of the Game object
   */
  public int getNumberOfPlayers()
  {
    return numberOfPlayers;
  }

  /**
   * Gets the description of the Game object
   * @return the description of the Game object
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * Returns boolean value when a given object has the same parameters as current Game object
   * @param obj the object given to compare with the current Game object
   * @return boolean value of the comparison
   */
  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }

    Game other = (Game) obj;
    return this.name.equals(other.name) && this.numberOfPlayers == other.numberOfPlayers && this.description.equals(other.description);
  }

  /**
   * Returns information about the Game object
   * @return String that contains information about the Game object
   */
  public String toString()
  {
    return "\nName: " + name +
        "\nNumber of players: " + numberOfPlayers +
        "\nDescription: " + description;
  }
}

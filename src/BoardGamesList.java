import java.io.Serializable;
import java.util.ArrayList;

/**
 * A class creating BoardGamesList objects that contain BoardGame objects
 * @author Oliwier Wijas
 * @version 1.0
 */
public class BoardGamesList implements Serializable
{
  private ArrayList<BoardGame> boardGames;

  /**
   * No-argument constructor initializing ArrayList of BoardGame objects
   */
  public BoardGamesList()
  {
    boardGames = new ArrayList<>();
  }

  /**
   * Adds BoardGame object to the ArrayList
   * @param boardGame boardGame object to be added to the ArrayList
   */
  public void addBoardGame(BoardGame boardGame)
  {
    boardGames.add(boardGame);
  }

  /**
   * Removes BoardGame object from the ArrayList
   * @param boardGame boardGame object to be removed from the ArrayList
   */
  public void removeGame(BoardGame boardGame)
  {
    boardGames.remove(boardGame);
  }

  /**
   * Gets teh BoardGame object using String object name and Student object owner
   * @param name String object name of the BoardGame object to be got
   * @param owner Student object owner of the BoardGame object to be got
   * @return the BoardGame object found by the properties given
   */
  public BoardGame getBoardGame(String name, Student owner)
  {
    for (int i = 0; i < boardGames.size(); i++)
    {
      if (name.equals(boardGames.get(i).getName()) && owner.equals(boardGames.get(i).getOwner()))
      {
        return boardGames.get(i);
      }
    }
    return null;
  }

  /**
   * Returns number of BoardGame objects that are not lent
   * @return the number of not lent BoardGame objects
   */
  public int getNumberOfAvailableGames()
  {
    int available = 0;
    for (int i = 0; i < boardGames.size(); i++)
    {
      if (!boardGames.get(i).isLent())
      {
        available++;
      }
    }
    return available;
  }

  /**
   * Returns number of BoardGame objects that are lent
   * @return the number of lent BoardGame objects
   */
  public int getNumberOfNotAvailableGames()
  {
    int notAvailable = 0;
    for (int i = 0; i < boardGames.size(); i++)
    {
      if (boardGames.get(i).isLent())
      {
        notAvailable++;
      }
    }
    return notAvailable;
  }

  public boolean hasBorrowedABoardGame(Student student)
  {
    for (int i = 0; i < boardGames.size(); i++)
    {
      if (boardGames.get(i).getBorrower().equals(student))
      {
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the list of all BoardGame objects
   * @return the list of all BoardGame objects
   */
  public BoardGame[] getAllGames()
  {
    BoardGame[] allBoardGames = new BoardGame[boardGames.size()];
    for (int i = 0; i < boardGames.size(); i++)
    {
      allBoardGames[i] = boardGames.get(i);
    }
    return allBoardGames;
  }

  /**
   * Returns the list of all not lent BoardGame objects
   * @return the list of all not lent BoardGame objects
   */
  public BoardGame[] getAllAvailableBoardGames()
  {
    BoardGame[] allAvailableBoardGames = new BoardGame[getNumberOfAvailableGames()];
    int j = 0;
    for (int i = 0; i < boardGames.size(); i++)
    {
      if (!boardGames.get(i).isLent())
      {
        allAvailableBoardGames[j] = boardGames.get(i);
        j++;
      }
    }
    return allAvailableBoardGames;
  }

  /**
   * Returns the list of all lent BoardGame objects
   * @return the list of all lent BoardGame objects
   */
  public BoardGame[] getAllNotAvailableBoardGames()
  {
    BoardGame[] allNotAvailableBoardGames = new BoardGame[getNumberOfNotAvailableGames()];
    int j = 0;
    for (int i = 0; i < boardGames.size(); i++)
    {
      if (boardGames.get(i).isLent())
      {
        allNotAvailableBoardGames[j] = boardGames.get(i);
        j++;
      }
    }
    return allNotAvailableBoardGames;
  }

  /**
   * Returns size of the ArrayList containing BoardGame objects
   * @return size of BoardGamesList
   */
  public int size()
  {
    return boardGames.size();
  }

  /**
   * Returns information about all the BoardGame objects contained in the BoardGamesList object
   * @return String that contains information about all the BoardGame objects contained in the BoardGameList object
   */
  public String toString()
  {
    String returnStr = "";
    for (int i = 0; i < boardGames.size(); i++)
    {
      returnStr += boardGames.get(i);
    }
    return returnStr;
  }
}

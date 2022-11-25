/**
 * A class creating Game objects
 * @author Dominika Janczyszyn
 * @version 1.0
 */
import java.util.ArrayList;

public class UpcomingBoardGamesList
{
  private ArrayList<UpcomingBoardGame> upcomingBoardGames;

  /**
   * Constructor creating UpcomingBoardGamesList object
   * and initializing upcomingBoardGame ArrayList
   */
  public UpcomingBoardGamesList(){
    upcomingBoardGames = new ArrayList<>();
  }

  /**
   * Adding UpcomingBoardGame Object to ArrayList
   * @param upcomingBoardGame UpcomingBoardGame Object to be added to upcomingBoardGames arryaList
   */
  public void addUpcomingGame(UpcomingBoardGame upcomingBoardGame){
    upcomingBoardGames.add(upcomingBoardGame);
  }

  /**
   * Get UpcomingBoardGame Object from upcomingBoardGames arraylist
   * @param name String value to compare with UpcomingBoardGame Object name varable;
   * @return upcomingBoardGame Object with the same name as given one
   */
  public UpcomingBoardGame getUpcomingGame(String name){
    for(int i = 0; i < upcomingBoardGames.size(); i++)
    {
      if(upcomingBoardGames.get(i).getName().equals(name)) return upcomingBoardGames.get(i);
    }
    return null;
  }

  /**
   *Remove UpcomingBoardGame Object from upcomingBoardGames arraylist
   * @param name String value to compare with UpcomingBoardGame Object name varable;
   */
  public void removeUpcomingGame(String name){
    for(int i = 0; i < upcomingBoardGames.size(); i++){
      if(upcomingBoardGames.get(i).getName().equals(name)){
        upcomingBoardGames.remove(i);
      }
    }
  }

  /**
   * Get all upcoming games
   * @return array UpcomingBoardGame1 array
   */
  public UpcomingBoardGame[] getAllUpcomingGames(){
    UpcomingBoardGame upcomingBoardGames1[] = upcomingBoardGames.toArray(new UpcomingBoardGame[upcomingBoardGames.size()]);
    return upcomingBoardGames1;
  }

  /**
   * Get the size of upcominBoardGames arrayList
   * @return size of upcominBoardGames arrayList
   */
  public int size(){
    return upcomingBoardGames.size();
  }

  /**
   *Returns information about the UpcomingBoardGamesList object
   * @return String that contains information about the UpcomingBoardGamesList object
   */
  public String toString(){
    return upcomingBoardGames.toString();
  }
}

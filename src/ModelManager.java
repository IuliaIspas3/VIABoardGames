/**
 * A class creating Game objects
 * @author Dominika Janczyszyn
 * @version 1.0
 */
public class ModelManager
{
  private String upcomingBoardGameFile;
  private String boardGamesFile;
  private String studentFile;//chanage this in diagram
  private String eventFile;

  /**
   * Constructor creating ModelManager object
   * @param upcomingBoardGameFile name of UpcomingBoardGameList binary file
   * @param boardGamesFile name of BoardGameList birnary file
   * @param studentFile name of StudentsList binary file
   * @param eventFile name of EventsList binary file
   */
  public ModelManager(String upcomingBoardGameFile, String boardGamesFile, String studentFile, String eventFile){//add this to the diagram
    this.upcomingBoardGameFile = upcomingBoardGameFile;
    this.boardGamesFile = boardGamesFile;
    this.studentFile = studentFile;
    this.eventFile = eventFile;
  }

  /**
   * Gets all UpcomingBoardGame objects from binary file and creates UpcomingBoardGamesList object
   * @return UpcomingBoardGamesList object
   */
  public UpcomingBoardGamesList getAllUpcomingGames(){
    UpcomingBoardGamesList upcomingBoardGames = new UpcomingBoardGamesList();

    try
    {
      upcomingBoardGames = (UpcomingBoardGamesList)MyFileHandler.readFromBinaryFile(upcomingBoardGameFile);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class Not Found");
    }
    return upcomingBoardGames;
  }

  /**
   * Save all UpcomingBoardGames Objects from UpcomingBoardGamesList to the binary file
   * @param upcomingBoardGames is an object that contains UpcomingBoardGames objects, that will be saved to the binary file
   */
  public void saveAllUpcomingGames(UpcomingBoardGamesList upcomingBoardGames)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(upcomingBoardGameFile, upcomingBoardGames);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
    }
  }
  /////////////////////////////////////////////////////////////////////////////////////////
  /**
   * Gets all BoardGame objects from binary file and creates BoardGamesList object
   * @return BoardGamesList object
   */
  public BoardGameList getAllBoardGames(){
    BoardGamesList boardGames = new BoardGamesList();

    try
    {
      boardGames = (BoardGamesList)MyFileHandler.readFromBinaryFile(boardGamesFile);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class Not Found");
    }
    return boardGames;
  }
  /**
   * Save all BoardGames Objects from BoardGamesList to the binary file
   * @param boardGames is an object that contains BoardGames objects, that will be saved to the binary file
   */
  public void saveAllGames(BoardGamesList boardGames)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(boardGameFile, boardGamesFile);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
    }
  }
  ///////////////////////////////////////////////////////////////////////////////////////////////////
  /**
   * Gets all Student objects from binary file and creates StudentList object
   * @return StudentList object
   */
  public StudentList getAllStudent(){
    StudentList studentList = new StudentList()

    try
    {
      studentList = (StudentList) MyFileHandler.readFromBinaryFile(studentFile);

    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class Not Found");
    }
    return studentList;
  }
  /**
   * Save all Student Objects from StundetList to the binary file
   * @param studentList is an object that contains Student objects, that will be saved to the binary file
   */
  public void saveAllStudents(StudentList studentList)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(studentList, studentFile);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
    }
  }
//////////////////////////////////////////////////////////////////////////////////////////////
  /**
   * Gets all Event objects from binary file and creates EventsList object
   * @return EventsList object
   */
public EventsList getAllEvent(){
  EventsLis eventsList = new EventsList();

  try
  {
    eventsList = (EventsLis) MyFileHandler.readFromBinaryFile(eventFile);

  }
  catch (FileNotFoundException e)
  {
    System.out.println("File not found");
  }
  catch (IOException e)
  {
    System.out.println("IO Error reading file");
  }
  catch (ClassNotFoundException e)
  {
    System.out.println("Class Not Found");
  }
  return eventsList;
}
  /**
   * Save all Event Objects from EventsList to the binary file
   * @param EventsList is an object that contains Event objects, that will be saved to the binary file
   */
  public void saveAllStudents(EventsList eventsList)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(eventsList, eventFile);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
    }
  }
}

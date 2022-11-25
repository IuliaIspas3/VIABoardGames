import java.util.ArrayList;

/**
 * A class creating BoardGame objects being an extension of the Game class
 * @author Oliwier Wijas
 * @version 1.0
 */
public class BoardGame extends Game
{
  private Student borrower;
  private Student owner;
  private Date dateOfLoan;
  private StudentList reservants;
  private int numberOfRatings;
  private ArrayList<Integer> ratings;

  /**
   * Constructor creating BoardGame object
   * @param name the name to be set to the BoardGame object
   * @param numberOfPlayers number of players to be set to the BoardGame object
   * @param description the description to be set to the BoardGame object
   */
  public BoardGame(String name, int numberOfPlayers, String description)
  {
    super(name, numberOfPlayers, description);
    borrower = null;
    owner = null;
    dateOfLoan = null;
    reservants = new StudentList();
    numberOfRatings = 0;
    ratings = new ArrayList<Integer>();
  }

  /**
   * Sets the owner of the BoardGame object
   * @param owner owner to be set to the BoardGame object
   */
  public void setOwner(Student owner)
  {
    this.owner = owner;
  }

  /**
   * Sets the borrower of the BoardGame object
   * @param borrower borrower to be set to the BoardGame object
   */
  public void setBorrower(Student borrower)
  {
    this.borrower = borrower;
  }

  /**
   * Gets the owner of the BoardGame object
   * @return the borrower of the BoardGame object
   */
  public Student getOwner()
  {
    return owner;
  }

  /**
   * Gets the borrower of the BoardGame object
   * @return the borrower of the BoardGame object
   */
  public Student getBorrower()
  {
    return borrower;
  }

  /**
   * Gets the date of loan of the BoardGame object
   * @return the date of loan of the BoardGame object
   */
  public Date getDateOfLoan()
  {
    return dateOfLoan;
  };

  /**
   * Lents the BoardGame object to the borrower and changes the date of loan to the current date
   * @param member the borrower of the BoardGame object
   * @throws IsLentException if the BoardGame object is already lent, process cannot be performed
   */
  public void lentBoardGame(Student member)
  {
    if (this.borrower == null)
    {
      this.borrower = member;
      dateOfLoan = Date.getTodaysDate();
    }
    else
    {
      throw new IsLentException();
    }
  }

  /**
   * Sets borrower and date of loan to null
   */
  public void returnBoardGame()
  {
    if (isReserved())
    {
      borrower = reservants.getMemberById(0);
      reservants.removeByIndex(0);
      dateOfLoan = Date.getTodaysDate();
    }
    else
    {
      borrower = null;
      dateOfLoan = null;
    }
  }

  /**
   * Returns true if the BoardGame object is lent; false if not
   * @return boolean value whether the BoardGame is lent or not
   */
  public boolean isLent()
  {
    if (borrower != null)
    {
      return true;
    }
    return false;
  }

  /**
   * Adds the member to the reservants list
   * @param member the reservant of the BoardGame object
   * @throws IsNotAMemberException if the entered Student object is not a member, process cannot be performed
   * @throws IsNotLentException if BoardGame is not lent to anyone, reservation process cannot be performed
   */
  public void reserve(Student member) throws IsNotLentException, IsNotAMemberException
  {
    if (!member.isAMember())
    {
      throw new IsNotAMemberException();
    }
    if (isLent())
    {
      reservants.addMember(member);
    }
    else
    {
      throw new IsNotLentException();
    }
  }

  /**
   * Returns true if the BoardGame object is reserved by at least one person; false if not
   * @return boolean value whether the BoardGame is reserved by someone or not
   */
  public boolean isReserved()
  {
    if (reservants.size() == 0)
    {
      return false;
    }
    return true;
  }

  /**
   * Cancels reservation of the entered Student
   * @param member the student that wants to cancel the reservation
   */
  public void cancelReservation(Student member)
  {
    reservants.removeMember(member);
  }

  /**
   * Adds a rating to the BoardGame object
   * @param rating the rating of the BoardGame object
   */
  public void rate(int rating)
  {
    numberOfRatings++;
    ratings.add(rating);
  }

  /**
   * Gets average rating of the BoardGame object
   * @return the average of the ratings of the BoardGame object
   */
  public double getAverageRating()
  {
    double sum = 0;
    for (int i = 0; i < ratings.size(); i++)
    {
      sum += ratings.get(i);
    }
    return sum / (double)ratings.size();
  }

  /**
   * Returns list of Student objects with all reservants of the BoardGame object
   * @return list of Student objects that contains all reservants
   */
  public Student[] getAllReservants()
  {
    Student[] students = reservants.getAllMembers();
    return students;
  }

  /**
   * Returns boolean value when a given object has the same parameters as current BoardGame object
   * @param obj the object given to compare with the current BoardGame object
   * @return boolean value of the comparison
   */
  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }

    BoardGame other = (BoardGame) obj;
    return super.equals(other) && this.owner.equals(other.owner) && this.borrower.equals(other.borrower) && this.dateOfLoan.equals(other.dateOfLoan) && this.reservants.equals(other.reservants) && this.numberOfRatings == other.numberOfRatings && this.ratings.equals(other.ratings);
  }

  /**
   * Returns information about the BoardGame object
   * @return String that contains information about the BoardGame object
   */
  public String toString()
  {
    String temp = super.toString() + owner;
    if (borrower != null)
    {
      temp += borrower;
      temp += dateOfLoan;
    }
    if (reservants.size() != 0)
    {
      temp += reservants;
    }
    if (numberOfRatings != 0)
    {
      temp += "\nNumber of ratings: " + numberOfRatings +
          "\nRatings: " + ratings;
    }
    return temp;
  }
}

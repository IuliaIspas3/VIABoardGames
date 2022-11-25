import java.util.ArrayList;

/**
 * A class containing an Event object.
 * @author Iulia Ispas
 * @version 1.0
 */

public class Event
{

  private String name, description;
  private Date date;
  private StudentList participants = new StudentList();


  /**
   * The constructor initializing the Event object
   * @param name the name of the Event object
   * @param description the description of the Event object
   */
  public Event (String name, String description)
  {
    this.name = name;
    this.description = description;
    date = null;
  }


  /**
   * Sets the name of the Event object
   * @param name the name of the Event object
   */
  public void setName(String name)
  {
    this.name = name;
  }


  /**
   * Sets the description of the Event object
   * @param description the description of the Event object
   */
  public void setDescription(String description)
  {
    this.description = description;
  }


  /**
   * Gets the name of the Event object
   * @return the name of the Event object
   */
  public String getName()
  {
    return name;
  }


  /**
   * Gets the description of the Event object
   * @return the description of the Event object
   */
  public String getDescription()
  {
    return description;
  }


  /**
   * Gets the date of the Event object
   * @return the date of the Event object
   */
  public Date getDate()
  {
    return date;
  }


  /**
   * Adds a new student to the participants list
   * @param student the student to add to the participants list
   */
  public void addParticipant(Student student)
  {
    if (student.isAMember())
    {
      participants.addMember(student);
    }
    else
    {
      participants.addGuest(student);
    }
  }


  /**
   * Removes a student from the participants list
   * @param student the student to remove from the participants list
   */
  public void removeParticipant(Student student)
  {
    if (student.isAMember())
    {
      participants.removeMember(student);
    }
    else
    {
      participants.removeGuest(student);
    }
  }

  /**
   * Returns if the Event object's date has passed or not
   * @return if the Event object's date has passed or not
   */
  public boolean pastEvent()
  {
    if (!date.isBefore(date))
    {
      return true;
    }
    return false;
  }

  /**
   * Returns the list with all the participants
   * @return the list with all the participants
   */
  public StudentList getAllParticipants()
  {
    return participants;
  }


  /**
   * Returns all the information about the Event object as a string
   * @return all the information about the Event object
   */
  public String toString()
  {
    return "Name: " + name + "\n" + "Date: " + date + "\n" + "Description: " + description + "The list of participants: " + participants.toString();
  }
}

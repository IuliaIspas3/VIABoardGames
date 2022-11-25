import java.util.ArrayList;
import java.io.Serializable;

/**
 * A class containing Student objects
 * @author Simona-Luana Draghici
 * @version 1.0
 */

public class StudentList implements Serializable
{
  private ArrayList<Student> students;

  /**
   * No-argument constructor initializing ArrayList of Student objects
   */
  public StudentList()
  {
    students = new ArrayList<Student>();
  }

  /**
   * Adds a Student object of type guest to the StudentList
   * @param guest the guest to add in the StudentList
   */
  public void addGuest(Student guest)
  {
    students.add(guest);
  }

  /**
   * Adds a Student object of type member to the StudentList
   * @param member the member to add in the StudentList
   */
  public void addMember(Student member)
  {
    students.add(member);
  }

  public void addMember(String firstName, String lastName, int VIAID)
  {
    Student member = new Student(firstName, lastName, VIAID);
    member.setAMember();
    students.add(member);
  }

  public void addGuest(String firstName, String lastName, int VIAID)
  {
    Student guest = new Student (firstName, lastName, VIAID);
    students.add(guest);
  }

  /**
   * Gets a Student object of type guest from the StudentList using the firstName, lastName and VIAID given as arguments
   * @param firstName the first name of the Student object
   * @param lastName the last name of the Student object
   * @param VIAID the VIA ID of the Student object
   * @return the Student object of type guest with the firstName, lastName and VIAID given
   */
  public Student getGuest(String firstName, String lastName, int VIAID)
  {
    for(int i = 0; i < students.size(); i++)
    {
      if(students.get(i).getFirstName().equals(firstName) && students.get(i).getLastName().equals(lastName) && students.get(i).getVIAID() == VIAID && !students.get(i).isAMember())
        return students.get(i);
    }
    return null;
  }

  /**
   * Gets a Student object of type member from the StudentList using the firstName, lastName and VIAID given as arguments
   * @param firstName the first name of the Student object
   * @param lastName the last name of the Student object
   * @param VIAID the VIA ID of the Student object
   * @return the Student object of type member with the firstName, lastName and VIAID given
   */
  public Student getMember(String firstName, String lastName, int VIAID)
  {
    for(int i = 0; i < students.size(); i++)
    {
      if(students.get(i).getFirstName().equals(firstName) && students.get(i).getLastName().equals(lastName) && students.get(i).getVIAID() == VIAID && students.get(i).isAMember())
        return students.get(i);
    }
    return null;
  }

  /**
   * Gets an Student object of type member from the StudentList using the index given as an argument
   * @param index the index of the Student object of type member
   * @return the Student object of type member with the index given
   */
  public Student getMemberById(int index)
  {
    return students.get(index);
  }

  /**
   *Gets all the Student objects from the StudentList as a Student array
   * @return all the Student objects from the StudentList as a Student array
   */
  public Student[] getAllStudents()
  {
    Student[] student = new Student[students.size()];
    return students.toArray(student);
  }

  /**
   *Gets all the Student objects of type guest from the StudentList as a Student array
   * @return all the Student objects of type guest from the StudentList as a Student array
   */
  public Student[] getAllGuests()
  {
    Student[] guest = new Student[students.size()];
    for (int i = 0; i < students.size(); i++)
    {
      if (students.get(i).isAMember() == false)
      {
        guest[i] = students.get(i);
      }
    }
    return guest;
  }

  /**
   *Gets all the Student objects of type member from the StudentList as a Student array
   * @return all the Student objects of type member from the StudentList as a Student array
   */
  public Student[] getAllMembers()
  {
    Student[] member = new Student[students.size()];
    for (int i = 0; i < students.size(); i++)
    {
      if (students.get(i).isAMember() == true)
      {
        member[i] = students.get(i);
      }
    }
    return member;
  }

  /**
   * Removes a Student object of type guest given as an argument from the StudentList
   * @param guest the Student object of type guest to remove from the StudentList
   */
  public void removeGuest(Student guest)
  {
    students.remove(guest);
  }

  /**
   * Removes a Student object of type member given as an argument from the StudentList
   * @param member the Student object of type member to remove from the StudentList
   */
  public void removeMember(Student member)
  {
    students.remove(member);
  }

  /**
   * Removes a Student object with the index given as an argument from the StudentList
   * @param index the Student object to remove from the StudentList
   */
  public void removeByIndex(int index)
  {
    students.remove(index);
  }
  /**
   * Returns size of the ArrayList containing Student objects
   * @return size of StudentList
   */
  public int size()
  {
    return students.size();
  }

  /**
   * Returns information about all the Student objects contained in the StudentList object
   * @return String that contains information about all the Student objects contained in the StudentList object
   */
  public String toString()
  {
    String returnStr = "";

    for(int i = 0; i<students.size(); i++)
    {
      Student temp = students.get(i);
      returnStr += temp +"\n";
    }
    return returnStr;
  }

  /**
   * Returns boolean value when a given object has the same parameters as the current Student object
   * @param obj the object given to compare with the given Student object
   * @return boolean value of the comparison
   */
  public boolean equals(Object obj)
  {
    if(obj == null || getClass() != obj.getClass())
    {
      return false;
    }

    StudentList other = (StudentList) obj;

    return students == other.students;
  }
}

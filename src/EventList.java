import java.io.Serializable;
import java.util.ArrayList;

/**
 * A class containing a list of Event objects
 * @author Iulia Ispas
 * @version 1.0
 */


public class EventList implements Serializable
{
  private ArrayList<Event> events;

  /**
   * The no-argument constructor initializing the Event objects list
   */
  public EventList()
  {
    events = new ArrayList<Event>();
  }


  /**
   * Adds an Event object to the EventsList
   * @param event the event to add in the EventsList
   */
  public void addEvent(Event event)
  {
    events.add(event);
  }


  /**
   * Gets an Event object from the EventsList using the name given as an argument
   * @param name the name of the Event object
   * @return the event with the name given
   */
  public Event getEvent(String name)
  {
    for (int i = 0; i < events.size(); i++)
    {
      if (events.get(i).getName().equals(name))
      {
        return events.get(i);
      }
    }
    return null;
  }


  /**
   *Gets all the Event objects from the EventsList as an Event array
   * @return all the Event objects from the EventsList as an Event array
   */
  public Event[] getAllEvents()
  {
    Event[] event = new Event[events.size()];
    return events.toArray(event);
  }


  /**
   * Gets all the Event objects that have passed in an Event array
   * @return an Event array with all the Event objects that have passed
   */
  public Event[] getAllPastEvents()
  {
    Event[] event = new Event[events.size()];
    ArrayList<Event> pastevents = new ArrayList<Event>();
    for (int i = 0; i < events.size(); i++)
    {
      if (events.get(i).pastEvent())
      {
        pastevents.add(events.get(i));
      }
    }
    return pastevents.toArray(event);
  }


  /**
   * Gets all the Event objects that are planned to happen in the future
   * @return an Event array with all the Event objects that are planned to happen in the future
   */
  public Event[] getAllFutureEvents()
  {
    Event[] event = new Event[events.size()];
    ArrayList<Event> futureevents = new ArrayList<Event>();
    for (int i = 0; i < events.size(); i++)
    {
      if (!events.get(i).pastEvent())
      {
        futureevents.add(events.get(i));
      }
    }
    return futureevents.toArray(event);
  }


  /**
   * Removes an Event object given as an argument from the EventsList
   * @param event the Event object to remove from the EventsList
   */
  public void removeEvent(Event event)
  {
    events.remove(event);
  }

  /**
   * Returns the size of the EventsList
   * @return the size of the EventsList
   */
  public int size()
  {
    return events.size();
  }

  /**
   * Returns the information about each Event object from the EventsList as a String
   * @return the String with the information about each Event object from the EventsList
   */
  public String toString()
  {
    String list = "";
    for (int i = 0; i < events.size(); i++)
    {
      list += events.get(i).toString() + "\n";
    }
    return list;
  }
}

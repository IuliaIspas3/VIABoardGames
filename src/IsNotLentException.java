public class IsNotLentException extends RuntimeException
{
  public IsNotLentException()
  {
    super("Game is not lent; cannot make a reservation");
  }
}

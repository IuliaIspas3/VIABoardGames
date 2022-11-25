public class IsLentException extends RuntimeException
{
  public IsLentException()
  {
    super("Game is already lent; cannot borrow");
  }
}
//@author Agrim Binjola 1154479
public class InvalidArgumentNumberException extends Exception
{
    public InvalidArgumentNumberException()
    {
        super("Incorrect number of arguments supplied to command.");
    }
    public InvalidArgumentNumberException(String message)
    {
        super(message);
    }
}

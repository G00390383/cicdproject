package ie.atu.microservices.Exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(int id)
    {
        super("Could not find user "+ id);
    }
}

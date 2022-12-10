package ie.atu.microservices.Exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(int id)
    {
        super("Count not find user "+ id);
    }
}

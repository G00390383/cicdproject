package ie.atu.microservices.Exceptions;

public class UserNotFoundException extends RuntimeException{
    //Custom Exception made in the case of someone trying to access a user that doesn't exist
    public UserNotFoundException(int id)
    {
        super("Could not find user "+ id);
    }
}

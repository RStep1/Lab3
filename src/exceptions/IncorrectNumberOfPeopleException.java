package exceptions;

public class IncorrectNumberOfPeopleException extends Exception {
    public IncorrectNumberOfPeopleException(){}
    public IncorrectNumberOfPeopleException(String message) {
        super(message);
    }
}

package exceptions;

public class IncorrectSweetsException extends Exception {

    public IncorrectSweetsException() {
    }

    public IncorrectSweetsException(String message) {
        super(message);
    }

    public IncorrectSweetsException(String message, Throwable cause) {
        super(message, cause);
}
    
    public IncorrectSweetsException(Throwable cause) {
        super(cause);
    }
}

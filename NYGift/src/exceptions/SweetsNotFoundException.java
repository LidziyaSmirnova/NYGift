package exceptions;

public class SweetsNotFoundException extends Exception {

    public SweetsNotFoundException() {
    }

    public SweetsNotFoundException(String message) {
        super(message);
    }

    public SweetsNotFoundException(String message, Throwable cause) {
        super(message, cause);
}
    
    public SweetsNotFoundException(Throwable cause) {
        super(cause);
    }
}


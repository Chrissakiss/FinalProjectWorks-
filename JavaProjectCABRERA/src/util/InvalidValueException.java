package util;
public class InvalidValueException extends Exception {

    public InvalidValueException() { super(); }
    public InvalidValueException(String message) { super(message); }
    public InvalidValueException(Throwable cause) { super(cause); }
    public InvalidValueException(String message, Throwable cause) {
        super(message, cause);
    }

}

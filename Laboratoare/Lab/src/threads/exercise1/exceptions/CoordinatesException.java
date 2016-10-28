package src.threads.exercise1.exceptions;

/**
 * Created by catalina.serbu on 10/27/2016.
 */
public class CoordinatesException extends Exception {

    public CoordinatesException(String message) {
        super(message);
    }

    public CoordinatesException(String message, Throwable cause) {
        super(message, cause);
    }
}

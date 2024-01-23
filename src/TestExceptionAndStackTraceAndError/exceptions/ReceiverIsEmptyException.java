package TestExceptionAndStackTraceAndError.exceptions;

public class ReceiverIsEmptyException extends RuntimeException{
    public ReceiverIsEmptyException(String message) {
        super(message);
    }
}

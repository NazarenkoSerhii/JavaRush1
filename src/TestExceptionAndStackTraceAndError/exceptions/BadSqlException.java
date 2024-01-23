package TestExceptionAndStackTraceAndError.exceptions;

public class BadSqlException extends Exception{
    public BadSqlException(String message) {
        super(message);
    }
}

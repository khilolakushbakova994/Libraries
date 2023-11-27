package org.example;
//так как не на Spring тут @ResponseStatus(httpStatus.BAD_REQUEST) не будет работать , если Spring, то тут должен быть
public class InvalidLetterException extends RuntimeException{
    public InvalidLetterException(){

    }

    public InvalidLetterException(String message) {
        super(message);
    }

    public InvalidLetterException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidLetterException(Throwable cause) {
        super(cause);
    }

    public InvalidLetterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

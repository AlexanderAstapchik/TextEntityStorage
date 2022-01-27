package com.company.exception;

public class SerialNumberException extends Exception{
    public SerialNumberException() {
    }

    public SerialNumberException(String message) {
        super(message);
    }

    public SerialNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public SerialNumberException(Throwable cause) {
        super(cause);
    }

    public SerialNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

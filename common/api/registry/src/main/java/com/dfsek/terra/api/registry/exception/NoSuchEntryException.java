package com.dfsek.terra.api.registry.exception;

public class NoSuchEntryException extends RuntimeException {
    public NoSuchEntryException(String message) {
        super(message);
    }
    
    public NoSuchEntryException(String message, Throwable cause) {
        super(message, cause);
    }
}

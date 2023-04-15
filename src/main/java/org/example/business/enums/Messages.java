package org.example.business.enums;

public enum Messages {
    LOGGED_IN("Signed in successfully"),
    LOGGED_OUT("You have been logged out");

    public final String message;
    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

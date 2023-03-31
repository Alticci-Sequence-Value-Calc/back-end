package pt.winprovit.exception;

public final class ErrorResponseBody {

    private final String message;

    public ErrorResponseBody(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
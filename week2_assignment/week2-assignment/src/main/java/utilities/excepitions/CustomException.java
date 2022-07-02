package utilities.excepitions;

public class CustomException extends Exception { //inherited from Exception class because we want to create exception class
    private String message;

    public CustomException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}

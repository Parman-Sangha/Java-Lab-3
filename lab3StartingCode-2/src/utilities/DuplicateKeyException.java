package utilities;

public class DuplicateKeyException extends Exception {

    private static final long serialVersionUID = 2L;

    public DuplicateKeyException(String message) {
        super(message);
    }
}
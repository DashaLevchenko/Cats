package Eceptions;

public class MasterIsBankruptException extends Exception {
    public MasterIsBankruptException(String message) {
        super(message);
    }
}

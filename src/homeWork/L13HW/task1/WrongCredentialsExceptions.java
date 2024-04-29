package homeWork.L13HW.task1;

public class WrongCredentialsExceptions extends Exception {
    private final Exception[] exceptions;

    public WrongCredentialsExceptions(Exception[] exceptions) {
        this.exceptions = exceptions;
    }

    public Exception[] getExceptions() {
        return exceptions;
    }
}

public class ParametrosInvalidosException extends RuntimeException {

    public ParametrosInvalidosException() {
        super("Parâmetros inválidos.");
    }

    public ParametrosInvalidosException(String message) {
        super(message);
    }

    public ParametrosInvalidosException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParametrosInvalidosException(Throwable cause) {
        super(cause);
    }
}
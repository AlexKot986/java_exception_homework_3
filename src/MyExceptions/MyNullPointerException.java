package MyExceptions;

public class MyNullPointerException extends NullPointerException {

    public MyNullPointerException() {
        super("Строка не может быть null!");
    }
}

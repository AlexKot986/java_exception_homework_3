package MyExceptions;

public class MyExceptionParseName extends RuntimeException {

    public MyExceptionParseName() {
        super("Ошибка ввода имени!");
    }
}

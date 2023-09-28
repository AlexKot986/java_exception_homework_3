package MyExceptions;

public class MyExceptionSize extends RuntimeException {

    public MyExceptionSize() {
        super("Неверное количество данных!");
    }
}

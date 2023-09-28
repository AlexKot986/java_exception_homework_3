package MyExceptions;

public class MyExceptionParseDate extends RuntimeException {

    public MyExceptionParseDate() {
        super("Ошибка ввода даты!");
    }
}

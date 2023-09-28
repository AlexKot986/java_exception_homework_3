package MyExceptions;

public class MyExceptionParseNumber extends RuntimeException {

    public MyExceptionParseNumber() {
        super("Ошибка ввода числа!");
    }
}

package MyExceptions;

public class MyExceptionParseGender extends RuntimeException {

    public MyExceptionParseGender() {
        super("Ошибка ввода гендера!");
    }
}

package MyExceptions;
import java.util.Map;

public class Checker {

    public boolean checkMap(Map<String, String> map) {
        if (map.size() == 6) return true;
        if (!map.containsKey("lastName") && !map.containsKey("firstName") && !map.containsKey("secondName"))
            throw new MyExceptionParseName();
        if (!map.containsKey("birthDate"))
            throw new MyExceptionParseDate();
        if (!map.containsKey("phoneNumber"))
            throw new MyExceptionParseNumber();
        if (!map.containsKey("gender"))
            throw new MyExceptionParseGender();
        return false;
    }
}

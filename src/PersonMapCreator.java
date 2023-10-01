import MyExceptions.MyExceptionSize;
import MyExceptions.MyNullPointerException;

import java.util.HashMap;
import java.util.Map;

public class PersonMapCreator {

    private Map<String, String> map;

    public PersonMapCreator() {
        map = new HashMap<>();
    }

    public Map<String, String> getMap() { return map; }

    public void createPersonMap(String personFormat) {

        if (personFormat == null) throw new MyNullPointerException();

        String[] strArr = personFormat.split(" ");
        if (strArr.length != 6) {
            throw new MyExceptionSize();
        }

        int count = 1;
        for (String str : strArr) {
            if (isGender(str)) map.putIfAbsent("gender", str);
            else if (isRuName(str)) count = switchFoo(count, str);
            else if (isDate(str)) map.putIfAbsent("birthDate", str);
            else if (isNumber(str)) map.putIfAbsent("phoneNumber", str);
        }
    }

    private int switchFoo(int count, String s) {
        switch (count) {
            case 1 -> {
                map.putIfAbsent("lastName", s);
                count++;
            }
            case 2 -> {
                map.putIfAbsent("firstName", s);
                count++;
            }
            case 3 -> {
                map.putIfAbsent("secondName", s);
                count++;
            }
        }
        return count;
    }

    private boolean isRuName(String lastName) {
        return lastName.matches("^[а-яА-Я]+$");
    }
    private boolean isNumber(String phoneNumber){
        return phoneNumber.matches("(\\+*)\\d{11}");
    }
    private boolean isDate(String s) {
        return s.matches("([0-9]{2}).([0-9]{2}).([0-9]{4})");
    }
    private boolean isGender(String st) { return st.matches("[fm]{1}"); }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>",
                map.get("lastName"),
                map.get("firstName"),
                map.get("secondName"),
                map.get("birthDate"),
                map.get("phoneNumber"),
                map.get("gender"));
    }
}

























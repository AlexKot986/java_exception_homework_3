import MyExceptions.Checker;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (String person : getPersonList())
            writePerson(person);

        writePerson(getStringPersonFormat());

    }

    public static String getStringPersonFormat() {
        System.out.print("\nВведите данные в произвольном порядке, разделенные пробелом\n" +
                "Фамилия_Имя_Отчество_датарождения(dd.MM.yyyy)_номер телефона_пол(m или f)\n\n-> ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void writePerson(String person) {

        MapWriter mapWriter = new MapWriter();

        try {
            PersonMapCreator creator = new PersonMapCreator();
            creator.createPersonMap(person);
            if (new Checker().checkMap(creator.getMap()))
                mapWriter.write(creator);
            System.out.println("ok");
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }

    public static List<String> getPersonList() {
        List<String> persons = Arrays.asList(
                "Иванов Иван Иванович 10.10.2020 82828282828 m",
                "Иванов Игорь Иванович 10.12.2000 +12345678901 m",
                "Smith John Nevada 43.13.2111 12345098765 m",
                "Петров Юрий Игоревич 14.03.9999 +74387635616 m",
                "Сидоров Иван 10.10.200 Иванович 82828282828 м",
                "Кошкина 10.04.2345 Людмила f +92837461782 Ивановна",
                "Карась Ася Ахмедовна f 28374638476 01.02.0304",
                "1202020203 Олег",
                "M Антонов Сергей Петрович 33333333333 09.09.0909",
                null,
                "Антонова Лиза Попович f 05.05.1987 +7(987)123-84-88",
                "f Мышкина 21.12.2112 +53988447656 Маша Михайловна");
        return persons;
    }
}
import java.io.*;

public class MapWriter {

    public void write(PersonMapCreator map) {

        try {FileWriter writer = new FileWriter(map.getMap().get("lastName"), true);
            writer.write(map + "\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

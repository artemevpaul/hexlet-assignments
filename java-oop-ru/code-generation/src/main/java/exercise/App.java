package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    public static void save(Path path, Car car) throws Exception {
        String data = car.serialize(car);
        Files.writeString(path, data);
    }
    public static Car extract(Path path) throws Exception {
    String data = Files.readString(path);
    return Car.deserealize(data);
    }
}
// END

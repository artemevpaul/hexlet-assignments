package exercise;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homes, int n) {
        Collections.sort(homes, Comparator.comparingDouble(Home::getArea));
        List<String> result = new ArrayList<>();
        for (int i = 0; i < Math.min(n, homes.size()); i++) {
            result.add(homes.get(i).toString());
        }

        return result;
    }
}
// END

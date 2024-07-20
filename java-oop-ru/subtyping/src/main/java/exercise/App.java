package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;


// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String,String> newStorage = new HashMap<>();
        Map<String,String> originalStorage = storage.toMap();
        for (Map.Entry<String, String> entry : originalStorage.entrySet()) {
            newStorage.put(entry.getValue(), entry.getKey());
        }
        originalStorage.keySet().forEach(storage::unset);
        newStorage.forEach(storage::set);
    }
}
// END

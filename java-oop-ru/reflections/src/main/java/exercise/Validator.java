package exercise;

import java.lang.reflect.Field;
// BEGIN
import java.util.ArrayList;
import java.util.List;

public class Validator {
    public static List<String> validate(Address address) {
        List<String> result = new ArrayList<>();
        for (Field field : address.getClass().getDeclaredFields()) {
            field.setAccessible(true);
        NotNull notnull = field.getAnnotation(NotNull.class);
            if (notnull != null) {
                try {
                    Object value = field.get(address);
                    if (value == null) {
                        result.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
        }
    }
        return result;
    }
}
// END

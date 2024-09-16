package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public abstract class Tag {
    private String name;
    private Map<String, String> atributes;

    public Tag(String name, Map<String, String> atributes){
        this.name = name;
        this.atributes = atributes;
    }

    public String getName() {
        return name;
    }

    protected String renderAttributes() {
        return atributes.entrySet().stream()
                .map(entry -> entry.getKey() + "=\"" + entry.getValue() + "\"")
                .collect(Collectors.joining(" "));

    }
    public abstract String toString();
}
// END

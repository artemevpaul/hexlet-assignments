package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag(String name, Map<String, String> atributes){
        super(name, atributes);
    }
    public String toString() {
        String attributesString = renderAttributes();
        if (!attributesString.isEmpty()) {
            return "<" + getName() + " " + attributesString + ">";
        } else {
            return "<" + getName() + ">";
        }
    }
}
// END

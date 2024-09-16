package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String body;
    private List<Tag> children;

    public PairedTag(
            String name,
            Map<String, String> atributes,
            String body,
            List<Tag> children
    ) {
        super(name, atributes);
        this.body = body;
        this.children = children;
    }
    public String toString() {
        String childrenString = children.stream()
                .map(Tag::toString)
                .collect(Collectors.joining());
        String attributesString = renderAttributes();
        if (!attributesString.isEmpty()) {
            return "<" + getName() + " " + attributesString + ">" + body + childrenString + "</" + getName() + ">";
        } else {
            return "<" + getName() + ">" + body + childrenString + "</" + getName() + ">";
        }
    }
}
// END

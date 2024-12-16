package exercise.dto.posts;

import java.util.List;
import java.util.Map;
import io.javalin.validation.ValidationError;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

// BEGIN
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class EditPostPage {
    private String name;
    private String body;
    private long id;
    private Map<String, List<ValidationError<Object>>> errors;

    public EditPostPage(String name, String body, Long id) {
        this(name, body, id, null);
    }
}
// END

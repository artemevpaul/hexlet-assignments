package exercise.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exercise.model.Comment;
import lombok.Getter;
import lombok.Setter;

// BEGIN
@Getter
@Setter
public class PostDTO {

    private Long id;
    private String title;
    private String body;
    private List<CommentDTO> comments;
}
// END

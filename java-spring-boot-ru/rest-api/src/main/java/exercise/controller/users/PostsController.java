package exercise.controller.users;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import exercise.model.Post;
import exercise.Data;

// BEGIN
@RestController
@RequestMapping("/api")
public class PostsController {
    public static List<Post> posts= Data.getPosts();
    @GetMapping("/users/{id}/posts")
    @ResponseStatus(HttpStatus.OK)
    public List<Post> show(@PathVariable Integer id) {
        List<Post> userPosts = posts.stream()
                .filter(p -> p.getUserId()==id)
                .toList();
        return userPosts;
    }
    @PostMapping("/users/{id}/posts")
    @ResponseStatus(HttpStatus.CREATED)
    public Post create(@RequestBody Post post, @PathVariable Integer id) {
        post.setUserId(id);
        posts.add(post);
        return post;
    }
}
// END

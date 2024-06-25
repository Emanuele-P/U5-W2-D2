package ep2024.u5w2d2.services;

import ep2024.u5w2d2.entities.BlogPost;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostsService {
    private List<BlogPost> posts = new ArrayList<>();

    public List<BlogPost> getPosts() {
        return this.posts;
    }
}

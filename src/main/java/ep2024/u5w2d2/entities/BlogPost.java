package ep2024.u5w2d2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class BlogPost {
    private long id;
    private String genre;
    private String title;
    private String cover;
    private String content;
    private LocalTime readingTime;
}

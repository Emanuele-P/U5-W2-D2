package ep2024.u5w2d2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Author {
    private long id;
    private String name;
    private String surname;
    private LocalDate dayOfBirth;
    private String avatar;
}

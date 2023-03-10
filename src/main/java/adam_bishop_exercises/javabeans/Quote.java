package adam_bishop_exercises.javabeans;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Quote implements Serializable {
    private int id;
    private Author author;
    private String content;

    public Quote(Author author, String content) {
        this.author = author;
        this.content = content;
    }
}

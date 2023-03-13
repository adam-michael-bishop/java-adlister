package adam_bishop_exercises.adlister;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ad {
    private long id;
    private long userId;
    private String title;
    private String description;
}
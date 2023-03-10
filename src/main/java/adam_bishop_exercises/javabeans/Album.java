package adam_bishop_exercises.javabeans;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Album implements Serializable {
    private int id;
    private String name;
    private String artist;
    private int releaseDate;
    private double sales;
    private String genre;

    public Album(String name, String artist, int releaseDate, double sales, String genre) {
        this.name = name;
        this.artist = artist;
        this.releaseDate = releaseDate;
        this.sales = sales;
        this.genre = genre;
    }
}

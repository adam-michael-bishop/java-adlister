package adam_bishop_exercises.adlister;

import java.util.List;

public interface Ads {
    List<Ad> all();
    public void insert(long id, String title, String description);
}
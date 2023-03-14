package adam_bishop_exercises.adlister;

import adam_bishop_exercises.Config;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection = null;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Ad> all() {
        String selectQuery = "SELECT * FROM ad_lister_ads";

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);

            List<Ad> ads = new ArrayList<>();

            while (rs.next()) {
                ads.add(
                        new Ad(
                                rs.getLong("ad_id"),
                                rs.getLong("user_id"),
                                rs.getString("title"),
                                rs.getString("description")
                        )
                );
            }
            return ads;
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to database.", e);
        }
    }

    @Override
    public Long insert(Ad ad) {
        String query = "INSERT INTO ad_lister_ads (title, description, user_id) VALUES (?,?,?);";
        Long adId = null;
        try {
            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, ad.getTitle());
            stmt.setString(2, ad.getDescription());
            stmt.setLong(3, ad.getUserId());
            stmt.execute();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                adId = rs.getLong(1);
                System.out.println("Inserted a new record! New id: " + adId);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return adId;
    }
}

package adam_bishop_exercises;

import lombok.AccessLevel;
import lombok.Getter;

@Getter
public class Config {
    private static Config config = null;
    @Getter(AccessLevel.NONE)
    private final String baseUrl = "jdbc:mysql://studentdb.fulgentcorp.com/";
    @Getter(AccessLevel.NONE)
    private final String database = "ymir_adam";
    @Getter(AccessLevel.NONE)
    private final String urlParameters = "?allowPublicKeyRetrieval=true&useSSL=false";
    private final String url;
    private final String user = "ymir_adam";
    private final String password = "KByF4eAy6k9H6XU";

    private Config() {
        StringBuilder urlBuilder = new StringBuilder(baseUrl);
        url = urlBuilder.append(database).append(urlParameters).toString();
    }

    public static Config getConfig() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }
}
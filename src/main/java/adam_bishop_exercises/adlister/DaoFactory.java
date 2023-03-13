package adam_bishop_exercises.adlister;

import adam_bishop_exercises.Config;

public class DaoFactory {
    private static MySQLAdsDao adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(Config.getConfig());
        }
        return adsDao;
    }
}

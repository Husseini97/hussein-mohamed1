package helpers;

import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HelperClass {
    /**
     * Helper function to check the network to make sure that a certain EP is called
     */
    public static int getStatusCodeForUrl(String urlString) {
        int statusCode = 0;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            statusCode = connection.getResponseCode();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return statusCode;
    }
    /**
     * Helper function to check that the page is being loaded in more than x number of seconds
     */
    public static boolean isPageLoadedWithinTime(WebDriver driver, long expectedTimeInSeconds) {
        long startTime = System.currentTimeMillis();

        while (!isPageLoaded(driver)) {
            if ((System.currentTimeMillis() - startTime) > expectedTimeInSeconds * 1000) {
                return false;
            }
        }

        long endTime = System.currentTimeMillis();
        long loadTimeInSeconds = (endTime - startTime) / 1000;
        return loadTimeInSeconds <= expectedTimeInSeconds;
    }

    /**
     * Helper function to check if a page has completely loaded by checking the document state.
     */
    private static boolean isPageLoaded(WebDriver driver) {
        return ((String) ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript("return document.readyState")).equals("complete");
    }
}

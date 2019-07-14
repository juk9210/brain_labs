package ua.zp.brain.labs.oop.basics.work_with_the_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Create class IpInfo for creating URL and extracting real information addressed to URL data.
 *
 * @author Shakhov Yevhen.
 */
class IpInfo {
    /**
     * Create method main to run the application.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://api.2ip.ua/geo.json");   //Create URl
        HttpURLConnection urlcon = (HttpURLConnection) url.openConnection();  //Create HttpURLConnection to extract information
        urlcon.connect();   //Make a connection
        /*
        Read information using BufferedReader (InputStreamReader).And output to console.
         */
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(urlcon.getInputStream()))) {
            String userInput;
            while ((userInput = bf.readLine()) != null) {
                System.out.println(userInput);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

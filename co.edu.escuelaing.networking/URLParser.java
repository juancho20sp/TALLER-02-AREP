import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class URLParser {
    public static void main(String[] args) {
        try {
            URL googleURL = new URL("https://www.google.com:80/index.html?size=10#test");
            System.out.println("Protocol: " + googleURL.getProtocol());
            System.out.println("Host: " + googleURL.getHost());
            System.out.println("Port: " + googleURL.getPort());
            System.out.println("Authority: " + googleURL.getAuthority());
            System.out.println("File: " + googleURL.getFile());
            System.out.println("Path: " + googleURL.getPath());
            System.out.println("Query: " + googleURL.getQuery());
            System.out.println("Ref: " + googleURL.getRef());
        } catch (MalformedURLException e) {
            Logger.getLogger(URLParser.class.getName()).log(Level.SEVERE, e.getMessage());
        }
    }
}

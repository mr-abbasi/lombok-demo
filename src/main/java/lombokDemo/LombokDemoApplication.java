package lombokDemo;

import lombokDemo.model.Movie;

import java.net.MalformedURLException;
import java.net.URL;

public class LombokDemoApplication {
    public static void main(String[] args) throws MalformedURLException {
        var movie = new Movie(1L,"The Lord of the Rings: The Fellowship of the Ring",
                "In the second age of Middle-earth, the lords of Elves ...","New zealand - United States",
                8,new URL("https://lordoftherings.com"),"English");
        System.out.println(movie);
    }
}

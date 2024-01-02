package lombokDemo;

import lombokDemo.model.Movie;

import java.net.MalformedURLException;
import java.net.URL;

public class LombokDemoApplication {
    public static void main(String[] args) throws MalformedURLException {
        var movie = new Movie();
        movie.setTitle("The Lord of the Rings: The Fellowship of the Ring");
        movie.setDescription("In the second age of Middle-earth, the lords of Elves ...");
        movie.setCountry("New zealand - United States");
        movie.setLanguage("English");
        movie.setRating(8);
        movie.setOfficialSite(new URL("https://lordoftherings.com"));
        movie.setId(1L);
        System.out.println(movie);
    }
}

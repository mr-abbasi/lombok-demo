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
        System.out.println(movie.hashCode());
        var secondMovie = new Movie(1L,"The Lord of the Rings: The Two Towers",
                "While Frodo and Sam edge closer to Mordor with the help  ...","New zealand - United States",
                8,new URL("https://lordoftherings.com"),"English");
        System.out.println(movie.equals(secondMovie));
        var thirdMovie = movie;
        System.out.println(movie.equals(thirdMovie));

    }
}

package lombokDemo.model;

import lombok.Getter;
import lombok.Setter;

import java.net.URL;

@Getter @Setter
public class Movie {
    private long id;
    private String title;
    private String description;
    private String country;
    private int rating;
    private URL officialSite;
    private String language;


    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", country='" + country + '\'' +
                ", rating=" + rating +
                ", officialSite=" + officialSite +
                ", language='" + language + '\'' +
                '}';
    }
}

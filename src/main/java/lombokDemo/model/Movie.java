package lombokDemo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.net.URL;

@Getter @Setter
@ToString(exclude = "id")
public class Movie {
    private long id;
    private String title;
    private String description;
    private String country;
    private int rating;
    private URL officialSite;
    private String language;

}

package lombokDemo.model;

import lombok.*;

import java.net.URL;

@Getter @Setter
@ToString(exclude = "id")
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PRIVATE)
    private long id;
    private String title;
    private String description;
    private String country;
    private int rating;
    private URL officialSite;
    private String language;

}

package lombokDemo.model;

import lombok.*;

import java.net.URL;
import java.util.List;

@Getter @Setter
@ToString(exclude = "id")
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@Builder
public class Movie {

//    @Setter(AccessLevel.PRIVATE)
//    @Getter(AccessLevel.PRIVATE)
    private long id;
    private String title;
    private String description;
    private String country;
    private int rating;
    private URL officialSite;
    private String language;

    @Singular
    private List<String> casts;
    private final int minutes = 12;
    public long addMinutes(@NonNull long minutes){
        return minutes + 60;
    }

}

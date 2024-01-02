package lombokDemo.model;

import lombok.*;
import lombok.experimental.Accessors;

import java.net.URL;

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

    @Builder.Default
    private final int minutes = 12;
    public long addMinutes(@NonNull long minutes){
        return minutes + 60;
    }

}

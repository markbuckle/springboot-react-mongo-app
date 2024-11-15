package dev.mark.movieAPI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data // takes care of getters, setters and two string methods
@AllArgsConstructor // annotation for creating a constructor that takes the private fields as arguments
@NoArgsConstructor // constructor that takes no parameters
public class Movie {
    @Id // unique identifier property. Only applies to ObjectId
    private ObjectId id; // id of the movie
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference // makes the database store only the id's of the review in a separate collection
    private List<Review> reviewIds;
}

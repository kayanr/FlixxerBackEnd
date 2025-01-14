package Flixxer.Flixxer.Backend.models;

import java.util.List;

public class PostResponse {
    String movieId;
    List<Post> posts;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "PostResponse{" +
                "movieId='" + movieId + '\'' +
                ", posts=" + posts +
                '}';
    }
}

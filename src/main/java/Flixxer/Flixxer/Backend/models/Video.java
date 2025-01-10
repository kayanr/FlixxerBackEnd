package Flixxer.Flixxer.Backend.models;

import jakarta.persistence.*;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;




@Entity
@Table(name = "video")
public class Video {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long ContentId;

        @Getter
        @Setter
        @Column
        private String title;

        @Getter
        @Setter
        @Column
        private String genre;

        @Getter
        @Setter
        @Column
        private int duration;

        @Getter
        @Setter
        @Column
        private String rating;

        @Getter
        @Setter
        @Column
        private String description;

        @Getter
        @Setter
        @Column
        private LocalDate releaseDate;

    public long getContentId() {
        return ContentId;
    }

    public void setContentId(long contentId) {
        this.ContentId = contentId;
    }
}



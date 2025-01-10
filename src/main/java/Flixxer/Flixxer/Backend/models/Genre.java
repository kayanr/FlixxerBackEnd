package Flixxer.Flixxer.Backend.models;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "genre")
public class Genre {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column
    private String title;

    @Getter
    @Setter
    @Column

    private String genre;




    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

package ar.edu.utn.frc.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@Table(name = Artist.TABLE_NAME)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Artist {

    public static final String TABLE_NAME = "artists";


    @Id
    @Column(name = "ArtistId")
    Integer id;

    String name;

    public Artist(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Artist() {
    }

    public void update(String name) {

        this.name = name;
    }
}

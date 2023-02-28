package com.example.batflix.Domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "movie_genre")
public class MovieGenre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int movie_id;

    @Column(name = "genre_id")
    private int genre_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    private Movie movie;

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public int getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(int genre_id) {
        this.genre_id = genre_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieGenre that = (MovieGenre) o;
        return movie_id == that.movie_id && genre_id == that.genre_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie_id, genre_id);
    }

    @Override
    public String toString() {
        return "MovieGenre{" +
                "movie_id=" + movie_id +
                ", genre_id=" + genre_id +
                ", movie=" + movie +
                '}';
    }

    public MovieGenre (){

    }
}



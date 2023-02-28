package com.example.batflix.Domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "movie_languages")
public class MovieLanguages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int movie_id;

    @Column(name = "language_name")
    private String language_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    private Movie movie;

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getLanguage_name() {
        return language_name;
    }

    public void setLanguage_name(String language_name) {
        this.language_name = language_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieLanguages that = (MovieLanguages) o;
        return movie_id == that.movie_id && language_name.equals(that.language_name) && movie.equals(that.movie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie_id, language_name, movie);
    }

    @Override
    public String toString() {
        return "MovieLanguages{" +
                "movie_id=" + movie_id +
                ", language_name='" + language_name + '\'' +
                ", movie=" + movie +
                '}';
    }

    public MovieLanguages() {

    }
}

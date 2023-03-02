package com.example.batflix.Domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int movie_id;

    @Column(name = "title")
    private String title;

    @Column(name = "budget")
    private int budget;

    @Column(name = "home_page")
    private String home_page;

    @Column(name = "overview")
    private String overview;


    @Column(name = "release_year")
    private int release_year;

    @Column(name = "runtime")
    private int runtime;

    @Column(name = "country_id")
    private int country_id;

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getHome_page() {
        return home_page;
    }

    public void setHome_page(String home_page) {
        this.home_page = home_page;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return movie_id == movie.movie_id && budget == movie.budget && release_year == movie.release_year && runtime == movie.runtime && country_id == movie.country_id && title.equals(movie.title) && home_page.equals(movie.home_page) && overview.equals(movie.overview);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie_id, title, budget, home_page, overview, release_year, runtime, country_id);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movie_id=" + movie_id +
                ", title='" + title + '\'' +
                ", budget=" + budget +
                ", home_page='" + home_page + '\'' +
                ", overview='" + overview + '\'' +
                ", release_year=" + release_year +
                ", runtime=" + runtime +
                ", country_id=" + country_id +
                '}';
    }

    public Movie() {
    }
}

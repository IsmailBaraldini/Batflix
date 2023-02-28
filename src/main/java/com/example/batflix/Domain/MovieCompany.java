package com.example.batflix.Domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "movie_company")
public class MovieCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int movie_id;

    @Column(name = "company_name")
    private String company_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    private Movie movie;

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieCompany that = (MovieCompany) o;
        return movie_id == that.movie_id && company_name.equals(that.company_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie_id, company_name);
    }

    @Override
    public String toString() {
        return "MovieCompany{" +
                "movie_id=" + movie_id +
                ", company_name='" + company_name + '\'' +
                ", movie=" + movie +
                '}';
    }

    public MovieCompany() {

    }
}
package com.dci.full_mvc.model;

public class Movie {

    private Long id;
    private String title;
    private int releaseYear;
    private int duration;
    private String genre;
    private String director;
    private String language;
    private boolean wonOscars;

    public Movie(Long id, String title, int releaseYear, int duration, String genre, String director, String language, boolean wonOscars) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.genre = genre;
        this.director = director;
        this.language = language;
        this.wonOscars = wonOscars;
    }

    public Movie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isWonOscars() {
        return wonOscars;
    }

    public void setWonOscars(boolean wonOscars) {
        this.wonOscars = wonOscars;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", language='" + language + '\'' +
                ", wonOscars=" + wonOscars +
                '}';
    }
}

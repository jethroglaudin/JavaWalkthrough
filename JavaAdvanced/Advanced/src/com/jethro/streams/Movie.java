package com.jethro.streams;

public class Movie implements Comparable<Movie> {
    private String title;
    private  int likes;

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public int compareTo(Movie movie) {
        return 0;
    }
}

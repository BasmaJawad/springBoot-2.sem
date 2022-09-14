package com.example.movieworkshop.model;

public class Movie implements Comparable<Movie> {

    private String year;
    private String length;
    private String title;
    private String subject;
    private String pop;
    private String awards;

    public Movie(String year, String lenght, String title, String subject, String pop, String awards) {
        this.year = year;
        this.length = lenght;
        this.title = title;
        this.subject = subject;
        this.pop = pop;
        this.awards = awards;
    }





    public String getYear() {
        return year;
    }
    public String getLength() {
        return length;
    }
    public String getTitle() {
        return title;
    }
    public String getSubject() {
        return subject;
    }
    public String getPop() {
        return pop;
    }
    public String getAwards() {
        return awards;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public void setLength(String length) {
        this.length = length;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setPop(String pop) {
        this.pop = pop;
    }
    public void setAwards(String awards) {
        this.awards = awards;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "year='" + year + '\'' +
                ", lenght='" + length + '\'' +
                ", title='" + title + '\'' +
                ", subject='" + subject + '\'' +
                ", pop='" + pop + '\'' +
                ", awards='" + awards + '\'' +
                '}';
    }
    @Override
    public int compareTo(Movie o) {
        return Integer.parseInt(pop)- Integer.parseInt(o.pop);
    }
}

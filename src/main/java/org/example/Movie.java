package org.example;

public class Movie extends LibraryItem {
    private int duration; // in minutes

    public Movie(String title, String director, int year, int duration) {
        super(title, director, year);
        this.duration = duration;
    }

    public int getDurationInMinutes() {
        return duration;
    }

    @Override
    public String toString() {
        return "Movie: " + getTitle() + " by " + getCreator() + " (" + getYear() + ") - " + duration + " minutes";
    }
}
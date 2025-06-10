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
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Duration: " + duration + " minutes");
    }
    @Override
    public String toString() {
        return "Movie: " + getTitle() + " by " + getCreator() + " (" + getYear() + ") - " + duration + " minutes";
    }
}
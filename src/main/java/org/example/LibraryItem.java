package org.example;

public class LibraryItem {
    private String title;
    private String creator;
    private int year;

    public LibraryItem(String title, String creator, int year) {
        this.title = title;
        this.creator = creator;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getCreator() {
        return creator;
    }

    public int getYear() {
        return year;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Creator: " + creator);
        System.out.println("Year: " + year);
    }
}
